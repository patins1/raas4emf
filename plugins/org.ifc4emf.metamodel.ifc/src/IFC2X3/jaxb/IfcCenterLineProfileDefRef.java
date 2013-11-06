package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCenterLineProfileDef;

@XmlRootElement(name = "IfcCenterLineProfileDefRefElement")
public class IfcCenterLineProfileDefRef extends IFC2X3.jaxb.IfcArbitraryOpenProfileDefRef  {

	

	
	@Override
	public IfcCenterLineProfileDef createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcCenterLineProfileDef();
	}
	
	public static IfcCenterLineProfileDefRef valueOf(String id) {
		IfcCenterLineProfileDefRef result = new IfcCenterLineProfileDefRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}