package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSpatialStructureElement;

@XmlRootElement(name = "IfcSpatialStructureElementRefElement")
public class IfcSpatialStructureElementRef extends IFC2X3.jaxb.IfcProductRef  {

	

	
	@Override
	public IfcSpatialStructureElement createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSpatialStructureElement();
	}
	
	public static IfcSpatialStructureElementRef valueOf(String id) {
		IfcSpatialStructureElementRef result = new IfcSpatialStructureElementRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}