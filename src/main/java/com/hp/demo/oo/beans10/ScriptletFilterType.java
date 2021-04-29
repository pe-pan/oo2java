
package com.hp.demo.oo.beans10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for scriptletFilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scriptletFilterType">
 *   &lt;complexContent>
 *     &lt;extension base="{}baseFilterType">
 *       &lt;all>
 *         &lt;element name="annotation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="scriptlet" type="{}scriptletType"/>
 *       &lt;/all>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scriptletFilterType", propOrder = {
    "annotation",
    "name",
    "scriptlet"
})
public class ScriptletFilterType
    extends BaseFilterType
{

    @XmlElement(required = true)
    protected String annotation;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected ScriptletType scriptlet;

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
     * Gets the value of the scriptlet property.
     * 
     * @return
     *     possible object is
     *     {@link ScriptletType }
     *     
     */
    public ScriptletType getScriptlet() {
        return scriptlet;
    }

    /**
     * Sets the value of the scriptlet property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScriptletType }
     *     
     */
    public void setScriptlet(ScriptletType value) {
        this.scriptlet = value;
    }

}
