
package raas.experiments.jaxbased.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteDerivedUnderClassE1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteDerivedUnderClassE1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://webservice.jaxbased.experiments.raas/}derivedUnderClassE1Ref" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteDerivedUnderClassE1", propOrder = {
    "arg0"
})
public class DeleteDerivedUnderClassE1 {

    protected DerivedUnderClassE1Ref arg0;

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

}
