package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFeatureElementAddition;

@XmlRootElement(name = "IfcFeatureElementAdditionRefElement")
public class IfcFeatureElementAdditionRef extends IFC2X3.jaxb.IfcFeatureElementRef  {

	

	
	@Override
	public IfcFeatureElementAddition createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFeatureElementAddition();
	}
	
	public static IfcFeatureElementAdditionRef valueOf(String id) {
		IfcFeatureElementAdditionRef result = new IfcFeatureElementAdditionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}