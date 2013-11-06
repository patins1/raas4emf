package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcShapeModel;

@XmlRootElement(name = "IfcShapeModelRefElement")
public class IfcShapeModelRef extends IFC2X3.jaxb.IfcRepresentationRef  {

	

	
	@Override
	public IfcShapeModel createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcShapeModel();
	}
	
	public static IfcShapeModelRef valueOf(String id) {
		IfcShapeModelRef result = new IfcShapeModelRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}