package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcShellBasedSurfaceModel;

@XmlRootElement(name = "IfcShellBasedSurfaceModelRefElement")
public class IfcShellBasedSurfaceModelRef extends IFC2X3.jaxb.IfcGeometricRepresentationItemRef  {

	

	
	@Override
	public IfcShellBasedSurfaceModel createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcShellBasedSurfaceModel();
	}
	
	public static IfcShellBasedSurfaceModelRef valueOf(String id) {
		IfcShellBasedSurfaceModelRef result = new IfcShellBasedSurfaceModelRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}