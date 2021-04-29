
package com.hp.demo.oo.beans10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xmlGetAttributeFilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xmlGetAttributeFilterType">
 *   &lt;complexContent>
 *     &lt;extension base="{}baseFilterType">
 *       &lt;all>
 *         &lt;element name="annotation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="attributeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="elementPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="includeSubElements" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resultAsFirstResult" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resultAsTable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xmlGetAttributeFilterType", propOrder = {
    "annotation",
    "attributeName",
    "elementPath",
    "includeSubElements",
    "name",
    "resultAsFirstResult",
    "resultAsTable"
})
public class XmlGetAttributeFilterType
    extends BaseFilterType
{

    @XmlElement(required = true)
    protected String annotation;
    protected String attributeName;
    protected String elementPath;
    @XmlElement(required = true)
    protected String includeSubElements;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String resultAsFirstResult;
    @XmlElement(required = true)
    protected String resultAsTable;

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
     * Gets the value of the attributeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeName() {
        return attributeName;
    }

    /**
     * Sets the value of the attributeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeName(String value) {
        this.attributeName = value;
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
     * Gets the value of the includeSubElements property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeSubElements() {
        return includeSubElements;
    }

    /**
     * Sets the value of the includeSubElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeSubElements(String value) {
        this.includeSubElements = value;
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
     * Gets the value of the resultAsFirstResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultAsFirstResult() {
        return resultAsFirstResult;
    }

    /**
     * Sets the value of the resultAsFirstResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultAsFirstResult(String value) {
        this.resultAsFirstResult = value;
    }

    /**
     * Gets the value of the resultAsTable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultAsTable() {
        return resultAsTable;
    }

    /**
     * Sets the value of the resultAsTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultAsTable(String value) {
        this.resultAsTable = value;
    }

}
