package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcWall;

@XmlRootElement(name = "IfcWallRefElement")
public class IfcWallRef extends IFC2X3.jaxb.IfcBuildingElementRef  {

	

	
	@Override
	public IfcWall createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcWall();
	}
	
	public static IfcWallRef valueOf(String id) {
		IfcWallRef result = new IfcWallRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}