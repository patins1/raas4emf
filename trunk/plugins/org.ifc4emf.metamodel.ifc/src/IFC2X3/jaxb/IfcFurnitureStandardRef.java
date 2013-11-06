package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFurnitureStandard;

@XmlRootElement(name = "IfcFurnitureStandardRefElement")
public class IfcFurnitureStandardRef extends IFC2X3.jaxb.IfcControlRef  {

	

	
	@Override
	public IfcFurnitureStandard createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFurnitureStandard();
	}
	
	public static IfcFurnitureStandardRef valueOf(String id) {
		IfcFurnitureStandardRef result = new IfcFurnitureStandardRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}