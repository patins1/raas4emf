package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSimpleValue;

@XmlRootElement(name = "IfcSimpleValueRefElement")
public class IfcSimpleValueRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcSimpleValue createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSimpleValue();
	}
	
	public static IfcSimpleValueRef valueOf(String id) {
		IfcSimpleValueRef result = new IfcSimpleValueRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}