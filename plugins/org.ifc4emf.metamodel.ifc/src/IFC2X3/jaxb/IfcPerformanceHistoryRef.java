package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPerformanceHistory;

@XmlRootElement(name = "IfcPerformanceHistoryRefElement")
public class IfcPerformanceHistoryRef extends IFC2X3.jaxb.IfcControlRef  {

	

	
	@Override
	public IfcPerformanceHistory createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPerformanceHistory();
	}
	
	public static IfcPerformanceHistoryRef valueOf(String id) {
		IfcPerformanceHistoryRef result = new IfcPerformanceHistoryRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}