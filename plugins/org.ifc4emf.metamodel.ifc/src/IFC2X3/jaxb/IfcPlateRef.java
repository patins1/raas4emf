package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPlate;

@XmlRootElement(name = "IfcPlateRefElement")
public class IfcPlateRef extends IFC2X3.jaxb.IfcBuildingElementRef  {

	

	
	@Override
	public IfcPlate createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPlate();
	}
	
	public static IfcPlateRef valueOf(String id) {
		IfcPlateRef result = new IfcPlateRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}