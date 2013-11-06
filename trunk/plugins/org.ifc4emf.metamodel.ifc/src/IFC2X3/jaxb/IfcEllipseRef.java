package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcEllipse;

@XmlRootElement(name = "IfcEllipseRefElement")
public class IfcEllipseRef extends IFC2X3.jaxb.IfcConicRef  {

	

	
	@Override
	public IfcEllipse createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcEllipse();
	}
	
	public static IfcEllipseRef valueOf(String id) {
		IfcEllipseRef result = new IfcEllipseRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}