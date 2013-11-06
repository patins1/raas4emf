package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcVibrationIsolatorType;

@XmlRootElement(name = "IfcVibrationIsolatorTypeRefElement")
public class IfcVibrationIsolatorTypeRef extends IFC2X3.jaxb.IfcDiscreteAccessoryTypeRef  {

	

	
	@Override
	public IfcVibrationIsolatorType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcVibrationIsolatorType();
	}
	
	public static IfcVibrationIsolatorTypeRef valueOf(String id) {
		IfcVibrationIsolatorTypeRef result = new IfcVibrationIsolatorTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}