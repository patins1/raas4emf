package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelAssignsToProduct;

@XmlRootElement(name = "IfcRelAssignsToProductRefElement")
public class IfcRelAssignsToProductRef extends IFC2X3.jaxb.IfcRelAssignsRef  {

	

	
	@Override
	public IfcRelAssignsToProduct createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelAssignsToProduct();
	}
	
	public static IfcRelAssignsToProductRef valueOf(String id) {
		IfcRelAssignsToProductRef result = new IfcRelAssignsToProductRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}