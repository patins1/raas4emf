package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcElementQuantity;

@XmlRootElement(name = "IfcElementQuantityRefElement")
public class IfcElementQuantityRef extends IFC2X3.jaxb.IfcPropertySetDefinitionRef  {

	

	
	@Override
	public IfcElementQuantity createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcElementQuantity();
	}
	
	public static IfcElementQuantityRef valueOf(String id) {
		IfcElementQuantityRef result = new IfcElementQuantityRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}