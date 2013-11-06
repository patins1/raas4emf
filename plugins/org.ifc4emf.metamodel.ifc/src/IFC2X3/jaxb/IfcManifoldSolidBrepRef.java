package IFC2X3.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcManifoldSolidBrep;

@XmlRootElement(name = "IfcManifoldSolidBrepRefElement")
public class IfcManifoldSolidBrepRef extends IFC2X3.jaxb.IfcSolidModelRef  {

	

	
	@Override
	public IfcManifoldSolidBrep createInstance() {
		return IFC2X3Factory.eINSTANCE.createIfcManifoldSolidBrep();
	}
	
	public static IfcManifoldSolidBrepRef valueOf(String id) {
		IfcManifoldSolidBrepRef result = new IfcManifoldSolidBrepRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}