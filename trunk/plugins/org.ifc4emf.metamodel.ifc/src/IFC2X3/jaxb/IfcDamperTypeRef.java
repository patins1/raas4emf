package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDamperType;

@XmlRootElement(name = "IfcDamperTypeRefElement")
public class IfcDamperTypeRef extends IFC2X3.jaxb.IfcFlowControllerTypeRef  {

	

	
	@Override
	public IfcDamperType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDamperType();
	}
	
	public static IfcDamperTypeRef valueOf(String id) {
		IfcDamperTypeRef result = new IfcDamperTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}