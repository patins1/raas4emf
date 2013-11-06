package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcMember;

@XmlRootElement(name = "IfcMemberRefElement")
public class IfcMemberRef extends IFC2X3.jaxb.IfcBuildingElementRef  {

	

	
	@Override
	public IfcMember createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcMember();
	}
	
	public static IfcMemberRef valueOf(String id) {
		IfcMemberRef result = new IfcMemberRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}