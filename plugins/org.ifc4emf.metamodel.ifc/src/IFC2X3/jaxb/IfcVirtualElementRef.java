package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcVirtualElement;

@XmlRootElement(name = "IfcVirtualElementRefElement")
public class IfcVirtualElementRef extends IFC2X3.jaxb.IfcElementRef  {

	

	
	@Override
	public IfcVirtualElement createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcVirtualElement();
	}
	
	public static IfcVirtualElementRef valueOf(String id) {
		IfcVirtualElementRef result = new IfcVirtualElementRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}