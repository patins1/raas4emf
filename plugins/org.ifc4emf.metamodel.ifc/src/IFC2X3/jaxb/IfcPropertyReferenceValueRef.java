package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPropertyReferenceValue;

@XmlRootElement(name = "IfcPropertyReferenceValueRefElement")
public class IfcPropertyReferenceValueRef extends IFC2X3.jaxb.IfcSimplePropertyRef  {

	

	
	@Override
	public IfcPropertyReferenceValue createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPropertyReferenceValue();
	}
	
	public static IfcPropertyReferenceValueRef valueOf(String id) {
		IfcPropertyReferenceValueRef result = new IfcPropertyReferenceValueRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}