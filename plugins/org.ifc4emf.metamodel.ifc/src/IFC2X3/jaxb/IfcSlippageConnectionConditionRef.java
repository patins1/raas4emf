package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSlippageConnectionCondition;

@XmlRootElement(name = "IfcSlippageConnectionConditionRefElement")
public class IfcSlippageConnectionConditionRef extends IFC2X3.jaxb.IfcStructuralConnectionConditionRef  {

	

	
	@Override
	public IfcSlippageConnectionCondition createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSlippageConnectionCondition();
	}
	
	public static IfcSlippageConnectionConditionRef valueOf(String id) {
		IfcSlippageConnectionConditionRef result = new IfcSlippageConnectionConditionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}