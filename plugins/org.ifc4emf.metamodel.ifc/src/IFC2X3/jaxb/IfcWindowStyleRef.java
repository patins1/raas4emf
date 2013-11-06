package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcWindowStyle;

@XmlRootElement(name = "IfcWindowStyleRefElement")
public class IfcWindowStyleRef extends IFC2X3.jaxb.IfcTypeProductRef  {

	

	
	@Override
	public IfcWindowStyle createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcWindowStyle();
	}
	
	public static IfcWindowStyleRef valueOf(String id) {
		IfcWindowStyleRef result = new IfcWindowStyleRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}