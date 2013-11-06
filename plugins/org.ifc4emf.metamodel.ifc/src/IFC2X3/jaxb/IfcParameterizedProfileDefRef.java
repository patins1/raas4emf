package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcParameterizedProfileDef;

@XmlRootElement(name = "IfcParameterizedProfileDefRefElement")
public class IfcParameterizedProfileDefRef extends IFC2X3.jaxb.IfcProfileDefRef  {

	

	
	@Override
	public IfcParameterizedProfileDef createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcParameterizedProfileDef();
	}
	
	public static IfcParameterizedProfileDefRef valueOf(String id) {
		IfcParameterizedProfileDefRef result = new IfcParameterizedProfileDefRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}