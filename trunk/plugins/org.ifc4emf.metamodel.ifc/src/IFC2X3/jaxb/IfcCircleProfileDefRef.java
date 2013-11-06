package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCircleProfileDef;

@XmlRootElement(name = "IfcCircleProfileDefRefElement")
public class IfcCircleProfileDefRef extends IFC2X3.jaxb.IfcParameterizedProfileDefRef  {

	

	
	@Override
	public IfcCircleProfileDef createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcCircleProfileDef();
	}
	
	public static IfcCircleProfileDefRef valueOf(String id) {
		IfcCircleProfileDefRef result = new IfcCircleProfileDefRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}