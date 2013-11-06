package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPermeableCoveringProperties;

@XmlRootElement(name = "IfcPermeableCoveringPropertiesRefElement")
public class IfcPermeableCoveringPropertiesRef extends IFC2X3.jaxb.IfcPropertySetDefinitionRef  {

	

	
	@Override
	public IfcPermeableCoveringProperties createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPermeableCoveringProperties();
	}
	
	public static IfcPermeableCoveringPropertiesRef valueOf(String id) {
		IfcPermeableCoveringPropertiesRef result = new IfcPermeableCoveringPropertiesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}