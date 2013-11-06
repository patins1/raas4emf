package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcGeometricCurveSet;

@XmlRootElement(name = "IfcGeometricCurveSetRefElement")
public class IfcGeometricCurveSetRef extends IFC2X3.jaxb.IfcGeometricSetRef  {

	

	
	@Override
	public IfcGeometricCurveSet createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcGeometricCurveSet();
	}
	
	public static IfcGeometricCurveSetRef valueOf(String id) {
		IfcGeometricCurveSetRef result = new IfcGeometricCurveSetRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}