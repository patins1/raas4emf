package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStructuralConnectionCondition;

@XmlRootElement(name = "IfcStructuralConnectionConditionRefElement")
public class IfcStructuralConnectionConditionRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcStructuralConnectionCondition createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStructuralConnectionCondition();
	}
	
	public static IfcStructuralConnectionConditionRef valueOf(String id) {
		IfcStructuralConnectionConditionRef result = new IfcStructuralConnectionConditionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}