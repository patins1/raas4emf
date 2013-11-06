package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcMetricValueSelect;

@XmlRootElement(name = "IfcMetricValueSelectRefElement")
public class IfcMetricValueSelectRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcMetricValueSelect createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcMetricValueSelect();
	}
	
	public static IfcMetricValueSelectRef valueOf(String id) {
		IfcMetricValueSelectRef result = new IfcMetricValueSelectRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}