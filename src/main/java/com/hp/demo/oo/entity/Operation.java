package com.hp.demo.oo.entity;

import com.hp.demo.oo.beans10.OperationType;

/**
 * Created by panuska on 31.7.14.
 */
public class Operation {
    String uuid;
    String name;
    String pakage;
    String annotation;

    public Operation(OperationType bean, String pakage) {
        this.uuid = bean.getId();
        this.name = bean.getName();
        this.annotation = bean.getAnnotation();
        this.pakage = pakage;
    }

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getPackage() {
        return pakage;
    }

    public String getAnnotation() {
        return annotation;
    }
}
