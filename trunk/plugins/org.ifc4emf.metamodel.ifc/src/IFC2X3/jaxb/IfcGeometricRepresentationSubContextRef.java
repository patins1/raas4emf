package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcGeometricRepresentationSubContext;

@XmlRootElement(name = "IfcGeometricRepresentationSubContextRefElement")
public class IfcGeometricRepresentationSubContextRef extends IFC2X3.jaxb.IfcGeometricRepresentationContextRef  {

	

	
	@Override
	public IfcGeometricRepresentationSubContext createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcGeometricRepresentationSubContext();
	}
	
	public static IfcGeometricRepresentationSubContextRef valueOf(String id) {
		IfcGeometricRepresentationSubContextRef result = new IfcGeometricRepresentationSubContextRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}