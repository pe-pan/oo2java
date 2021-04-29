package com.hp.demo.oo.graph;

import com.hp.demo.oo.Repository;
import org.apache.log4j.Logger;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by panuska on 6.8.14.
 */
public class Block {
    private static Logger log = Logger.getLogger(Block.class.getName());

    public static Map<String, Block> blockRepository = new HashMap<>();  //todo shoudn't this be per flow (not static?)

    Step firstStep, lastStep;

    protected Block nextBlock;
    boolean lastStepIsCondition;
    boolean exitsLoop;
    boolean loopStart;
    boolean loopEnd;
    boolean printed = false;
    int numberOfInputs;
    List<String> additionalPrefixes = null;
    String prefix = null;
    int size;

    String loopCandidatePrefixPath;        // if set, this block is a loop and this prefix shows the path through the loop (all other paths exits the loop)

    Block conditionCandidateCommonBlock;   // if set, this block is a root of a condition and this is the first common block after the condition

    public String getLoopCandidatePrefixPath() {
        return loopCandidatePrefixPath;
    }

    public void setLoopCandidatePrefixPath(String loopCandidatePrefixPath) {
        this.loopCandidatePrefixPath = loopCandidatePrefixPath;
    }

    public Block getConditionCandidateCommonBlock() {
        return conditionCandidateCommonBlock;
    }

    public void setConditionCandidateCommonBlock(Block conditionCandidateCommonBlock) {
        this.conditionCandidateCommonBlock = conditionCandidateCommonBlock;
    }

    public boolean isLastStepIsCondition() {
        return lastStepIsCondition;
    }

    //    boolean blocksDoNotMerge;

    List<Block> nextBlocks;
    Set<Block> reverseBlocks = new HashSet<>();

//    List<Block> multiBlocks;

    public Block(Step firstStep) {
        init(firstStep);
    }

    Block() {

    }

    public String getUuid() {
        return firstStep.getUuid();
    }

    private void init(Step firstStep) {
        this.firstStep = firstStep;
        this.size = 1;
        this.numberOfInputs = this.firstStep.getNumberOfInputs();
        this.lastStep = firstStep;
        nextBlock = null;
        blockRepository.put(getUuid(), this);
    }

    public Loop process() {
        createBlockGraph();
        visitedBlocks.clear();
        findMultiBlocks();
        visitedBlocks.clear();
        findBlockSequences();
        visitedBlocks.clear();
        return this.findLoop();
    }

    public void createBlockGraph() {
        List<Step> nextSteps = lastStep.getNextValidSteps();
        while (nextSteps.size() == 1) {
            Step newLastStep = nextSteps.get(0);
//            if (blockRepository.get(newLastStep.getUuid()) != null) {  // isn't next step in already processed block?
//                return;                                                // in such a case, we found a loop!! but we should not continue further
//            }
//            Set<Step> sourceSteps = newLastStep.getReverseSteps();
            if (newLastStep.getNumberOfInputs() > 1) { // there is more steps pointing at me; cannot be a single block
                nextBlock = blockRepository.get(newLastStep.getUuid());
                if (nextBlock == null) {
                    nextBlock = new Block(newLastStep);
                    nextBlock.reverseBlocks.add(this);
                    nextBlock.createBlockGraph();
                }
                return;
            } else {
                // it's only a single step pointing to me (the current lastStep)
//                if (sourceSteps.size() != 0 && sourceSteps.contains(lastStep)) {
//                    throw new IllegalStateException("Error in the algorithm!! "+lastStep+", "+newLastStep+", "+sourceSteps);
//                }
                size++;
                lastStep = newLastStep;
            }
            nextSteps = lastStep.getNextValidSteps();
        }
        if (nextSteps.size() == 0) {
            // no next block
            return;
        }
        if (nextSteps.size() > 1) {
            this.lastStepIsCondition = true;    //shouldn't we have a condition as the last one?
            nextBlocks = new LinkedList<>();
            for (Step nextStep : nextSteps) {
                Block nextBlock = blockRepository.get(nextStep.getUuid());
                if (nextBlock == null) {
                    nextBlock = new Block(nextStep);
                    nextBlock.reverseBlocks.add(this);
                    nextBlock.createBlockGraph();
                }
                nextBlocks.add(nextBlock);     //todo shouldn't it be before createBlockGraph?
            }
        }
    }

/*
    private void addPrefixes(String prefix) {
        List<Block> buffer = new LinkedList<>();
        buffer.add(this);
        while (buffer.size() > 0) {
            Block block = buffer.get(0);
            if (block.prefixes != null) {
                log.info("Block "+block+" already has prefixes "+block.prefixes+"; new prefix is "+prefix);
            } else {
                block.prefixes = new LinkedList<>();
                block.prefixes.add(prefix);
            }
            if (block.nextBlock != null) {
                buffer.add(nextBlock);
            }
        }
    }
*/

    private void findMultiBlocks() {
        if (visitedBlocks.contains(this)) {   // prevents infinite recursion
            return;
        }
        visitedBlocks.add(this);

        if (!lastStepIsCondition) {
            if (nextBlock == null) return;
            nextBlock.findMultiBlocks();
        } else {
            Map<Block, List<Block>> toBeMerged = new HashMap<>();

            for (Block nextBlock : nextBlocks) {
                if (nextBlock.nextBlocks != null) {
                    //todo current algorithm does not support merging blocks when there is more afterNextBlocks...
                    break;
                }
                Block afterNextBlock = nextBlock.nextBlock;           // afterNextBlock can be null but we allow that!
                List<Block> list = toBeMerged.get(afterNextBlock);
                if (list == null) {
                    list = new LinkedList<>();
                    toBeMerged.put(afterNextBlock, list);
                }
                list.add(nextBlock);
            }

            for (Block afterNextBlock : toBeMerged.keySet()) {
                List<Block> list = toBeMerged.get(afterNextBlock);
                if (list.size() > 1) {  // anything to be merged?
                    MultiBlock mBlock = new MultiBlock(list);
                    mBlock.reverseBlocks.add(this);
                    this.nextBlocks.removeAll(list);      // replace all the previous next Blocks
//                    if (this.nextBlock != null) this.nextBlock = null;
                    this.nextBlocks.add(mBlock);          // with this single one?
                    mBlock.increaseNumberOfInputs();
                    mBlock.nextBlock = afterNextBlock;
                    if (afterNextBlock != null) {
                        afterNextBlock.numberOfInputs -= (list.size()-1);  // decrease number of inputs
                        afterNextBlock.reverseBlocks.clear();
                        afterNextBlock.reverseBlocks.add(mBlock);
                    }
                    for (Block block : list) {
                        block.nextBlock = null;   // there are no next blocks anymore; the parent mBlock has next blocks not me
                        if (block.nextBlocks != null) {
                            throw new IllegalStateException("Cannot merge a block when there is more next blocks!" +block.nextBlocks);
                        }
                    }
                    // todo shouldn't we set also the transition names so we know which block from the multi-block is which?
                }
            }
            if (this.nextBlocks.size() == 1) {                // merge the blocks
                this.nextBlock = this.nextBlocks.get(0);
                this.nextBlocks = null;
                this.lastStepIsCondition = false; //todo shouldn't we keep it true?

                nextBlock.findMultiBlocks();    // recursive
            } else {

                // recursive
                for (Block nextBlock : nextBlocks) {
                    nextBlock.findMultiBlocks();
                }
            }


//            blocksDoNotMerge = false;
//            Block afterNextBlock = null;
//            for (Block nextBlock : nextBlocks) {
//                if (nextBlock == null) continue;
//                if (afterNextBlock == null) {
//                    afterNextBlock = nextBlock.nextBlock;
//                } else {
//                    blocksDoNotMerge = true;
//                    break;
//                }
//            }
//            if (!blocksDoNotMerge) {
//
//            }

//            if (blocksDoNotMerge) {
//                visitedBlocks.clear();
//                if (findLoops(this, this)) {
//                    for ()
//                } else {
//                    throw new IllegalStateException("Blocks must merge or there must be a loop! "+this);
//                }
//
//            } else {
//
//            }
        }
    }

    private static Set<Block> visitedBlocks = new HashSet<>();    //todo visitedblocks should be per flow
    private static Set<Block> loop = new HashSet<>();

    public Loop findLoop() {
        if (numberOfInputs > 1) {  // loop start
            if (trackLoop(this, this)) {
                List<Block> nextBlocks = new LinkedList<>();
                this.loopStart = true;
                for (Block block : loop) {
                    if (!block.loopStart && block.firstStep.getNumberOfInputs() > 1) {
                        throw new IllegalStateException("Only loop start can have more entries in the loop "+block);
                    }
                    if (block.lastStepIsCondition) {
                        for (Block branch : block.nextBlocks) {
                            if (!loop.contains(branch)) {
                                if (!nextBlocks.contains(branch)) {
                                    nextBlocks.add(branch);
                                } else {
                                    System.out.println("Tato podminka je uplne zbytecna!!"); //todo if never printed, remove the condition; if printed, remove the else branch
                                }
//                                if (!branch.exitsLoop) throw new IllegalStateException("Exits loop should be set to true already");
                            } else {
                                block.nextBlock = branch;
                            }
                        }
                        block.lastStepIsCondition = false;  // it's a loop, it's not a condition anymore
                        block.exitsLoop = true;
                        block.nextBlocks = null;
                    }
                }
                Loop loopBlock = new Loop(this, nextBlocks);
                return loopBlock;
//                this.nextBlocks.clear();              //todo shouldn't nextBlocks be rather Set?
//                this.nextBlocks.addAll(nextBlocks);
            } else {
                throw new IllegalStateException("There must be a loop when there is more steps pointing at me!! "+this);
            }
        } else {

            if (lastStepIsCondition) {
                for (int i = 0; i < nextBlocks.size(); i++) {
                    Block branch = nextBlocks.get(i);
                    Loop loopBlock = branch.findLoop();
                    if (loopBlock != null) {
//                        if (loop.contains(this)) nextBlocks.set(i, null);  // if I'm in the loop, break the loop
//                        else
                        nextBlocks.set(i, loopBlock);  // if loop found, replace the original reference to this loop
                        loopBlock.reverseBlocks.add(this);
                    }
                }
//                for (Block branch : nextBlocks) {
//                    branch.findLoop();
//                }
            } else {
                if (nextBlock == null) return null;
                Loop loopBlock = nextBlock.findLoop();
                if (loopBlock != null) {
//                    if (loop.contains(this)) nextBlock = null;  // if I'm in the loop, break the loop
//                    else
                    nextBlock = loopBlock;            // if loop found, replace the original reference to this loop
                    loopBlock.reverseBlocks.add(this);
                }
            }
            return null;
        }
//        while (root.firstStep.getReverseSteps().size() == 1) root = root.nextBlock;
//        while (!root.lastStepIsCondition) root = root.nextBlock;
//        for (Block branch : root.nextBlocks) {
//            if (!trackLoop(root, branch)) {
//                branch.exitsLoop = true;
//            }
//        }
    }


    public boolean trackLoop(Block root, Block me) {  // todo parameter me should be this
        if (visitedBlocks.contains(me)) {  // prevent infinite recursion
            return false;
        }
        visitedBlocks.add(me);
        if (!me.lastStepIsCondition) {
            if (me.nextBlock == null) {
                return false;  // loop not found
            }
            if (me.nextBlock == root) { // loop found
                log.info("Loop found! Root is " + root);
                loop.clear();
                loop.add(me);
                me.loopEnd = true;
                me.nextBlock = null;  // break the loop
//                if (root.firstStep.getReverseSteps().size() > 1) {   //todo just guessing
//                    root.loopStart = true;
//                }
                return true;
            } else {
                boolean loopFound = trackLoop(root, me.nextBlock);
                if (loopFound) {
                    loop.add(me);
                }
                return loopFound;
            }
        } else {
            boolean loopFound = false;
            for (int i = 0; i < me.nextBlocks.size(); i++) {
                Block branch = me.nextBlocks.get(i);
                if (branch == root) {
                    log.info("Loop found! Root is "+root);
                    loop.clear();
                    loop.add(me);
                    me.loopEnd = true;
                    me.nextBlocks.set(i, null);  // break the loop
                    loopFound = true;
                } else {
                    loopFound = trackLoop(root, branch);
                }
                if (loopFound) {
                    loop.add(me);
//                    if (branch.firstStep.getReverseSteps().size() > 1) {  //todo just guessing
//                        branch.loopStart = true;
//                    }

                } else {
//                    branch.exitsLoop = true;
                }
            }
            return loopFound;
        }
    }

    public void findBlockSequences() {
        if (visitedBlocks.contains(this)) {
            return;
        }
        visitedBlocks.add(this);

        Block block = nextBlock;
        while (block != null) {
            block = block.nextBlock;
        }
        if (nextBlocks != null) {
            for (Block nextBlock : nextBlocks) {
                nextBlock.findBlockSequences();
            }
        }
        if (block != nextBlock) {  // more blocks can be merged together

        }


    }

/*
    public boolean findLoops(Block root, Block me) {

        if (visitedBlocks.contains(me)) {   // prevents infinite recursion in case there are other loops
            return false;
        }
        if (lastStepIsCondition) {
            for (Block nextBlock : nextBlocks) {
                if (_processNextBlock(root, nextBlock)) {
                    return true;
                }
            }
            return false;
        } else {
            Block nextBlock = this.nextBlock;
            return _processNextBlock(root, nextBlock);
        }
    }

    private boolean _processNextBlock(Block root, Block nextBlock) {
        if (nextBlock == root) {
            log.info("Loop found! Root is "+root);
            loop.clear();
            loop.add(nextBlock);
            return true;
        } else {
            boolean loopFound = findLoops(root, nextBlock);
            if (loopFound) {
                loop.add(nextBlock);
                return loopFound;
            }
        }
        return false;
    }
*/

//    private void verifyLoop() {
//        for (Block block : loop) {
//            Step firstStep = block.firstStep;
//            if (firstStep.getReverseSteps().size() > 1) {
//                throw new IllegalStateException("There cannot be more entries in a loop! "+block);
//            }
//            if ()
//            if (block.l)
//        }
//    }

    public String toString() {
        if (lastStep == firstStep) return "Block-1 "+firstStep.toString();
//        return "Block-n "+firstStep.toString()+" - "+lastStep.toString();
        return "Block-"+size+" "+firstStep.toString()+" - "+lastStep.toString();
    }

/*
    public void transform(BufferedWriter file, int cycles) throws IOException {
        transform(file, cycles, this.exitsLoop);
    }
*/

    public boolean transform(BufferedWriter file, int cycles) throws IOException {
        if (!printed) {
            Step step = firstStep;
            while (step != null) {
                step.transform(file, cycles);
                if (step == lastStep) {
                    step = null;
                }  else {
                    step = step.getFollower();
                }
            }
            printed = true;
            return true;
        }
        return false;
//        if (get)
    }


    public void transform(BufferedWriter file, int cycles, boolean exitsLoop) throws IOException {
        if (!printed) {
            Step step = firstStep;
            while (step != null) {
                step.transform(file, cycles);
                if (step == lastStep) {
                    step = null;
                }  else {
                    step = step.getFollower();
                }
            }
            printed = true;
        }
        if (exitsLoop) {
            Repository.align(file, cycles);
            file.write("if (returnValue) break;\n");
        }

        if (lastStepIsCondition) {
            if (nextBlocks.size() == 2) {
                Repository.align(file, cycles);
                file.write("if (condition) {\n");
                nextBlocks.get(0).transform(file, cycles + 1);
                Repository.align(file, cycles);
                file.write("} else {\n");
                nextBlocks.get(1).transform(file, cycles + 1);
                Repository.align(file, cycles);
                file.write("}\n");
            } else {
                Repository.align(file, cycles);
                file.write("switch (condition) {\n");
                for (Block block : nextBlocks) {
                    Repository.align(file, cycles+1);
                    file.write("case 1:\n");
                    Repository.align(file, cycles+2);
                    block.transform(file, cycles+2);
                    Repository.align(file, cycles+2);
                    file.write("break;\n");
                }
            }
        } else {
            if (nextBlock != null) {
                nextBlock.transform(file, cycles);
            }
        }
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
        prefixBlock.put(prefix, this);
    }


    public void addAdditionalPrefix(String prefix) {
        if (additionalPrefixes == null) {
            additionalPrefixes = new LinkedList<>();
        }
        additionalPrefixes.add(prefix);
        if (getBlock(prefix) != null) {
            throw new IllegalStateException("Prefix is not unique: "+prefix);
        }
        prefixBlock.put(prefix, this);
        log.info(this+" - prefix: "+prefix);
    }

    public List<String> getAdditionalPrefixes() {
        return additionalPrefixes;
    }

    private static Map<String, Block> prefixBlock = new HashMap<>();
    public static Block getBlock(String prefix) {
        return prefixBlock.get(prefix);
    }

    public static void clearPrefixBlock() {
        prefixBlock.clear();
    }

    public Block getNextBlock() {
        return nextBlock;
    }

    public List<Block> getNextBlocks() {
        return nextBlocks;
    }


}
