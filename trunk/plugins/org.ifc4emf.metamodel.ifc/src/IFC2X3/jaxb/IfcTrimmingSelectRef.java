package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcTrimmingSelect;

@XmlRootElement(name = "IfcTrimmingSelectRefElement")
public class IfcTrimmingSelectRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcTrimmingSelect createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcTrimmingSelect();
	}
	
	public static IfcTrimmingSelectRef valueOf(String id) {
		IfcTrimmingSelectRef result = new IfcTrimmingSelectRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}