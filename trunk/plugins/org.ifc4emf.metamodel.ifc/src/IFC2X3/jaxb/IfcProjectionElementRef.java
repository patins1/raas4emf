package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcProjectionElement;

@XmlRootElement(name = "IfcProjectionElementRefElement")
public class IfcProjectionElementRef extends IFC2X3.jaxb.IfcFeatureElementAdditionRef  {

	

	
	@Override
	public IfcProjectionElement createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcProjectionElement();
	}
	
	public static IfcProjectionElementRef valueOf(String id) {
		IfcProjectionElementRef result = new IfcProjectionElementRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}