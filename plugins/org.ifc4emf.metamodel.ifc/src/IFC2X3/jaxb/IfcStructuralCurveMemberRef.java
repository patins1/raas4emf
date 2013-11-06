package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStructuralCurveMember;

@XmlRootElement(name = "IfcStructuralCurveMemberRefElement")
public class IfcStructuralCurveMemberRef extends IFC2X3.jaxb.IfcStructuralMemberRef  {

	

	
	@Override
	public IfcStructuralCurveMember createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStructuralCurveMember();
	}
	
	public static IfcStructuralCurveMemberRef valueOf(String id) {
		IfcStructuralCurveMemberRef result = new IfcStructuralCurveMemberRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}