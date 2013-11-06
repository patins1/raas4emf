package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDistributionControlElement;

@XmlRootElement(name = "IfcDistributionControlElementRefElement")
public class IfcDistributionControlElementRef extends IFC2X3.jaxb.IfcDistributionElementRef  {

	

	
	@Override
	public IfcDistributionControlElement createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDistributionControlElement();
	}
	
	public static IfcDistributionControlElementRef valueOf(String id) {
		IfcDistributionControlElementRef result = new IfcDistributionControlElementRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}