package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcTopologicalRepresentationItem;

@XmlRootElement(name = "IfcTopologicalRepresentationItemRefElement")
public class IfcTopologicalRepresentationItemRef extends IFC2X3.jaxb.IfcRepresentationItemRef  {

	

	
	@Override
	public IfcTopologicalRepresentationItem createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcTopologicalRepresentationItem();
	}
	
	public static IfcTopologicalRepresentationItemRef valueOf(String id) {
		IfcTopologicalRepresentationItemRef result = new IfcTopologicalRepresentationItemRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}