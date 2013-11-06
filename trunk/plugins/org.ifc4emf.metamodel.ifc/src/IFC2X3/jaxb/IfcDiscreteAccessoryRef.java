package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDiscreteAccessory;

@XmlRootElement(name = "IfcDiscreteAccessoryRefElement")
public class IfcDiscreteAccessoryRef extends IFC2X3.jaxb.IfcElementComponentRef  {

	

	
	@Override
	public IfcDiscreteAccessory createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDiscreteAccessory();
	}
	
	public static IfcDiscreteAccessoryRef valueOf(String id) {
		IfcDiscreteAccessoryRef result = new IfcDiscreteAccessoryRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}