package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStructuralSurfaceMember;

@XmlRootElement(name = "IfcStructuralSurfaceMemberRefElement")
public class IfcStructuralSurfaceMemberRef extends IFC2X3.jaxb.IfcStructuralMemberRef  {

	

	
	@Override
	public IfcStructuralSurfaceMember createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStructuralSurfaceMember();
	}
	
	public static IfcStructuralSurfaceMemberRef valueOf(String id) {
		IfcStructuralSurfaceMemberRef result = new IfcStructuralSurfaceMemberRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}