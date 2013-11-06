package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcElectricalElement;

@XmlRootElement(name = "IfcElectricalElementRefElement")
public class IfcElectricalElementRef extends IFC2X3.jaxb.IfcElementRef  {

	

	
	@Override
	public IfcElectricalElement createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcElectricalElement();
	}
	
	public static IfcElectricalElementRef valueOf(String id) {
		IfcElectricalElementRef result = new IfcElectricalElementRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}