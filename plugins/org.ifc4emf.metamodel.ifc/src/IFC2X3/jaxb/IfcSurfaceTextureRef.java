package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSurfaceTexture;

@XmlRootElement(name = "IfcSurfaceTextureRefElement")
public class IfcSurfaceTextureRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcSurfaceTexture createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSurfaceTexture();
	}
	
	public static IfcSurfaceTextureRef valueOf(String id) {
		IfcSurfaceTextureRef result = new IfcSurfaceTextureRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}