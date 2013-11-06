package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcConversionBasedUnit;

@XmlRootElement(name = "IfcConversionBasedUnitRefElement")
public class IfcConversionBasedUnitRef extends IFC2X3.jaxb.IfcNamedUnitRef  {

	

	
	@Override
	public IfcConversionBasedUnit createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcConversionBasedUnit();
	}
	
	public static IfcConversionBasedUnitRef valueOf(String id) {
		IfcConversionBasedUnitRef result = new IfcConversionBasedUnitRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}