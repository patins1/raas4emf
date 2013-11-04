package raas.experiments.jaxbased.webservice.raas;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.resource.HibernateResource;


/**
 * Implements {@link IRepository} using an {@link HibernateResource}. This
 * enables resolving of proxies.
 * 
 */
public class HibernateResourceRepository extends ResourceRepository {
	private final HbDataStore dataStore;

	public HibernateResourceRepository(EPackage[] packages) throws IOException {
		this.dataStore = TeneoUtil.configureDataStore(packages);
		setupResource();
	}

	private void setupResource() throws IOException {
		String uriStr = "hibernate://?" + HibernateResource.DS_NAME_PARAM + "=" + dataStore.getName();
		final URI uri = URI.createURI(uriStr);
		ResourceSet resourceSet = new ResourceSetImpl();
		res = resourceSet.createResource(uri);
		res.setTrackingModification(false);
		res.load(Collections.EMPTY_MAP);
	}

	public void openSession() throws IOException {
		if (res != null) {
			res.unload();
			res = null;
		}
		setupResource();
	}

	public void closeSession() {
		// TODO: uncomment
		// res.unload();
		// EObjectRefAdapter.proxyResource = null;
		// res = null;
	}

	@Override
	public List<?> query(String queryString) {
		Object[] result = ((HibernateResource) res).getObjectsByQuery(queryString, false);
		return Arrays.asList(result);
	}

	@SuppressWarnings("unchecked")
	public List<? extends EObject> getAllInstances(EClass eClass) throws IOException {
		List<?> result = query("FROM " + eClass.getName());
		return (List<? extends EObject>) result;
	}
}
