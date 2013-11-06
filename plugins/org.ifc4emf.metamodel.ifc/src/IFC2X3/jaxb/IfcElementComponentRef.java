package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcElementComponent;

@XmlRootElement(name = "IfcElementComponentRefElement")
public class IfcElementComponentRef extends IFC2X3.jaxb.IfcElementRef  {

	

	
	@Override
	public IfcElementComponent createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcElementComponent();
	}
	
	public static IfcElementComponentRef valueOf(String id) {
		IfcElementComponentRef result = new IfcElementComponentRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}