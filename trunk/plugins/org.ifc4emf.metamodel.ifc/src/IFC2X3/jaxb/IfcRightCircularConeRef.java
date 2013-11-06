package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRightCircularCone;

@XmlRootElement(name = "IfcRightCircularConeRefElement")
public class IfcRightCircularConeRef extends IFC2X3.jaxb.IfcCsgPrimitive3DRef  {

	

	
	@Override
	public IfcRightCircularCone createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRightCircularCone();
	}
	
	public static IfcRightCircularConeRef valueOf(String id) {
		IfcRightCircularConeRef result = new IfcRightCircularConeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}