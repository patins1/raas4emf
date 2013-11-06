package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcElectricDistributionPoint;

@XmlRootElement(name = "IfcElectricDistributionPointRefElement")
public class IfcElectricDistributionPointRef extends IFC2X3.jaxb.IfcFlowControllerRef  {

	

	
	@Override
	public IfcElectricDistributionPoint createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcElectricDistributionPoint();
	}
	
	public static IfcElectricDistributionPointRef valueOf(String id) {
		IfcElectricDistributionPointRef result = new IfcElectricDistributionPointRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}