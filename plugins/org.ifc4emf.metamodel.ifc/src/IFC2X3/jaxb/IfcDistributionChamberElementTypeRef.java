package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDistributionChamberElementType;

@XmlRootElement(name = "IfcDistributionChamberElementTypeRefElement")
public class IfcDistributionChamberElementTypeRef extends IFC2X3.jaxb.IfcDistributionFlowElementTypeRef  {

	

	
	@Override
	public IfcDistributionChamberElementType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDistributionChamberElementType();
	}
	
	public static IfcDistributionChamberElementTypeRef valueOf(String id) {
		IfcDistributionChamberElementTypeRef result = new IfcDistributionChamberElementTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}