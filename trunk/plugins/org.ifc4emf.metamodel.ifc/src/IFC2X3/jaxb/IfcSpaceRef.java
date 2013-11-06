package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSpace;

@XmlRootElement(name = "IfcSpaceRefElement")
public class IfcSpaceRef extends IFC2X3.jaxb.IfcSpatialStructureElementRef  {

	

	
	@Override
	public IfcSpace createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSpace();
	}
	
	public static IfcSpaceRef valueOf(String id) {
		IfcSpaceRef result = new IfcSpaceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}