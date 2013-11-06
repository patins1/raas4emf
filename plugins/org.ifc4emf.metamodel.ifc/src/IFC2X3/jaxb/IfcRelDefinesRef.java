package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelDefines;

@XmlRootElement(name = "IfcRelDefinesRefElement")
public class IfcRelDefinesRef extends IFC2X3.jaxb.IfcRelationshipRef  {

	

	
	@Override
	public IfcRelDefines createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelDefines();
	}
	
	public static IfcRelDefinesRef valueOf(String id) {
		IfcRelDefinesRef result = new IfcRelDefinesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}