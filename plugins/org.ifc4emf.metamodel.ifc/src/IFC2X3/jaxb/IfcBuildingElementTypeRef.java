package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcBuildingElementType;

@XmlRootElement(name = "IfcBuildingElementTypeRefElement")
public class IfcBuildingElementTypeRef extends IFC2X3.jaxb.IfcElementTypeRef  {

	

	
	@Override
	public IfcBuildingElementType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcBuildingElementType();
	}
	
	public static IfcBuildingElementTypeRef valueOf(String id) {
		IfcBuildingElementTypeRef result = new IfcBuildingElementTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}