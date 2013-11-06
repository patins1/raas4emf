package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFacetedBrep;

@XmlRootElement(name = "IfcFacetedBrepRefElement")
public class IfcFacetedBrepRef extends IFC2X3.jaxb.IfcManifoldSolidBrepRef  {

	

	
	@Override
	public IfcFacetedBrep createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFacetedBrep();
	}
	
	public static IfcFacetedBrepRef valueOf(String id) {
		IfcFacetedBrepRef result = new IfcFacetedBrepRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}