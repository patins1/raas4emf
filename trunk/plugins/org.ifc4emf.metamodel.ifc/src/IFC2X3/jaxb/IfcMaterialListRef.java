package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcMaterialList;

@XmlRootElement(name = "IfcMaterialListRefElement")
public class IfcMaterialListRef extends IFC2X3.jaxb.IfcMaterialSelectRef  {

	

	
	@Override
	public IfcMaterialList createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcMaterialList();
	}
	
	public static IfcMaterialListRef valueOf(String id) {
		IfcMaterialListRef result = new IfcMaterialListRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}