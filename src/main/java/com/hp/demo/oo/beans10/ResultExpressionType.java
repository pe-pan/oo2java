
package com.hp.demo.oo.beans10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultExpressionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultExpressionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="annotation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sourceType" type="{}sourceTypeType"/>
 *         &lt;element name="containsEvaluator" type="{}containsResponseType" minOccurs="0"/>
 *         &lt;element name="compare" type="{}compareResponseType" minOccurs="0"/>
 *         &lt;element name="referenceEvaluator" type="{}referenceResponseType" minOccurs="0"/>
 *         &lt;element name="regexEvaluator" type="{}regexResponseType" minOccurs="0"/>
 *         &lt;element name="scriptletEvaluator" type="{}scriptletResponseType" minOccurs="0"/>
 *         &lt;element name="filters" type="{}filtersType" minOccurs="0"/>
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
@XmlType(name = "resultExpressionType", propOrder = {

})
public class ResultExpressionType {

    @XmlElement(required = true)
    protected String annotation;
    @XmlElement(required = true)
    protected String fieldName;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected SourceTypeType sourceType;
    protected ContainsResponseType containsEvaluator;
    protected CompareResponseType compare;
    protected ReferenceResponseType referenceEvaluator;
    protected RegexResponseType regexEvaluator;
    protected ScriptletResponseType scriptletEvaluator;
    protected FiltersType filters;
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
     * Gets the value of the fieldName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets the value of the fieldName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
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
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link SourceTypeType }
     *     
     */
    public SourceTypeType getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceTypeType }
     *     
     */
    public void setSourceType(SourceTypeType value) {
        this.sourceType = value;
    }

    /**
     * Gets the value of the containsEvaluator property.
     * 
     * @return
     *     possible object is
     *     {@link ContainsResponseType }
     *     
     */
    public ContainsResponseType getContainsEvaluator() {
        return containsEvaluator;
    }

    /**
     * Sets the value of the containsEvaluator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainsResponseType }
     *     
     */
    public void setContainsEvaluator(ContainsResponseType value) {
        this.containsEvaluator = value;
    }

    /**
     * Gets the value of the compare property.
     * 
     * @return
     *     possible object is
     *     {@link CompareResponseType }
     *     
     */
    public CompareResponseType getCompare() {
        return compare;
    }

    /**
     * Sets the value of the compare property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareResponseType }
     *     
     */
    public void setCompare(CompareResponseType value) {
        this.compare = value;
    }

    /**
     * Gets the value of the referenceEvaluator property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceResponseType }
     *     
     */
    public ReferenceResponseType getReferenceEvaluator() {
        return referenceEvaluator;
    }

    /**
     * Sets the value of the referenceEvaluator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceResponseType }
     *     
     */
    public void setReferenceEvaluator(ReferenceResponseType value) {
        this.referenceEvaluator = value;
    }

    /**
     * Gets the value of the regexEvaluator property.
     * 
     * @return
     *     possible object is
     *     {@link RegexResponseType }
     *     
     */
    public RegexResponseType getRegexEvaluator() {
        return regexEvaluator;
    }

    /**
     * Sets the value of the regexEvaluator property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegexResponseType }
     *     
     */
    public void setRegexEvaluator(RegexResponseType value) {
        this.regexEvaluator = value;
    }

    /**
     * Gets the value of the scriptletEvaluator property.
     * 
     * @return
     *     possible object is
     *     {@link ScriptletResponseType }
     *     
     */
    public ScriptletResponseType getScriptletEvaluator() {
        return scriptletEvaluator;
    }

    /**
     * Sets the value of the scriptletEvaluator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScriptletResponseType }
     *     
     */
    public void setScriptletEvaluator(ScriptletResponseType value) {
        this.scriptletEvaluator = value;
    }

    /**
     * Gets the value of the filters property.
     * 
     * @return
     *     possible object is
     *     {@link FiltersType }
     *     
     */
    public FiltersType getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiltersType }
     *     
     */
    public void setFilters(FiltersType value) {
        this.filters = value;
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
