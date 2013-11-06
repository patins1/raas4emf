package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRightCircularCylinder;

@XmlRootElement(name = "IfcRightCircularCylinderRefElement")
public class IfcRightCircularCylinderRef extends IFC2X3.jaxb.IfcCsgPrimitive3DRef  {

	

	
	@Override
	public IfcRightCircularCylinder createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRightCircularCylinder();
	}
	
	public static IfcRightCircularCylinderRef valueOf(String id) {
		IfcRightCircularCylinderRef result = new IfcRightCircularCylinderRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}