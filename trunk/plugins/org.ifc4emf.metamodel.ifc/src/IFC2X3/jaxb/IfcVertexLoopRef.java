package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcVertexLoop;

@XmlRootElement(name = "IfcVertexLoopRefElement")
public class IfcVertexLoopRef extends IFC2X3.jaxb.IfcLoopRef  {

	

	
	@Override
	public IfcVertexLoop createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcVertexLoop();
	}
	
	public static IfcVertexLoopRef valueOf(String id) {
		IfcVertexLoopRef result = new IfcVertexLoopRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}