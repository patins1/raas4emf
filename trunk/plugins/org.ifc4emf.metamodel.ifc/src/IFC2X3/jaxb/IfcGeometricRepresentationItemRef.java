package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcGeometricRepresentationItem;

@XmlRootElement(name = "IfcGeometricRepresentationItemRefElement")
public class IfcGeometricRepresentationItemRef extends IFC2X3.jaxb.IfcRepresentationItemRef  {

	

	
	@Override
	public IfcGeometricRepresentationItem createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcGeometricRepresentationItem();
	}
	
	public static IfcGeometricRepresentationItemRef valueOf(String id) {
		IfcGeometricRepresentationItemRef result = new IfcGeometricRepresentationItemRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}