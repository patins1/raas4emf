package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSubedge;

@XmlRootElement(name = "IfcSubedgeRefElement")
public class IfcSubedgeRef extends IFC2X3.jaxb.IfcEdgeRef  {

	

	
	@Override
	public IfcSubedge createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSubedge();
	}
	
	public static IfcSubedgeRef valueOf(String id) {
		IfcSubedgeRef result = new IfcSubedgeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}