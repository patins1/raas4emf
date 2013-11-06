package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelConnectsStructuralMember;

@XmlRootElement(name = "IfcRelConnectsStructuralMemberRefElement")
public class IfcRelConnectsStructuralMemberRef extends IFC2X3.jaxb.IfcRelConnectsRef  {

	

	
	@Override
	public IfcRelConnectsStructuralMember createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelConnectsStructuralMember();
	}
	
	public static IfcRelConnectsStructuralMemberRef valueOf(String id) {
		IfcRelConnectsStructuralMemberRef result = new IfcRelConnectsStructuralMemberRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}