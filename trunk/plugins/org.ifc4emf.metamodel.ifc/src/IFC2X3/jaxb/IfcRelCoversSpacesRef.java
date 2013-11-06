package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelCoversSpaces;

@XmlRootElement(name = "IfcRelCoversSpacesRefElement")
public class IfcRelCoversSpacesRef extends IFC2X3.jaxb.IfcRelConnectsRef  {

	

	
	@Override
	public IfcRelCoversSpaces createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelCoversSpaces();
	}
	
	public static IfcRelCoversSpacesRef valueOf(String id) {
		IfcRelCoversSpacesRef result = new IfcRelCoversSpacesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}