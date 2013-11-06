package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcAppliedValueSelect;

@XmlRootElement(name = "IfcAppliedValueSelectRefElement")
public class IfcAppliedValueSelectRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcAppliedValueSelect createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcAppliedValueSelect();
	}
	
	public static IfcAppliedValueSelectRef valueOf(String id) {
		IfcAppliedValueSelectRef result = new IfcAppliedValueSelectRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}