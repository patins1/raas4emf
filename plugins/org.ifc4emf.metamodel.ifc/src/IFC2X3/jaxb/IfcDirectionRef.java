package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDirection;

@XmlRootElement(name = "IfcDirectionRefElement")
public class IfcDirectionRef extends IFC2X3.jaxb.IfcVectorOrDirectionRef  {

	

	
	@Override
	public IfcDirection createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcDirection();
	}
	
	public static IfcDirectionRef valueOf(String id) {
		IfcDirectionRef result = new IfcDirectionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}