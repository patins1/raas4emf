package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelInteractionRequirements;

@XmlRootElement(name = "IfcRelInteractionRequirementsRefElement")
public class IfcRelInteractionRequirementsRef extends IFC2X3.jaxb.IfcRelConnectsRef  {

	

	
	@Override
	public IfcRelInteractionRequirements createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelInteractionRequirements();
	}
	
	public static IfcRelInteractionRequirementsRef valueOf(String id) {
		IfcRelInteractionRequirementsRef result = new IfcRelInteractionRequirementsRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}