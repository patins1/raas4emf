package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcVector;

@XmlRootElement(name = "IfcVectorRefElement")
public class IfcVectorRef extends IFC2X3.jaxb.IfcVectorOrDirectionRef  {

	

	
	@Override
	public IfcVector createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcVector();
	}
	
	public static IfcVectorRef valueOf(String id) {
		IfcVectorRef result = new IfcVectorRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}