package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcTextStyleTextModel;

@XmlRootElement(name = "IfcTextStyleTextModelRefElement")
public class IfcTextStyleTextModelRef extends IFC2X3.jaxb.IfcTextStyleSelectRef  {

	

	
	@Override
	public IfcTextStyleTextModel createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcTextStyleTextModel();
	}
	
	public static IfcTextStyleTextModelRef valueOf(String id) {
		IfcTextStyleTextModelRef result = new IfcTextStyleTextModelRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}