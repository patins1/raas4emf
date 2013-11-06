package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRadiusDimension;

@XmlRootElement(name = "IfcRadiusDimensionRefElement")
public class IfcRadiusDimensionRef extends IFC2X3.jaxb.IfcDimensionCurveDirectedCalloutRef  {

	

	
	@Override
	public IfcRadiusDimension createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRadiusDimension();
	}
	
	public static IfcRadiusDimensionRef valueOf(String id) {
		IfcRadiusDimensionRef result = new IfcRadiusDimensionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}