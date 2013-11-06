package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStructuralLoadTemperature;

@XmlRootElement(name = "IfcStructuralLoadTemperatureRefElement")
public class IfcStructuralLoadTemperatureRef extends IFC2X3.jaxb.IfcStructuralLoadStaticRef  {

	

	
	@Override
	public IfcStructuralLoadTemperature createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStructuralLoadTemperature();
	}
	
	public static IfcStructuralLoadTemperatureRef valueOf(String id) {
		IfcStructuralLoadTemperatureRef result = new IfcStructuralLoadTemperatureRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}