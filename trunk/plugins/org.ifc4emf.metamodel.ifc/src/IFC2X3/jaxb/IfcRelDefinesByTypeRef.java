package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelDefinesByType;

@XmlRootElement(name = "IfcRelDefinesByTypeRefElement")
public class IfcRelDefinesByTypeRef extends IFC2X3.jaxb.IfcRelDefinesRef  {

	

	
	@Override
	public IfcRelDefinesByType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelDefinesByType();
	}
	
	public static IfcRelDefinesByTypeRef valueOf(String id) {
		IfcRelDefinesByTypeRef result = new IfcRelDefinesByTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}