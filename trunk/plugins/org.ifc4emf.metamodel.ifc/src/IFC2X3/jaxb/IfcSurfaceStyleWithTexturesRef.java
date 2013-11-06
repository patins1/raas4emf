package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSurfaceStyleWithTextures;

@XmlRootElement(name = "IfcSurfaceStyleWithTexturesRefElement")
public class IfcSurfaceStyleWithTexturesRef extends IFC2X3.jaxb.IfcSurfaceStyleElementSelectRef  {

	

	
	@Override
	public IfcSurfaceStyleWithTextures createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSurfaceStyleWithTextures();
	}
	
	public static IfcSurfaceStyleWithTexturesRef valueOf(String id) {
		IfcSurfaceStyleWithTexturesRef result = new IfcSurfaceStyleWithTexturesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}