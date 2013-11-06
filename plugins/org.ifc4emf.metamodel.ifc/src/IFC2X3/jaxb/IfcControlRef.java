package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcControl;

@XmlRootElement(name = "IfcControlRefElement")
public class IfcControlRef extends IFC2X3.jaxb.IfcObjectRef  {

	

	
	@Override
	public IfcControl createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcControl();
	}
	
	public static IfcControlRef valueOf(String id) {
		IfcControlRef result = new IfcControlRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}