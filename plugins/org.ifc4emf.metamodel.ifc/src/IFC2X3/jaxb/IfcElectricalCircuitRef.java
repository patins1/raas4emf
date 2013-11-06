package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcElectricalCircuit;

@XmlRootElement(name = "IfcElectricalCircuitRefElement")
public class IfcElectricalCircuitRef extends IFC2X3.jaxb.IfcSystemRef  {

	

	
	@Override
	public IfcElectricalCircuit createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcElectricalCircuit();
	}
	
	public static IfcElectricalCircuitRef valueOf(String id) {
		IfcElectricalCircuitRef result = new IfcElectricalCircuitRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}