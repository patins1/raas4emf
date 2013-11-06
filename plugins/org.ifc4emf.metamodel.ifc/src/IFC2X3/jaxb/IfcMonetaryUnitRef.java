package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcMonetaryUnit;

@XmlRootElement(name = "IfcMonetaryUnitRefElement")
public class IfcMonetaryUnitRef extends IFC2X3.jaxb.IfcUnitRef  {

	

	
	@Override
	public IfcMonetaryUnit createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcMonetaryUnit();
	}
	
	public static IfcMonetaryUnitRef valueOf(String id) {
		IfcMonetaryUnitRef result = new IfcMonetaryUnitRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}