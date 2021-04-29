
package com.hp.demo.oo.beans10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for flowType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="flowType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="annotation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="categories" type="{}categoriesType" minOccurs="0"/>
 *         &lt;element name="checkPointFlow" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="compatibleRuntimeContext" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="historyCheckPointFlow" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{}restrictionName"/>
 *         &lt;element name="availableResultExpressions" type="{}availableResultExpressionsType" minOccurs="0"/>
 *         &lt;element name="inputs" type="{}bindingsType"/>
 *         &lt;element name="possibleResponses" type="{}possibleResponsesType"/>
 *         &lt;element name="resultExpression" type="{}resultExpressionType" minOccurs="0"/>
 *         &lt;element name="scriptlet" type="{}scriptletType" minOccurs="0"/>
 *         &lt;element name="startSteps" type="{}restrictionId"/>
 *         &lt;element name="steps" type="{}stepsType"/>
 *         &lt;element name="callouts" type="{}calloutsType" minOccurs="0"/>
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
@XmlType(name = "flowType", propOrder = {

})
public class FlowType {

    @XmlElement(required = true)
    protected String annotation;
    protected CategoriesType categories;
    @XmlElement(required = true)
    protected String checkPointFlow;
    @XmlElement(required = true)
    protected String compatibleRuntimeContext;
    @XmlElement(required = true)
    protected String historyCheckPointFlow;
    @XmlElement(required = true)
    protected String name;
    protected AvailableResultExpressionsType availableResultExpressions;
    @XmlElement(required = true)
    protected BindingsType inputs;
    @XmlElement(required = true)
    protected PossibleResponsesType possibleResponses;
    protected ResultExpressionType resultExpression;
    protected ScriptletType scriptlet;
    @XmlElement(required = true)
    protected String startSteps;
    @XmlElement(required = true)
    protected StepsType steps;
    protected CalloutsType callouts;
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
     * Gets the value of the checkPointFlow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckPointFlow() {
        return checkPointFlow;
    }

    /**
     * Sets the value of the checkPointFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckPointFlow(String value) {
        this.checkPointFlow = value;
    }

    /**
     * Gets the value of the compatibleRuntimeContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompatibleRuntimeContext() {
        return compatibleRuntimeContext;
    }

    /**
     * Sets the value of the compatibleRuntimeContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompatibleRuntimeContext(String value) {
        this.compatibleRuntimeContext = value;
    }

    /**
     * Gets the value of the historyCheckPointFlow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistoryCheckPointFlow() {
        return historyCheckPointFlow;
    }

    /**
     * Sets the value of the historyCheckPointFlow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoryCheckPointFlow(String value) {
        this.historyCheckPointFlow = value;
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
     * Gets the value of the startSteps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartSteps() {
        return startSteps;
    }

    /**
     * Sets the value of the startSteps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartSteps(String value) {
        this.startSteps = value;
    }

    /**
     * Gets the value of the steps property.
     * 
     * @return
     *     possible object is
     *     {@link StepsType }
     *     
     */
    public StepsType getSteps() {
        return steps;
    }

    /**
     * Sets the value of the steps property.
     * 
     * @param value
     *     allowed object is
     *     {@link StepsType }
     *     
     */
    public void setSteps(StepsType value) {
        this.steps = value;
    }

    /**
     * Gets the value of the callouts property.
     * 
     * @return
     *     possible object is
     *     {@link CalloutsType }
     *     
     */
    public CalloutsType getCallouts() {
        return callouts;
    }

    /**
     * Sets the value of the callouts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalloutsType }
     *     
     */
    public void setCallouts(CalloutsType value) {
        this.callouts = value;
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
