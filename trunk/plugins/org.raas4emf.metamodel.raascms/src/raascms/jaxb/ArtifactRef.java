package raascms.jaxb;

import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.emf.ecore.jaxb.CDOObjectRef;

import raascms.Artifact;
import raascms.RaascmsFactory;

@XmlRootElement(name = "ArtifactRefElement")
public class ArtifactRef extends CDOObjectRef  {

	

	
	@Override
	public Artifact createInstance() {
		return RaascmsFactory.eINSTANCE.createArtifact();
	}
	
	public static ArtifactRef valueOf(String id) {
		ArtifactRef result = new ArtifactRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}