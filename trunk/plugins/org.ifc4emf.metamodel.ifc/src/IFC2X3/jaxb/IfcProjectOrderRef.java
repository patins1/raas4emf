package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcProjectOrder;

@XmlRootElement(name = "IfcProjectOrderRefElement")
public class IfcProjectOrderRef extends IFC2X3.jaxb.IfcControlRef  {

	

	
	@Override
	public IfcProjectOrder createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcProjectOrder();
	}
	
	public static IfcProjectOrderRef valueOf(String id) {
		IfcProjectOrderRef result = new IfcProjectOrderRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}