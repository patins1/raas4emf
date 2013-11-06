package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcGridPlacement;

@XmlRootElement(name = "IfcGridPlacementRefElement")
public class IfcGridPlacementRef extends IFC2X3.jaxb.IfcObjectPlacementRef  {

	

	
	@Override
	public IfcGridPlacement createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcGridPlacement();
	}
	
	public static IfcGridPlacementRef valueOf(String id) {
		IfcGridPlacementRef result = new IfcGridPlacementRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}