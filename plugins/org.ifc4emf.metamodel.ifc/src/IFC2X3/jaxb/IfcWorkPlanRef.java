package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcWorkPlan;

@XmlRootElement(name = "IfcWorkPlanRefElement")
public class IfcWorkPlanRef extends IFC2X3.jaxb.IfcWorkControlRef  {

	

	
	@Override
	public IfcWorkPlan createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcWorkPlan();
	}
	
	public static IfcWorkPlanRef valueOf(String id) {
		IfcWorkPlanRef result = new IfcWorkPlanRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}