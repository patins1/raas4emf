package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelAssociatesMaterial;

@XmlRootElement(name = "IfcRelAssociatesMaterialRefElement")
public class IfcRelAssociatesMaterialRef extends IFC2X3.jaxb.IfcRelAssociatesRef  {

	

	
	@Override
	public IfcRelAssociatesMaterial createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelAssociatesMaterial();
	}
	
	public static IfcRelAssociatesMaterialRef valueOf(String id) {
		IfcRelAssociatesMaterialRef result = new IfcRelAssociatesMaterialRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}