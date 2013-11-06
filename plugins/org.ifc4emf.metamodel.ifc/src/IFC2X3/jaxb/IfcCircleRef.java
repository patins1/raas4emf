package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCircle;

@XmlRootElement(name = "IfcCircleRefElement")
public class IfcCircleRef extends IFC2X3.jaxb.IfcConicRef  {

	

	
	@Override
	public IfcCircle createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcCircle();
	}
	
	public static IfcCircleRef valueOf(String id) {
		IfcCircleRef result = new IfcCircleRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}