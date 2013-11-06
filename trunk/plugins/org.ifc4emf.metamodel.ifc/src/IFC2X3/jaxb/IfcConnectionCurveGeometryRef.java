package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcConnectionCurveGeometry;

@XmlRootElement(name = "IfcConnectionCurveGeometryRefElement")
public class IfcConnectionCurveGeometryRef extends IFC2X3.jaxb.IfcConnectionGeometryRef  {

	

	
	@Override
	public IfcConnectionCurveGeometry createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcConnectionCurveGeometry();
	}
	
	public static IfcConnectionCurveGeometryRef valueOf(String id) {
		IfcConnectionCurveGeometryRef result = new IfcConnectionCurveGeometryRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}