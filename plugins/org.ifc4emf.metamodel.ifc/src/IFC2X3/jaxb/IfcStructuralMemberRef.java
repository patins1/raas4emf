package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStructuralMember;

@XmlRootElement(name = "IfcStructuralMemberRefElement")
public class IfcStructuralMemberRef extends IFC2X3.jaxb.IfcStructuralItemRef  {

	

	
	@Override
	public IfcStructuralMember createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStructuralMember();
	}
	
	public static IfcStructuralMemberRef valueOf(String id) {
		IfcStructuralMemberRef result = new IfcStructuralMemberRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}