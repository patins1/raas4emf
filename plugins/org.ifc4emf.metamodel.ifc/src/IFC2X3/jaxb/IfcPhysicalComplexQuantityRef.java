package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPhysicalComplexQuantity;

@XmlRootElement(name = "IfcPhysicalComplexQuantityRefElement")
public class IfcPhysicalComplexQuantityRef extends IFC2X3.jaxb.IfcPhysicalQuantityRef  {

	

	
	@Override
	public IfcPhysicalComplexQuantity createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPhysicalComplexQuantity();
	}
	
	public static IfcPhysicalComplexQuantityRef valueOf(String id) {
		IfcPhysicalComplexQuantityRef result = new IfcPhysicalComplexQuantityRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}