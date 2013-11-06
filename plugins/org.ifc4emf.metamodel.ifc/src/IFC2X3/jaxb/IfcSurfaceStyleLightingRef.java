package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSurfaceStyleLighting;

@XmlRootElement(name = "IfcSurfaceStyleLightingRefElement")
public class IfcSurfaceStyleLightingRef extends IFC2X3.jaxb.IfcSurfaceStyleElementSelectRef  {

	

	
	@Override
	public IfcSurfaceStyleLighting createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSurfaceStyleLighting();
	}
	
	public static IfcSurfaceStyleLightingRef valueOf(String id) {
		IfcSurfaceStyleLightingRef result = new IfcSurfaceStyleLightingRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}