package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPostalAddress;

@XmlRootElement(name = "IfcPostalAddressRefElement")
public class IfcPostalAddressRef extends IFC2X3.jaxb.IfcAddressRef  {

	

	
	@Override
	public IfcPostalAddress createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPostalAddress();
	}
	
	public static IfcPostalAddressRef valueOf(String id) {
		IfcPostalAddressRef result = new IfcPostalAddressRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}