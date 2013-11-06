package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcLightSourceDirectional;

@XmlRootElement(name = "IfcLightSourceDirectionalRefElement")
public class IfcLightSourceDirectionalRef extends IFC2X3.jaxb.IfcLightSourceRef  {

	

	
	@Override
	public IfcLightSourceDirectional createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcLightSourceDirectional();
	}
	
	public static IfcLightSourceDirectionalRef valueOf(String id) {
		IfcLightSourceDirectionalRef result = new IfcLightSourceDirectionalRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}