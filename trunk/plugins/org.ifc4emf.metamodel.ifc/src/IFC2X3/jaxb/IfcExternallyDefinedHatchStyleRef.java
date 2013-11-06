package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcExternallyDefinedHatchStyle;

@XmlRootElement(name = "IfcExternallyDefinedHatchStyleRefElement")
public class IfcExternallyDefinedHatchStyleRef extends IFC2X3.jaxb.IfcFillStyleSelectRef  {

	

	
	@Override
	public IfcExternallyDefinedHatchStyle createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcExternallyDefinedHatchStyle();
	}
	
	public static IfcExternallyDefinedHatchStyleRef valueOf(String id) {
		IfcExternallyDefinedHatchStyleRef result = new IfcExternallyDefinedHatchStyleRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}