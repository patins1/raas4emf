package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcExternallyDefinedSurfaceStyle;

@XmlRootElement(name = "IfcExternallyDefinedSurfaceStyleRefElement")
public class IfcExternallyDefinedSurfaceStyleRef extends IFC2X3.jaxb.IfcSurfaceStyleElementSelectRef  {

	

	
	@Override
	public IfcExternallyDefinedSurfaceStyle createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcExternallyDefinedSurfaceStyle();
	}
	
	public static IfcExternallyDefinedSurfaceStyleRef valueOf(String id) {
		IfcExternallyDefinedSurfaceStyleRef result = new IfcExternallyDefinedSurfaceStyleRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}