package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelContainedInSpatialStructure;

@XmlRootElement(name = "IfcRelContainedInSpatialStructureRefElement")
public class IfcRelContainedInSpatialStructureRef extends IFC2X3.jaxb.IfcRelConnectsRef  {

	

	
	@Override
	public IfcRelContainedInSpatialStructure createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelContainedInSpatialStructure();
	}
	
	public static IfcRelContainedInSpatialStructureRef valueOf(String id) {
		IfcRelContainedInSpatialStructureRef result = new IfcRelContainedInSpatialStructureRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}