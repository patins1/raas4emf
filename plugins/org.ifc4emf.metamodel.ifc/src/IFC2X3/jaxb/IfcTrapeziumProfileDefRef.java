package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcTrapeziumProfileDef;

@XmlRootElement(name = "IfcTrapeziumProfileDefRefElement")
public class IfcTrapeziumProfileDefRef extends IFC2X3.jaxb.IfcParameterizedProfileDefRef  {

	

	
	@Override
	public IfcTrapeziumProfileDef createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcTrapeziumProfileDef();
	}
	
	public static IfcTrapeziumProfileDefRef valueOf(String id) {
		IfcTrapeziumProfileDefRef result = new IfcTrapeziumProfileDefRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}