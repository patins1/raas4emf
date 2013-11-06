package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPropertyBoundedValue;

@XmlRootElement(name = "IfcPropertyBoundedValueRefElement")
public class IfcPropertyBoundedValueRef extends IFC2X3.jaxb.IfcSimplePropertyRef  {

	

	
	@Override
	public IfcPropertyBoundedValue createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPropertyBoundedValue();
	}
	
	public static IfcPropertyBoundedValueRef valueOf(String id) {
		IfcPropertyBoundedValueRef result = new IfcPropertyBoundedValueRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}