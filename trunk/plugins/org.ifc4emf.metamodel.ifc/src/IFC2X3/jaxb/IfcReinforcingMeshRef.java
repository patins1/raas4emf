package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcReinforcingMesh;

@XmlRootElement(name = "IfcReinforcingMeshRefElement")
public class IfcReinforcingMeshRef extends IFC2X3.jaxb.IfcReinforcingElementRef  {

	

	
	@Override
	public IfcReinforcingMesh createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcReinforcingMesh();
	}
	
	public static IfcReinforcingMeshRef valueOf(String id) {
		IfcReinforcingMeshRef result = new IfcReinforcingMeshRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}