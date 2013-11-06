package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRoundedEdgeFeature;

@XmlRootElement(name = "IfcRoundedEdgeFeatureRefElement")
public class IfcRoundedEdgeFeatureRef extends IFC2X3.jaxb.IfcEdgeFeatureRef  {

	

	
	@Override
	public IfcRoundedEdgeFeature createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRoundedEdgeFeature();
	}
	
	public static IfcRoundedEdgeFeatureRef valueOf(String id) {
		IfcRoundedEdgeFeatureRef result = new IfcRoundedEdgeFeatureRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}