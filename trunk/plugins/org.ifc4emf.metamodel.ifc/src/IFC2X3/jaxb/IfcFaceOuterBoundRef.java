package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFaceOuterBound;

@XmlRootElement(name = "IfcFaceOuterBoundRefElement")
public class IfcFaceOuterBoundRef extends IFC2X3.jaxb.IfcFaceBoundRef  {

	

	
	@Override
	public IfcFaceOuterBound createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFaceOuterBound();
	}
	
	public static IfcFaceOuterBoundRef valueOf(String id) {
		IfcFaceOuterBoundRef result = new IfcFaceOuterBoundRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}