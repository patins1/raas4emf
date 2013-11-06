package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcArbitraryClosedProfileDef;

@XmlRootElement(name = "IfcArbitraryClosedProfileDefRefElement")
public class IfcArbitraryClosedProfileDefRef extends IFC2X3.jaxb.IfcProfileDefRef  {

	

	
	@Override
	public IfcArbitraryClosedProfileDef createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcArbitraryClosedProfileDef();
	}
	
	public static IfcArbitraryClosedProfileDefRef valueOf(String id) {
		IfcArbitraryClosedProfileDefRef result = new IfcArbitraryClosedProfileDefRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}