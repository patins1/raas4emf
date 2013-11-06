package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelConnectsStructuralElement;

@XmlRootElement(name = "IfcRelConnectsStructuralElementRefElement")
public class IfcRelConnectsStructuralElementRef extends IFC2X3.jaxb.IfcRelConnectsRef  {

	

	
	@Override
	public IfcRelConnectsStructuralElement createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelConnectsStructuralElement();
	}
	
	public static IfcRelConnectsStructuralElementRef valueOf(String id) {
		IfcRelConnectsStructuralElementRef result = new IfcRelConnectsStructuralElementRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}