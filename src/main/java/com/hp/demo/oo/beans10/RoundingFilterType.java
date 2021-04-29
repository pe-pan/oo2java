
package com.hp.demo.oo.beans10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for roundingFilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="roundingFilterType">
 *   &lt;complexContent>
 *     &lt;extension base="{}baseFilterType">
 *       &lt;all>
 *         &lt;element name="annotation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ceiling" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="floor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numPlaces" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="round" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "roundingFilterType", propOrder = {
    "annotation",
    "ceiling",
    "floor",
    "name",
    "numPlaces",
    "round"
})
public class RoundingFilterType
    extends BaseFilterType
{

    @XmlElement(required = true)
    protected String annotation;
    @XmlElement(required = true)
    protected String ceiling;
    @XmlElement(required = true)
    protected String floor;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String numPlaces;
    @XmlElement(required = true)
    protected String round;

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
     * Gets the value of the ceiling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCeiling() {
        return ceiling;
    }

    /**
     * Sets the value of the ceiling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCeiling(String value) {
        this.ceiling = value;
    }

    /**
     * Gets the value of the floor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloor() {
        return floor;
    }

    /**
     * Sets the value of the floor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloor(String value) {
        this.floor = value;
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
     * Gets the value of the numPlaces property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumPlaces() {
        return numPlaces;
    }

    /**
     * Sets the value of the numPlaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumPlaces(String value) {
        this.numPlaces = value;
    }

    /**
     * Gets the value of the round property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRound() {
        return round;
    }

    /**
     * Sets the value of the round property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRound(String value) {
        this.round = value;
    }

}
