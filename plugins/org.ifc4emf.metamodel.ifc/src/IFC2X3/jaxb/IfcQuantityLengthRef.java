package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcQuantityLength;

@XmlRootElement(name = "IfcQuantityLengthRefElement")
public class IfcQuantityLengthRef extends IFC2X3.jaxb.IfcPhysicalSimpleQuantityRef  {

	

	
	@Override
	public IfcQuantityLength createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcQuantityLength();
	}
	
	public static IfcQuantityLengthRef valueOf(String id) {
		IfcQuantityLengthRef result = new IfcQuantityLengthRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}