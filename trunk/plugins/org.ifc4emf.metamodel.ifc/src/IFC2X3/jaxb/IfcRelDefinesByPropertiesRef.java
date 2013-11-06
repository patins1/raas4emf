package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelDefinesByProperties;

@XmlRootElement(name = "IfcRelDefinesByPropertiesRefElement")
public class IfcRelDefinesByPropertiesRef extends IFC2X3.jaxb.IfcRelDefinesRef  {

	

	
	@Override
	public IfcRelDefinesByProperties createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelDefinesByProperties();
	}
	
	public static IfcRelDefinesByPropertiesRef valueOf(String id) {
		IfcRelDefinesByPropertiesRef result = new IfcRelDefinesByPropertiesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}