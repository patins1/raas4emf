package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcTimeSeries;

@XmlRootElement(name = "IfcTimeSeriesRefElement")
public class IfcTimeSeriesRef extends IFC2X3.jaxb.IfcObjectReferenceSelectRef  {

	

	
	@Override
	public IfcTimeSeries createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcTimeSeries();
	}
	
	public static IfcTimeSeriesRef valueOf(String id) {
		IfcTimeSeriesRef result = new IfcTimeSeriesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}