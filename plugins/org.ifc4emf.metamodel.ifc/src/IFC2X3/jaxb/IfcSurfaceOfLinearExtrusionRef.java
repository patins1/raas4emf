package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSurfaceOfLinearExtrusion;

@XmlRootElement(name = "IfcSurfaceOfLinearExtrusionRefElement")
public class IfcSurfaceOfLinearExtrusionRef extends IFC2X3.jaxb.IfcSweptSurfaceRef  {

	

	
	@Override
	public IfcSurfaceOfLinearExtrusion createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSurfaceOfLinearExtrusion();
	}
	
	public static IfcSurfaceOfLinearExtrusionRef valueOf(String id) {
		IfcSurfaceOfLinearExtrusionRef result = new IfcSurfaceOfLinearExtrusionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}