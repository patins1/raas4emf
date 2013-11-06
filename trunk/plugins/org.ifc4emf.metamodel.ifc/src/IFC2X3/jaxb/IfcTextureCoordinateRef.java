package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcTextureCoordinate;

@XmlRootElement(name = "IfcTextureCoordinateRefElement")
public class IfcTextureCoordinateRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcTextureCoordinate createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcTextureCoordinate();
	}
	
	public static IfcTextureCoordinateRef valueOf(String id) {
		IfcTextureCoordinateRef result = new IfcTextureCoordinateRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}