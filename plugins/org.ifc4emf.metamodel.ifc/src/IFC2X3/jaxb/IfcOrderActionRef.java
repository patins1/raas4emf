package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcOrderAction;

@XmlRootElement(name = "IfcOrderActionRefElement")
public class IfcOrderActionRef extends IFC2X3.jaxb.IfcTaskRef  {

	

	
	@Override
	public IfcOrderAction createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcOrderAction();
	}
	
	public static IfcOrderActionRef valueOf(String id) {
		IfcOrderActionRef result = new IfcOrderActionRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}