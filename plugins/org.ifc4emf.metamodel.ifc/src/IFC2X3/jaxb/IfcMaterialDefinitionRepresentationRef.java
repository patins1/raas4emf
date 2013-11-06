package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcMaterialDefinitionRepresentation;

@XmlRootElement(name = "IfcMaterialDefinitionRepresentationRefElement")
public class IfcMaterialDefinitionRepresentationRef extends IFC2X3.jaxb.IfcProductRepresentationRef  {

	

	
	@Override
	public IfcMaterialDefinitionRepresentation createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcMaterialDefinitionRepresentation();
	}
	
	public static IfcMaterialDefinitionRepresentationRef valueOf(String id) {
		IfcMaterialDefinitionRepresentationRef result = new IfcMaterialDefinitionRepresentationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}