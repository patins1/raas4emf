package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcEdgeFeature;

@XmlRootElement(name = "IfcEdgeFeatureRefElement")
public class IfcEdgeFeatureRef extends IFC2X3.jaxb.IfcFeatureElementSubtractionRef  {

	

	
	@Override
	public IfcEdgeFeature createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcEdgeFeature();
	}
	
	public static IfcEdgeFeatureRef valueOf(String id) {
		IfcEdgeFeatureRef result = new IfcEdgeFeatureRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}