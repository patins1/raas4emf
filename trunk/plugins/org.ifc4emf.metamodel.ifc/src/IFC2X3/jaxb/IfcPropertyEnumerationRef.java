package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPropertyEnumeration;

@XmlRootElement(name = "IfcPropertyEnumerationRefElement")
public class IfcPropertyEnumerationRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcPropertyEnumeration createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPropertyEnumeration();
	}
	
	public static IfcPropertyEnumerationRef valueOf(String id) {
		IfcPropertyEnumerationRef result = new IfcPropertyEnumerationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}