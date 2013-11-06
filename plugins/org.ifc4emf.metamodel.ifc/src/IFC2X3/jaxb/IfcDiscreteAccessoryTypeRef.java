package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDiscreteAccessoryType;

@XmlRootElement(name = "IfcDiscreteAccessoryTypeRefElement")
public class IfcDiscreteAccessoryTypeRef extends IFC2X3.jaxb.IfcElementComponentTypeRef  {

	

	
	@Override
	public IfcDiscreteAccessoryType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDiscreteAccessoryType();
	}
	
	public static IfcDiscreteAccessoryTypeRef valueOf(String id) {
		IfcDiscreteAccessoryTypeRef result = new IfcDiscreteAccessoryTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}