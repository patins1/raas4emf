
package raas.experiments.jaxbased.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateDerivedUnderClassE1Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateDerivedUnderClassE1Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://webservice.jaxbased.experiments.raas/}derivedUnderClassE1Ref" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateDerivedUnderClassE1Response", propOrder = {
    "_return"
})
public class CreateDerivedUnderClassE1Response {

    @XmlElement(name = "return")
    protected DerivedUnderClassE1Ref _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link DerivedUnderClassE1Ref }
     *     
     */
    public DerivedUnderClassE1Ref getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivedUnderClassE1Ref }
     *     
     */
    public void setReturn(DerivedUnderClassE1Ref value) {
        this._return = value;
    }

}
