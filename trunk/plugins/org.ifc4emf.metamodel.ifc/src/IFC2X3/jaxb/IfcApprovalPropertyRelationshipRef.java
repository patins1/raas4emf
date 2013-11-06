package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcApprovalPropertyRelationship;

@XmlRootElement(name = "IfcApprovalPropertyRelationshipRefElement")
public class IfcApprovalPropertyRelationshipRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcApprovalPropertyRelationship createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcApprovalPropertyRelationship();
	}
	
	public static IfcApprovalPropertyRelationshipRef valueOf(String id) {
		IfcApprovalPropertyRelationshipRef result = new IfcApprovalPropertyRelationshipRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}