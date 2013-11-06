package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcZone;

@XmlRootElement(name = "IfcZoneRefElement")
public class IfcZoneRef extends IFC2X3.jaxb.IfcGroupRef  {

	

	
	@Override
	public IfcZone createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcZone();
	}
	
	public static IfcZoneRef valueOf(String id) {
		IfcZoneRef result = new IfcZoneRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}