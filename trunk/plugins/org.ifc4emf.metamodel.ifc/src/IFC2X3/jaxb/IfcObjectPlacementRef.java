package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcObjectPlacement;

@XmlRootElement(name = "IfcObjectPlacementRefElement")
public class IfcObjectPlacementRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcObjectPlacement createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcObjectPlacement();
	}
	
	public static IfcObjectPlacementRef valueOf(String id) {
		IfcObjectPlacementRef result = new IfcObjectPlacementRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}