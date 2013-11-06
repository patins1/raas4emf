package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPresentationStyleAssignment;

@XmlRootElement(name = "IfcPresentationStyleAssignmentRefElement")
public class IfcPresentationStyleAssignmentRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcPresentationStyleAssignment createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPresentationStyleAssignment();
	}
	
	public static IfcPresentationStyleAssignmentRef valueOf(String id) {
		IfcPresentationStyleAssignmentRef result = new IfcPresentationStyleAssignmentRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}