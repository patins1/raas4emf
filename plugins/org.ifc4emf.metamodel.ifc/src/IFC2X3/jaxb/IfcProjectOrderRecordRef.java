package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcProjectOrderRecord;

@XmlRootElement(name = "IfcProjectOrderRecordRefElement")
public class IfcProjectOrderRecordRef extends IFC2X3.jaxb.IfcControlRef  {

	

	
	@Override
	public IfcProjectOrderRecord createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcProjectOrderRecord();
	}
	
	public static IfcProjectOrderRecordRef valueOf(String id) {
		IfcProjectOrderRecordRef result = new IfcProjectOrderRecordRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}