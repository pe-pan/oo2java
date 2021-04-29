
package com.hp.demo.oo.beans10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for selectLineFilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="selectLineFilterType">
 *   &lt;complexContent>
 *     &lt;extension base="{}baseFilterType">
 *       &lt;all>
 *         &lt;element name="annotation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="autoSelectLineEnding" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unixLineEnding" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="windowsLineEnding" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "selectLineFilterType", propOrder = {
    "annotation",
    "autoSelectLineEnding",
    "name",
    "text",
    "type",
    "unixLineEnding",
    "windowsLineEnding"
})
public class SelectLineFilterType
    extends BaseFilterType
{

    @XmlElement(required = true)
    protected String annotation;
    @XmlElement(required = true)
    protected String autoSelectLineEnding;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String text;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String unixLineEnding;
    @XmlElement(required = true)
    protected String windowsLineEnding;

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
     * Gets the value of the autoSelectLineEnding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoSelectLineEnding() {
        return autoSelectLineEnding;
    }

    /**
     * Sets the value of the autoSelectLineEnding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoSelectLineEnding(String value) {
        this.autoSelectLineEnding = value;
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

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the unixLineEnding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnixLineEnding() {
        return unixLineEnding;
    }

    /**
     * Sets the value of the unixLineEnding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnixLineEnding(String value) {
        this.unixLineEnding = value;
    }

    /**
     * Gets the value of the windowsLineEnding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWindowsLineEnding() {
        return windowsLineEnding;
    }

    /**
     * Sets the value of the windowsLineEnding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWindowsLineEnding(String value) {
        this.windowsLineEnding = value;
    }

}
