package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSurfaceStyle;

@XmlRootElement(name = "IfcSurfaceStyleRefElement")
public class IfcSurfaceStyleRef extends IFC2X3.jaxb.IfcPresentationStyleRef  {

	

	
	@Override
	public IfcSurfaceStyle createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSurfaceStyle();
	}
	
	public static IfcSurfaceStyleRef valueOf(String id) {
		IfcSurfaceStyleRef result = new IfcSurfaceStyleRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}