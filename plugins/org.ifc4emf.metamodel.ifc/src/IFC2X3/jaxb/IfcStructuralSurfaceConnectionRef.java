package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStructuralSurfaceConnection;

@XmlRootElement(name = "IfcStructuralSurfaceConnectionRefElement")
public class IfcStructuralSurfaceConnectionRef extends IFC2X3.jaxb.IfcStructuralConnectionRef  {

	

	
	@Override
	public IfcStructuralSurfaceConnection createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStructuralSurfaceConnection();
	}
	
	public static IfcStructuralSurfaceConnectionRef valueOf(String id) {
		IfcStructuralSurfaceConnectionRef result = new IfcStructuralSurfaceConnectionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}