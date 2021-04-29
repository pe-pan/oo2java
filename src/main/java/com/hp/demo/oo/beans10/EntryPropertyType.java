
package com.hp.demo.oo.beans10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entryPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entryPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modelValue" type="{}modelValueType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entryPropertyType", propOrder = {
    "key",
    "modelValue"
})
public class EntryPropertyType {

    @XmlElement(required = true)
    protected String key;
    @XmlElement(required = true)
    protected ModelValueType modelValue;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the modelValue property.
     * 
     * @return
     *     possible object is
     *     {@link ModelValueType }
     *     
     */
    public ModelValueType getModelValue() {
        return modelValue;
    }

    /**
     * Sets the value of the modelValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModelValueType }
     *     
     */
    public void setModelValue(ModelValueType value) {
        this.modelValue = value;
    }

}
