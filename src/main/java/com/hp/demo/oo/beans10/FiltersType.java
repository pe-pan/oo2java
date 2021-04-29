
package com.hp.demo.oo.beans10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for filtersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="filtersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}baseFilter" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "filtersType", propOrder = {
    "baseFilter"
})
public class FiltersType {

    @XmlElementRef(name = "baseFilter", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends BaseFilterType>> baseFilter;

    /**
     * Gets the value of the baseFilter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baseFilter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaseFilter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ScriptletFilterType }{@code >}
     * {@link JAXBElement }{@code <}{@link CaseFilterType }{@code >}
     * {@link JAXBElement }{@code <}{@link ConcatType }{@code >}
     * {@link JAXBElement }{@code <}{@link CountLinesFilterType }{@code >}
     * {@link JAXBElement }{@code <}{@link XmlGetElementsFilterType }{@code >}
     * {@link JAXBElement }{@code <}{@link StripTrailingFilterType }{@code >}
     * {@link JAXBElement }{@code <}{@link XmlGetElementValueFilterType }{@code >}
     * {@link JAXBElement }{@code <}{@link StripWhitespaceFilterType }{@code >}
     * {@link JAXBElement }{@code <}{@link SortFilterType }{@code >}
     * {@link JAXBElement }{@code <}{@link RegexFilterType }{@code >}
     * {@link JAXBElement }{@code <}{@link XmlGetAttributeFilterType }{@code >}
     * {@link JAXBElement }{@code <}{@link SelectRangeFilterType }{@code >}
     * {@link JAXBElement }{@code <}{@link SelectLineFilterType }{@code >}
     * {@link JAXBElement }{@code <}{@link RemoveDuplicatesFilterType }{@code >}
     * {@link JAXBElement }{@code <}{@link TableFilterType }{@code >}
     * {@link JAXBElement }{@code <}{@link ReferenceFilterType }{@code >}
     * {@link JAXBElement }{@code <}{@link XpathFilterType }{@code >}
     * {@link JAXBElement }{@code <}{@link ReplaceAllFilterType }{@code >}
     * {@link JAXBElement }{@code <}{@link RoundingFilterType }{@code >}
     * {@link JAXBElement }{@code <}{@link BaseFilterType }{@code >}
     * {@link JAXBElement }{@code <}{@link NumberFilterType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends BaseFilterType>> getBaseFilter() {
        if (baseFilter == null) {
            baseFilter = new ArrayList<JAXBElement<? extends BaseFilterType>>();
        }
        return this.baseFilter;
    }

}
