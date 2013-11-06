package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFacetedBrepWithVoids;

@XmlRootElement(name = "IfcFacetedBrepWithVoidsRefElement")
public class IfcFacetedBrepWithVoidsRef extends IFC2X3.jaxb.IfcManifoldSolidBrepRef  {

	

	
	@Override
	public IfcFacetedBrepWithVoids createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFacetedBrepWithVoids();
	}
	
	public static IfcFacetedBrepWithVoidsRef valueOf(String id) {
		IfcFacetedBrepWithVoidsRef result = new IfcFacetedBrepWithVoidsRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}