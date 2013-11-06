package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPoint;

@XmlRootElement(name = "IfcPointRefElement")
public class IfcPointRef extends IFC2X3.jaxb.IfcGeometricSetSelectRef  {

	

	
	@Override
	public IfcPoint createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPoint();
	}
	
	public static IfcPointRef valueOf(String id) {
		IfcPointRef result = new IfcPointRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}