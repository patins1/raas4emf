package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelConnects;

@XmlRootElement(name = "IfcRelConnectsRefElement")
public class IfcRelConnectsRef extends IFC2X3.jaxb.IfcRelationshipRef  {

	

	
	@Override
	public IfcRelConnects createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelConnects();
	}
	
	public static IfcRelConnectsRef valueOf(String id) {
		IfcRelConnectsRef result = new IfcRelConnectsRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}