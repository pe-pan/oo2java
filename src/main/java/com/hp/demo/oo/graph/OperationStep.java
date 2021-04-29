package com.hp.demo.oo.graph;

import com.hp.demo.oo.Repository;
import com.hp.demo.oo.beans10.RegularStepType;
import com.hp.demo.oo.entity.Operation;

/**
 * Created by panuska on 31.7.14.
 */
public class OperationStep extends Step {
    Operation operation;

    public OperationStep(RegularStepType stepBean) {
        super(stepBean.getId(), stepBean.getName(), null, stepBean.getTransitions());
        operation = Repository.getRepository().getOperation(stepBean.getId());
    }

    public Operation getOperation() {
        return operation;
    }

    public String toString() {
        return this.getOperation().getName()+"(); // - operation"+this.getName();
    }
}
