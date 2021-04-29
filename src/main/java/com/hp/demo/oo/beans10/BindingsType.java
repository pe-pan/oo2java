
package com.hp.demo.oo.beans10;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bindingsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bindingsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;choice>
 *           &lt;element name="staticBinding" type="{}staticBindingType"/>
 *           &lt;element name="identityBinding" type="{}identityBindingType"/>
 *           &lt;element name="resultBinding" type="{}resultBindingType"/>
 *           &lt;element name="loggedUserIdentityBinding" type="{}loggedUserIdentityBindingType"/>
 *           &lt;element name="userInputBinding" type="{}userInputBindingType"/>
 *           &lt;element name="contextBinding" type="{}contextBindingType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bindingsType", propOrder = {
    "staticBindingOrIdentityBindingOrResultBinding"
})
public class BindingsType {

    @XmlElements({
        @XmlElement(name = "staticBinding", type = StaticBindingType.class),
        @XmlElement(name = "identityBinding", type = IdentityBindingType.class),
        @XmlElement(name = "resultBinding", type = ResultBindingType.class),
        @XmlElement(name = "loggedUserIdentityBinding", type = LoggedUserIdentityBindingType.class),
        @XmlElement(name = "userInputBinding", type = UserInputBindingType.class),
        @XmlElement(name = "contextBinding", type = ContextBindingType.class)
    })
    protected List<Object> staticBindingOrIdentityBindingOrResultBinding;

    /**
     * Gets the value of the staticBindingOrIdentityBindingOrResultBinding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the staticBindingOrIdentityBindingOrResultBinding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStaticBindingOrIdentityBindingOrResultBinding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StaticBindingType }
     * {@link IdentityBindingType }
     * {@link ResultBindingType }
     * {@link LoggedUserIdentityBindingType }
     * {@link UserInputBindingType }
     * {@link ContextBindingType }
     * 
     * 
     */
    public List<Object> getStaticBindingOrIdentityBindingOrResultBinding() {
        if (staticBindingOrIdentityBindingOrResultBinding == null) {
            staticBindingOrIdentityBindingOrResultBinding = new ArrayList<Object>();
        }
        return this.staticBindingOrIdentityBindingOrResultBinding;
    }

}
