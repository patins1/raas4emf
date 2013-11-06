package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcMechanicalFastener;

@XmlRootElement(name = "IfcMechanicalFastenerRefElement")
public class IfcMechanicalFastenerRef extends IFC2X3.jaxb.IfcFastenerRef  {

	

	
	@Override
	public IfcMechanicalFastener createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcMechanicalFastener();
	}
	
	public static IfcMechanicalFastenerRef valueOf(String id) {
		IfcMechanicalFastenerRef result = new IfcMechanicalFastenerRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}