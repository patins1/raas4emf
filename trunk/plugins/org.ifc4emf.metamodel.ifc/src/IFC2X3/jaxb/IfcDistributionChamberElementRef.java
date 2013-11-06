package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDistributionChamberElement;

@XmlRootElement(name = "IfcDistributionChamberElementRefElement")
public class IfcDistributionChamberElementRef extends IFC2X3.jaxb.IfcDistributionFlowElementRef  {

	

	
	@Override
	public IfcDistributionChamberElement createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDistributionChamberElement();
	}
	
	public static IfcDistributionChamberElementRef valueOf(String id) {
		IfcDistributionChamberElementRef result = new IfcDistributionChamberElementRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}