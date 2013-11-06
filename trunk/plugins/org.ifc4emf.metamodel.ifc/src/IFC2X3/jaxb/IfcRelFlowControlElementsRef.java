package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelFlowControlElements;

@XmlRootElement(name = "IfcRelFlowControlElementsRefElement")
public class IfcRelFlowControlElementsRef extends IFC2X3.jaxb.IfcRelConnectsRef  {

	

	
	@Override
	public IfcRelFlowControlElements createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelFlowControlElements();
	}
	
	public static IfcRelFlowControlElementsRef valueOf(String id) {
		IfcRelFlowControlElementsRef result = new IfcRelFlowControlElementsRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}