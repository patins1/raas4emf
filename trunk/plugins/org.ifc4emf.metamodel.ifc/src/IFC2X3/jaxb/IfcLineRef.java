package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcLine;

@XmlRootElement(name = "IfcLineRefElement")
public class IfcLineRef extends IFC2X3.jaxb.IfcCurveRef  {

	

	
	@Override
	public IfcLine createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcLine();
	}
	
	public static IfcLineRef valueOf(String id) {
		IfcLineRef result = new IfcLineRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}