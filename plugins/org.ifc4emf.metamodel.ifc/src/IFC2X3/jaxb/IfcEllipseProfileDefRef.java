package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcEllipseProfileDef;

@XmlRootElement(name = "IfcEllipseProfileDefRefElement")
public class IfcEllipseProfileDefRef extends IFC2X3.jaxb.IfcParameterizedProfileDefRef  {

	

	
	@Override
	public IfcEllipseProfileDef createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcEllipseProfileDef();
	}
	
	public static IfcEllipseProfileDefRef valueOf(String id) {
		IfcEllipseProfileDefRef result = new IfcEllipseProfileDefRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}