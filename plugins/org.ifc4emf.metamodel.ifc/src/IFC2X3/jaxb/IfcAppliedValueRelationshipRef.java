package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcAppliedValueRelationship;

@XmlRootElement(name = "IfcAppliedValueRelationshipRefElement")
public class IfcAppliedValueRelationshipRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcAppliedValueRelationship createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcAppliedValueRelationship();
	}
	
	public static IfcAppliedValueRelationshipRef valueOf(String id) {
		IfcAppliedValueRelationshipRef result = new IfcAppliedValueRelationshipRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}