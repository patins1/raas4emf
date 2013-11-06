package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcNamedUnit;

@XmlRootElement(name = "IfcNamedUnitRefElement")
public class IfcNamedUnitRef extends IFC2X3.jaxb.IfcUnitRef  {

	

	
	@Override
	public IfcNamedUnit createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcNamedUnit();
	}
	
	public static IfcNamedUnitRef valueOf(String id) {
		IfcNamedUnitRef result = new IfcNamedUnitRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}