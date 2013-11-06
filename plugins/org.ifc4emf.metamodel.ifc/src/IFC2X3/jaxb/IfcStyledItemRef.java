package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStyledItem;

@XmlRootElement(name = "IfcStyledItemRefElement")
public class IfcStyledItemRef extends IFC2X3.jaxb.IfcRepresentationItemRef  {

	

	
	@Override
	public IfcStyledItem createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStyledItem();
	}
	
	public static IfcStyledItemRef valueOf(String id) {
		IfcStyledItemRef result = new IfcStyledItemRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}