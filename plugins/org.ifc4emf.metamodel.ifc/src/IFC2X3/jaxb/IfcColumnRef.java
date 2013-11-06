package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcColumn;

@XmlRootElement(name = "IfcColumnRefElement")
public class IfcColumnRef extends IFC2X3.jaxb.IfcBuildingElementRef  {

	

	
	@Override
	public IfcColumn createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcColumn();
	}
	
	public static IfcColumnRef valueOf(String id) {
		IfcColumnRef result = new IfcColumnRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}