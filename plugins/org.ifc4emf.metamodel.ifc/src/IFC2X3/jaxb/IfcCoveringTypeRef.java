package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCoveringType;

@XmlRootElement(name = "IfcCoveringTypeRefElement")
public class IfcCoveringTypeRef extends IFC2X3.jaxb.IfcBuildingElementTypeRef  {

	

	
	@Override
	public IfcCoveringType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcCoveringType();
	}
	
	public static IfcCoveringTypeRef valueOf(String id) {
		IfcCoveringTypeRef result = new IfcCoveringTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}