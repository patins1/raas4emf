package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStair;

@XmlRootElement(name = "IfcStairRefElement")
public class IfcStairRef extends IFC2X3.jaxb.IfcBuildingElementRef  {

	

	
	@Override
	public IfcStair createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStair();
	}
	
	public static IfcStairRef valueOf(String id) {
		IfcStairRef result = new IfcStairRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}