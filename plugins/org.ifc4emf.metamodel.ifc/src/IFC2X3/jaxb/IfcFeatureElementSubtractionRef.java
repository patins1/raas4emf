package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFeatureElementSubtraction;

@XmlRootElement(name = "IfcFeatureElementSubtractionRefElement")
public class IfcFeatureElementSubtractionRef extends IFC2X3.jaxb.IfcFeatureElementRef  {

	

	
	@Override
	public IfcFeatureElementSubtraction createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFeatureElementSubtraction();
	}
	
	public static IfcFeatureElementSubtractionRef valueOf(String id) {
		IfcFeatureElementSubtractionRef result = new IfcFeatureElementSubtractionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}