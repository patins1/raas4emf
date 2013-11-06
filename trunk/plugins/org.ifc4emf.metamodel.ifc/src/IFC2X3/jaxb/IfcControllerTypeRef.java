package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcControllerType;

@XmlRootElement(name = "IfcControllerTypeRefElement")
public class IfcControllerTypeRef extends IFC2X3.jaxb.IfcDistributionControlElementTypeRef  {

	

	
	@Override
	public IfcControllerType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcControllerType();
	}
	
	public static IfcControllerTypeRef valueOf(String id) {
		IfcControllerTypeRef result = new IfcControllerTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}