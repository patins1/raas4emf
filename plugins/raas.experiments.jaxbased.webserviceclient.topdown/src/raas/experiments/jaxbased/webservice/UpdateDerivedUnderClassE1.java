
package raas.experiments.jaxbased.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateDerivedUnderClassE1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateDerivedUnderClassE1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://webservice.jaxbased.experiments.raas/}derivedUnderClassE1Ref" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://webservice.jaxbased.experiments.raas/}DerivedUnderClassE1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateDerivedUnderClassE1", propOrder = {
    "arg0",
    "arg1"
})
public class UpdateDerivedUnderClassE1 {

    protected DerivedUnderClassE1Ref arg0;
    protected DerivedUnderClassE1 arg1;

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link DerivedUnderClassE1Ref }
     *     
     */
    public DerivedUnderClassE1Ref getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivedUnderClassE1Ref }
     *     
     */
    public void setArg0(DerivedUnderClassE1Ref value) {
        this.arg0 = value;
    }

    /**
     * Gets the value of the arg1 property.
     * 
     * @return
     *     possible object is
     *     {@link DerivedUnderClassE1 }
     *     
     */
    public DerivedUnderClassE1 getArg1() {
        return arg1;
    }

    /**
     * Sets the value of the arg1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivedUnderClassE1 }
     *     
     */
    public void setArg1(DerivedUnderClassE1 value) {
        this.arg1 = value;
    }

}
