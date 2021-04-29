
package com.hp.demo.oo.beans10;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for identityAttributeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="identityAttributeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="USERNAME"/>
 *     &lt;enumeration value="PASSWORD"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "identityAttributeType")
@XmlEnum
public enum IdentityAttributeType {

    USERNAME,
    PASSWORD,
    OTHER;

    public String value() {
        return name();
    }

    public static IdentityAttributeType fromValue(String v) {
        return valueOf(v);
    }

}
