package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSectionedSpine;

@XmlRootElement(name = "IfcSectionedSpineRefElement")
public class IfcSectionedSpineRef extends IFC2X3.jaxb.IfcGeometricRepresentationItemRef  {

	

	
	@Override
	public IfcSectionedSpine createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSectionedSpine();
	}
	
	public static IfcSectionedSpineRef valueOf(String id) {
		IfcSectionedSpineRef result = new IfcSectionedSpineRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}