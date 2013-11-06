package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcActuatorType;

@XmlRootElement(name = "IfcActuatorTypeRefElement")
public class IfcActuatorTypeRef extends IFC2X3.jaxb.IfcDistributionControlElementTypeRef  {

	

	
	@Override
	public IfcActuatorType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcActuatorType();
	}
	
	public static IfcActuatorTypeRef valueOf(String id) {
		IfcActuatorTypeRef result = new IfcActuatorTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}