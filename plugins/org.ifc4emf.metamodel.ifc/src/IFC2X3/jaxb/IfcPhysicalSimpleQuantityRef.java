package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPhysicalSimpleQuantity;

@XmlRootElement(name = "IfcPhysicalSimpleQuantityRefElement")
public class IfcPhysicalSimpleQuantityRef extends IFC2X3.jaxb.IfcPhysicalQuantityRef  {

	

	
	@Override
	public IfcPhysicalSimpleQuantity createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPhysicalSimpleQuantity();
	}
	
	public static IfcPhysicalSimpleQuantityRef valueOf(String id) {
		IfcPhysicalSimpleQuantityRef result = new IfcPhysicalSimpleQuantityRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}