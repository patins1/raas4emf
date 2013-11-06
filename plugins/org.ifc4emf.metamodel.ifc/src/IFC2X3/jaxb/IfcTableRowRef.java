package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcTableRow;

@XmlRootElement(name = "IfcTableRowRefElement")
public class IfcTableRowRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcTableRow createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcTableRow();
	}
	
	public static IfcTableRowRef valueOf(String id) {
		IfcTableRowRef result = new IfcTableRowRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}