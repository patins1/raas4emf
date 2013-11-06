package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDoorStyle;

@XmlRootElement(name = "IfcDoorStyleRefElement")
public class IfcDoorStyleRef extends IFC2X3.jaxb.IfcTypeProductRef  {

	

	
	@Override
	public IfcDoorStyle createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDoorStyle();
	}
	
	public static IfcDoorStyleRef valueOf(String id) {
		IfcDoorStyleRef result = new IfcDoorStyleRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}