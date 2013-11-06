package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFailureConnectionCondition;

@XmlRootElement(name = "IfcFailureConnectionConditionRefElement")
public class IfcFailureConnectionConditionRef extends IFC2X3.jaxb.IfcStructuralConnectionConditionRef  {

	

	
	@Override
	public IfcFailureConnectionCondition createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFailureConnectionCondition();
	}
	
	public static IfcFailureConnectionConditionRef valueOf(String id) {
		IfcFailureConnectionConditionRef result = new IfcFailureConnectionConditionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}