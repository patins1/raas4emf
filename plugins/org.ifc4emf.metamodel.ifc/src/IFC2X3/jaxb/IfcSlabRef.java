package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSlab;

@XmlRootElement(name = "IfcSlabRefElement")
public class IfcSlabRef extends IFC2X3.jaxb.IfcBuildingElementRef  {

	

	
	@Override
	public IfcSlab createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSlab();
	}
	
	public static IfcSlabRef valueOf(String id) {
		IfcSlabRef result = new IfcSlabRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}