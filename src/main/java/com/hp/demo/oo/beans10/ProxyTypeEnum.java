
package com.hp.demo.oo.beans10;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for proxyTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="proxyTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="GENERIC_PROXY"/>
 *     &lt;enumeration value="OPSWARE_GATEWAY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "proxyTypeEnum")
@XmlEnum
public enum ProxyTypeEnum {

    NONE,
    GENERIC_PROXY,
    OPSWARE_GATEWAY;

    public String value() {
        return name();
    }

    public static ProxyTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
