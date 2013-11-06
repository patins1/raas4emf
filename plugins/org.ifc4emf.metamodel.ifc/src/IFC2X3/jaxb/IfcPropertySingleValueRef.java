package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPropertySingleValue;

@XmlRootElement(name = "IfcPropertySingleValueRefElement")
public class IfcPropertySingleValueRef extends IFC2X3.jaxb.IfcSimplePropertyRef  {

	

	
	@Override
	public IfcPropertySingleValue createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPropertySingleValue();
	}
	
	public static IfcPropertySingleValueRef valueOf(String id) {
		IfcPropertySingleValueRef result = new IfcPropertySingleValueRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}