package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcApprovalActorRelationship;

@XmlRootElement(name = "IfcApprovalActorRelationshipRefElement")
public class IfcApprovalActorRelationshipRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcApprovalActorRelationship createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcApprovalActorRelationship();
	}
	
	public static IfcApprovalActorRelationshipRef valueOf(String id) {
		IfcApprovalActorRelationshipRef result = new IfcApprovalActorRelationshipRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}