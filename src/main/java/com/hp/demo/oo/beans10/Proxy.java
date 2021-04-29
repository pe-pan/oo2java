
package com.hp.demo.oo.beans10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for proxy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="proxy">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="proxyInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="proxyHeaders" type="{}proxyHeadersType" minOccurs="0"/>
 *                   &lt;element name="proxyHost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="proxyPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="proxyPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="proxyType" type="{}proxyTypeEnum" minOccurs="0"/>
 *                   &lt;element name="proxyUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/all>
 *                 &lt;attribute name="id" type="{}restrictionId" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "proxy", propOrder = {

})
public class Proxy {

    protected Proxy.ProxyInformation proxyInformation;

    /**
     * Gets the value of the proxyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link Proxy.ProxyInformation }
     *     
     */
    public Proxy.ProxyInformation getProxyInformation() {
        return proxyInformation;
    }

    /**
     * Sets the value of the proxyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Proxy.ProxyInformation }
     *     
     */
    public void setProxyInformation(Proxy.ProxyInformation value) {
        this.proxyInformation = value;
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
     *         &lt;element name="proxyHeaders" type="{}proxyHeadersType" minOccurs="0"/>
     *         &lt;element name="proxyHost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="proxyPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="proxyPort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="proxyType" type="{}proxyTypeEnum" minOccurs="0"/>
     *         &lt;element name="proxyUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {

    })
    public static class ProxyInformation {

        protected ProxyHeadersType proxyHeaders;
        protected String proxyHost;
        protected String proxyPassword;
        protected String proxyPort;
        protected ProxyTypeEnum proxyType;
        protected String proxyUser;
        @XmlAttribute(name = "id")
        protected String id;

        /**
         * Gets the value of the proxyHeaders property.
         * 
         * @return
         *     possible object is
         *     {@link ProxyHeadersType }
         *     
         */
        public ProxyHeadersType getProxyHeaders() {
            return proxyHeaders;
        }

        /**
         * Sets the value of the proxyHeaders property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProxyHeadersType }
         *     
         */
        public void setProxyHeaders(ProxyHeadersType value) {
            this.proxyHeaders = value;
        }

        /**
         * Gets the value of the proxyHost property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProxyHost() {
            return proxyHost;
        }

        /**
         * Sets the value of the proxyHost property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProxyHost(String value) {
            this.proxyHost = value;
        }

        /**
         * Gets the value of the proxyPassword property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProxyPassword() {
            return proxyPassword;
        }

        /**
         * Sets the value of the proxyPassword property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProxyPassword(String value) {
            this.proxyPassword = value;
        }

        /**
         * Gets the value of the proxyPort property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProxyPort() {
            return proxyPort;
        }

        /**
         * Sets the value of the proxyPort property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProxyPort(String value) {
            this.proxyPort = value;
        }

        /**
         * Gets the value of the proxyType property.
         * 
         * @return
         *     possible object is
         *     {@link ProxyTypeEnum }
         *     
         */
        public ProxyTypeEnum getProxyType() {
            return proxyType;
        }

        /**
         * Sets the value of the proxyType property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProxyTypeEnum }
         *     
         */
        public void setProxyType(ProxyTypeEnum value) {
            this.proxyType = value;
        }

        /**
         * Gets the value of the proxyUser property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProxyUser() {
            return proxyUser;
        }

        /**
         * Sets the value of the proxyUser property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProxyUser(String value) {
            this.proxyUser = value;
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

}
