package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcConnectionPointEccentricity;

@XmlRootElement(name = "IfcConnectionPointEccentricityRefElement")
public class IfcConnectionPointEccentricityRef extends IFC2X3.jaxb.IfcConnectionPointGeometryRef  {

	

	
	@Override
	public IfcConnectionPointEccentricity createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcConnectionPointEccentricity();
	}
	
	public static IfcConnectionPointEccentricityRef valueOf(String id) {
		IfcConnectionPointEccentricityRef result = new IfcConnectionPointEccentricityRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}