package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcZShapeProfileDef;

@XmlRootElement(name = "IfcZShapeProfileDefRefElement")
public class IfcZShapeProfileDefRef extends IFC2X3.jaxb.IfcParameterizedProfileDefRef  {

	

	
	@Override
	public IfcZShapeProfileDef createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcZShapeProfileDef();
	}
	
	public static IfcZShapeProfileDefRef valueOf(String id) {
		IfcZShapeProfileDefRef result = new IfcZShapeProfileDefRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}