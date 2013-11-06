package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelConnectsPortToElement;

@XmlRootElement(name = "IfcRelConnectsPortToElementRefElement")
public class IfcRelConnectsPortToElementRef extends IFC2X3.jaxb.IfcRelConnectsRef  {

	

	
	@Override
	public IfcRelConnectsPortToElement createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelConnectsPortToElement();
	}
	
	public static IfcRelConnectsPortToElementRef valueOf(String id) {
		IfcRelConnectsPortToElementRef result = new IfcRelConnectsPortToElementRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}