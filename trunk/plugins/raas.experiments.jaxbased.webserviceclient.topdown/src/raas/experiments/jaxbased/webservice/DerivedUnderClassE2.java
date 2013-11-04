
package raas.experiments.jaxbased.webservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DerivedUnderClassE2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DerivedUnderClassE2">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.jaxbased.experiments.raas/}UnderClassE">
 *       &lt;sequence>
 *         &lt;element name="multiContainClassJ" type="{http://webservice.jaxbased.experiments.raas/}ThirdLevelClassJ" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivedUnderClassE2", propOrder = {
    "multiContainClassJ"
})
public class DerivedUnderClassE2
    extends UnderClassE
{

    protected List<ThirdLevelClassJ> multiContainClassJ;

    /**
     * Gets the value of the multiContainClassJ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multiContainClassJ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultiContainClassJ().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ThirdLevelClassJ }
     * 
     * 
     */
    public List<ThirdLevelClassJ> getMultiContainClassJ() {
        if (multiContainClassJ == null) {
            multiContainClassJ = new ArrayList<ThirdLevelClassJ>();
        }
        return this.multiContainClassJ;
    }

}
