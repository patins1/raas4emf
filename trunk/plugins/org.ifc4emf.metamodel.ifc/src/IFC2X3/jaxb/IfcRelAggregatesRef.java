package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcRelAggregates;

@XmlRootElement(name = "IfcRelAggregatesRefElement")
public class IfcRelAggregatesRef extends IFC2X3.jaxb.IfcRelDecomposesRef  {

	

	
	@Override
	public IfcRelAggregates createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcRelAggregates();
	}
	
	public static IfcRelAggregatesRef valueOf(String id) {
		IfcRelAggregatesRef result = new IfcRelAggregatesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}