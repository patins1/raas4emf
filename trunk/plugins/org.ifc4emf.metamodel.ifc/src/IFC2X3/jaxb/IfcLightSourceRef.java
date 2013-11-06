package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcLightSource;

@XmlRootElement(name = "IfcLightSourceRefElement")
public class IfcLightSourceRef extends IFC2X3.jaxb.IfcGeometricRepresentationItemRef  {

	

	
	@Override
	public IfcLightSource createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcLightSource();
	}
	
	public static IfcLightSourceRef valueOf(String id) {
		IfcLightSourceRef result = new IfcLightSourceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}