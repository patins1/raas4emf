package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStructuralLoadLinearForce;

@XmlRootElement(name = "IfcStructuralLoadLinearForceRefElement")
public class IfcStructuralLoadLinearForceRef extends IFC2X3.jaxb.IfcStructuralLoadStaticRef  {

	

	
	@Override
	public IfcStructuralLoadLinearForce createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStructuralLoadLinearForce();
	}
	
	public static IfcStructuralLoadLinearForceRef valueOf(String id) {
		IfcStructuralLoadLinearForceRef result = new IfcStructuralLoadLinearForceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}