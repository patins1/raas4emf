package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcApplication;

@XmlRootElement(name = "IfcApplicationRefElement")
public class IfcApplicationRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcApplication createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcApplication();
	}
	
	public static IfcApplicationRef valueOf(String id) {
		IfcApplicationRef result = new IfcApplicationRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}