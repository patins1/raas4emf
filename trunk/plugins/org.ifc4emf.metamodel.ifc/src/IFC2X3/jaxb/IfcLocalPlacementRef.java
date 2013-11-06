package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcLocalPlacement;

@XmlRootElement(name = "IfcLocalPlacementRefElement")
public class IfcLocalPlacementRef extends IFC2X3.jaxb.IfcObjectPlacementRef  {

	

	
	@Override
	public IfcLocalPlacement createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcLocalPlacement();
	}
	
	public static IfcLocalPlacementRef valueOf(String id) {
		IfcLocalPlacementRef result = new IfcLocalPlacementRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}