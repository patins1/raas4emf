package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcComplexProperty;

@XmlRootElement(name = "IfcComplexPropertyRefElement")
public class IfcComplexPropertyRef extends IFC2X3.jaxb.IfcPropertyRef  {

	

	
	@Override
	public IfcComplexProperty createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcComplexProperty();
	}
	
	public static IfcComplexPropertyRef valueOf(String id) {
		IfcComplexPropertyRef result = new IfcComplexPropertyRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}