package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcGrid;

@XmlRootElement(name = "IfcGridRefElement")
public class IfcGridRef extends IFC2X3.jaxb.IfcProductRef  {

	

	
	@Override
	public IfcGrid createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcGrid();
	}
	
	public static IfcGridRef valueOf(String id) {
		IfcGridRef result = new IfcGridRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}