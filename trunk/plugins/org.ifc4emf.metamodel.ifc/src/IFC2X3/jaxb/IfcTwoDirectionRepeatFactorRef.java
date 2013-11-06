package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcTwoDirectionRepeatFactor;

@XmlRootElement(name = "IfcTwoDirectionRepeatFactorRefElement")
public class IfcTwoDirectionRepeatFactorRef extends IFC2X3.jaxb.IfcOneDirectionRepeatFactorRef  {

	

	
	@Override
	public IfcTwoDirectionRepeatFactor createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcTwoDirectionRepeatFactor();
	}
	
	public static IfcTwoDirectionRepeatFactorRef valueOf(String id) {
		IfcTwoDirectionRepeatFactorRef result = new IfcTwoDirectionRepeatFactorRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}