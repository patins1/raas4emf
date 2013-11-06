package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcPile;

@XmlRootElement(name = "IfcPileRefElement")
public class IfcPileRef extends IFC2X3.jaxb.IfcBuildingElementRef  {

	

	
	@Override
	public IfcPile createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcPile();
	}
	
	public static IfcPileRef valueOf(String id) {
		IfcPileRef result = new IfcPileRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}