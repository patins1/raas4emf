package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcVertexPoint;

@XmlRootElement(name = "IfcVertexPointRefElement")
public class IfcVertexPointRef extends IFC2X3.jaxb.IfcPointOrVertexPointRef  {

	

	
	@Override
	public IfcVertexPoint createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcVertexPoint();
	}
	
	public static IfcVertexPointRef valueOf(String id) {
		IfcVertexPointRef result = new IfcVertexPointRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}