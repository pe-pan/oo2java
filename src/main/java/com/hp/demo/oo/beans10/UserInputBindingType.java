
package com.hp.demo.oo.beans10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userInputBindingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userInputBindingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="annotation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assignFromContext" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="assignToContext" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dynPickListKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fromContextKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inputSymbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inputType" type="{}inputTypeType"/>
 *         &lt;element name="isList" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isMultiSelect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isPersisted" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="link" type="{}refIdType" minOccurs="0"/>
 *         &lt;element name="listDelimiter" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sourceDelimiter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prompt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recordKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recordName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="record" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="required" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="toContextKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validationFormat" type="{}refIdType" minOccurs="0"/>
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
@XmlType(name = "userInputBindingType", propOrder = {

})
public class UserInputBindingType {

    protected String annotation;
    protected boolean assignFromContext;
    protected boolean assignToContext;
    protected String dynPickListKey;
    protected String fromContextKey;
    @XmlElement(required = true)
    protected String inputSymbol;
    @XmlElement(required = true)
    protected InputTypeType inputType;
    protected boolean isList;
    protected Boolean isMultiSelect;
    protected boolean isPersisted;
    protected RefIdType link;
    @XmlElement(required = true)
    protected String listDelimiter;
    protected String sourceDelimiter;
    protected String prompt;
    protected String recordKey;
    protected String recordName;
    protected Boolean record;
    protected boolean required;
    protected String toContextKey;
    protected RefIdType validationFormat;
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
     * Gets the value of the assignFromContext property.
     * 
     */
    public boolean isAssignFromContext() {
        return assignFromContext;
    }

    /**
     * Sets the value of the assignFromContext property.
     * 
     */
    public void setAssignFromContext(boolean value) {
        this.assignFromContext = value;
    }

    /**
     * Gets the value of the assignToContext property.
     * 
     */
    public boolean isAssignToContext() {
        return assignToContext;
    }

    /**
     * Sets the value of the assignToContext property.
     * 
     */
    public void setAssignToContext(boolean value) {
        this.assignToContext = value;
    }

    /**
     * Gets the value of the dynPickListKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDynPickListKey() {
        return dynPickListKey;
    }

    /**
     * Sets the value of the dynPickListKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDynPickListKey(String value) {
        this.dynPickListKey = value;
    }

    /**
     * Gets the value of the fromContextKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromContextKey() {
        return fromContextKey;
    }

    /**
     * Sets the value of the fromContextKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromContextKey(String value) {
        this.fromContextKey = value;
    }

    /**
     * Gets the value of the inputSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInputSymbol() {
        return inputSymbol;
    }

    /**
     * Sets the value of the inputSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInputSymbol(String value) {
        this.inputSymbol = value;
    }

    /**
     * Gets the value of the inputType property.
     * 
     * @return
     *     possible object is
     *     {@link InputTypeType }
     *     
     */
    public InputTypeType getInputType() {
        return inputType;
    }

    /**
     * Sets the value of the inputType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputTypeType }
     *     
     */
    public void setInputType(InputTypeType value) {
        this.inputType = value;
    }

    /**
     * Gets the value of the isList property.
     * 
     */
    public boolean isIsList() {
        return isList;
    }

    /**
     * Sets the value of the isList property.
     * 
     */
    public void setIsList(boolean value) {
        this.isList = value;
    }

    /**
     * Gets the value of the isMultiSelect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMultiSelect() {
        return isMultiSelect;
    }

    /**
     * Sets the value of the isMultiSelect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMultiSelect(Boolean value) {
        this.isMultiSelect = value;
    }

    /**
     * Gets the value of the isPersisted property.
     * 
     */
    public boolean isIsPersisted() {
        return isPersisted;
    }

    /**
     * Sets the value of the isPersisted property.
     * 
     */
    public void setIsPersisted(boolean value) {
        this.isPersisted = value;
    }

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link RefIdType }
     *     
     */
    public RefIdType getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefIdType }
     *     
     */
    public void setLink(RefIdType value) {
        this.link = value;
    }

    /**
     * Gets the value of the listDelimiter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListDelimiter() {
        return listDelimiter;
    }

    /**
     * Sets the value of the listDelimiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListDelimiter(String value) {
        this.listDelimiter = value;
    }

    /**
     * Gets the value of the sourceDelimiter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceDelimiter() {
        return sourceDelimiter;
    }

    /**
     * Sets the value of the sourceDelimiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceDelimiter(String value) {
        this.sourceDelimiter = value;
    }

    /**
     * Gets the value of the prompt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrompt() {
        return prompt;
    }

    /**
     * Sets the value of the prompt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrompt(String value) {
        this.prompt = value;
    }

    /**
     * Gets the value of the recordKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordKey() {
        return recordKey;
    }

    /**
     * Sets the value of the recordKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordKey(String value) {
        this.recordKey = value;
    }

    /**
     * Gets the value of the recordName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordName() {
        return recordName;
    }

    /**
     * Sets the value of the recordName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordName(String value) {
        this.recordName = value;
    }

    /**
     * Gets the value of the record property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRecord() {
        return record;
    }

    /**
     * Sets the value of the record property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRecord(Boolean value) {
        this.record = value;
    }

    /**
     * Gets the value of the required property.
     * 
     */
    public boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     */
    public void setRequired(boolean value) {
        this.required = value;
    }

    /**
     * Gets the value of the toContextKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToContextKey() {
        return toContextKey;
    }

    /**
     * Sets the value of the toContextKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToContextKey(String value) {
        this.toContextKey = value;
    }

    /**
     * Gets the value of the validationFormat property.
     * 
     * @return
     *     possible object is
     *     {@link RefIdType }
     *     
     */
    public RefIdType getValidationFormat() {
        return validationFormat;
    }

    /**
     * Sets the value of the validationFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefIdType }
     *     
     */
    public void setValidationFormat(RefIdType value) {
        this.validationFormat = value;
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
