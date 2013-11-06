package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcFillAreaStyleTileSymbolWithStyle;

@XmlRootElement(name = "IfcFillAreaStyleTileSymbolWithStyleRefElement")
public class IfcFillAreaStyleTileSymbolWithStyleRef extends IFC2X3.jaxb.IfcFillAreaStyleTileShapeSelectRef  {

	

	
	@Override
	public IfcFillAreaStyleTileSymbolWithStyle createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcFillAreaStyleTileSymbolWithStyle();
	}
	
	public static IfcFillAreaStyleTileSymbolWithStyleRef valueOf(String id) {
		IfcFillAreaStyleTileSymbolWithStyleRef result = new IfcFillAreaStyleTileSymbolWithStyleRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}