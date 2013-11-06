package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcLinearDimension;

@XmlRootElement(name = "IfcLinearDimensionRefElement")
public class IfcLinearDimensionRef extends IFC2X3.jaxb.IfcDimensionCurveDirectedCalloutRef  {

	

	
	@Override
	public IfcLinearDimension createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcLinearDimension();
	}
	
	public static IfcLinearDimensionRef valueOf(String id) {
		IfcLinearDimensionRef result = new IfcLinearDimensionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}