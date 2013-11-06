package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcMetric;

@XmlRootElement(name = "IfcMetricRefElement")
public class IfcMetricRef extends IFC2X3.jaxb.IfcConstraintRef  {

	

	
	@Override
	public IfcMetric createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcMetric();
	}
	
	public static IfcMetricRef valueOf(String id) {
		IfcMetricRef result = new IfcMetricRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}