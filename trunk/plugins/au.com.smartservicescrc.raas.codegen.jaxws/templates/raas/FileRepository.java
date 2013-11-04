package raas.experiments.jaxbased.webservice.raas;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class FileRepository extends ResourceRepository {
	private static final String filename = "c:/dev/testRepos.xmi";

	public FileRepository() throws IOException {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		new File(filename).delete();
	}

	public void openSession() {
		if (res != null) {
			res.unload();
			res = null;
		}
		ResourceSetImpl rset = new ResourceSetImpl();
		try {
			res = rset.getResource(URI.createFileURI(filename), true);
		} catch (Exception e) {
			res = rset.createResource(URI.createFileURI(filename));
		}
	}

	public void closeSession() {
		// TODO: uncomment
		// res.unload();
		// EObjectRefAdapter.proxyResource = null;
		// res = null;
	}

	@Override
	public List<?> query(String queryString) {
		throw new RuntimeException("not supported");
	}

	@Override
	public List<? extends EObject> getAllInstances(EClass eClass) throws Exception {
		Collection<EObject> all = new HashSet<EObject>();
		TreeIterator<EObject> it = res.getAllContents();
		while (it.hasNext()) {
			all.add(it.next());
		}
		return (List<? extends EObject>) EcoreUtil.getObjectsByType(all, eClass);
	}

}
