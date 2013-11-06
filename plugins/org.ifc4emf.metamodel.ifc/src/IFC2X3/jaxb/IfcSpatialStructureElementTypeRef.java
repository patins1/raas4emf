package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSpatialStructureElementType;

@XmlRootElement(name = "IfcSpatialStructureElementTypeRefElement")
public class IfcSpatialStructureElementTypeRef extends IFC2X3.jaxb.IfcElementTypeRef  {

	

	
	@Override
	public IfcSpatialStructureElementType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSpatialStructureElementType();
	}
	
	public static IfcSpatialStructureElementTypeRef valueOf(String id) {
		IfcSpatialStructureElementTypeRef result = new IfcSpatialStructureElementTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}