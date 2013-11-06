package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcQuantityCount;

@XmlRootElement(name = "IfcQuantityCountRefElement")
public class IfcQuantityCountRef extends IFC2X3.jaxb.IfcPhysicalSimpleQuantityRef  {

	

	
	@Override
	public IfcQuantityCount createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcQuantityCount();
	}
	
	public static IfcQuantityCountRef valueOf(String id) {
		IfcQuantityCountRef result = new IfcQuantityCountRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}