
package raas.experiments.jaxbased.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DerivedUnderClassE1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DerivedUnderClassE1">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.jaxbased.experiments.raas/}UnderClassE">
 *       &lt;sequence>
 *         &lt;element name="singleRefClassD" type="{http://webservice.jaxbased.experiments.raas/}topClassDRef"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivedUnderClassE1", propOrder = {
    "singleRefClassD"
})
public class DerivedUnderClassE1
    extends UnderClassE
{

    @XmlElement(required = true)
    protected TopClassDRef singleRefClassD;

    /**
     * Gets the value of the singleRefClassD property.
     * 
     * @return
     *     possible object is
     *     {@link TopClassDRef }
     *     
     */
    public TopClassDRef getSingleRefClassD() {
        return singleRefClassD;
    }

    /**
     * Sets the value of the singleRefClassD property.
     * 
     * @param value
     *     allowed object is
     *     {@link TopClassDRef }
     *     
     */
    public void setSingleRefClassD(TopClassDRef value) {
        this.singleRefClassD = value;
    }

}
