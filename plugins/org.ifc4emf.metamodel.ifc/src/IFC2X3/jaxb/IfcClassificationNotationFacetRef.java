package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcClassificationNotationFacet;

@XmlRootElement(name = "IfcClassificationNotationFacetRefElement")
public class IfcClassificationNotationFacetRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcClassificationNotationFacet createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcClassificationNotationFacet();
	}
	
	public static IfcClassificationNotationFacetRef valueOf(String id) {
		IfcClassificationNotationFacetRef result = new IfcClassificationNotationFacetRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}