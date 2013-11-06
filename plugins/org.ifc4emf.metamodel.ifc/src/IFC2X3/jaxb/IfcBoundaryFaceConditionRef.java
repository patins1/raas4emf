package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcBoundaryFaceCondition;

@XmlRootElement(name = "IfcBoundaryFaceConditionRefElement")
public class IfcBoundaryFaceConditionRef extends IFC2X3.jaxb.IfcBoundaryConditionRef  {

	

	
	@Override
	public IfcBoundaryFaceCondition createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcBoundaryFaceCondition();
	}
	
	public static IfcBoundaryFaceConditionRef valueOf(String id) {
		IfcBoundaryFaceConditionRef result = new IfcBoundaryFaceConditionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}