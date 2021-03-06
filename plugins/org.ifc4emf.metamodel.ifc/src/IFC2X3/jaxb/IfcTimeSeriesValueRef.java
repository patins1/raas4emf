package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcTimeSeriesValue;

@XmlRootElement(name = "IfcTimeSeriesValueRefElement")
public class IfcTimeSeriesValueRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcTimeSeriesValue createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcTimeSeriesValue();
	}
	
	public static IfcTimeSeriesValueRef valueOf(String id) {
		IfcTimeSeriesValueRef result = new IfcTimeSeriesValueRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}