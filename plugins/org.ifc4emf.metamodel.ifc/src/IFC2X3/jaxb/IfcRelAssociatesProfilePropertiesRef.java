package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelAssociatesProfileProperties;

@XmlRootElement(name = "IfcRelAssociatesProfilePropertiesRefElement")
public class IfcRelAssociatesProfilePropertiesRef extends IFC2X3.jaxb.IfcRelAssociatesRef  {

	

	
	@Override
	public IfcRelAssociatesProfileProperties createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelAssociatesProfileProperties();
	}
	
	public static IfcRelAssociatesProfilePropertiesRef valueOf(String id) {
		IfcRelAssociatesProfilePropertiesRef result = new IfcRelAssociatesProfilePropertiesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}