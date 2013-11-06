package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStructuralLoadPlanarForce;

@XmlRootElement(name = "IfcStructuralLoadPlanarForceRefElement")
public class IfcStructuralLoadPlanarForceRef extends IFC2X3.jaxb.IfcStructuralLoadStaticRef  {

	

	
	@Override
	public IfcStructuralLoadPlanarForce createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStructuralLoadPlanarForce();
	}
	
	public static IfcStructuralLoadPlanarForceRef valueOf(String id) {
		IfcStructuralLoadPlanarForceRef result = new IfcStructuralLoadPlanarForceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}