package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcContextDependentUnit;

@XmlRootElement(name = "IfcContextDependentUnitRefElement")
public class IfcContextDependentUnitRef extends IFC2X3.jaxb.IfcNamedUnitRef  {

	

	
	@Override
	public IfcContextDependentUnit createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcContextDependentUnit();
	}
	
	public static IfcContextDependentUnitRef valueOf(String id) {
		IfcContextDependentUnitRef result = new IfcContextDependentUnitRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}