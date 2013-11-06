package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCsgPrimitive3D;

@XmlRootElement(name = "IfcCsgPrimitive3DRefElement")
public class IfcCsgPrimitive3DRef extends IFC2X3.jaxb.IfcBooleanOperandRef  {

	

	
	@Override
	public IfcCsgPrimitive3D createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcCsgPrimitive3D();
	}
	
	public static IfcCsgPrimitive3DRef valueOf(String id) {
		IfcCsgPrimitive3DRef result = new IfcCsgPrimitive3DRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}