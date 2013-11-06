package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFillAreaStyleHatching;

@XmlRootElement(name = "IfcFillAreaStyleHatchingRefElement")
public class IfcFillAreaStyleHatchingRef extends IFC2X3.jaxb.IfcFillStyleSelectRef  {

	

	
	@Override
	public IfcFillAreaStyleHatching createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFillAreaStyleHatching();
	}
	
	public static IfcFillAreaStyleHatchingRef valueOf(String id) {
		IfcFillAreaStyleHatchingRef result = new IfcFillAreaStyleHatchingRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}