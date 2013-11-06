package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcSubContractResource;

@XmlRootElement(name = "IfcSubContractResourceRefElement")
public class IfcSubContractResourceRef extends IFC2X3.jaxb.IfcConstructionResourceRef  {

	

	
	@Override
	public IfcSubContractResource createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcSubContractResource();
	}
	
	public static IfcSubContractResourceRef valueOf(String id) {
		IfcSubContractResourceRef result = new IfcSubContractResourceRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}