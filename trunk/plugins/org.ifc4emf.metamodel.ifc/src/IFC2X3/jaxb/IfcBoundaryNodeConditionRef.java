package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcBoundaryNodeCondition;

@XmlRootElement(name = "IfcBoundaryNodeConditionRefElement")
public class IfcBoundaryNodeConditionRef extends IFC2X3.jaxb.IfcBoundaryConditionRef  {

	

	
	@Override
	public IfcBoundaryNodeCondition createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcBoundaryNodeCondition();
	}
	
	public static IfcBoundaryNodeConditionRef valueOf(String id) {
		IfcBoundaryNodeConditionRef result = new IfcBoundaryNodeConditionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}