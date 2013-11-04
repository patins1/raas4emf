
package raas.experiments.jaxbased.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ThirdLevelClassJ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThirdLevelClassJ">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.jaxbased.experiments.raas/}eObjectImpl">
 *       &lt;sequence>
 *         &lt;element name="multi2lowerAttrInt" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="optionalAttrInt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="optionalContainClassK" type="{http://webservice.jaxbased.experiments.raas/}FourthLevelClassK" minOccurs="0"/>
 *         &lt;element name="raasRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="singleAttrInt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ThirdLevelClassJ", propOrder = {
    "multi2LowerAttrInt",
    "optionalAttrInt",
    "optionalContainClassK",
    "raasRef",
    "singleAttrInt"
})
public class ThirdLevelClassJ
    extends EObjectImpl
{

    @XmlElement(name = "multi2lowerAttrInt", type = Integer.class)
    protected List<Integer> multi2LowerAttrInt;
    protected int optionalAttrInt;
    protected FourthLevelClassK optionalContainClassK;
    protected String raasRef;
    protected int singleAttrInt;

    /**
     * Gets the value of the multi2LowerAttrInt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multi2LowerAttrInt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMulti2LowerAttrInt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getMulti2LowerAttrInt() {
        if (multi2LowerAttrInt == null) {
            multi2LowerAttrInt = new ArrayList<Integer>();
        }
        return this.multi2LowerAttrInt;
    }

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
     * Gets the value of the optionalContainClassK property.
     * 
     * @return
     *     possible object is
     *     {@link FourthLevelClassK }
     *     
     */
    public FourthLevelClassK getOptionalContainClassK() {
        return optionalContainClassK;
    }

    /**
     * Sets the value of the optionalContainClassK property.
     * 
     * @param value
     *     allowed object is
     *     {@link FourthLevelClassK }
     *     
     */
    public void setOptionalContainClassK(FourthLevelClassK value) {
        this.optionalContainClassK = value;
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

}
