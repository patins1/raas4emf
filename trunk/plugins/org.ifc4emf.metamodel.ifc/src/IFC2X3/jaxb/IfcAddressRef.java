package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcAddress;

@XmlRootElement(name = "IfcAddressRefElement")
public class IfcAddressRef extends IFC2X3.jaxb.IfcObjectReferenceSelectRef  {

	

	
	@Override
	public IfcAddress createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcAddress();
	}
	
	public static IfcAddressRef valueOf(String id) {
		IfcAddressRef result = new IfcAddressRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}