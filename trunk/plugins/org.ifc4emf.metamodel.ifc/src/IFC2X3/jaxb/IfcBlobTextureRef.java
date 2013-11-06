package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcBlobTexture;

@XmlRootElement(name = "IfcBlobTextureRefElement")
public class IfcBlobTextureRef extends IFC2X3.jaxb.IfcSurfaceTextureRef  {

	

	
	@Override
	public IfcBlobTexture createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcBlobTexture();
	}
	
	public static IfcBlobTextureRef valueOf(String id) {
		IfcBlobTextureRef result = new IfcBlobTextureRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}