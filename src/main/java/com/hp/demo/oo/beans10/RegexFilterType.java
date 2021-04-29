
package com.hp.demo.oo.beans10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for regexFilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="regexFilterType">
 *   &lt;complexContent>
 *     &lt;extension base="{}baseFilterType">
 *       &lt;all>
 *         &lt;element name="annotation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="entireString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="expression" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ignoreCase" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="multiLine" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regType" type="{}regexFormatType"/>
 *       &lt;/all>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "regexFilterType", propOrder = {
    "annotation",
    "entireString",
    "expression",
    "ignoreCase",
    "multiLine",
    "name",
    "regType"
})
public class RegexFilterType
    extends BaseFilterType
{

    @XmlElement(required = true)
    protected String annotation;
    @XmlElement(required = true)
    protected String entireString;
    @XmlElement(required = true)
    protected String expression;
    @XmlElement(required = true)
    protected String ignoreCase;
    @XmlElement(required = true)
    protected String multiLine;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected RegexFormatType regType;

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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntireString() {
        return entireString;
    }

    /**
     * Sets the value of the entireString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntireString(String value) {
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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIgnoreCase() {
        return ignoreCase;
    }

    /**
     * Sets the value of the ignoreCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIgnoreCase(String value) {
        this.ignoreCase = value;
    }

    /**
     * Gets the value of the multiLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultiLine() {
        return multiLine;
    }

    /**
     * Sets the value of the multiLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultiLine(String value) {
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
     *     {@link RegexFormatType }
     *     
     */
    public RegexFormatType getRegType() {
        return regType;
    }

    /**
     * Sets the value of the regType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegexFormatType }
     *     
     */
    public void setRegType(RegexFormatType value) {
        this.regType = value;
    }

}
