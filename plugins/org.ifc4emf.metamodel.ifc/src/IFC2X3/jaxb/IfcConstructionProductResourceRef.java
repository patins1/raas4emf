package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcConstructionProductResource;

@XmlRootElement(name = "IfcConstructionProductResourceRefElement")
public class IfcConstructionProductResourceRef extends IFC2X3.jaxb.IfcConstructionResourceRef  {

	

	
	@Override
	public IfcConstructionProductResource createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcConstructionProductResource();
	}
	
	public static IfcConstructionProductResourceRef valueOf(String id) {
		IfcConstructionProductResourceRef result = new IfcConstructionProductResourceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}