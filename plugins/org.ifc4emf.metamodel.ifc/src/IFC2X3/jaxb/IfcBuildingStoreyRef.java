package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcBuildingStorey;

@XmlRootElement(name = "IfcBuildingStoreyRefElement")
public class IfcBuildingStoreyRef extends IFC2X3.jaxb.IfcSpatialStructureElementRef  {

	

	
	@Override
	public IfcBuildingStorey createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcBuildingStorey();
	}
	
	public static IfcBuildingStoreyRef valueOf(String id) {
		IfcBuildingStoreyRef result = new IfcBuildingStoreyRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}