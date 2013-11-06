package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcMaterial;

@XmlRootElement(name = "IfcMaterialRefElement")
public class IfcMaterialRef extends IFC2X3.jaxb.IfcMaterialSelectRef  {

	

	
	@Override
	public IfcMaterial createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcMaterial();
	}
	
	public static IfcMaterialRef valueOf(String id) {
		IfcMaterialRef result = new IfcMaterialRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}