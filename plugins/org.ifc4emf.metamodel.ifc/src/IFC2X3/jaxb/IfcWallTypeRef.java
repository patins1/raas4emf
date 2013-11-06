package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcWallType;

@XmlRootElement(name = "IfcWallTypeRefElement")
public class IfcWallTypeRef extends IFC2X3.jaxb.IfcBuildingElementTypeRef  {

	

	
	@Override
	public IfcWallType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcWallType();
	}
	
	public static IfcWallTypeRef valueOf(String id) {
		IfcWallTypeRef result = new IfcWallTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}