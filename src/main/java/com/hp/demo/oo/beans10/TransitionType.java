
package com.hp.demo.oo.beans10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="annotation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="command" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="linkMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="responseSymbol" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shouldHandoff" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transitionValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="requiredRoleAlias" type="{}refIdType" minOccurs="0"/>
 *         &lt;element name="destination" type="{}destinationType"/>
 *         &lt;element name="source" type="{}destinationType"/>
 *         &lt;element name="viewAttributes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="labelPosition" type="{}positionType" minOccurs="0"/>
 *         &lt;element name="positions" type="{}pointListType" minOccurs="0"/>
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
@XmlType(name = "transitionType", propOrder = {

})
public class TransitionType {

    protected String annotation;
    @XmlElement(required = true)
    protected String command;
    @XmlElement(required = true)
    protected String linkMode;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String responseSymbol;
    @XmlElement(required = true)
    protected String shouldHandoff;
    @XmlElement(required = true)
    protected String transitionValue;
    protected RefIdType requiredRoleAlias;
    @XmlElement(required = true)
    protected DestinationType destination;
    @XmlElement(required = true)
    protected DestinationType source;
    protected String viewAttributes;
    protected PositionType labelPosition;
    protected PointListType positions;
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
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommand(String value) {
        this.command = value;
    }

    /**
     * Gets the value of the linkMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkMode() {
        return linkMode;
    }

    /**
     * Sets the value of the linkMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkMode(String value) {
        this.linkMode = value;
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
     * Gets the value of the responseSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseSymbol() {
        return responseSymbol;
    }

    /**
     * Sets the value of the responseSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseSymbol(String value) {
        this.responseSymbol = value;
    }

    /**
     * Gets the value of the shouldHandoff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShouldHandoff() {
        return shouldHandoff;
    }

    /**
     * Sets the value of the shouldHandoff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShouldHandoff(String value) {
        this.shouldHandoff = value;
    }

    /**
     * Gets the value of the transitionValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitionValue() {
        return transitionValue;
    }

    /**
     * Sets the value of the transitionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitionValue(String value) {
        this.transitionValue = value;
    }

    /**
     * Gets the value of the requiredRoleAlias property.
     * 
     * @return
     *     possible object is
     *     {@link RefIdType }
     *     
     */
    public RefIdType getRequiredRoleAlias() {
        return requiredRoleAlias;
    }

    /**
     * Sets the value of the requiredRoleAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefIdType }
     *     
     */
    public void setRequiredRoleAlias(RefIdType value) {
        this.requiredRoleAlias = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationType }
     *     
     */
    public DestinationType getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationType }
     *     
     */
    public void setDestination(DestinationType value) {
        this.destination = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationType }
     *     
     */
    public DestinationType getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationType }
     *     
     */
    public void setSource(DestinationType value) {
        this.source = value;
    }

    /**
     * Gets the value of the viewAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViewAttributes() {
        return viewAttributes;
    }

    /**
     * Sets the value of the viewAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViewAttributes(String value) {
        this.viewAttributes = value;
    }

    /**
     * Gets the value of the labelPosition property.
     * 
     * @return
     *     possible object is
     *     {@link PositionType }
     *     
     */
    public PositionType getLabelPosition() {
        return labelPosition;
    }

    /**
     * Sets the value of the labelPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionType }
     *     
     */
    public void setLabelPosition(PositionType value) {
        this.labelPosition = value;
    }

    /**
     * Gets the value of the positions property.
     * 
     * @return
     *     possible object is
     *     {@link PointListType }
     *     
     */
    public PointListType getPositions() {
        return positions;
    }

    /**
     * Sets the value of the positions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointListType }
     *     
     */
    public void setPositions(PointListType value) {
        this.positions = value;
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
