package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRepresentationMap;

@XmlRootElement(name = "IfcRepresentationMapRefElement")
public class IfcRepresentationMapRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcRepresentationMap createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRepresentationMap();
	}
	
	public static IfcRepresentationMapRef valueOf(String id) {
		IfcRepresentationMapRef result = new IfcRepresentationMapRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}