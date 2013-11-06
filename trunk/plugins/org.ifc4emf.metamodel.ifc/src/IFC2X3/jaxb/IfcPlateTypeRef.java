package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPlateType;

@XmlRootElement(name = "IfcPlateTypeRefElement")
public class IfcPlateTypeRef extends IFC2X3.jaxb.IfcBuildingElementTypeRef  {

	

	
	@Override
	public IfcPlateType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPlateType();
	}
	
	public static IfcPlateTypeRef valueOf(String id) {
		IfcPlateTypeRef result = new IfcPlateTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}