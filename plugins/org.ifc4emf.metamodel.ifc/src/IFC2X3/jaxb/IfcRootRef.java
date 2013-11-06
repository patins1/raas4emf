package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRoot;

@XmlRootElement(name = "IfcRootRefElement")
public class IfcRootRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	
	private String id;

	@XmlValue
	@Override
	public String getID() {
		return id;
	}

	@Override
	public void setID(String id) {
		this.id = id;
	}
	

	
	@Override
	public IfcRoot createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRoot();
	}
	
	public static IfcRootRef valueOf(String id) {
		IfcRootRef result = new IfcRootRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}