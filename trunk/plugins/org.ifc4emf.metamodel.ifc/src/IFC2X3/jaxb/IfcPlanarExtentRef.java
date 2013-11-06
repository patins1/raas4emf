package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPlanarExtent;

@XmlRootElement(name = "IfcPlanarExtentRefElement")
public class IfcPlanarExtentRef extends IFC2X3.jaxb.IfcGeometricRepresentationItemRef  {

	

	
	@Override
	public IfcPlanarExtent createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPlanarExtent();
	}
	
	public static IfcPlanarExtentRef valueOf(String id) {
		IfcPlanarExtentRef result = new IfcPlanarExtentRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}