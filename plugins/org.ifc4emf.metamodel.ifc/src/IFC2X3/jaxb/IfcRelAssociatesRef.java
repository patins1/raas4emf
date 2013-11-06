package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelAssociates;

@XmlRootElement(name = "IfcRelAssociatesRefElement")
public class IfcRelAssociatesRef extends IFC2X3.jaxb.IfcRelationshipRef  {

	

	
	@Override
	public IfcRelAssociates createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelAssociates();
	}
	
	public static IfcRelAssociatesRef valueOf(String id) {
		IfcRelAssociatesRef result = new IfcRelAssociatesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}