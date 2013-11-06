package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcConstructionResource;

@XmlRootElement(name = "IfcConstructionResourceRefElement")
public class IfcConstructionResourceRef extends IFC2X3.jaxb.IfcResourceRef  {

	

	
	@Override
	public IfcConstructionResource createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcConstructionResource();
	}
	
	public static IfcConstructionResourceRef valueOf(String id) {
		IfcConstructionResourceRef result = new IfcConstructionResourceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}