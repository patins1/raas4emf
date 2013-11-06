package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcLightSourceSpot;

@XmlRootElement(name = "IfcLightSourceSpotRefElement")
public class IfcLightSourceSpotRef extends IFC2X3.jaxb.IfcLightSourcePositionalRef  {

	

	
	@Override
	public IfcLightSourceSpot createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcLightSourceSpot();
	}
	
	public static IfcLightSourceSpotRef valueOf(String id) {
		IfcLightSourceSpotRef result = new IfcLightSourceSpotRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}