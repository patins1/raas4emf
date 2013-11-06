package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRailing;

@XmlRootElement(name = "IfcRailingRefElement")
public class IfcRailingRef extends IFC2X3.jaxb.IfcBuildingElementRef  {

	

	
	@Override
	public IfcRailing createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRailing();
	}
	
	public static IfcRailingRef valueOf(String id) {
		IfcRailingRef result = new IfcRailingRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}