
package com.hp.demo.oo.beans10;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for regexFormatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="regexFormatType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PERL5"/>
 *     &lt;enumeration value="JAVA"/>
 *     &lt;enumeration value="AWK"/>
 *     &lt;enumeration value="GLOB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "regexFormatType")
@XmlEnum
public enum RegexFormatType {

    @XmlEnumValue("PERL5")
    PERL_5("PERL5"),
    JAVA("JAVA"),
    AWK("AWK"),
    GLOB("GLOB");
    private final String value;

    RegexFormatType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegexFormatType fromValue(String v) {
        for (RegexFormatType c: RegexFormatType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
