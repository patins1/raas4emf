package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStructuralLoadSingleForce;

@XmlRootElement(name = "IfcStructuralLoadSingleForceRefElement")
public class IfcStructuralLoadSingleForceRef extends IFC2X3.jaxb.IfcStructuralLoadStaticRef  {

	

	
	@Override
	public IfcStructuralLoadSingleForce createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStructuralLoadSingleForce();
	}
	
	public static IfcStructuralLoadSingleForceRef valueOf(String id) {
		IfcStructuralLoadSingleForceRef result = new IfcStructuralLoadSingleForceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}