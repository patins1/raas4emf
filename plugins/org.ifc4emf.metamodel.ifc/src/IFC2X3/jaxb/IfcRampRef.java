package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRamp;

@XmlRootElement(name = "IfcRampRefElement")
public class IfcRampRef extends IFC2X3.jaxb.IfcBuildingElementRef  {

	

	
	@Override
	public IfcRamp createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRamp();
	}
	
	public static IfcRampRef valueOf(String id) {
		IfcRampRef result = new IfcRampRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}