package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcConditionCriterionSelect;

@XmlRootElement(name = "IfcConditionCriterionSelectRefElement")
public class IfcConditionCriterionSelectRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcConditionCriterionSelect createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcConditionCriterionSelect();
	}
	
	public static IfcConditionCriterionSelectRef valueOf(String id) {
		IfcConditionCriterionSelectRef result = new IfcConditionCriterionSelectRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}