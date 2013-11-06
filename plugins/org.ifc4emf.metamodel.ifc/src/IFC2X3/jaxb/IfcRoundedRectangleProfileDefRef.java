package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRoundedRectangleProfileDef;

@XmlRootElement(name = "IfcRoundedRectangleProfileDefRefElement")
public class IfcRoundedRectangleProfileDefRef extends IFC2X3.jaxb.IfcRectangleProfileDefRef  {

	

	
	@Override
	public IfcRoundedRectangleProfileDef createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRoundedRectangleProfileDef();
	}
	
	public static IfcRoundedRectangleProfileDefRef valueOf(String id) {
		IfcRoundedRectangleProfileDefRef result = new IfcRoundedRectangleProfileDefRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}