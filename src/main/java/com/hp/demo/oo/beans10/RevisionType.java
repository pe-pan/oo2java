
package com.hp.demo.oo.beans10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for revisionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="revisionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="checkoutModificationNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="commitUuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modificationNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="respositoryId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "revisionType", propOrder = {

})
public class RevisionType {

    @XmlElement(required = true)
    protected String checkoutModificationNum;
    protected String commitUuid;
    @XmlElement(required = true)
    protected String modificationNum;
    @XmlElement(required = true)
    protected String respositoryId;

    /**
     * Gets the value of the checkoutModificationNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckoutModificationNum() {
        return checkoutModificationNum;
    }

    /**
     * Sets the value of the checkoutModificationNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckoutModificationNum(String value) {
        this.checkoutModificationNum = value;
    }

    /**
     * Gets the value of the commitUuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommitUuid() {
        return commitUuid;
    }

    /**
     * Sets the value of the commitUuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommitUuid(String value) {
        this.commitUuid = value;
    }

    /**
     * Gets the value of the modificationNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationNum() {
        return modificationNum;
    }

    /**
     * Sets the value of the modificationNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificationNum(String value) {
        this.modificationNum = value;
    }

    /**
     * Gets the value of the respositoryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespositoryId() {
        return respositoryId;
    }

    /**
     * Sets the value of the respositoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespositoryId(String value) {
        this.respositoryId = value;
    }

}
