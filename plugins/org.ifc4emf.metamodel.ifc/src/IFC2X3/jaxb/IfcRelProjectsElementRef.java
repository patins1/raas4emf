package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelProjectsElement;

@XmlRootElement(name = "IfcRelProjectsElementRefElement")
public class IfcRelProjectsElementRef extends IFC2X3.jaxb.IfcRelConnectsRef  {

	

	
	@Override
	public IfcRelProjectsElement createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelProjectsElement();
	}
	
	public static IfcRelProjectsElementRef valueOf(String id) {
		IfcRelProjectsElementRef result = new IfcRelProjectsElementRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}