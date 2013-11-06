package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFaceBound;

@XmlRootElement(name = "IfcFaceBoundRefElement")
public class IfcFaceBoundRef extends IFC2X3.jaxb.IfcTopologicalRepresentationItemRef  {

	

	
	@Override
	public IfcFaceBound createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFaceBound();
	}
	
	public static IfcFaceBoundRef valueOf(String id) {
		IfcFaceBoundRef result = new IfcFaceBoundRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}