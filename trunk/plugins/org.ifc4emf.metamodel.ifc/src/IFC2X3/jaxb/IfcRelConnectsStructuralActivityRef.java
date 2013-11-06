package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelConnectsStructuralActivity;

@XmlRootElement(name = "IfcRelConnectsStructuralActivityRefElement")
public class IfcRelConnectsStructuralActivityRef extends IFC2X3.jaxb.IfcRelConnectsRef  {

	

	
	@Override
	public IfcRelConnectsStructuralActivity createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelConnectsStructuralActivity();
	}
	
	public static IfcRelConnectsStructuralActivityRef valueOf(String id) {
		IfcRelConnectsStructuralActivityRef result = new IfcRelConnectsStructuralActivityRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}