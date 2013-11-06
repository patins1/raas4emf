package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFillAreaStyleTiles;

@XmlRootElement(name = "IfcFillAreaStyleTilesRefElement")
public class IfcFillAreaStyleTilesRef extends IFC2X3.jaxb.IfcFillStyleSelectRef  {

	

	
	@Override
	public IfcFillAreaStyleTiles createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFillAreaStyleTiles();
	}
	
	public static IfcFillAreaStyleTilesRef valueOf(String id) {
		IfcFillAreaStyleTilesRef result = new IfcFillAreaStyleTilesRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}