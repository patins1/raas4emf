package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcConic;

@XmlRootElement(name = "IfcConicRefElement")
public class IfcConicRef extends IFC2X3.jaxb.IfcCurveRef  {

	

	
	@Override
	public IfcConic createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcConic();
	}
	
	public static IfcConicRef valueOf(String id) {
		IfcConicRef result = new IfcConicRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}