package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcTendonAnchor;

@XmlRootElement(name = "IfcTendonAnchorRefElement")
public class IfcTendonAnchorRef extends IFC2X3.jaxb.IfcReinforcingElementRef  {

	

	
	@Override
	public IfcTendonAnchor createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcTendonAnchor();
	}
	
	public static IfcTendonAnchorRef valueOf(String id) {
		IfcTendonAnchorRef result = new IfcTendonAnchorRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}