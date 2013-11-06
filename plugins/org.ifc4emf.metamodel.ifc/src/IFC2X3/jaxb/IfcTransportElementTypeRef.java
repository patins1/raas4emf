package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcTransportElementType;

@XmlRootElement(name = "IfcTransportElementTypeRefElement")
public class IfcTransportElementTypeRef extends IFC2X3.jaxb.IfcElementTypeRef  {

	

	
	@Override
	public IfcTransportElementType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcTransportElementType();
	}
	
	public static IfcTransportElementTypeRef valueOf(String id) {
		IfcTransportElementTypeRef result = new IfcTransportElementTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}