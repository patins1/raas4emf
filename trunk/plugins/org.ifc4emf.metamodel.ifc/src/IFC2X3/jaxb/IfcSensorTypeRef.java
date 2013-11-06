package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSensorType;

@XmlRootElement(name = "IfcSensorTypeRefElement")
public class IfcSensorTypeRef extends IFC2X3.jaxb.IfcDistributionControlElementTypeRef  {

	

	
	@Override
	public IfcSensorType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSensorType();
	}
	
	public static IfcSensorTypeRef valueOf(String id) {
		IfcSensorTypeRef result = new IfcSensorTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}