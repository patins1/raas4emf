package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelationship;

@XmlRootElement(name = "IfcRelationshipRefElement")
public class IfcRelationshipRef extends IFC2X3.jaxb.IfcRootRef  {

	

	
	@Override
	public IfcRelationship createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelationship();
	}
	
	public static IfcRelationshipRef valueOf(String id) {
		IfcRelationshipRef result = new IfcRelationshipRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}