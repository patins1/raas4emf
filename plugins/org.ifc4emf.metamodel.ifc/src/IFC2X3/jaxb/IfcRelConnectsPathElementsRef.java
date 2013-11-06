package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelConnectsPathElements;

@XmlRootElement(name = "IfcRelConnectsPathElementsRefElement")
public class IfcRelConnectsPathElementsRef extends IFC2X3.jaxb.IfcRelConnectsElementsRef  {

	

	
	@Override
	public IfcRelConnectsPathElements createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelConnectsPathElements();
	}
	
	public static IfcRelConnectsPathElementsRef valueOf(String id) {
		IfcRelConnectsPathElementsRef result = new IfcRelConnectsPathElementsRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}