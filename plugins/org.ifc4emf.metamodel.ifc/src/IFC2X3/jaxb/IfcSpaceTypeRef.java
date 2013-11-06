package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSpaceType;

@XmlRootElement(name = "IfcSpaceTypeRefElement")
public class IfcSpaceTypeRef extends IFC2X3.jaxb.IfcSpatialStructureElementTypeRef  {

	

	
	@Override
	public IfcSpaceType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSpaceType();
	}
	
	public static IfcSpaceTypeRef valueOf(String id) {
		IfcSpaceTypeRef result = new IfcSpaceTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}