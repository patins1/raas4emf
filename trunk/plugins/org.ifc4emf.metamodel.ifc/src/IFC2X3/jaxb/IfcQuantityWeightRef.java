package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcQuantityWeight;

@XmlRootElement(name = "IfcQuantityWeightRefElement")
public class IfcQuantityWeightRef extends IFC2X3.jaxb.IfcPhysicalSimpleQuantityRef  {

	

	
	@Override
	public IfcQuantityWeight createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcQuantityWeight();
	}
	
	public static IfcQuantityWeightRef valueOf(String id) {
		IfcQuantityWeightRef result = new IfcQuantityWeightRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}