package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcQuantityTime;

@XmlRootElement(name = "IfcQuantityTimeRefElement")
public class IfcQuantityTimeRef extends IFC2X3.jaxb.IfcPhysicalSimpleQuantityRef  {

	

	
	@Override
	public IfcQuantityTime createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcQuantityTime();
	}
	
	public static IfcQuantityTimeRef valueOf(String id) {
		IfcQuantityTimeRef result = new IfcQuantityTimeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}