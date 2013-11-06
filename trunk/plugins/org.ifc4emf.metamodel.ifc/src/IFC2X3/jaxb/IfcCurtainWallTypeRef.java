package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCurtainWallType;

@XmlRootElement(name = "IfcCurtainWallTypeRefElement")
public class IfcCurtainWallTypeRef extends IFC2X3.jaxb.IfcBuildingElementTypeRef  {

	

	
	@Override
	public IfcCurtainWallType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcCurtainWallType();
	}
	
	public static IfcCurtainWallTypeRef valueOf(String id) {
		IfcCurtainWallTypeRef result = new IfcCurtainWallTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}