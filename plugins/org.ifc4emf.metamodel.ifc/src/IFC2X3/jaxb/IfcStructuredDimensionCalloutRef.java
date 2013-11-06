package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStructuredDimensionCallout;

@XmlRootElement(name = "IfcStructuredDimensionCalloutRefElement")
public class IfcStructuredDimensionCalloutRef extends IFC2X3.jaxb.IfcDraughtingCalloutRef  {

	

	
	@Override
	public IfcStructuredDimensionCallout createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStructuredDimensionCallout();
	}
	
	public static IfcStructuredDimensionCalloutRef valueOf(String id) {
		IfcStructuredDimensionCalloutRef result = new IfcStructuredDimensionCalloutRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}