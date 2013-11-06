package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelAssociatesApproval;

@XmlRootElement(name = "IfcRelAssociatesApprovalRefElement")
public class IfcRelAssociatesApprovalRef extends IFC2X3.jaxb.IfcRelAssociatesRef  {

	

	
	@Override
	public IfcRelAssociatesApproval createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelAssociatesApproval();
	}
	
	public static IfcRelAssociatesApprovalRef valueOf(String id) {
		IfcRelAssociatesApprovalRef result = new IfcRelAssociatesApprovalRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}