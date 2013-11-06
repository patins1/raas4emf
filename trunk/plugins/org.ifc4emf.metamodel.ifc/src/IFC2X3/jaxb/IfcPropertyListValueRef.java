package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPropertyListValue;

@XmlRootElement(name = "IfcPropertyListValueRefElement")
public class IfcPropertyListValueRef extends IFC2X3.jaxb.IfcSimplePropertyRef  {

	

	
	@Override
	public IfcPropertyListValue createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPropertyListValue();
	}
	
	public static IfcPropertyListValueRef valueOf(String id) {
		IfcPropertyListValueRef result = new IfcPropertyListValueRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}