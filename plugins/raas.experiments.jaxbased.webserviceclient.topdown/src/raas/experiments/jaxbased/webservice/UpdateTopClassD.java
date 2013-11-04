
package raas.experiments.jaxbased.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateTopClassD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateTopClassD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arg0" type="{http://webservice.jaxbased.experiments.raas/}topClassDRef" minOccurs="0"/>
 *         &lt;element name="arg1" type="{http://webservice.jaxbased.experiments.raas/}TopClassD" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateTopClassD", propOrder = {
    "arg0",
    "arg1"
})
public class UpdateTopClassD {

    protected TopClassDRef arg0;
    protected TopClassD arg1;

    /**
     * Gets the value of the arg0 property.
     * 
     * @return
     *     possible object is
     *     {@link TopClassDRef }
     *     
     */
    public TopClassDRef getArg0() {
        return arg0;
    }

    /**
     * Sets the value of the arg0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopClassDRef }
     *     
     */
    public void setArg0(TopClassDRef value) {
        this.arg0 = value;
    }

    /**
     * Gets the value of the arg1 property.
     * 
     * @return
     *     possible object is
     *     {@link TopClassD }
     *     
     */
    public TopClassD getArg1() {
        return arg1;
    }

    /**
     * Sets the value of the arg1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopClassD }
     *     
     */
    public void setArg1(TopClassD value) {
        this.arg1 = value;
    }

}
