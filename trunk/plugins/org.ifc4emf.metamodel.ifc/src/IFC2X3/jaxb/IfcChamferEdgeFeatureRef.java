package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcChamferEdgeFeature;

@XmlRootElement(name = "IfcChamferEdgeFeatureRefElement")
public class IfcChamferEdgeFeatureRef extends IFC2X3.jaxb.IfcEdgeFeatureRef  {

	

	
	@Override
	public IfcChamferEdgeFeature createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcChamferEdgeFeature();
	}
	
	public static IfcChamferEdgeFeatureRef valueOf(String id) {
		IfcChamferEdgeFeatureRef result = new IfcChamferEdgeFeatureRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}