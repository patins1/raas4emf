package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPlacement;

@XmlRootElement(name = "IfcPlacementRefElement")
public class IfcPlacementRef extends IFC2X3.jaxb.IfcGeometricRepresentationItemRef  {

	

	
	@Override
	public IfcPlacement createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPlacement();
	}
	
	public static IfcPlacementRef valueOf(String id) {
		IfcPlacementRef result = new IfcPlacementRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}