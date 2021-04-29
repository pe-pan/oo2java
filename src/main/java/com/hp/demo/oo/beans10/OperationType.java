
package com.hp.demo.oo.beans10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for operationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="operationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="annotation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categories" type="{}categoriesType" minOccurs="0"/>
 *         &lt;element name="plugin" type="{}actionPluginType" minOccurs="0"/>
 *         &lt;element name="fieldValues" type="{}fieldValuesType" minOccurs="0"/>
 *         &lt;element name="overrideGroupAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{}restrictionName"/>
 *         &lt;element name="availableResultExpressions" type="{}availableResultExpressionsType" minOccurs="0"/>
 *         &lt;element name="inputs" type="{}bindingsType" minOccurs="0"/>
 *         &lt;element name="possibleResponses" type="{}possibleResponsesType" minOccurs="0"/>
 *         &lt;element name="resultExpression" type="{}resultExpressionType" minOccurs="0"/>
 *         &lt;element name="scriptlet" type="{}scriptletType" minOccurs="0"/>
 *         &lt;element name="groupAliasRef" type="{}refIdType" minOccurs="0"/>
 *         &lt;element name="opRef" type="{}refIdType" minOccurs="0"/>
 *         &lt;element name="iconSpec" type="{}iconSpecType" minOccurs="0"/>
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
@XmlType(name = "operationType", propOrder = {

})
public class OperationType {

    protected String annotation;
    protected CategoriesType categories;
    protected ActionPluginType plugin;
    protected FieldValuesType fieldValues;
    protected String overrideGroupAlias;
    @XmlElement(required = true)
    protected String name;
    protected AvailableResultExpressionsType availableResultExpressions;
    protected BindingsType inputs;
    protected PossibleResponsesType possibleResponses;
    protected ResultExpressionType resultExpression;
    protected ScriptletType scriptlet;
    protected RefIdType groupAliasRef;
    protected RefIdType opRef;
    protected IconSpecType iconSpec;
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
     * Gets the value of the categories property.
     * 
     * @return
     *     possible object is
     *     {@link CategoriesType }
     *     
     */
    public CategoriesType getCategories() {
        return categories;
    }

    /**
     * Sets the value of the categories property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoriesType }
     *     
     */
    public void setCategories(CategoriesType value) {
        this.categories = value;
    }

    /**
     * Gets the value of the plugin property.
     * 
     * @return
     *     possible object is
     *     {@link ActionPluginType }
     *     
     */
    public ActionPluginType getPlugin() {
        return plugin;
    }

    /**
     * Sets the value of the plugin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionPluginType }
     *     
     */
    public void setPlugin(ActionPluginType value) {
        this.plugin = value;
    }

    /**
     * Gets the value of the fieldValues property.
     * 
     * @return
     *     possible object is
     *     {@link FieldValuesType }
     *     
     */
    public FieldValuesType getFieldValues() {
        return fieldValues;
    }

    /**
     * Sets the value of the fieldValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldValuesType }
     *     
     */
    public void setFieldValues(FieldValuesType value) {
        this.fieldValues = value;
    }

    /**
     * Gets the value of the overrideGroupAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideGroupAlias() {
        return overrideGroupAlias;
    }

    /**
     * Sets the value of the overrideGroupAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideGroupAlias(String value) {
        this.overrideGroupAlias = value;
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
     * Gets the value of the availableResultExpressions property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableResultExpressionsType }
     *     
     */
    public AvailableResultExpressionsType getAvailableResultExpressions() {
        return availableResultExpressions;
    }

    /**
     * Sets the value of the availableResultExpressions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableResultExpressionsType }
     *     
     */
    public void setAvailableResultExpressions(AvailableResultExpressionsType value) {
        this.availableResultExpressions = value;
    }

    /**
     * Gets the value of the inputs property.
     * 
     * @return
     *     possible object is
     *     {@link BindingsType }
     *     
     */
    public BindingsType getInputs() {
        return inputs;
    }

    /**
     * Sets the value of the inputs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BindingsType }
     *     
     */
    public void setInputs(BindingsType value) {
        this.inputs = value;
    }

    /**
     * Gets the value of the possibleResponses property.
     * 
     * @return
     *     possible object is
     *     {@link PossibleResponsesType }
     *     
     */
    public PossibleResponsesType getPossibleResponses() {
        return possibleResponses;
    }

    /**
     * Sets the value of the possibleResponses property.
     * 
     * @param value
     *     allowed object is
     *     {@link PossibleResponsesType }
     *     
     */
    public void setPossibleResponses(PossibleResponsesType value) {
        this.possibleResponses = value;
    }

    /**
     * Gets the value of the resultExpression property.
     * 
     * @return
     *     possible object is
     *     {@link ResultExpressionType }
     *     
     */
    public ResultExpressionType getResultExpression() {
        return resultExpression;
    }

    /**
     * Sets the value of the resultExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultExpressionType }
     *     
     */
    public void setResultExpression(ResultExpressionType value) {
        this.resultExpression = value;
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

    /**
     * Gets the value of the groupAliasRef property.
     * 
     * @return
     *     possible object is
     *     {@link RefIdType }
     *     
     */
    public RefIdType getGroupAliasRef() {
        return groupAliasRef;
    }

    /**
     * Sets the value of the groupAliasRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefIdType }
     *     
     */
    public void setGroupAliasRef(RefIdType value) {
        this.groupAliasRef = value;
    }

    /**
     * Gets the value of the opRef property.
     * 
     * @return
     *     possible object is
     *     {@link RefIdType }
     *     
     */
    public RefIdType getOpRef() {
        return opRef;
    }

    /**
     * Sets the value of the opRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefIdType }
     *     
     */
    public void setOpRef(RefIdType value) {
        this.opRef = value;
    }

    /**
     * Gets the value of the iconSpec property.
     * 
     * @return
     *     possible object is
     *     {@link IconSpecType }
     *     
     */
    public IconSpecType getIconSpec() {
        return iconSpec;
    }

    /**
     * Sets the value of the iconSpec property.
     * 
     * @param value
     *     allowed object is
     *     {@link IconSpecType }
     *     
     */
    public void setIconSpec(IconSpecType value) {
        this.iconSpec = value;
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
