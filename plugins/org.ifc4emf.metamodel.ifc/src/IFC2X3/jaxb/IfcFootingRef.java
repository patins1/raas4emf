package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFooting;

@XmlRootElement(name = "IfcFootingRefElement")
public class IfcFootingRef extends IFC2X3.jaxb.IfcBuildingElementRef  {

	

	
	@Override
	public IfcFooting createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFooting();
	}
	
	public static IfcFootingRef valueOf(String id) {
		IfcFootingRef result = new IfcFootingRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}