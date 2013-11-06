package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcQuantityVolume;

@XmlRootElement(name = "IfcQuantityVolumeRefElement")
public class IfcQuantityVolumeRef extends IFC2X3.jaxb.IfcPhysicalSimpleQuantityRef  {

	

	
	@Override
	public IfcQuantityVolume createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcQuantityVolume();
	}
	
	public static IfcQuantityVolumeRef valueOf(String id) {
		IfcQuantityVolumeRef result = new IfcQuantityVolumeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}