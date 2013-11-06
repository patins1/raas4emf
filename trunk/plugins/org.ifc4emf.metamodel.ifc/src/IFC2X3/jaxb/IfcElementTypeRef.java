package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcElementType;

@XmlRootElement(name = "IfcElementTypeRefElement")
public class IfcElementTypeRef extends IFC2X3.jaxb.IfcTypeProductRef  {

	

	
	@Override
	public IfcElementType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcElementType();
	}
	
	public static IfcElementTypeRef valueOf(String id) {
		IfcElementTypeRef result = new IfcElementTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}