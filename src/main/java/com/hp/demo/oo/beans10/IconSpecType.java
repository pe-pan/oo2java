
package com.hp.demo.oo.beans10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iconSpecType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iconSpecType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="baseIcon" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="basePath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="readOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="layers" type="{}iconListType"/>
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
@XmlType(name = "iconSpecType", propOrder = {

})
public class IconSpecType {

    @XmlElement(required = true)
    protected String baseIcon;
    @XmlElement(required = true)
    protected String basePath;
    protected boolean readOnly;
    @XmlElement(required = true)
    protected IconListType layers;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the baseIcon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseIcon() {
        return baseIcon;
    }

    /**
     * Sets the value of the baseIcon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseIcon(String value) {
        this.baseIcon = value;
    }

    /**
     * Gets the value of the basePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasePath() {
        return basePath;
    }

    /**
     * Sets the value of the basePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasePath(String value) {
        this.basePath = value;
    }

    /**
     * Gets the value of the readOnly property.
     * 
     */
    public boolean isReadOnly() {
        return readOnly;
    }

    /**
     * Sets the value of the readOnly property.
     * 
     */
    public void setReadOnly(boolean value) {
        this.readOnly = value;
    }

    /**
     * Gets the value of the layers property.
     * 
     * @return
     *     possible object is
     *     {@link IconListType }
     *     
     */
    public IconListType getLayers() {
        return layers;
    }

    /**
     * Sets the value of the layers property.
     * 
     * @param value
     *     allowed object is
     *     {@link IconListType }
     *     
     */
    public void setLayers(IconListType value) {
        this.layers = value;
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
