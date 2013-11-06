package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcLightSourceGoniometric;

@XmlRootElement(name = "IfcLightSourceGoniometricRefElement")
public class IfcLightSourceGoniometricRef extends IFC2X3.jaxb.IfcLightSourceRef  {

	

	
	@Override
	public IfcLightSourceGoniometric createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcLightSourceGoniometric();
	}
	
	public static IfcLightSourceGoniometricRef valueOf(String id) {
		IfcLightSourceGoniometricRef result = new IfcLightSourceGoniometricRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}