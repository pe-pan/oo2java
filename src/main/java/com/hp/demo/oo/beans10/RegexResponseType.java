
package com.hp.demo.oo.beans10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for regexResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="regexResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{}baseResponseType">
 *       &lt;all>
 *         &lt;element name="modifiedTimestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="annotation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entireString" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="expression" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ignoreCase" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="multiLine" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "regexResponseType", propOrder = {
    "modifiedTimestamp",
    "annotation",
    "entireString",
    "expression",
    "ignoreCase",
    "multiLine",
    "name",
    "regType"
})
public class RegexResponseType
    extends BaseResponseType
{

    protected String modifiedTimestamp;
    protected String annotation;
    protected boolean entireString;
    @XmlElement(required = true)
    protected String expression;
    protected boolean ignoreCase;
    protected boolean multiLine;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String regType;

    /**
     * Gets the value of the modifiedTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifiedTimestamp() {
        return modifiedTimestamp;
    }

    /**
     * Sets the value of the modifiedTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifiedTimestamp(String value) {
        this.modifiedTimestamp = value;
    }

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
     * Gets the value of the entireString property.
     * 
     */
    public boolean isEntireString() {
        return entireString;
    }

    /**
     * Sets the value of the entireString property.
     * 
     */
    public void setEntireString(boolean value) {
        this.entireString = value;
    }

    /**
     * Gets the value of the expression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpression() {
        return expression;
    }

    /**
     * Sets the value of the expression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpression(String value) {
        this.expression = value;
    }

    /**
     * Gets the value of the ignoreCase property.
     * 
     */
    public boolean isIgnoreCase() {
        return ignoreCase;
    }

    /**
     * Sets the value of the ignoreCase property.
     * 
     */
    public void setIgnoreCase(boolean value) {
        this.ignoreCase = value;
    }

    /**
     * Gets the value of the multiLine property.
     * 
     */
    public boolean isMultiLine() {
        return multiLine;
    }

    /**
     * Sets the value of the multiLine property.
     * 
     */
    public void setMultiLine(boolean value) {
        this.multiLine = value;
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
     * Gets the value of the regType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegType() {
        return regType;
    }

    /**
     * Sets the value of the regType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegType(String value) {
        this.regType = value;
    }

}
