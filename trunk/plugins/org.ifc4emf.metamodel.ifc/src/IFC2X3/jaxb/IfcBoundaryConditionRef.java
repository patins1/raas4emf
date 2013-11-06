package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcBoundaryCondition;

@XmlRootElement(name = "IfcBoundaryConditionRefElement")
public class IfcBoundaryConditionRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcBoundaryCondition createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcBoundaryCondition();
	}
	
	public static IfcBoundaryConditionRef valueOf(String id) {
		IfcBoundaryConditionRef result = new IfcBoundaryConditionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}