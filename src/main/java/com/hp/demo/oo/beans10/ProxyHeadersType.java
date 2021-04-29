
package com.hp.demo.oo.beans10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for proxyHeadersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="proxyHeadersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="entry" type="{}proxyEntryType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "proxyHeadersType", propOrder = {

})
public class ProxyHeadersType {

    protected ProxyEntryType entry;

    /**
     * Gets the value of the entry property.
     * 
     * @return
     *     possible object is
     *     {@link ProxyEntryType }
     *     
     */
    public ProxyEntryType getEntry() {
        return entry;
    }

    /**
     * Sets the value of the entry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProxyEntryType }
     *     
     */
    public void setEntry(ProxyEntryType value) {
        this.entry = value;
    }

}
