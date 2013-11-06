package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSlabType;

@XmlRootElement(name = "IfcSlabTypeRefElement")
public class IfcSlabTypeRef extends IFC2X3.jaxb.IfcBuildingElementTypeRef  {

	

	
	@Override
	public IfcSlabType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSlabType();
	}
	
	public static IfcSlabTypeRef valueOf(String id) {
		IfcSlabTypeRef result = new IfcSlabTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}