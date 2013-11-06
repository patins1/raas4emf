package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcColumnType;

@XmlRootElement(name = "IfcColumnTypeRefElement")
public class IfcColumnTypeRef extends IFC2X3.jaxb.IfcBuildingElementTypeRef  {

	

	
	@Override
	public IfcColumnType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcColumnType();
	}
	
	public static IfcColumnTypeRef valueOf(String id) {
		IfcColumnTypeRef result = new IfcColumnTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}