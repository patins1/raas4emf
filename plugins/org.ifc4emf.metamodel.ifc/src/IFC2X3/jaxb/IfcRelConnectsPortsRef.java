package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelConnectsPorts;

@XmlRootElement(name = "IfcRelConnectsPortsRefElement")
public class IfcRelConnectsPortsRef extends IFC2X3.jaxb.IfcRelConnectsRef  {

	

	
	@Override
	public IfcRelConnectsPorts createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelConnectsPorts();
	}
	
	public static IfcRelConnectsPortsRef valueOf(String id) {
		IfcRelConnectsPortsRef result = new IfcRelConnectsPortsRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}