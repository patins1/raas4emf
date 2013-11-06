package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcIrregularTimeSeries;

@XmlRootElement(name = "IfcIrregularTimeSeriesRefElement")
public class IfcIrregularTimeSeriesRef extends IFC2X3.jaxb.IfcTimeSeriesRef  {

	

	
	@Override
	public IfcIrregularTimeSeries createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcIrregularTimeSeries();
	}
	
	public static IfcIrregularTimeSeriesRef valueOf(String id) {
		IfcIrregularTimeSeriesRef result = new IfcIrregularTimeSeriesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}