package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFaceBasedSurfaceModel;

@XmlRootElement(name = "IfcFaceBasedSurfaceModelRefElement")
public class IfcFaceBasedSurfaceModelRef extends IFC2X3.jaxb.IfcSurfaceOrFaceSurfaceRef  {

	

	
	@Override
	public IfcFaceBasedSurfaceModel createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFaceBasedSurfaceModel();
	}
	
	public static IfcFaceBasedSurfaceModelRef valueOf(String id) {
		IfcFaceBasedSurfaceModelRef result = new IfcFaceBasedSurfaceModelRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}