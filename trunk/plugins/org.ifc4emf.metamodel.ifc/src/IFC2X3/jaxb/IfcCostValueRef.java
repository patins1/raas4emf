package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCostValue;

@XmlRootElement(name = "IfcCostValueRefElement")
public class IfcCostValueRef extends IFC2X3.jaxb.IfcAppliedValueRef  {

	

	
	@Override
	public IfcCostValue createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcCostValue();
	}
	
	public static IfcCostValueRef valueOf(String id) {
		IfcCostValueRef result = new IfcCostValueRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}