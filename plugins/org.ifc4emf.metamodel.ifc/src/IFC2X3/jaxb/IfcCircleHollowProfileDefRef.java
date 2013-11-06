package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCircleHollowProfileDef;

@XmlRootElement(name = "IfcCircleHollowProfileDefRefElement")
public class IfcCircleHollowProfileDefRef extends IFC2X3.jaxb.IfcCircleProfileDefRef  {

	

	
	@Override
	public IfcCircleHollowProfileDef createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcCircleHollowProfileDef();
	}
	
	public static IfcCircleHollowProfileDefRef valueOf(String id) {
		IfcCircleHollowProfileDefRef result = new IfcCircleHollowProfileDefRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}