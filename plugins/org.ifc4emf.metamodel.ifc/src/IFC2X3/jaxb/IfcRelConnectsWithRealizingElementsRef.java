package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelConnectsWithRealizingElements;

@XmlRootElement(name = "IfcRelConnectsWithRealizingElementsRefElement")
public class IfcRelConnectsWithRealizingElementsRef extends IFC2X3.jaxb.IfcRelConnectsElementsRef  {

	

	
	@Override
	public IfcRelConnectsWithRealizingElements createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelConnectsWithRealizingElements();
	}
	
	public static IfcRelConnectsWithRealizingElementsRef valueOf(String id) {
		IfcRelConnectsWithRealizingElementsRef result = new IfcRelConnectsWithRealizingElementsRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}