package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcQuantityArea;

@XmlRootElement(name = "IfcQuantityAreaRefElement")
public class IfcQuantityAreaRef extends IFC2X3.jaxb.IfcPhysicalSimpleQuantityRef  {

	

	
	@Override
	public IfcQuantityArea createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcQuantityArea();
	}
	
	public static IfcQuantityAreaRef valueOf(String id) {
		IfcQuantityAreaRef result = new IfcQuantityAreaRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}