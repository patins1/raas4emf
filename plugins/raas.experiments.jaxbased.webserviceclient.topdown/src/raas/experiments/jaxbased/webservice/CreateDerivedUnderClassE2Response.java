
package raas.experiments.jaxbased.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateDerivedUnderClassE2Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateDerivedUnderClassE2Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://webservice.jaxbased.experiments.raas/}derivedUnderClassE2Ref" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateDerivedUnderClassE2Response", propOrder = {
    "_return"
})
public class CreateDerivedUnderClassE2Response {

    @XmlElement(name = "return")
    protected DerivedUnderClassE2Ref _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link DerivedUnderClassE2Ref }
     *     
     */
    public DerivedUnderClassE2Ref getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivedUnderClassE2Ref }
     *     
     */
    public void setReturn(DerivedUnderClassE2Ref value) {
        this._return = value;
    }

}
