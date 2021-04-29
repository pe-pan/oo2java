
package com.hp.demo.oo.beans10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tableFilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tableFilterType">
 *   &lt;complexContent>
 *     &lt;extension base="{}baseFilterType">
 *       &lt;all>
 *         &lt;element name="annotation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ascending" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="columnDelimiter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstRowHeader" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lineDelimintor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="selectCol" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="selectHeight" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="selectRow" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="selectWidth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sortColumn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stripFirstRow" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/all>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tableFilterType", propOrder = {
    "annotation",
    "ascending",
    "columnDelimiter",
    "firstRowHeader",
    "lineDelimintor",
    "name",
    "selectCol",
    "selectHeight",
    "selectRow",
    "selectWidth",
    "sortColumn",
    "stripFirstRow"
})
public class TableFilterType
    extends BaseFilterType
{

    @XmlElement(required = true)
    protected String annotation;
    @XmlElement(required = true)
    protected String ascending;
    protected String columnDelimiter;
    @XmlElement(required = true)
    protected String firstRowHeader;
    protected String lineDelimintor;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String selectCol;
    @XmlElement(required = true)
    protected String selectHeight;
    @XmlElement(required = true)
    protected String selectRow;
    @XmlElement(required = true)
    protected String selectWidth;
    @XmlElement(required = true)
    protected String sortColumn;
    @XmlElement(required = true)
    protected String stripFirstRow;

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
     * Gets the value of the ascending property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAscending() {
        return ascending;
    }

    /**
     * Sets the value of the ascending property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAscending(String value) {
        this.ascending = value;
    }

    /**
     * Gets the value of the columnDelimiter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnDelimiter() {
        return columnDelimiter;
    }

    /**
     * Sets the value of the columnDelimiter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnDelimiter(String value) {
        this.columnDelimiter = value;
    }

    /**
     * Gets the value of the firstRowHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstRowHeader() {
        return firstRowHeader;
    }

    /**
     * Sets the value of the firstRowHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstRowHeader(String value) {
        this.firstRowHeader = value;
    }

    /**
     * Gets the value of the lineDelimintor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineDelimintor() {
        return lineDelimintor;
    }

    /**
     * Sets the value of the lineDelimintor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineDelimintor(String value) {
        this.lineDelimintor = value;
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
     * Gets the value of the selectCol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectCol() {
        return selectCol;
    }

    /**
     * Sets the value of the selectCol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectCol(String value) {
        this.selectCol = value;
    }

    /**
     * Gets the value of the selectHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectHeight() {
        return selectHeight;
    }

    /**
     * Sets the value of the selectHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectHeight(String value) {
        this.selectHeight = value;
    }

    /**
     * Gets the value of the selectRow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectRow() {
        return selectRow;
    }

    /**
     * Sets the value of the selectRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectRow(String value) {
        this.selectRow = value;
    }

    /**
     * Gets the value of the selectWidth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectWidth() {
        return selectWidth;
    }

    /**
     * Sets the value of the selectWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectWidth(String value) {
        this.selectWidth = value;
    }

    /**
     * Gets the value of the sortColumn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortColumn() {
        return sortColumn;
    }

    /**
     * Sets the value of the sortColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortColumn(String value) {
        this.sortColumn = value;
    }

    /**
     * Gets the value of the stripFirstRow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStripFirstRow() {
        return stripFirstRow;
    }

    /**
     * Sets the value of the stripFirstRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStripFirstRow(String value) {
        this.stripFirstRow = value;
    }

}
