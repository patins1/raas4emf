package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcLightSourceAmbient;

@XmlRootElement(name = "IfcLightSourceAmbientRefElement")
public class IfcLightSourceAmbientRef extends IFC2X3.jaxb.IfcLightSourceRef  {

	

	
	@Override
	public IfcLightSourceAmbient createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcLightSourceAmbient();
	}
	
	public static IfcLightSourceAmbientRef valueOf(String id) {
		IfcLightSourceAmbientRef result = new IfcLightSourceAmbientRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}