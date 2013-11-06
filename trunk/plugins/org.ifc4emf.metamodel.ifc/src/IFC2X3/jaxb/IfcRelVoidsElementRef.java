package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelVoidsElement;

@XmlRootElement(name = "IfcRelVoidsElementRefElement")
public class IfcRelVoidsElementRef extends IFC2X3.jaxb.IfcRelConnectsRef  {

	

	
	@Override
	public IfcRelVoidsElement createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelVoidsElement();
	}
	
	public static IfcRelVoidsElementRef valueOf(String id) {
		IfcRelVoidsElementRef result = new IfcRelVoidsElementRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}