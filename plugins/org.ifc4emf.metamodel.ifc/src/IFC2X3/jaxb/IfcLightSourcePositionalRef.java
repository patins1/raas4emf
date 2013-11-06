package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcLightSourcePositional;

@XmlRootElement(name = "IfcLightSourcePositionalRefElement")
public class IfcLightSourcePositionalRef extends IFC2X3.jaxb.IfcLightSourceRef  {

	

	
	@Override
	public IfcLightSourcePositional createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcLightSourcePositional();
	}
	
	public static IfcLightSourcePositionalRef valueOf(String id) {
		IfcLightSourcePositionalRef result = new IfcLightSourcePositionalRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}