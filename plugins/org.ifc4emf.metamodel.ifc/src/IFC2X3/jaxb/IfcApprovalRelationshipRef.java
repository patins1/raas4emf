package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcApprovalRelationship;

@XmlRootElement(name = "IfcApprovalRelationshipRefElement")
public class IfcApprovalRelationshipRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcApprovalRelationship createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcApprovalRelationship();
	}
	
	public static IfcApprovalRelationshipRef valueOf(String id) {
		IfcApprovalRelationshipRef result = new IfcApprovalRelationshipRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}