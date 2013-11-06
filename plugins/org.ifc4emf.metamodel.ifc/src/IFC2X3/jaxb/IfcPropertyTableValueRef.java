package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPropertyTableValue;

@XmlRootElement(name = "IfcPropertyTableValueRefElement")
public class IfcPropertyTableValueRef extends IFC2X3.jaxb.IfcSimplePropertyRef  {

	

	
	@Override
	public IfcPropertyTableValue createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPropertyTableValue();
	}
	
	public static IfcPropertyTableValueRef valueOf(String id) {
		IfcPropertyTableValueRef result = new IfcPropertyTableValueRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}