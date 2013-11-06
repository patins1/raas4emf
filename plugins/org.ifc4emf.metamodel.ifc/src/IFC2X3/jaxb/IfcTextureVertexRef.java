package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcTextureVertex;

@XmlRootElement(name = "IfcTextureVertexRefElement")
public class IfcTextureVertexRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcTextureVertex createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcTextureVertex();
	}
	
	public static IfcTextureVertexRef valueOf(String id) {
		IfcTextureVertexRef result = new IfcTextureVertexRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}