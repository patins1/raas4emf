package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcVertex;

@XmlRootElement(name = "IfcVertexRefElement")
public class IfcVertexRef extends IFC2X3.jaxb.IfcTopologicalRepresentationItemRef  {

	

	
	@Override
	public IfcVertex createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcVertex();
	}
	
	public static IfcVertexRef valueOf(String id) {
		IfcVertexRef result = new IfcVertexRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}