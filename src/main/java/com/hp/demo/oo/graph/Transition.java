package com.hp.demo.oo.graph;

import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by panuska on 30.7.14.
 */
public class Transition implements Comparable<Transition> {
    private static Logger log = Logger.getLogger(Transition.class.getName());
    private final String name;
    private final Step source;
    private final Step destination;
    private List<String> otherNames;
    private boolean isFailing;   // leads to a failing state

    public boolean isFailing() {
        return isFailing;
    }

    public void setFailing(boolean failing) {
        isFailing = failing;
    }

    public enum Purpose {
        noPurpose, goesBackToLoop, loops, exitsLoop;
    }

    Purpose purpose = Purpose.noPurpose;

    public Purpose getPurpose() {
        return purpose;
    }

    public void setPurpose(Purpose purpose) {
        this.purpose = purpose;
    }

    public Transition(String name, Step destination, Step source) {
        this.name = name;
        this.destination = destination;
        this.source = source;
    }

    public String getName() {
        return name;
    }

    public Step getDestination() {
        return destination;
    }

    public Step getSource() {
        return source;
    }

    enum Order {
        _success, _done, _notNull, _isNull, _has_more, _no_more, _true, _false, _yes, _no, _Yes, _No,
        _unknown,
        _INFORMATIONAL, _REDIRECTION, _PAGE_NOT_FOUND, _failure;  // todo the order is significant!!
    }

    @Override
    public int compareTo(Transition o) {
        Order thisOrder = getOrder();
        Order thatOrder = o.getOrder();
        if (thisOrder == Order._failure && thatOrder == Order._failure) {  // if both are failures (perhaps, they are both unknown transition types)
            return this.getName().compareTo(o.getName());                // order is based on alphabetical order of their names
        } else {
            return (thisOrder.ordinal() - thatOrder.ordinal());        // otherwise, order is based on Order enum definition
        }
    }

    private Order getOrder() {
        try {
            return Order.valueOf("_"+this.getName().replace(' ', '_'));
        } catch (IllegalArgumentException e) {
            log.error("Unknown transition name "+this.getName());
            return Order._failure;
        }
    }

    public String toString() {
        return name;
    }

    public void addOtherName(String otherName) {
        if (otherNames == null) {
            otherNames = new LinkedList<>();
        }
        otherNames.add(otherName);
    }
}
