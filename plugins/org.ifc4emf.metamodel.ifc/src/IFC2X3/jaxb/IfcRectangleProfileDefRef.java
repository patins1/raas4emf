package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRectangleProfileDef;

@XmlRootElement(name = "IfcRectangleProfileDefRefElement")
public class IfcRectangleProfileDefRef extends IFC2X3.jaxb.IfcParameterizedProfileDefRef  {

	

	
	@Override
	public IfcRectangleProfileDef createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRectangleProfileDef();
	}
	
	public static IfcRectangleProfileDefRef valueOf(String id) {
		IfcRectangleProfileDefRef result = new IfcRectangleProfileDefRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}