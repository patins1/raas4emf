package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcProfileDef;

@XmlRootElement(name = "IfcProfileDefRefElement")
public class IfcProfileDefRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcProfileDef createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcProfileDef();
	}
	
	public static IfcProfileDefRef valueOf(String id) {
		IfcProfileDefRef result = new IfcProfileDefRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}