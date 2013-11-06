package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcOneDirectionRepeatFactor;

@XmlRootElement(name = "IfcOneDirectionRepeatFactorRefElement")
public class IfcOneDirectionRepeatFactorRef extends IFC2X3.jaxb.IfcGeometricRepresentationItemRef  {

	

	
	@Override
	public IfcOneDirectionRepeatFactor createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcOneDirectionRepeatFactor();
	}
	
	public static IfcOneDirectionRepeatFactorRef valueOf(String id) {
		IfcOneDirectionRepeatFactorRef result = new IfcOneDirectionRepeatFactorRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}