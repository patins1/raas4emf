package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcTextureCoordinateGenerator;

@XmlRootElement(name = "IfcTextureCoordinateGeneratorRefElement")
public class IfcTextureCoordinateGeneratorRef extends IFC2X3.jaxb.IfcTextureCoordinateRef  {

	

	
	@Override
	public IfcTextureCoordinateGenerator createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcTextureCoordinateGenerator();
	}
	
	public static IfcTextureCoordinateGeneratorRef valueOf(String id) {
		IfcTextureCoordinateGeneratorRef result = new IfcTextureCoordinateGeneratorRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}