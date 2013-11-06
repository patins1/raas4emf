package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcTransportElement;

@XmlRootElement(name = "IfcTransportElementRefElement")
public class IfcTransportElementRef extends IFC2X3.jaxb.IfcElementRef  {

	

	
	@Override
	public IfcTransportElement createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcTransportElement();
	}
	
	public static IfcTransportElementRef valueOf(String id) {
		IfcTransportElementRef result = new IfcTransportElementRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}