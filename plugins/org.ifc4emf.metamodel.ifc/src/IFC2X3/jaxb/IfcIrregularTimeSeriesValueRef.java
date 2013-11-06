package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcIrregularTimeSeriesValue;

@XmlRootElement(name = "IfcIrregularTimeSeriesValueRefElement")
public class IfcIrregularTimeSeriesValueRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcIrregularTimeSeriesValue createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcIrregularTimeSeriesValue();
	}
	
	public static IfcIrregularTimeSeriesValueRef valueOf(String id) {
		IfcIrregularTimeSeriesValueRef result = new IfcIrregularTimeSeriesValueRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}