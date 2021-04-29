
package com.hp.demo.oo.beans10;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sourceTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="sourceTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RAWRESULT"/>
 *     &lt;enumeration value="AVAILABLE_RESULT"/>
 *     &lt;enumeration value="INPUT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "sourceTypeType")
@XmlEnum
public enum SourceTypeType {

    RAWRESULT,
    AVAILABLE_RESULT,
    INPUT;

    public String value() {
        return name();
    }

    public static SourceTypeType fromValue(String v) {
        return valueOf(v);
    }

}
