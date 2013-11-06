package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelCoversBldgElements;

@XmlRootElement(name = "IfcRelCoversBldgElementsRefElement")
public class IfcRelCoversBldgElementsRef extends IFC2X3.jaxb.IfcRelConnectsRef  {

	

	
	@Override
	public IfcRelCoversBldgElements createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelCoversBldgElements();
	}
	
	public static IfcRelCoversBldgElementsRef valueOf(String id) {
		IfcRelCoversBldgElementsRef result = new IfcRelCoversBldgElementsRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}