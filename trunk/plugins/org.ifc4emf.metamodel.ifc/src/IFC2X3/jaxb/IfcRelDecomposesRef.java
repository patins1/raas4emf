package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelDecomposes;

@XmlRootElement(name = "IfcRelDecomposesRefElement")
public class IfcRelDecomposesRef extends IFC2X3.jaxb.IfcRelationshipRef  {

	

	
	@Override
	public IfcRelDecomposes createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelDecomposes();
	}
	
	public static IfcRelDecomposesRef valueOf(String id) {
		IfcRelDecomposesRef result = new IfcRelDecomposesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}