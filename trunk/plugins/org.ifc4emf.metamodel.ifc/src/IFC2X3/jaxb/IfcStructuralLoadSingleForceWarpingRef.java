package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStructuralLoadSingleForceWarping;

@XmlRootElement(name = "IfcStructuralLoadSingleForceWarpingRefElement")
public class IfcStructuralLoadSingleForceWarpingRef extends IFC2X3.jaxb.IfcStructuralLoadSingleForceRef  {

	

	
	@Override
	public IfcStructuralLoadSingleForceWarping createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStructuralLoadSingleForceWarping();
	}
	
	public static IfcStructuralLoadSingleForceWarpingRef valueOf(String id) {
		IfcStructuralLoadSingleForceWarpingRef result = new IfcStructuralLoadSingleForceWarpingRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}