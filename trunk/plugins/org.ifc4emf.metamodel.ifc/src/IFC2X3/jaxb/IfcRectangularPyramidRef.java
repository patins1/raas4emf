package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRectangularPyramid;

@XmlRootElement(name = "IfcRectangularPyramidRefElement")
public class IfcRectangularPyramidRef extends IFC2X3.jaxb.IfcCsgPrimitive3DRef  {

	

	
	@Override
	public IfcRectangularPyramid createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRectangularPyramid();
	}
	
	public static IfcRectangularPyramidRef valueOf(String id) {
		IfcRectangularPyramidRef result = new IfcRectangularPyramidRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}