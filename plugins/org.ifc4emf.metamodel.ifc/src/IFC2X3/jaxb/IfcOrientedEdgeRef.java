package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcOrientedEdge;

@XmlRootElement(name = "IfcOrientedEdgeRefElement")
public class IfcOrientedEdgeRef extends IFC2X3.jaxb.IfcEdgeRef  {

	

	
	@Override
	public IfcOrientedEdge createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcOrientedEdge();
	}
	
	public static IfcOrientedEdgeRef valueOf(String id) {
		IfcOrientedEdgeRef result = new IfcOrientedEdgeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}