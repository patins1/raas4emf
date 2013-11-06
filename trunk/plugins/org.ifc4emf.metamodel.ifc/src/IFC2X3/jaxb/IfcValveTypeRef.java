package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcValveType;

@XmlRootElement(name = "IfcValveTypeRefElement")
public class IfcValveTypeRef extends IFC2X3.jaxb.IfcFlowControllerTypeRef  {

	

	
	@Override
	public IfcValveType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcValveType();
	}
	
	public static IfcValveTypeRef valueOf(String id) {
		IfcValveTypeRef result = new IfcValveTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}