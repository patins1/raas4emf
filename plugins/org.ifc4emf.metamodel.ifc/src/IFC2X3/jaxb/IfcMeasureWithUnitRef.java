package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcMeasureWithUnit;

@XmlRootElement(name = "IfcMeasureWithUnitRefElement")
public class IfcMeasureWithUnitRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcMeasureWithUnit createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcMeasureWithUnit();
	}
	
	public static IfcMeasureWithUnitRef valueOf(String id) {
		IfcMeasureWithUnitRef result = new IfcMeasureWithUnitRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}