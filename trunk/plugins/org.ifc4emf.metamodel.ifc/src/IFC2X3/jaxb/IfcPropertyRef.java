package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcProperty;

@XmlRootElement(name = "IfcPropertyRefElement")
public class IfcPropertyRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcProperty createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcProperty();
	}
	
	public static IfcPropertyRef valueOf(String id) {
		IfcPropertyRef result = new IfcPropertyRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}