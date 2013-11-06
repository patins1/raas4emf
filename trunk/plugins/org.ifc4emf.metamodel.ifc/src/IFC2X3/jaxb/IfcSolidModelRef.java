package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSolidModel;

@XmlRootElement(name = "IfcSolidModelRefElement")
public class IfcSolidModelRef extends IFC2X3.jaxb.IfcBooleanOperandRef  {

	

	
	@Override
	public IfcSolidModel createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSolidModel();
	}
	
	public static IfcSolidModelRef valueOf(String id) {
		IfcSolidModelRef result = new IfcSolidModelRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}