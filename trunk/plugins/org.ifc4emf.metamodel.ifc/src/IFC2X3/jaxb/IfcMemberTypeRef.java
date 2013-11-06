package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcMemberType;

@XmlRootElement(name = "IfcMemberTypeRefElement")
public class IfcMemberTypeRef extends IFC2X3.jaxb.IfcBuildingElementTypeRef  {

	

	
	@Override
	public IfcMemberType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcMemberType();
	}
	
	public static IfcMemberTypeRef valueOf(String id) {
		IfcMemberTypeRef result = new IfcMemberTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}