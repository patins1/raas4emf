
package raas.experiments.jaxbased.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eObjectImpl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eObjectImpl">
 *   &lt;complexContent>
 *     &lt;extension base="{http://webservice.jaxbased.experiments.raas/}basicEObjectImpl">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eObjectImpl")
@XmlSeeAlso({
    ThirdLevelClassJ.class,
    FourthLevelClassK.class,
    TopClassD.class,
    TopClassC.class,
    TopClassA.class,
    TopClassB.class,
    UnderClassF.class,
    UnderClassE.class
})
public class EObjectImpl
    extends BasicEObjectImpl
{


}
