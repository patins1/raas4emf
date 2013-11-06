package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStructuralCurveMemberVarying;

@XmlRootElement(name = "IfcStructuralCurveMemberVaryingRefElement")
public class IfcStructuralCurveMemberVaryingRef extends IFC2X3.jaxb.IfcStructuralCurveMemberRef  {

	

	
	@Override
	public IfcStructuralCurveMemberVarying createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStructuralCurveMemberVarying();
	}
	
	public static IfcStructuralCurveMemberVaryingRef valueOf(String id) {
		IfcStructuralCurveMemberVaryingRef result = new IfcStructuralCurveMemberVaryingRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}