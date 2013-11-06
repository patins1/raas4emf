package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcProxy;

@XmlRootElement(name = "IfcProxyRefElement")
public class IfcProxyRef extends IFC2X3.jaxb.IfcProductRef  {

	

	
	@Override
	public IfcProxy createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcProxy();
	}
	
	public static IfcProxyRef valueOf(String id) {
		IfcProxyRef result = new IfcProxyRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}