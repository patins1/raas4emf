package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRailingType;

@XmlRootElement(name = "IfcRailingTypeRefElement")
public class IfcRailingTypeRef extends IFC2X3.jaxb.IfcBuildingElementTypeRef  {

	

	
	@Override
	public IfcRailingType createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRailingType();
	}
	
	public static IfcRailingTypeRef valueOf(String id) {
		IfcRailingTypeRef result = new IfcRailingTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}