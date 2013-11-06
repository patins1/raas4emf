package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCraneRailFShapeProfileDef;

@XmlRootElement(name = "IfcCraneRailFShapeProfileDefRefElement")
public class IfcCraneRailFShapeProfileDefRef extends IFC2X3.jaxb.IfcParameterizedProfileDefRef  {

	

	
	@Override
	public IfcCraneRailFShapeProfileDef createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcCraneRailFShapeProfileDef();
	}
	
	public static IfcCraneRailFShapeProfileDefRef valueOf(String id) {
		IfcCraneRailFShapeProfileDefRef result = new IfcCraneRailFShapeProfileDefRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}