package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCShapeProfileDef;

@XmlRootElement(name = "IfcCShapeProfileDefRefElement")
public class IfcCShapeProfileDefRef extends IFC2X3.jaxb.IfcParameterizedProfileDefRef  {

	

	
	@Override
	public IfcCShapeProfileDef createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcCShapeProfileDef();
	}
	
	public static IfcCShapeProfileDefRef valueOf(String id) {
		IfcCShapeProfileDefRef result = new IfcCShapeProfileDefRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}