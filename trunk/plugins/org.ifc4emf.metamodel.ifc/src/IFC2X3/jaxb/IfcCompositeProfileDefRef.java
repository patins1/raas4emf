package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCompositeProfileDef;

@XmlRootElement(name = "IfcCompositeProfileDefRefElement")
public class IfcCompositeProfileDefRef extends IFC2X3.jaxb.IfcProfileDefRef  {

	

	
	@Override
	public IfcCompositeProfileDef createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcCompositeProfileDef();
	}
	
	public static IfcCompositeProfileDefRef valueOf(String id) {
		IfcCompositeProfileDefRef result = new IfcCompositeProfileDefRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}