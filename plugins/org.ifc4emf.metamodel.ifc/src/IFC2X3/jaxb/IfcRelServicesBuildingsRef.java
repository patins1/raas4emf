package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelServicesBuildings;

@XmlRootElement(name = "IfcRelServicesBuildingsRefElement")
public class IfcRelServicesBuildingsRef extends IFC2X3.jaxb.IfcRelConnectsRef  {

	

	
	@Override
	public IfcRelServicesBuildings createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelServicesBuildings();
	}
	
	public static IfcRelServicesBuildingsRef valueOf(String id) {
		IfcRelServicesBuildingsRef result = new IfcRelServicesBuildingsRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}