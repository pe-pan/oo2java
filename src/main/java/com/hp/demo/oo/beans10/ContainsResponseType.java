
package com.hp.demo.oo.beans10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for containsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="containsResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{}baseResponseType">
 *       &lt;all>
 *         &lt;element name="modifiedTimestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="annotation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ignoreCase" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="matchType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="ALWAYS_MATCH"/>
 *               &lt;enumeration value="BEGINS_WITH"/>
 *               &lt;enumeration value="CONTAINS"/>
 *               &lt;enumeration value="ENDS_WITH"/>
 *               &lt;enumeration value="EXACT_MATCH"/>
 *               &lt;enumeration value="MATCH_ALL_WORDS"/>
 *               &lt;enumeration value="MATCH_AT_LEAST_ONE_WORD"/>
 *               &lt;enumeration value="MATCH_NONE_OF_THE_WORDS"/>
 *               &lt;enumeration value="MATCH_ONLY_ONE_WORD"/>
 *               &lt;enumeration value="NOT_EXACT_MATCH"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "containsResponseType", propOrder = {
    "modifiedTimestamp",
    "annotation",
    "ignoreCase",
    "matchType",
    "name",
    "text"
})
public class ContainsResponseType
    extends BaseResponseType
{

    protected String modifiedTimestamp;
    protected String annotation;
    protected boolean ignoreCase;
    protected String matchType;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String text;

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
     * Gets the value of the matchType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchType() {
        return matchType;
    }

    /**
     * Sets the value of the matchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchType(String value) {
        this.matchType = value;
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

}
