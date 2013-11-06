package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDerivedProfileDef;

@XmlRootElement(name = "IfcDerivedProfileDefRefElement")
public class IfcDerivedProfileDefRef extends IFC2X3.jaxb.IfcProfileDefRef  {

	

	
	@Override
	public IfcDerivedProfileDef createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDerivedProfileDef();
	}
	
	public static IfcDerivedProfileDefRef valueOf(String id) {
		IfcDerivedProfileDefRef result = new IfcDerivedProfileDefRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}