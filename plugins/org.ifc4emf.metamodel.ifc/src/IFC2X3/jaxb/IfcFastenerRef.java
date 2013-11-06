package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFastener;

@XmlRootElement(name = "IfcFastenerRefElement")
public class IfcFastenerRef extends IFC2X3.jaxb.IfcElementComponentRef  {

	

	
	@Override
	public IfcFastener createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFastener();
	}
	
	public static IfcFastenerRef valueOf(String id) {
		IfcFastenerRef result = new IfcFastenerRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}