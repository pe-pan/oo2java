
package com.hp.demo.oo.beans10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for baseFilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="baseFilterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseFilterType")
@XmlSeeAlso({
    SelectLineFilterType.class,
    SortFilterType.class,
    ReplaceAllFilterType.class,
    ReferenceFilterType.class,
    StripWhitespaceFilterType.class,
    CaseFilterType.class,
    RemoveDuplicatesFilterType.class,
    SelectRangeFilterType.class,
    XmlGetAttributeFilterType.class,
    XmlGetElementValueFilterType.class,
    ScriptletFilterType.class,
    TableFilterType.class,
    ConcatType.class,
    RegexFilterType.class,
    NumberFilterType.class,
    CountLinesFilterType.class,
    XmlGetElementsFilterType.class,
    StripTrailingFilterType.class,
    RoundingFilterType.class,
    XpathFilterType.class
})
public class BaseFilterType {

    @XmlAttribute(name = "id")
    protected String id;

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
