package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPresentationStyle;

@XmlRootElement(name = "IfcPresentationStyleRefElement")
public class IfcPresentationStyleRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcPresentationStyle createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPresentationStyle();
	}
	
	public static IfcPresentationStyleRef valueOf(String id) {
		IfcPresentationStyleRef result = new IfcPresentationStyleRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}