package com.hp.demo.oo.entity;

import com.hp.demo.oo.Repository;
import com.hp.demo.oo.beans10.FlowType;
import com.hp.demo.oo.beans10.RegularStepType;
import com.hp.demo.oo.beans10.ReturnStepType;
//import com.hp.demo.oo.graph.FlowResponse;
import com.hp.demo.oo.graph.Block;
import com.hp.demo.oo.graph.OperationStep;
import com.hp.demo.oo.graph.ReturnStep;
import com.hp.demo.oo.graph.Step;
import com.hp.demo.oo.graph.Transition;
import org.apache.log4j.Logger;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/**
 * Created by panuska on 28.7.14.
 */
public class Flow {
    private static Logger log = Logger.getLogger(Flow.class.getName());
    private String uuid;
    private FlowType bean;

    private String name;
    private String pakage;

    private String annotation;

//    private List<FlowResponse> responses;

    private Step startStep;
    private List<Step> steps;

    ///////////////

    private List<Step> failureSteps;    // every step that is either error or leads to error (with no other transition)

    private Block startBlock;

    public Flow(FlowType bean, String pakage) {
        this.bean = bean;
        this.pakage = pakage;
    }

    public Flow(String uuid) {
        this.uuid = uuid;
        this.name = "unknownFlow-"+uuid;
        log.debug("Unknown flow being referenced: " + uuid);
    }

    public String getUuid() {
        if (uuid == null) {
            uuid = bean.getId();
        }
        return uuid;
    }

    public String getName() {
        if (name == null) {
            name = bean.getName();
        }
        return name;
    }

    public String getPackage() {
        return pakage;
    }

    public String getAnnotation() {
        if (annotation == null) {
            annotation = bean.getAnnotation();
        }
        return annotation;
    }

//    public List<FlowResponse> getResponses() {
//        if (responses == null) {
//            responses = new ArrayList<>(bean.getPossibleResponses().getOpResponse().size());
//            for (OpResponseType responseType : bean.getPossibleResponses().getOpResponse()) {
//                FlowResponse response = new FlowResponse(responseType);
//                responses.add(response);
//            }
//        }
//        return responses;
//    }

/*
    public Block getStartBlock() {
        if (startBlock ==  null) {
            startBlock = new Block(getStartStep());
            Loop loop = startBlock.process();
            if (loop != null) {
                startBlock = loop;
            }
        }
        return startBlock;
    }
*/

    public Block getStartBlock() {
        if (startBlock ==  null) {
            startBlock = new Block(getStartStep());
            startBlock.createBlockGraph();
            Block.clearPrefixBlock();
            setPrefixes();
            createLoopsAndConditions();
        }
        return startBlock;
    }

    private String greatestCommonPrefix(String longerString, String shorterString) {
        for (int i = 0; i < shorterString.length(); i++) {
            if (longerString.charAt(i) != shorterString.charAt(i)) {
                return longerString.substring(0, i);
            }
        }
        return shorterString;
    }

    private Map<String, String> candidates = new HashMap<>();

    private void setPrefixes() {
        List<Object> buffer = new LinkedList<>();
        buffer.add("A");
        buffer.add(startBlock);
        while (buffer.size() > 0) {
            String prefix = (String) buffer.remove(0);
            Block block = (Block) buffer.remove(0);
            String existingPrefix = block.getPrefix();
            if (existingPrefix != null) {
//                String candidate;
                //todo mel bych si zaznamenavat vsechny prefixy; node muze hrat roli v nekolika rolich
                int i = 1;
                if (prefix.startsWith(existingPrefix)) {
                    candidates.put(existingPrefix, "L");
//                    candidate = "Loop";

                    block.addAdditionalPrefix(prefix);
                    String existingLoopPrefixPath = block.getLoopCandidatePrefixPath();
                    if (existingLoopPrefixPath == null) {
                        block.setLoopCandidatePrefixPath(prefix);
                    } else {
                        if (prefix.length() > existingLoopPrefixPath.length()) {
                            log.info("Longer loop prefix found. Old prefix: "+existingLoopPrefixPath+"; new prefix: "+prefix);
                            block.setLoopCandidatePrefixPath(prefix);
                        } else {
                            log.info("Longer loop prefix not found. Old prefix: "+existingLoopPrefixPath+"; new prefix: "+prefix);
                        }
                    }
                } else {
                    String commonPrefix = greatestCommonPrefix(prefix, existingPrefix);
                    candidates.put(commonPrefix, "C");
//                    candidate = "Condition";
                    // todo mel bych zaznamenat tento block, pac je to prvni block, kde se condition spojuje
                    // todo taky bych mel zaznamenat common prefix, pac az na nej narazim, tak je to zacatek condition
                    Block conditionBlock = Block.getBlock(commonPrefix);
                    Block existingChild = conditionBlock.getConditionCandidateCommonBlock();
                    if (existingChild == block) {
                        log.info("If command with more than 2 branches; Parent: "+conditionBlock+"\n; common block "+block);
                    } else {
                        if (existingChild != null) {
                            throw new IllegalStateException("Block cannot be common in more conditions.\n Parent Block: "+conditionBlock.getPrefix()+"-"+conditionBlock+"\n existing child "+existingChild.getPrefix()+"-"+existingChild+"\n additional child "+block.getPrefix()+"-"+block);
                        }
                        conditionBlock.setConditionCandidateCommonBlock(block);
                    }
                }
/*
                for (String existingPrefix : existingPrefixes) {
                    if (prefix.startsWith(existingPrefix)) {
                        // loop candidate
                        candidates.put(existingPrefix, "L");
                        candidate = "Loop";
                        // todo mel bych zaznamenat, tento block, pac je to root loopu, az na nej narazim, mel bych z nej delat loop
                        // a taky prefix, pac mi bude ukazovat cestu loopem, vsechny nodes, ktere zacinaji timto prefixem, jsou v loopu, ostatni nodes ten loop exituji
                        block.setLoopCandidatePrefixPath(prefix);
                    } else {
                        // condition candidate
                        String commonPrefix = greatestCommonPrefix(prefix, existingPrefix);
                        candidates.put(commonPrefix, "C");
                        candidate = "Condition";
                        // todo mel bych zaznamenat tento block, pac je to prvni block, kde se condition spojuje
                        // todo taky bych mel zaznamenat common prefix, pac az na nej narazim, tak je to zacatek condition
                        Block conditionBlock = Block.getBlock(commonPrefix);
                        conditionBlock.setConditionCandidateCommonBlock(block);
                    }
                    // kdyz je stejny node nekolikrat vyhodnocen jako loop, jde o stejny loop, v kterem je condition
                    // projdi vsechny dlouhe prefixy a najdi nejdelsi spolecny prefix, ten odkaze na node, ktery je onou condition
                    log.info(i+". "+candidate+" found!!"+ block+" already has prefix "+existingPrefix+"; new prefix is "+prefix);
                    i++;
                }
                block.setPrefix(prefix);
*/
            } else {
                block.setPrefix(prefix);
                if (block.getNextBlock() != null) {
                    char lastChar = prefix.charAt(prefix.length()-1);
                    if (lastChar >= 'A' && lastChar <= 'Z') {
                        prefix = prefix+'1';
                    } else { //last char must be number
                        prefix = prefix.substring(0, prefix.length()-1)+((char)(lastChar+1)); // increase that number
                    }
                    buffer.add(prefix);
                    buffer.add(block.getNextBlock());
                }
                if (block.getNextBlocks() != null) {
                    for (int i = 0; i < block.getNextBlocks().size(); i++) {
                        char c = (char)('A'+i);
                        buffer.add(prefix+c);
                        buffer.add(block.getNextBlocks().get(i));
                    }
                }
            }
        }
    }

    Set<Block> alreadyVisited = new HashSet<>();

    private void createLoopsAndConditions() {
        if (candidates.size() == 0) return;
        List<Block> buffer = new LinkedList<>();
        buffer.add(startBlock);
        while (buffer.size() > 0) {
            Block block = buffer.remove(0);
            if (alreadyVisited.contains(block)) {  // prevent infinite recursion
                continue;
            }
            alreadyVisited.add(block);

            if (block.getNextBlock() != null) {
                buffer.add(block.getNextBlock());
            }
            if (block.getNextBlocks() != null) {
                for (Block nextBlock : block.getNextBlocks()) {
                    buffer.add(nextBlock);
                }
            }
            if (block.getLoopCandidatePrefixPath() != null) {
                log.info(block+" loop starts and the path is "+block.getLoopCandidatePrefixPath());
                String path = block.getLoopCandidatePrefixPath();
//                do {
//                    Block loopMember = Block.getBlock(path);
//                    if (loopMember.getNextBlocks() != null) {
//                        log.info(loopMember+" is part of the loop and exits the loop");
//                    } else {
//                        log.info(loopMember+" is part of the loop");
//                    }
//                    path = path.substring(0, path.length()-1);
//                } while (!path.equals(block.getPrefix()getLoopCandidatePrefixPathEnd()));
            }
            if (block.isLastStepIsCondition()) {
                if (block.getConditionCandidateCommonBlock() != null) {
                    log.info(block+" condition starts and the first common block is "+block.getConditionCandidateCommonBlock());
                } else {
                    log.info(block+" either condition with no common block or loop exit");
                }
            }
            if (block.getConditionCandidateCommonBlock() != null && !block.isLastStepIsCondition()) {
                throw new IllegalStateException("There is a condition which is not a condition!");
            }
            List<String> additionalPrefixes = block.getAdditionalPrefixes();
            if (additionalPrefixes != null) {
                log.info(block+" has that many additional prefixes! "+additionalPrefixes.size());
            }
            String prefix = block.getPrefix();
            String role = candidates.get(prefix);

            if (role != null) {
                if (role.equals("L")) {
                // jdi po sub-blockich, ktery maji stejny prefix a udelej z nich loop, ostatni jsou loop exit
                } else if (role.equals("C")) {
                // jdi po sub-blockich, ktery maji stejny prefix
                } else throw new IllegalStateException("Error in algorithm!");
            }

        }

    }


    public Step getStartStep() {
        if (startStep == null) {
            initStepsAndTransitions();
            findFailureSteps();
            orderSteps();
        }
        return startStep;
    }

    public List<Step> getSteps() {
        if (this.getName().equals("Http Post Multipart Sync")) {
            System.out.println(getName());
        }
        if (steps == null) {
            initStepsAndTransitions();
            findFailureSteps();
            findLoops(null, null, startStep);
//            orderSteps(null, null startStep);
            Collections.sort(this.steps);
        }
        return steps;
    }

    private void initStepsAndTransitions() {
        List<Object> steps = bean.getSteps().getStepOrReturnStepOrParallelMultiStep();
        this.steps = new ArrayList<>(steps.size());
        this.failureSteps = new LinkedList<>();
        Map<String, Step> stepsRepository = new HashMap<>(steps.size());
        for (Object o : steps) {
            Step step;
            if (o instanceof RegularStepType) {
                RegularStepType stepBean = (RegularStepType)o;
                Operation operation = Repository.getRepository().getOperation(stepBean.getId());
                if (operation != null) {
                    step = new OperationStep(stepBean);
                } else {
                    step = new Step(stepBean);
                }
            } else if (o instanceof ReturnStepType) {
                step = new ReturnStep((ReturnStepType)o);
                if (step.isFailing()) {
                    failureSteps.add(step);
                }
            } else {
                throw new IllegalStateException("Step type expected!! "+o);
            }
            this.steps.add(step);
            stepsRepository.put(step.getUuid(), step);
        }
        startStep = stepsRepository.get(bean.getStartSteps());
        startStep.setStartStep(true);
        if (startStep == null) {
            throw new IllegalStateException("Start step must not be null! "+bean.getStartSteps());
        }
        for (Step step : this.steps) {
            step.initTransitions(stepsRepository);
        }
    }

    private void findFailureSteps() {
        if (name.equals("Transform Service Offering")) {
            System.out.println(name);
        }
        ListIterator<Step> iterator = failureSteps.listIterator();
        while(iterator.hasNext()) {                                  // create graph of failure steps
            Step step = iterator.next();
            for (Transition transition : step.getReverseTransitions()) {            // traverse back to source
                transition.setFailing(true);
                Step source = transition.getSource();
                boolean failing = true;
                for (Transition destination : source.getTransitions()) {  // and if the source points only to failure steps
                    if (!destination.getDestination().isFailing()) {      // then source step itself is also a failure step
                        failing = false;                             //todo this alg. is not completely correct;
                        break;                                       //it's possible the failing step is not marked as failing yet...
                    }
                }
                if (failing) {
                  iterator.add(source);  // source is also failure
                  iterator.previous();
                }
            }
        }
    }

    int order = 0;

    private void orderSteps(Step source, Transition sourceToStep, Step step) {  // finds cycles
        if (step.getOrder() == Step.NO_ORDER) {
            step.setOrder(order++);
            if (step.getTransitions() != null) {  // filter out return steps
                for (Transition transition : step.getTransitions()) { // will return steps in order
                    Step destination = transition.getDestination();
                    if (destination.isFailing()) {
                        failingSteps.add(destination);
                        steps.remove(destination);
                    } else {
                        orderSteps(step, transition, destination);
                    }
                }
            }
        } else {
            source.addStartCycle(step);
            step.addEndCycle(source);
//            sourceToStep.setPurpose(Transition.Purpose.goesBackToLoop);
        }
    }

    private int findLoops(Step source, Transition sourceToStep, Step step) {
        if (step.getOrder() == Step.NO_ORDER) {
            step.setOrder(order++);
            if (step.getTransitions() != null) { //filter out return steps
                for (Transition transition : step.getTransitions()) {
                    Step destination = transition.getDestination();
                    if (!destination.isFailing()) { // avoid failing steps
                        int foundLoop = findLoops(step, transition, destination);
                        if (foundLoop != Step.NO_LOOP) {
                            step.setLoopNumber(foundLoop);
                            if (transition.getPurpose() != Transition.Purpose.noPurpose) {
                                transition.setPurpose(Transition.Purpose.loops);
                            }
                        }
                        return foundLoop;
                    }
                }
            }
            return Step.NO_LOOP;
        } else {
            source.addStartCycle(step);
            step.addEndCycle(source);
            sourceToStep.setPurpose(Transition.Purpose.goesBackToLoop);
            step.setLoopNumber(step.getOrder());
            return step.getLoopNumber();
        }
    }

/*
    private int findLoopExits(Step source, Transition sourceToStep, Step step) {
        if (step.getTransitions() != null) {
            for (Transition transition : step.getTransitions()) {
                Step destination = transition.getDestination();
                if (!destination.isFailing()) {
                    findLoopExits(step, transition, destination);
                }
            }
        }
    }
*/

    private List<Step> failingSteps = new LinkedList<>();

    private void orderSteps() {  // finds cycles
        List<Step> sourceDestinationSteps = new ArrayList<>(this.steps.size()*2);
        sourceDestinationSteps.add(null);
        sourceDestinationSteps.add(startStep);
//        ListIterator<Step> iterator = sourceDestinationSteps.listIterator();
        int order = 0;
        for (int i = 0; i < sourceDestinationSteps.size();) {
//        while(iterator.hasNext()) {
            Step source = sourceDestinationSteps.get(i++);
            Step step = sourceDestinationSteps.get(i++);
//            Step source = iterator.next();
//            Step step = iterator.next();
            if (step.getOrder() == Step.NO_ORDER) {
                step.setOrder(order++);
                if (step.getTransitions() != null) {  // filter out return steps
                    for (Transition transition : step.getTransitions()) { // will return steps in order
                        Step destination = transition.getDestination();
    //                    if (!destination.isFailing()) {

                        sourceDestinationSteps.add(step);
                        sourceDestinationSteps.add(destination);
    //                    iterator.add(step);              //source
    //                        iterator.add(destination);


    //                    } else {

    //                    }
                    }
                }
            } else {
                source.addStartCycle(step);
                step.addEndCycle(source);
//                l1:
//                for (Step source : step.getReverseSteps()) {
//                    for (int i = 0; i < source.getTransitions().size(); i++) {
//                        if (source.getTransitions().get(i).getDestination() == step) {
//                            source.addStartCycle(step);
//                            step.addEndCycle(source);
//                            break l1;
//                        }
//                    }
//                    throw new IllegalStateException("Error!");
//                }
            }
        }
//        assert this.steps.containsAll(sourceDestinationSteps);     //todo remove
//        assert this.steps.size() == sourceDestinationSteps.size();
//        this.steps = sourceDestinationSteps;
        Collections.sort(this.steps);
    }

    public void transform(BufferedWriter file, int cycles, Block first, Block until, String prefix) throws IOException {
        if (first == null) return;
        if (first == until) return;
        if (first.getLoopCandidatePrefixPath() != null) {
            prefix = first.getLoopCandidatePrefixPath();
            Repository.align(file, cycles);
            file.write("for(;;)");
            cycles++;
            transform(file, cycles, first.ge);
        }
        first.transform(file, cycles);
        if (first.getNextBlocks() != null) {
            if (first.getConditionCandidateCommonBlock() != null) {
                Repository.align(file, cycles);
                file.write("if (condition) {");
                cycles++;
                int i = 0;
                for (;i < first.getNextBlocks().size()-1; i++) {
                    transform(file, cycles, first.getNextBlocks().get(i), first.getConditionCandidateCommonBlock(), prefix);
                    Repository.align(file, cycles);
                    file.write("} else {");
                }
                i++;
                transform(file, cycles, first.getNextBlocks().get(i), first.getConditionCandidateCommonBlock(), prefix);
                cycles--;
                Repository.align(file, cycles);
                file.write("}");
                first.getConditionCandidateCommonBlock().transform(file, cycles);
            }
        }

//    }
//
//    public Block getNextBlock(Block block, String prefix) {
//        if (block.getNextBlock() != null) return block.getNextBlock();
//        if (block.getNextBlocks() != null) {
//            for
//     }


        List<Block> buffer = new LinkedList<>();
        buffer.add(first);
        while (buffer.size() > 0) {
            Block block = buffer.remove(0);
            if (block.transform(file, cycles)) {
                if (block.getNextBlock() != null) {
                    buffer.add(block.getNextBlock());
                }
                if (block.getNextBlocks() != null) {
                    buffer.addAll(block.getNextBlocks());
                }
            }
        }
    }

    public void transform() {
        Stack<W> stack;

        if (block.condition) {

        }

    }
}
