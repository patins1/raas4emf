package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSurfaceStyleRefraction;

@XmlRootElement(name = "IfcSurfaceStyleRefractionRefElement")
public class IfcSurfaceStyleRefractionRef extends IFC2X3.jaxb.IfcSurfaceStyleElementSelectRef  {

	

	
	@Override
	public IfcSurfaceStyleRefraction createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSurfaceStyleRefraction();
	}
	
	public static IfcSurfaceStyleRefractionRef valueOf(String id) {
		IfcSurfaceStyleRefractionRef result = new IfcSurfaceStyleRefractionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}