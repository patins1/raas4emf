package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelConnectsWithEccentricity;

@XmlRootElement(name = "IfcRelConnectsWithEccentricityRefElement")
public class IfcRelConnectsWithEccentricityRef extends IFC2X3.jaxb.IfcRelConnectsStructuralMemberRef  {

	

	
	@Override
	public IfcRelConnectsWithEccentricity createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelConnectsWithEccentricity();
	}
	
	public static IfcRelConnectsWithEccentricityRef valueOf(String id) {
		IfcRelConnectsWithEccentricityRef result = new IfcRelConnectsWithEccentricityRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}