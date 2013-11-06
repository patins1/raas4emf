package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSurfaceOfRevolution;

@XmlRootElement(name = "IfcSurfaceOfRevolutionRefElement")
public class IfcSurfaceOfRevolutionRef extends IFC2X3.jaxb.IfcSweptSurfaceRef  {

	

	
	@Override
	public IfcSurfaceOfRevolution createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSurfaceOfRevolution();
	}
	
	public static IfcSurfaceOfRevolutionRef valueOf(String id) {
		IfcSurfaceOfRevolutionRef result = new IfcSurfaceOfRevolutionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}