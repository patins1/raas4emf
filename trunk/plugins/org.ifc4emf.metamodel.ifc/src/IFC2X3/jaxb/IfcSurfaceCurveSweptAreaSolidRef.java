package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSurfaceCurveSweptAreaSolid;

@XmlRootElement(name = "IfcSurfaceCurveSweptAreaSolidRefElement")
public class IfcSurfaceCurveSweptAreaSolidRef extends IFC2X3.jaxb.IfcSweptAreaSolidRef  {

	

	
	@Override
	public IfcSurfaceCurveSweptAreaSolid createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSurfaceCurveSweptAreaSolid();
	}
	
	public static IfcSurfaceCurveSweptAreaSolidRef valueOf(String id) {
		IfcSurfaceCurveSweptAreaSolidRef result = new IfcSurfaceCurveSweptAreaSolidRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}