package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCompositeCurveSegment;

@XmlRootElement(name = "IfcCompositeCurveSegmentRefElement")
public class IfcCompositeCurveSegmentRef extends IFC2X3.jaxb.IfcGeometricRepresentationItemRef  {

	

	
	@Override
	public IfcCompositeCurveSegment createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcCompositeCurveSegment();
	}
	
	public static IfcCompositeCurveSegmentRef valueOf(String id) {
		IfcCompositeCurveSegmentRef result = new IfcCompositeCurveSegmentRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}