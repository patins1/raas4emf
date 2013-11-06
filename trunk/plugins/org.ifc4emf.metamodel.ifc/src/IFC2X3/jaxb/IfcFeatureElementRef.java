package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFeatureElement;

@XmlRootElement(name = "IfcFeatureElementRefElement")
public class IfcFeatureElementRef extends IFC2X3.jaxb.IfcElementRef  {

	

	
	@Override
	public IfcFeatureElement createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFeatureElement();
	}
	
	public static IfcFeatureElementRef valueOf(String id) {
		IfcFeatureElementRef result = new IfcFeatureElementRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}