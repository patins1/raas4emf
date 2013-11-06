package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDimensionCurveTerminator;

@XmlRootElement(name = "IfcDimensionCurveTerminatorRefElement")
public class IfcDimensionCurveTerminatorRef extends IFC2X3.jaxb.IfcTerminatorSymbolRef  {

	

	
	@Override
	public IfcDimensionCurveTerminator createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDimensionCurveTerminator();
	}
	
	public static IfcDimensionCurveTerminatorRef valueOf(String id) {
		IfcDimensionCurveTerminatorRef result = new IfcDimensionCurveTerminatorRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}