package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcIShapeProfileDef;

@XmlRootElement(name = "IfcIShapeProfileDefRefElement")
public class IfcIShapeProfileDefRef extends IFC2X3.jaxb.IfcParameterizedProfileDefRef  {

	

	
	@Override
	public IfcIShapeProfileDef createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcIShapeProfileDef();
	}
	
	public static IfcIShapeProfileDefRef valueOf(String id) {
		IfcIShapeProfileDefRef result = new IfcIShapeProfileDefRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}