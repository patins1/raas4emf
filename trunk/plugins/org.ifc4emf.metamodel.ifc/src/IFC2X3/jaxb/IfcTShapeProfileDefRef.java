package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcTShapeProfileDef;

@XmlRootElement(name = "IfcTShapeProfileDefRefElement")
public class IfcTShapeProfileDefRef extends IFC2X3.jaxb.IfcParameterizedProfileDefRef  {

	

	
	@Override
	public IfcTShapeProfileDef createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcTShapeProfileDef();
	}
	
	public static IfcTShapeProfileDefRef valueOf(String id) {
		IfcTShapeProfileDefRef result = new IfcTShapeProfileDefRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}