package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcGeometricRepresentationContext;

@XmlRootElement(name = "IfcGeometricRepresentationContextRefElement")
public class IfcGeometricRepresentationContextRef extends IFC2X3.jaxb.IfcRepresentationContextRef  {

	

	
	@Override
	public IfcGeometricRepresentationContext createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcGeometricRepresentationContext();
	}
	
	public static IfcGeometricRepresentationContextRef valueOf(String id) {
		IfcGeometricRepresentationContextRef result = new IfcGeometricRepresentationContextRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}