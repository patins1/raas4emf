package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcAxis2Placement2D;

@XmlRootElement(name = "IfcAxis2Placement2DRefElement")
public class IfcAxis2Placement2DRef extends IFC2X3.jaxb.IfcAxis2PlacementRef  {

	

	
	@Override
	public IfcAxis2Placement2D createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcAxis2Placement2D();
	}
	
	public static IfcAxis2Placement2DRef valueOf(String id) {
		IfcAxis2Placement2DRef result = new IfcAxis2Placement2DRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}