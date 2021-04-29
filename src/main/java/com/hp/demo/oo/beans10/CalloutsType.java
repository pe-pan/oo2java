
package com.hp.demo.oo.beans10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calloutsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calloutsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="callout" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="viewAttributes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="step" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="refId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="bounds" type="{}boundsType" minOccurs="0"/>
 *                   &lt;element name="layer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="id" use="required" type="{}restrictionId" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calloutsType", propOrder = {
    "callout"
})
public class CalloutsType {

    protected List<CalloutsType.Callout> callout;

    /**
     * Gets the value of the callout property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callout property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallout().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CalloutsType.Callout }
     * 
     * 
     */
    public List<CalloutsType.Callout> getCallout() {
        if (callout == null) {
            callout = new ArrayList<CalloutsType.Callout>();
        }
        return this.callout;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;all>
     *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="viewAttributes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="step" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="refId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="bounds" type="{}boundsType" minOccurs="0"/>
     *         &lt;element name="layer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *       &lt;/all>
     *       &lt;attribute name="id" use="required" type="{}restrictionId" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class Callout {

        @XmlElement(required = true)
        protected String text;
        protected String viewAttributes;
        protected CalloutsType.Callout.Step step;
        protected BoundsType bounds;
        protected Integer layer;
        @XmlAttribute(name = "id", required = true)
        protected String id;

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
         * Gets the value of the step property.
         * 
         * @return
         *     possible object is
         *     {@link CalloutsType.Callout.Step }
         *     
         */
        public CalloutsType.Callout.Step getStep() {
            return step;
        }

        /**
         * Sets the value of the step property.
         * 
         * @param value
         *     allowed object is
         *     {@link CalloutsType.Callout.Step }
         *     
         */
        public void setStep(CalloutsType.Callout.Step value) {
            this.step = value;
        }

        /**
         * Gets the value of the bounds property.
         * 
         * @return
         *     possible object is
         *     {@link BoundsType }
         *     
         */
        public BoundsType getBounds() {
            return bounds;
        }

        /**
         * Sets the value of the bounds property.
         * 
         * @param value
         *     allowed object is
         *     {@link BoundsType }
         *     
         */
        public void setBounds(BoundsType value) {
            this.bounds = value;
        }

        /**
         * Gets the value of the layer property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getLayer() {
            return layer;
        }

        /**
         * Sets the value of the layer property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setLayer(Integer value) {
            this.layer = value;
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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="refId" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "refId"
        })
        public static class Step {

            @XmlElement(required = true)
            protected String refId;

            /**
             * Gets the value of the refId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRefId() {
                return refId;
            }

            /**
             * Sets the value of the refId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRefId(String value) {
                this.refId = value;
            }

        }

    }

}
