
package com.hp.demo.oo.beans10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stepsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stepsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="step" type="{}regularStepType"/>
 *         &lt;element name="returnStep" type="{}returnStepType"/>
 *         &lt;element name="parallelMultiStep" type="{}parallelMultiStepType"/>
 *         &lt;element name="multiInstanceStep" type="{}multiInstanceStepType"/>
 *         &lt;element name="endBranchStep" type="{}endBranchStepType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stepsType", propOrder = {
    "stepOrReturnStepOrParallelMultiStep"
})
public class StepsType {

    @XmlElements({
        @XmlElement(name = "step", type = RegularStepType.class),
        @XmlElement(name = "returnStep", type = ReturnStepType.class),
        @XmlElement(name = "parallelMultiStep", type = ParallelMultiStepType.class),
        @XmlElement(name = "multiInstanceStep", type = MultiInstanceStepType.class),
        @XmlElement(name = "endBranchStep", type = EndBranchStepType.class)
    })
    protected List<Object> stepOrReturnStepOrParallelMultiStep;

    /**
     * Gets the value of the stepOrReturnStepOrParallelMultiStep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stepOrReturnStepOrParallelMultiStep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStepOrReturnStepOrParallelMultiStep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegularStepType }
     * {@link ReturnStepType }
     * {@link ParallelMultiStepType }
     * {@link MultiInstanceStepType }
     * {@link EndBranchStepType }
     * 
     * 
     */
    public List<Object> getStepOrReturnStepOrParallelMultiStep() {
        if (stepOrReturnStepOrParallelMultiStep == null) {
            stepOrReturnStepOrParallelMultiStep = new ArrayList<Object>();
        }
        return this.stepOrReturnStepOrParallelMultiStep;
    }

}
