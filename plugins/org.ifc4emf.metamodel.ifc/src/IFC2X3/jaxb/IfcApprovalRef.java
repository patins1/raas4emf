package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcApproval;

@XmlRootElement(name = "IfcApprovalRefElement")
public class IfcApprovalRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcApproval createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcApproval();
	}
	
	public static IfcApprovalRef valueOf(String id) {
		IfcApprovalRef result = new IfcApprovalRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}