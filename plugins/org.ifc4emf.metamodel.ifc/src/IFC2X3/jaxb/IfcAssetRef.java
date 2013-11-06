package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcAsset;

@XmlRootElement(name = "IfcAssetRefElement")
public class IfcAssetRef extends IFC2X3.jaxb.IfcGroupRef  {

	

	
	@Override
	public IfcAsset createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcAsset();
	}
	
	public static IfcAssetRef valueOf(String id) {
		IfcAssetRef result = new IfcAssetRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}