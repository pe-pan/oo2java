package com.hp.demo.oo.graph;

import com.hp.demo.oo.Repository;
import com.hp.demo.oo.beans10.RegularStepType;
import com.hp.demo.oo.beans10.TransitionType;
import com.hp.demo.oo.beans10.TransitionsType;
import com.hp.demo.oo.entity.Flow;
import org.apache.log4j.Logger;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by panuska on 30.7.14.
 */
public class Step implements Comparable<Step>{
    private static Logger log = Logger.getLogger(Block.class.getName());
    private String uuid;
    private String name;
    private Flow flow;
    private TransitionsType transitionsBean;
    private List<Transition> transitions;         // where to continue from me

    ///////////////
    private boolean isStartStep;
    private boolean isFailing;
    private int order;
    public static final int NO_ORDER = -1;
    public static final int NO_LOOP = -1;
//    private Set<Step> reverseSteps;  // which step continues to me
    private Set<Transition> reverseTransitions;       //todo optimize reverseSteps/reverseTransitions data structures (aren't they redundant?)

    private int loopNumber;

    public int getLoopNumber() {
        return loopNumber;
    }

    public void setLoopNumber(int loopNumber) {    // todo a step might be in more loops!
        this.loopNumber = loopNumber;
    }

    /*
        enum Purpose {
            loopStart
        }

        private Purpose purpose;

        public Purpose getPurpose() {
            return purpose;
        }

        public void setPurpose(Purpose purpose) {
            this.purpose = purpose;
        }
    */

    Step(String uuid, String name, Flow flow, TransitionsType transitionsBean) {
        this.uuid = uuid;
        this.name = name;
        this.flow = flow;
        this.transitionsBean = transitionsBean;
        this.isFailing = false;
//        this.reverseSteps = new HashSet<>();
        this.reverseTransitions = new HashSet<>();
        this.order = NO_ORDER;
    }

    public Step(RegularStepType stepBean) {
        this(stepBean.getId(), stepBean.getName(), Repository.getRepository().getFlow(stepBean.getOpRef().getRefId()), stepBean.getTransitions());
    }

    public void initTransitions(Map<String, Step> steps) {
        transitions = new ArrayList<>(transitionsBean.getTransition().size());
        for (TransitionType transition : transitionsBean.getTransition()) {
            Step destination = steps.get(transition.getDestination().getRefId());
            if (destination == null) {
                throw new IllegalStateException("Destination step must not be null! "+transition.getDestination().getRefId());
            }
            log.debug("Transition name: "+transition.getName());

            //remove duplicates
            Transition original = null;

            for (Transition t : transitions) {
                if (t.getDestination() == destination) {
                    original = t;
                }
            }

            if (original == null) {
                Transition t = new Transition(transition.getName(), destination, this);
                transitions.add(t);
                destination.addReverseTransition(t);
            } else {
                original.addOtherName(transition.getName());
            }
//            destination.addReverseStep(this);
        }


        Collections.sort(transitions);    // sort the transition so we can traverse them in the right order
    }

    public Step getNextStepInTheLoop() {
        Step nextStep = null;
        for (Transition transition : transitions) {
            if (transition.getPurpose() == Transition.Purpose.loops) {
                if (nextStep != null) {
                    throw new IllegalStateException("There are 2 loop transitions! "+nextStep+", "+transition.getDestination());
                }
                nextStep = transition.getDestination();
            }
        }
        return nextStep;
    }

    public List<Step> getLoopExitSteps() {
        List<Step> steps = new LinkedList<>();
        for (Transition transition : transitions) {
            if (transition.getPurpose() == Transition.Purpose.noPurpose) {
                steps.add(transition.getDestination());
            }
        }
        return steps;
    }

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public Flow getFlow() {
        return flow;
    }

    public List<Transition> getTransitions() {
        return transitions;
    }

    public Step getFollower() {
        List<Step> nextValidSteps = getNextValidSteps();
        if (nextValidSteps.size() > 1) throw new IllegalStateException("There cannot be more followers! "+getNextValidSteps());
        return nextValidSteps.get(0);
//        if (transitions != null) return transitions.get(0).getDestination();
//        return null;
    }

    public String toString() {
        return getName();
    }

    public String getJavaString() {
        String comment = this.getName().equals(this.getFlow().getName()) ? "" : " //"+this.getName();  // write comment only if step name differs from flow name
        String pakage = this.getFlow().getPackage();
        pakage = pakage != null && pakage.length() > 0 ? pakage+"." : "";
        return pakage+getFlow().getName().replace(' ', '_')+"();"+comment;
    }

    public void transform(BufferedWriter file, int cycles) throws IOException {
        Repository.align(file, cycles);
        file.write(getJavaString()+"\n");
    }

    public boolean isFailing() {
        return isFailing;
    }

    public void setFailing(boolean failing) {
        isFailing = failing;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

//    public void addReverseStep(Step source) {
//        this.reverseSteps.add(source);
//    }

//    public Set<Step> getReverseSteps() {
//        return reverseSteps;
//    }

    public void addReverseTransition(Transition transition) {
        this.reverseTransitions.add(transition);
    }

    public Set<Transition> getReverseTransitions() {
        return reverseTransitions;
    }

    private static Map<Step, Step> cycleStartEnd = new HashMap<>();
    private static Map<Step, Step> cycleEndStart = new HashMap<>();

    public void addStartCycle(Step returnStep) {
        cycleStartEnd.put(this, returnStep);
    }
    public void addEndCycle(Step startStep) {
        cycleEndStart.put(this, startStep);
    }

    public Step isCycleStart() {
        return cycleStartEnd.get(this);
    }

    public Step isCycleEnd() {
        return cycleEndStart.get(this);
    }

    @Override
    public int compareTo(Step o) {
        return this.getOrder() - o.getOrder();
    }

    /**
     * Does not return failing steps; if there is more transitions pointing to the same step, it merges them.
      * @return
     */

    private List<Step> nextValidSteps;
    public List<Step> getNextValidSteps() {
        if (nextValidSteps == null) {
            nextValidSteps = new LinkedList<>();
            if (transitions != null) {
                for (Transition t : transitions) {
                    if (!t.isFailing()) {
                        if (!nextValidSteps.contains(t.getDestination())) {
                            nextValidSteps.add(t.getDestination());
                        }
                    }
                }
            }
        }
        return nextValidSteps;
    }

    public boolean isStartStep() {
        return isStartStep;
    }

    public void setStartStep(boolean startStep) {
        isStartStep = startStep;
    }

    public int getNumberOfInputs() {
        if (isStartStep)
            return reverseTransitions.size() + 1;
        return reverseTransitions.size();
    }
}
