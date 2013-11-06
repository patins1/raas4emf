package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcImageTexture;

@XmlRootElement(name = "IfcImageTextureRefElement")
public class IfcImageTextureRef extends IFC2X3.jaxb.IfcSurfaceTextureRef  {

	

	
	@Override
	public IfcImageTexture createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcImageTexture();
	}
	
	public static IfcImageTextureRef valueOf(String id) {
		IfcImageTextureRef result = new IfcImageTextureRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}