package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcAppliedValue;

@XmlRootElement(name = "IfcAppliedValueRefElement")
public class IfcAppliedValueRef extends IFC2X3.jaxb.IfcObjectReferenceSelectRef  {

	

	
	@Override
	public IfcAppliedValue createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcAppliedValue();
	}
	
	public static IfcAppliedValueRef valueOf(String id) {
		IfcAppliedValueRef result = new IfcAppliedValueRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}