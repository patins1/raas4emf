
package raas.experiments.jaxbased.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TopClassC complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TopClassC">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.jaxbased.experiments.raas/}eObjectImpl">
 *       &lt;sequence>
 *         &lt;element name="optionalAttrInt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="raasRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="singleAttrInt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="singleContainClassF" type="{http://webservice.jaxbased.experiments.raas/}UnderClassF" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopClassC", propOrder = {
    "optionalAttrInt",
    "raasRef",
    "singleAttrInt",
    "singleContainClassF"
})
public class TopClassC
    extends EObjectImpl
{

    protected int optionalAttrInt;
    protected String raasRef;
    protected int singleAttrInt;
    protected UnderClassF singleContainClassF;

    /**
     * Gets the value of the optionalAttrInt property.
     * 
     */
    public int getOptionalAttrInt() {
        return optionalAttrInt;
    }

    /**
     * Sets the value of the optionalAttrInt property.
     * 
     */
    public void setOptionalAttrInt(int value) {
        this.optionalAttrInt = value;
    }

    /**
     * Gets the value of the raasRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRaasRef() {
        return raasRef;
    }

    /**
     * Sets the value of the raasRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRaasRef(String value) {
        this.raasRef = value;
    }

    /**
     * Gets the value of the singleAttrInt property.
     * 
     */
    public int getSingleAttrInt() {
        return singleAttrInt;
    }

    /**
     * Sets the value of the singleAttrInt property.
     * 
     */
    public void setSingleAttrInt(int value) {
        this.singleAttrInt = value;
    }

    /**
     * Gets the value of the singleContainClassF property.
     * 
     * @return
     *     possible object is
     *     {@link UnderClassF }
     *     
     */
    public UnderClassF getSingleContainClassF() {
        return singleContainClassF;
    }

    /**
     * Sets the value of the singleContainClassF property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderClassF }
     *     
     */
    public void setSingleContainClassF(UnderClassF value) {
        this.singleContainClassF = value;
    }

}
