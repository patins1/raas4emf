package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPort;

@XmlRootElement(name = "IfcPortRefElement")
public class IfcPortRef extends IFC2X3.jaxb.IfcProductRef  {

	

	
	@Override
	public IfcPort createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPort();
	}
	
	public static IfcPortRef valueOf(String id) {
		IfcPortRef result = new IfcPortRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}