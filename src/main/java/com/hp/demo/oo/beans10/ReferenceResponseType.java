
package com.hp.demo.oo.beans10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for referenceResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="referenceResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{}baseResponseType">
 *       &lt;all>
 *         &lt;element name="modifiedTimestamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="annotation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="evaluatorRef" type="{}refIdType"/>
 *       &lt;/all>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "referenceResponseType", propOrder = {
    "modifiedTimestamp",
    "annotation",
    "name",
    "evaluatorRef"
})
public class ReferenceResponseType
    extends BaseResponseType
{

    protected String modifiedTimestamp;
    protected String annotation;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected RefIdType evaluatorRef;

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
     * Gets the value of the evaluatorRef property.
     * 
     * @return
     *     possible object is
     *     {@link RefIdType }
     *     
     */
    public RefIdType getEvaluatorRef() {
        return evaluatorRef;
    }

    /**
     * Sets the value of the evaluatorRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefIdType }
     *     
     */
    public void setEvaluatorRef(RefIdType value) {
        this.evaluatorRef = value;
    }

}
