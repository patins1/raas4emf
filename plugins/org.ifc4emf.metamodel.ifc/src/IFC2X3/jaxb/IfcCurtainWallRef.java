package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCurtainWall;

@XmlRootElement(name = "IfcCurtainWallRefElement")
public class IfcCurtainWallRef extends IFC2X3.jaxb.IfcBuildingElementRef  {

	

	
	@Override
	public IfcCurtainWall createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcCurtainWall();
	}
	
	public static IfcCurtainWallRef valueOf(String id) {
		IfcCurtainWallRef result = new IfcCurtainWallRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}