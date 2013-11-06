package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPresentationLayerAssignment;

@XmlRootElement(name = "IfcPresentationLayerAssignmentRefElement")
public class IfcPresentationLayerAssignmentRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcPresentationLayerAssignment createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPresentationLayerAssignment();
	}
	
	public static IfcPresentationLayerAssignmentRef valueOf(String id) {
		IfcPresentationLayerAssignmentRef result = new IfcPresentationLayerAssignmentRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}