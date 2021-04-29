package com.hp.demo.oo.graph;

import com.hp.demo.oo.beans10.ReturnStepType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/**
 * Created by panuska on 31.7.14.
 */
public class ReturnStep extends Step {

    public enum Type {
        RESOLVED, ERROR, NO_ACTION_TAKEN, DIAGNOSED;
    }

    private Type type;

    public ReturnStep (ReturnStepType stepBean) {
        super(stepBean.getId(), stepBean.getName(), null, stepBean.getTransitions());
        type = Type.valueOf(stepBean.getReturnStepType().value());
        if (type == Type.ERROR) {
            setFailing(true);
        }
    }

    public void initTransitions(Map<String, Step> steps) {
        return;
        // there are no transitions from return step
    }

    public String toString() {
        switch (type) {
            case RESOLVED : return "return value;";
            case ERROR : return "throw new Exception(\""+this.getName()+"\");";
            case NO_ACTION_TAKEN : return "return null;";
            case DIAGNOSED: return "return diagnosed;";
        }
        throw new IllegalStateException("These are the only allowed types: "+ Arrays.toString(Type.values()));
    }

    public String getJavaString() {
        return toString();
    }

    public Type getType() {
        return type;
    }


}
