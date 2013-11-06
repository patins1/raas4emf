package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcMaterialLayer;

@XmlRootElement(name = "IfcMaterialLayerRefElement")
public class IfcMaterialLayerRef extends IFC2X3.jaxb.IfcMaterialSelectRef  {

	

	
	@Override
	public IfcMaterialLayer createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcMaterialLayer();
	}
	
	public static IfcMaterialLayerRef valueOf(String id) {
		IfcMaterialLayerRef result = new IfcMaterialLayerRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}