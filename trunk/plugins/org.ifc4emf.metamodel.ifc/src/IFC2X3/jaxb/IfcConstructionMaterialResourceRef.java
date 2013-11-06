package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcConstructionMaterialResource;

@XmlRootElement(name = "IfcConstructionMaterialResourceRefElement")
public class IfcConstructionMaterialResourceRef extends IFC2X3.jaxb.IfcConstructionResourceRef  {

	

	
	@Override
	public IfcConstructionMaterialResource createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcConstructionMaterialResource();
	}
	
	public static IfcConstructionMaterialResourceRef valueOf(String id) {
		IfcConstructionMaterialResourceRef result = new IfcConstructionMaterialResourceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}