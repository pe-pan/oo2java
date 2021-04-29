package com.hp.demo.oo.entity;

import com.hp.demo.oo.beans.AttributeType;
import com.hp.demo.oo.beans.RootType;

import java.util.List;

/**
 * Created by panuska on 28.7.14.
 */
public class BeanHelper {
    public static final String getAttributeValue(RootType bean, String name) {
        for (AttributeType attribute : bean.getNode().getAttribute()) {
            if (name.equals(attribute.getName())) {
                return attribute.getContent().toString();
            }
        }
        return null;
    }
}
