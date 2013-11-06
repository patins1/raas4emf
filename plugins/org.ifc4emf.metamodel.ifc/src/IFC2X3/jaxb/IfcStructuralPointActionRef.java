package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStructuralPointAction;

@XmlRootElement(name = "IfcStructuralPointActionRefElement")
public class IfcStructuralPointActionRef extends IFC2X3.jaxb.IfcStructuralActionRef  {

	

	
	@Override
	public IfcStructuralPointAction createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStructuralPointAction();
	}
	
	public static IfcStructuralPointActionRef valueOf(String id) {
		IfcStructuralPointActionRef result = new IfcStructuralPointActionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}