package raascms.jaxb;

import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.emf.ecore.jaxb.CDOObjectRef;

import raascms.Folder;
import raascms.RaascmsFactory;

@XmlRootElement(name = "FolderRefElement")
public class FolderRef extends CDOObjectRef  {

	

	
	@Override
	public Folder createInstance() {
		return RaascmsFactory.eINSTANCE.createFolder();
	}
	
	public static FolderRef valueOf(String id) {
		FolderRef result = new FolderRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}