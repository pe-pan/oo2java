
package com.hp.demo.oo.beans10;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inputTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="inputTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STRING"/>
 *     &lt;enumeration value="ENCRYPTED"/>
 *     &lt;enumeration value="BOOLEAN"/>
 *     &lt;enumeration value="OBJECT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "inputTypeType")
@XmlEnum
public enum InputTypeType {

    STRING,
    ENCRYPTED,
    BOOLEAN,
    OBJECT;

    public String value() {
        return name();
    }

    public static InputTypeType fromValue(String v) {
        return valueOf(v);
    }

}
