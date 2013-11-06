package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelReferencedInSpatialStructure;

@XmlRootElement(name = "IfcRelReferencedInSpatialStructureRefElement")
public class IfcRelReferencedInSpatialStructureRef extends IFC2X3.jaxb.IfcRelConnectsRef  {

	

	
	@Override
	public IfcRelReferencedInSpatialStructure createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelReferencedInSpatialStructure();
	}
	
	public static IfcRelReferencedInSpatialStructureRef valueOf(String id) {
		IfcRelReferencedInSpatialStructureRef result = new IfcRelReferencedInSpatialStructureRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}