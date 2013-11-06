package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPropertyEnumeratedValue;

@XmlRootElement(name = "IfcPropertyEnumeratedValueRefElement")
public class IfcPropertyEnumeratedValueRef extends IFC2X3.jaxb.IfcSimplePropertyRef  {

	

	
	@Override
	public IfcPropertyEnumeratedValue createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPropertyEnumeratedValue();
	}
	
	public static IfcPropertyEnumeratedValueRef valueOf(String id) {
		IfcPropertyEnumeratedValueRef result = new IfcPropertyEnumeratedValueRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}