package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSimpleProperty;

@XmlRootElement(name = "IfcSimplePropertyRefElement")
public class IfcSimplePropertyRef extends IFC2X3.jaxb.IfcPropertyRef  {

	

	
	@Override
	public IfcSimpleProperty createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSimpleProperty();
	}
	
	public static IfcSimplePropertyRef valueOf(String id) {
		IfcSimplePropertyRef result = new IfcSimplePropertyRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}