package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcProfileProperties;

@XmlRootElement(name = "IfcProfilePropertiesRefElement")
public class IfcProfilePropertiesRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcProfileProperties createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcProfileProperties();
	}
	
	public static IfcProfilePropertiesRef valueOf(String id) {
		IfcProfilePropertiesRef result = new IfcProfilePropertiesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}