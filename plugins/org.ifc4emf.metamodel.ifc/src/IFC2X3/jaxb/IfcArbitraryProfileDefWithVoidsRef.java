package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcArbitraryProfileDefWithVoids;

@XmlRootElement(name = "IfcArbitraryProfileDefWithVoidsRefElement")
public class IfcArbitraryProfileDefWithVoidsRef extends IFC2X3.jaxb.IfcArbitraryClosedProfileDefRef  {

	

	
	@Override
	public IfcArbitraryProfileDefWithVoids createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcArbitraryProfileDefWithVoids();
	}
	
	public static IfcArbitraryProfileDefWithVoidsRef valueOf(String id) {
		IfcArbitraryProfileDefWithVoidsRef result = new IfcArbitraryProfileDefWithVoidsRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}