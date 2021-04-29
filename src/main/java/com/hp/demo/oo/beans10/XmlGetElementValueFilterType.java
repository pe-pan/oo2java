
package com.hp.demo.oo.beans10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xmlGetElementValueFilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xmlGetElementValueFilterType">
 *   &lt;complexContent>
 *     &lt;extension base="{}baseFilterType">
 *       &lt;all>
 *         &lt;element name="annotation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="elementPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xmlGetElementValueFilterType", propOrder = {
    "annotation",
    "elementPath",
    "name"
})
public class XmlGetElementValueFilterType
    extends BaseFilterType
{

    @XmlElement(required = true)
    protected String annotation;
    protected String elementPath;
    @XmlElement(required = true)
    protected String name;

    /**
     * Gets the value of the annotation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnotation() {
        return annotation;
    }

    /**
     * Sets the value of the annotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnotation(String value) {
        this.annotation = value;
    }

    /**
     * Gets the value of the elementPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementPath() {
        return elementPath;
    }

    /**
     * Sets the value of the elementPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementPath(String value) {
        this.elementPath = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
