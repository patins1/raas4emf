package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcGridAxis;

@XmlRootElement(name = "IfcGridAxisRefElement")
public class IfcGridAxisRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcGridAxis createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcGridAxis();
	}
	
	public static IfcGridAxisRef valueOf(String id) {
		IfcGridAxisRef result = new IfcGridAxisRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}