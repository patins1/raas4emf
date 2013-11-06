package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcEnvironmentalImpactValue;

@XmlRootElement(name = "IfcEnvironmentalImpactValueRefElement")
public class IfcEnvironmentalImpactValueRef extends IFC2X3.jaxb.IfcAppliedValueRef  {

	

	
	@Override
	public IfcEnvironmentalImpactValue createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcEnvironmentalImpactValue();
	}
	
	public static IfcEnvironmentalImpactValueRef valueOf(String id) {
		IfcEnvironmentalImpactValueRef result = new IfcEnvironmentalImpactValueRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}