package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDiameterDimension;

@XmlRootElement(name = "IfcDiameterDimensionRefElement")
public class IfcDiameterDimensionRef extends IFC2X3.jaxb.IfcDimensionCurveDirectedCalloutRef  {

	

	
	@Override
	public IfcDiameterDimension createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDiameterDimension();
	}
	
	public static IfcDiameterDimensionRef valueOf(String id) {
		IfcDiameterDimensionRef result = new IfcDiameterDimensionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}