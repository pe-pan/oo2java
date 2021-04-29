
package com.hp.demo.oo.beans10;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for endBranchStepType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="endBranchStepType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="annotation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="addResultToRunContext" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isCriticalStep" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isNonBlocking" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isParallelStep" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isSingleResponse" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="recordInHistory" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="recordRawOutput" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="recordPrimaryOutput" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="checkPointStep" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="historyCheckPointStep" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="scriptResultStep" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bindings" type="{}bindingsType" minOccurs="0"/>
 *         &lt;element name="properties" type="{}propertiesType" minOccurs="0"/>
 *         &lt;element name="transitions" type="{}transitionsType"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="steps" type="{}stepsType" minOccurs="0"/>
 *         &lt;element name="userPrompt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assignments" maxOccurs="0" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="flowVariableAssignment" type="{}flowVariableAssignmentType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="bounds" type="{}boundsType" minOccurs="0"/>
 *         &lt;element name="layer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="viewAttributes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hideInbound" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "endBranchStepType", propOrder = {

})
public class EndBranchStepType {

    @XmlElement(required = true)
    protected String annotation;
    protected boolean addResultToRunContext;
    protected boolean isCriticalStep;
    protected boolean isNonBlocking;
    protected boolean isParallelStep;
    protected boolean isSingleResponse;
    protected boolean recordInHistory;
    protected boolean recordRawOutput;
    protected boolean recordPrimaryOutput;
    protected boolean checkPointStep;
    protected boolean historyCheckPointStep;
    protected boolean scriptResultStep;
    protected BindingsType bindings;
    protected PropertiesType properties;
    @XmlElement(required = true)
    protected TransitionsType transitions;
    @XmlElement(required = true)
    protected String name;
    protected StepsType steps;
    protected String userPrompt;
    protected BoundsType bounds;
    protected Integer layer;
    protected String viewAttributes;
    protected Boolean hideInbound;
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
     * Gets the value of the addResultToRunContext property.
     * 
     */
    public boolean isAddResultToRunContext() {
        return addResultToRunContext;
    }

    /**
     * Sets the value of the addResultToRunContext property.
     * 
     */
    public void setAddResultToRunContext(boolean value) {
        this.addResultToRunContext = value;
    }

    /**
     * Gets the value of the isCriticalStep property.
     * 
     */
    public boolean isIsCriticalStep() {
        return isCriticalStep;
    }

    /**
     * Sets the value of the isCriticalStep property.
     * 
     */
    public void setIsCriticalStep(boolean value) {
        this.isCriticalStep = value;
    }

    /**
     * Gets the value of the isNonBlocking property.
     * 
     */
    public boolean isIsNonBlocking() {
        return isNonBlocking;
    }

    /**
     * Sets the value of the isNonBlocking property.
     * 
     */
    public void setIsNonBlocking(boolean value) {
        this.isNonBlocking = value;
    }

    /**
     * Gets the value of the isParallelStep property.
     * 
     */
    public boolean isIsParallelStep() {
        return isParallelStep;
    }

    /**
     * Sets the value of the isParallelStep property.
     * 
     */
    public void setIsParallelStep(boolean value) {
        this.isParallelStep = value;
    }

    /**
     * Gets the value of the isSingleResponse property.
     * 
     */
    public boolean isIsSingleResponse() {
        return isSingleResponse;
    }

    /**
     * Sets the value of the isSingleResponse property.
     * 
     */
    public void setIsSingleResponse(boolean value) {
        this.isSingleResponse = value;
    }

    /**
     * Gets the value of the recordInHistory property.
     * 
     */
    public boolean isRecordInHistory() {
        return recordInHistory;
    }

    /**
     * Sets the value of the recordInHistory property.
     * 
     */
    public void setRecordInHistory(boolean value) {
        this.recordInHistory = value;
    }

    /**
     * Gets the value of the recordRawOutput property.
     * 
     */
    public boolean isRecordRawOutput() {
        return recordRawOutput;
    }

    /**
     * Sets the value of the recordRawOutput property.
     * 
     */
    public void setRecordRawOutput(boolean value) {
        this.recordRawOutput = value;
    }

    /**
     * Gets the value of the recordPrimaryOutput property.
     * 
     */
    public boolean isRecordPrimaryOutput() {
        return recordPrimaryOutput;
    }

    /**
     * Sets the value of the recordPrimaryOutput property.
     * 
     */
    public void setRecordPrimaryOutput(boolean value) {
        this.recordPrimaryOutput = value;
    }

    /**
     * Gets the value of the checkPointStep property.
     * 
     */
    public boolean isCheckPointStep() {
        return checkPointStep;
    }

    /**
     * Sets the value of the checkPointStep property.
     * 
     */
    public void setCheckPointStep(boolean value) {
        this.checkPointStep = value;
    }

    /**
     * Gets the value of the historyCheckPointStep property.
     * 
     */
    public boolean isHistoryCheckPointStep() {
        return historyCheckPointStep;
    }

    /**
     * Sets the value of the historyCheckPointStep property.
     * 
     */
    public void setHistoryCheckPointStep(boolean value) {
        this.historyCheckPointStep = value;
    }

    /**
     * Gets the value of the scriptResultStep property.
     * 
     */
    public boolean isScriptResultStep() {
        return scriptResultStep;
    }

    /**
     * Sets the value of the scriptResultStep property.
     * 
     */
    public void setScriptResultStep(boolean value) {
        this.scriptResultStep = value;
    }

    /**
     * Gets the value of the bindings property.
     * 
     * @return
     *     possible object is
     *     {@link BindingsType }
     *     
     */
    public BindingsType getBindings() {
        return bindings;
    }

    /**
     * Sets the value of the bindings property.
     * 
     * @param value
     *     allowed object is
     *     {@link BindingsType }
     *     
     */
    public void setBindings(BindingsType value) {
        this.bindings = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link PropertiesType }
     *     
     */
    public PropertiesType getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertiesType }
     *     
     */
    public void setProperties(PropertiesType value) {
        this.properties = value;
    }

    /**
     * Gets the value of the transitions property.
     * 
     * @return
     *     possible object is
     *     {@link TransitionsType }
     *     
     */
    public TransitionsType getTransitions() {
        return transitions;
    }

    /**
     * Sets the value of the transitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitionsType }
     *     
     */
    public void setTransitions(TransitionsType value) {
        this.transitions = value;
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
     * Gets the value of the userPrompt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPrompt() {
        return userPrompt;
    }

    /**
     * Sets the value of the userPrompt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPrompt(String value) {
        this.userPrompt = value;
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
     * Gets the value of the hideInbound property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHideInbound() {
        return hideInbound;
    }

    /**
     * Sets the value of the hideInbound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHideInbound(Boolean value) {
        this.hideInbound = value;
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
     *         &lt;element name="flowVariableAssignment" type="{}flowVariableAssignmentType" maxOccurs="unbounded" minOccurs="0"/>
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
        "content"
    })
    public static class Assignments {

        @XmlElementRef(name = "flowVariableAssignment", type = JAXBElement.class, required = false)
        @XmlMixed
        protected List<Serializable> content;

        /**
         * Gets the value of the content property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the content property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link FlowVariableAssignmentType }{@code >}
         * {@link String }
         * 
         * 
         */
        public List<Serializable> getContent() {
            if (content == null) {
                content = new ArrayList<Serializable>();
            }
            return this.content;
        }

    }

}
