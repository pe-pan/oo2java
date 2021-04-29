
package com.hp.demo.oo.beans10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for regexEvaluatorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="regexEvaluatorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="annotation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="expression" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ignoreCase" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="multiLine" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="entireString" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="regType" type="{}regexFormatType"/>
 *       &lt;/all>
 *       &lt;attribute name="id" type="{}restrictionId" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "regexEvaluatorType", propOrder = {

})
public class RegexEvaluatorType {

    @XmlElement(required = true)
    protected String annotation;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String expression;
    protected boolean ignoreCase;
    protected boolean multiLine;
    protected boolean entireString;
    @XmlElement(required = true)
    protected RegexFormatType regType;
    @XmlAttribute(name = "id")
    protected String id;

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

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
