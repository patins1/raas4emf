package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSectionProperties;

@XmlRootElement(name = "IfcSectionPropertiesRefElement")
public class IfcSectionPropertiesRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcSectionProperties createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSectionProperties();
	}
	
	public static IfcSectionPropertiesRef valueOf(String id) {
		IfcSectionPropertiesRef result = new IfcSectionPropertiesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}