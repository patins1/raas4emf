package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSurfaceStyleShading;

@XmlRootElement(name = "IfcSurfaceStyleShadingRefElement")
public class IfcSurfaceStyleShadingRef extends IFC2X3.jaxb.IfcSurfaceStyleElementSelectRef  {

	

	
	@Override
	public IfcSurfaceStyleShading createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSurfaceStyleShading();
	}
	
	public static IfcSurfaceStyleShadingRef valueOf(String id) {
		IfcSurfaceStyleShadingRef result = new IfcSurfaceStyleShadingRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}