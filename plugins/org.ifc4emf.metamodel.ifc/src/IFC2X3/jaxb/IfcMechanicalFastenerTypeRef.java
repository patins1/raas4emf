package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcMechanicalFastenerType;

@XmlRootElement(name = "IfcMechanicalFastenerTypeRefElement")
public class IfcMechanicalFastenerTypeRef extends IFC2X3.jaxb.IfcFastenerTypeRef  {

	

	
	@Override
	public IfcMechanicalFastenerType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcMechanicalFastenerType();
	}
	
	public static IfcMechanicalFastenerTypeRef valueOf(String id) {
		IfcMechanicalFastenerTypeRef result = new IfcMechanicalFastenerTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}