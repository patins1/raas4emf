package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcTextStyle;

@XmlRootElement(name = "IfcTextStyleRefElement")
public class IfcTextStyleRef extends IFC2X3.jaxb.IfcPresentationStyleRef  {

	

	
	@Override
	public IfcTextStyle createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcTextStyle();
	}
	
	public static IfcTextStyleRef valueOf(String id) {
		IfcTextStyleRef result = new IfcTextStyleRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}