package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcUnitAssignment;

@XmlRootElement(name = "IfcUnitAssignmentRefElement")
public class IfcUnitAssignmentRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcUnitAssignment createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcUnitAssignment();
	}
	
	public static IfcUnitAssignmentRef valueOf(String id) {
		IfcUnitAssignmentRef result = new IfcUnitAssignmentRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}