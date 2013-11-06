package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStructuralLoad;

@XmlRootElement(name = "IfcStructuralLoadRefElement")
public class IfcStructuralLoadRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcStructuralLoad createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStructuralLoad();
	}
	
	public static IfcStructuralLoadRef valueOf(String id) {
		IfcStructuralLoadRef result = new IfcStructuralLoadRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}