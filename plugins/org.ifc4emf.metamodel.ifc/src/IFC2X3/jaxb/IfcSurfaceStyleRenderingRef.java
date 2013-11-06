package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSurfaceStyleRendering;

@XmlRootElement(name = "IfcSurfaceStyleRenderingRefElement")
public class IfcSurfaceStyleRenderingRef extends IFC2X3.jaxb.IfcSurfaceStyleShadingRef  {

	

	
	@Override
	public IfcSurfaceStyleRendering createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSurfaceStyleRendering();
	}
	
	public static IfcSurfaceStyleRenderingRef valueOf(String id) {
		IfcSurfaceStyleRenderingRef result = new IfcSurfaceStyleRenderingRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}