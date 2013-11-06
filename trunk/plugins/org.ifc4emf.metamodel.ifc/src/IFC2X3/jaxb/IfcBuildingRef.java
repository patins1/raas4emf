package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcBuilding;

@XmlRootElement(name = "IfcBuildingRefElement")
public class IfcBuildingRef extends IFC2X3.jaxb.IfcSpatialStructureElementRef  {

	

	
	@Override
	public IfcBuilding createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcBuilding();
	}
	
	public static IfcBuildingRef valueOf(String id) {
		IfcBuildingRef result = new IfcBuildingRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}