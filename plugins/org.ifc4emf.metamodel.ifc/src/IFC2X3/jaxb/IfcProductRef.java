package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcProduct;

@XmlRootElement(name = "IfcProductRefElement")
public class IfcProductRef extends IFC2X3.jaxb.IfcObjectRef  {

	

	
	@Override
	public IfcProduct createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcProduct();
	}
	
	public static IfcProductRef valueOf(String id) {
		IfcProductRef result = new IfcProductRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}