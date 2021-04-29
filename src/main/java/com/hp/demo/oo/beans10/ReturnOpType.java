
package com.hp.demo.oo.beans10;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for returnOpType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="returnOpType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RESOLVED"/>
 *     &lt;enumeration value="ERROR"/>
 *     &lt;enumeration value="DIAGNOSED"/>
 *     &lt;enumeration value="NO_ACTION_TAKEN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "returnOpType")
@XmlEnum
public enum ReturnOpType {

    RESOLVED,
    ERROR,
    DIAGNOSED,
    NO_ACTION_TAKEN;

    public String value() {
        return name();
    }

    public static ReturnOpType fromValue(String v) {
        return valueOf(v);
    }

}
