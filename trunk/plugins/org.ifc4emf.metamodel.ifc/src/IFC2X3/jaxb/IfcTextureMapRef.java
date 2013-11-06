package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcTextureMap;

@XmlRootElement(name = "IfcTextureMapRefElement")
public class IfcTextureMapRef extends IFC2X3.jaxb.IfcTextureCoordinateRef  {

	

	
	@Override
	public IfcTextureMap createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcTextureMap();
	}
	
	public static IfcTextureMapRef valueOf(String id) {
		IfcTextureMapRef result = new IfcTextureMapRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}