package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPropertySet;

@XmlRootElement(name = "IfcPropertySetRefElement")
public class IfcPropertySetRef extends IFC2X3.jaxb.IfcPropertySetDefinitionRef  {

	

	
	@Override
	public IfcPropertySet createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPropertySet();
	}
	
	public static IfcPropertySetRef valueOf(String id) {
		IfcPropertySetRef result = new IfcPropertySetRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}