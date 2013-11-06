package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelAssociatesAppliedValue;

@XmlRootElement(name = "IfcRelAssociatesAppliedValueRefElement")
public class IfcRelAssociatesAppliedValueRef extends IFC2X3.jaxb.IfcRelAssociatesRef  {

	

	
	@Override
	public IfcRelAssociatesAppliedValue createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelAssociatesAppliedValue();
	}
	
	public static IfcRelAssociatesAppliedValueRef valueOf(String id) {
		IfcRelAssociatesAppliedValueRef result = new IfcRelAssociatesAppliedValueRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}