package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcLaborResource;

@XmlRootElement(name = "IfcLaborResourceRefElement")
public class IfcLaborResourceRef extends IFC2X3.jaxb.IfcConstructionResourceRef  {

	

	
	@Override
	public IfcLaborResource createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcLaborResource();
	}
	
	public static IfcLaborResourceRef valueOf(String id) {
		IfcLaborResourceRef result = new IfcLaborResourceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}