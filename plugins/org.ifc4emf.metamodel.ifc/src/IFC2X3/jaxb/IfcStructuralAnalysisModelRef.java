package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcStructuralAnalysisModel;

@XmlRootElement(name = "IfcStructuralAnalysisModelRefElement")
public class IfcStructuralAnalysisModelRef extends IFC2X3.jaxb.IfcSystemRef  {

	

	
	@Override
	public IfcStructuralAnalysisModel createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcStructuralAnalysisModel();
	}
	
	public static IfcStructuralAnalysisModelRef valueOf(String id) {
		IfcStructuralAnalysisModelRef result = new IfcStructuralAnalysisModelRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}