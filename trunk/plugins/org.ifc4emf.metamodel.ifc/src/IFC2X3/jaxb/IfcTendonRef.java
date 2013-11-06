package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcTendon;

@XmlRootElement(name = "IfcTendonRefElement")
public class IfcTendonRef extends IFC2X3.jaxb.IfcReinforcingElementRef  {

	

	
	@Override
	public IfcTendon createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcTendon();
	}
	
	public static IfcTendonRef valueOf(String id) {
		IfcTendonRef result = new IfcTendonRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}