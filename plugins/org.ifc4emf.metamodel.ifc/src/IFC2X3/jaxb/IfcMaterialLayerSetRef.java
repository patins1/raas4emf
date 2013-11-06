package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcMaterialLayerSet;

@XmlRootElement(name = "IfcMaterialLayerSetRefElement")
public class IfcMaterialLayerSetRef extends IFC2X3.jaxb.IfcMaterialSelectRef  {

	

	
	@Override
	public IfcMaterialLayerSet createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcMaterialLayerSet();
	}
	
	public static IfcMaterialLayerSetRef valueOf(String id) {
		IfcMaterialLayerSetRef result = new IfcMaterialLayerSetRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}