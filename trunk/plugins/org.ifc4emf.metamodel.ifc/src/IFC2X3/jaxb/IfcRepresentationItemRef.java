package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRepresentationItem;

@XmlRootElement(name = "IfcRepresentationItemRefElement")
public class IfcRepresentationItemRef extends IFC2X3.jaxb.IfcLayeredItemRef  {

	

	
	@Override
	public IfcRepresentationItem createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRepresentationItem();
	}
	
	public static IfcRepresentationItemRef valueOf(String id) {
		IfcRepresentationItemRef result = new IfcRepresentationItemRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}