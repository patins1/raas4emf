package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelaxation;

@XmlRootElement(name = "IfcRelaxationRefElement")
public class IfcRelaxationRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcRelaxation createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelaxation();
	}
	
	public static IfcRelaxationRef valueOf(String id) {
		IfcRelaxationRef result = new IfcRelaxationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}