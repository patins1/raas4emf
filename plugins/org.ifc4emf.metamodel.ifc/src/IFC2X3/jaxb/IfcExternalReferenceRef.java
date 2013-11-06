package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcExternalReference;

@XmlRootElement(name = "IfcExternalReferenceRefElement")
public class IfcExternalReferenceRef extends IFC2X3.jaxb.IfcLightDistributionDataSourceSelectRef  {

	

	
	@Override
	public IfcExternalReference createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcExternalReference();
	}
	
	public static IfcExternalReferenceRef valueOf(String id) {
		IfcExternalReferenceRef result = new IfcExternalReferenceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}