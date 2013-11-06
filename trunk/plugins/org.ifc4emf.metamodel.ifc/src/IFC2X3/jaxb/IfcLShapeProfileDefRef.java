package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcLShapeProfileDef;

@XmlRootElement(name = "IfcLShapeProfileDefRefElement")
public class IfcLShapeProfileDefRef extends IFC2X3.jaxb.IfcParameterizedProfileDefRef  {

	

	
	@Override
	public IfcLShapeProfileDef createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcLShapeProfileDef();
	}
	
	public static IfcLShapeProfileDefRef valueOf(String id) {
		IfcLShapeProfileDefRef result = new IfcLShapeProfileDefRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}