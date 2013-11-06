package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcTypeProduct;

@XmlRootElement(name = "IfcTypeProductRefElement")
public class IfcTypeProductRef extends IFC2X3.jaxb.IfcTypeObjectRef  {

	

	
	@Override
	public IfcTypeProduct createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcTypeProduct();
	}
	
	public static IfcTypeProductRef valueOf(String id) {
		IfcTypeProductRef result = new IfcTypeProductRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}