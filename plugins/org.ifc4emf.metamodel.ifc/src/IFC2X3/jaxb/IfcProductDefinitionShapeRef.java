package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcProductDefinitionShape;

@XmlRootElement(name = "IfcProductDefinitionShapeRefElement")
public class IfcProductDefinitionShapeRef extends IFC2X3.jaxb.IfcProductRepresentationRef  {

	

	
	@Override
	public IfcProductDefinitionShape createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcProductDefinitionShape();
	}
	
	public static IfcProductDefinitionShapeRef valueOf(String id) {
		IfcProductDefinitionShapeRef result = new IfcProductDefinitionShapeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}