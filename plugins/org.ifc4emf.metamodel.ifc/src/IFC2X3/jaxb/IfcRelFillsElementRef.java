package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelFillsElement;

@XmlRootElement(name = "IfcRelFillsElementRefElement")
public class IfcRelFillsElementRef extends IFC2X3.jaxb.IfcRelConnectsRef  {

	

	
	@Override
	public IfcRelFillsElement createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelFillsElement();
	}
	
	public static IfcRelFillsElementRef valueOf(String id) {
		IfcRelFillsElementRef result = new IfcRelFillsElementRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}