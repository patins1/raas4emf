package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcAxis2Placement3D;

@XmlRootElement(name = "IfcAxis2Placement3DRefElement")
public class IfcAxis2Placement3DRef extends IFC2X3.jaxb.IfcAxis2PlacementRef  {

	

	
	@Override
	public IfcAxis2Placement3D createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcAxis2Placement3D();
	}
	
	public static IfcAxis2Placement3DRef valueOf(String id) {
		IfcAxis2Placement3DRef result = new IfcAxis2Placement3DRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}