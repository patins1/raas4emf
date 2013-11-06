package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPresentationStyleSelect;

@XmlRootElement(name = "IfcPresentationStyleSelectRefElement")
public class IfcPresentationStyleSelectRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcPresentationStyleSelect createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPresentationStyleSelect();
	}
	
	public static IfcPresentationStyleSelectRef valueOf(String id) {
		IfcPresentationStyleSelectRef result = new IfcPresentationStyleSelectRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}