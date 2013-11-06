package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcEdgeCurve;

@XmlRootElement(name = "IfcEdgeCurveRefElement")
public class IfcEdgeCurveRef extends IFC2X3.jaxb.IfcCurveOrEdgeCurveRef  {

	

	
	@Override
	public IfcEdgeCurve createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcEdgeCurve();
	}
	
	public static IfcEdgeCurveRef valueOf(String id) {
		IfcEdgeCurveRef result = new IfcEdgeCurveRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}