package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcGeometricSet;

@XmlRootElement(name = "IfcGeometricSetRefElement")
public class IfcGeometricSetRef extends IFC2X3.jaxb.IfcGeometricRepresentationItemRef  {

	

	
	@Override
	public IfcGeometricSet createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcGeometricSet();
	}
	
	public static IfcGeometricSetRef valueOf(String id) {
		IfcGeometricSetRef result = new IfcGeometricSetRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}