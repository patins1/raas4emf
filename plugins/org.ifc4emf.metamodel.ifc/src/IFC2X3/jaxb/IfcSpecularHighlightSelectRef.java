package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSpecularHighlightSelect;

@XmlRootElement(name = "IfcSpecularHighlightSelectRefElement")
public class IfcSpecularHighlightSelectRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcSpecularHighlightSelect createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSpecularHighlightSelect();
	}
	
	public static IfcSpecularHighlightSelectRef valueOf(String id) {
		IfcSpecularHighlightSelectRef result = new IfcSpecularHighlightSelectRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}