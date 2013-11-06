package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStructuralSurfaceMemberVarying;

@XmlRootElement(name = "IfcStructuralSurfaceMemberVaryingRefElement")
public class IfcStructuralSurfaceMemberVaryingRef extends IFC2X3.jaxb.IfcStructuralSurfaceMemberRef  {

	

	
	@Override
	public IfcStructuralSurfaceMemberVarying createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStructuralSurfaceMemberVarying();
	}
	
	public static IfcStructuralSurfaceMemberVaryingRef valueOf(String id) {
		IfcStructuralSurfaceMemberVaryingRef result = new IfcStructuralSurfaceMemberVaryingRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}