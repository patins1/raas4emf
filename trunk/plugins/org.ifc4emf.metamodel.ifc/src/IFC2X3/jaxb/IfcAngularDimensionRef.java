package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcAngularDimension;

@XmlRootElement(name = "IfcAngularDimensionRefElement")
public class IfcAngularDimensionRef extends IFC2X3.jaxb.IfcDimensionCurveDirectedCalloutRef  {

	

	
	@Override
	public IfcAngularDimension createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcAngularDimension();
	}
	
	public static IfcAngularDimensionRef valueOf(String id) {
		IfcAngularDimensionRef result = new IfcAngularDimensionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}