
package com.hp.demo.oo.beans10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for lanesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="lanesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="parallelLane" type="{}parallelLaneType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "lanesType", propOrder = {
    "parallelLane"
})
public class LanesType {

    protected List<ParallelLaneType> parallelLane;

    /**
     * Gets the value of the parallelLane property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parallelLane property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParallelLane().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParallelLaneType }
     * 
     * 
     */
    public List<ParallelLaneType> getParallelLane() {
        if (parallelLane == null) {
            parallelLane = new ArrayList<ParallelLaneType>();
        }
        return this.parallelLane;
    }

}
