package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRepresentationContext;

@XmlRootElement(name = "IfcRepresentationContextRefElement")
public class IfcRepresentationContextRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcRepresentationContext createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRepresentationContext();
	}
	
	public static IfcRepresentationContextRef valueOf(String id) {
		IfcRepresentationContextRef result = new IfcRepresentationContextRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}