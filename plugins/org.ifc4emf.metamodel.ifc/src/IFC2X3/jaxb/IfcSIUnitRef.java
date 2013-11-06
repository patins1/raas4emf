package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSIUnit;

@XmlRootElement(name = "IfcSIUnitRefElement")
public class IfcSIUnitRef extends IFC2X3.jaxb.IfcNamedUnitRef  {

	

	
	@Override
	public IfcSIUnit createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSIUnit();
	}
	
	public static IfcSIUnitRef valueOf(String id) {
		IfcSIUnitRef result = new IfcSIUnitRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}