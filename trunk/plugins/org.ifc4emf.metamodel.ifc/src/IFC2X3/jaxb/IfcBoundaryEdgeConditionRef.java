package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcBoundaryEdgeCondition;

@XmlRootElement(name = "IfcBoundaryEdgeConditionRefElement")
public class IfcBoundaryEdgeConditionRef extends IFC2X3.jaxb.IfcBoundaryConditionRef  {

	

	
	@Override
	public IfcBoundaryEdgeCondition createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcBoundaryEdgeCondition();
	}
	
	public static IfcBoundaryEdgeConditionRef valueOf(String id) {
		IfcBoundaryEdgeConditionRef result = new IfcBoundaryEdgeConditionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}