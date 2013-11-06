package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDerivedUnit;

@XmlRootElement(name = "IfcDerivedUnitRefElement")
public class IfcDerivedUnitRef extends IFC2X3.jaxb.IfcUnitRef  {

	

	
	@Override
	public IfcDerivedUnit createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDerivedUnit();
	}
	
	public static IfcDerivedUnitRef valueOf(String id) {
		IfcDerivedUnitRef result = new IfcDerivedUnitRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}