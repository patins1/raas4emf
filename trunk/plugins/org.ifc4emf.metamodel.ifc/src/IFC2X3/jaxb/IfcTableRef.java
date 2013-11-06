package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcTable;

@XmlRootElement(name = "IfcTableRefElement")
public class IfcTableRef extends org.eclipse.emf.cdo.jaxb.CDOObjectRef  {

	

	
	@Override
	public IfcTable createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcTable();
	}
	
	public static IfcTableRef valueOf(String id) {
		IfcTableRef result = new IfcTableRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}