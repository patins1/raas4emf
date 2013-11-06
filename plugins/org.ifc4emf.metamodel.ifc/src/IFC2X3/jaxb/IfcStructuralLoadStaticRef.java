package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStructuralLoadStatic;

@XmlRootElement(name = "IfcStructuralLoadStaticRefElement")
public class IfcStructuralLoadStaticRef extends IFC2X3.jaxb.IfcStructuralLoadRef  {

	

	
	@Override
	public IfcStructuralLoadStatic createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStructuralLoadStatic();
	}
	
	public static IfcStructuralLoadStaticRef valueOf(String id) {
		IfcStructuralLoadStaticRef result = new IfcStructuralLoadStaticRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}