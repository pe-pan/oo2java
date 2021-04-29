package com.hp.demo.oo.entity;

import com.hp.demo.oo.beans.RootType;

/**
 * Created by panuska on 28.7.14.
 */
public abstract class Entity {
    private String uuid;

    Entity(RootType bean) {
        uuid = bean.getNode().getId();
    }

    public String getUuid() {
        return uuid;
    }

}
