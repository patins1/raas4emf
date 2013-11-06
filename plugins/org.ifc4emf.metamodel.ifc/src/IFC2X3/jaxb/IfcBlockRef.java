package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcBlock;

@XmlRootElement(name = "IfcBlockRefElement")
public class IfcBlockRef extends IFC2X3.jaxb.IfcCsgPrimitive3DRef  {

	

	
	@Override
	public IfcBlock createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcBlock();
	}
	
	public static IfcBlockRef valueOf(String id) {
		IfcBlockRef result = new IfcBlockRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}