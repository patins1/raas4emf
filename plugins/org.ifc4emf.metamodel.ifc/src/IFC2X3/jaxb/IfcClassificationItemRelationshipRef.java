package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcClassificationItemRelationship;

@XmlRootElement(name = "IfcClassificationItemRelationshipRefElement")
public class IfcClassificationItemRelationshipRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcClassificationItemRelationship createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcClassificationItemRelationship();
	}
	
	public static IfcClassificationItemRelationshipRef valueOf(String id) {
		IfcClassificationItemRelationshipRef result = new IfcClassificationItemRelationshipRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}