package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcOwnerHistory;

@XmlRootElement(name = "IfcOwnerHistoryRefElement")
public class IfcOwnerHistoryRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcOwnerHistory createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcOwnerHistory();
	}
	
	public static IfcOwnerHistoryRef valueOf(String id) {
		IfcOwnerHistoryRef result = new IfcOwnerHistoryRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}