package raas.experiments.jaxbased.webservice.raas;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * Implements {@link IRepository} using a {@link Resource}. Thus, one can
 * abstract from the repository technology (e.g. Teneo, CDO, text files). *
 */
abstract public class ResourceRepository implements IRepository {
	Resource res;

	public void openSession() throws IOException {
		// nothing to do
	}

	public void closeSession() {
		res.unload();
	}

	public void beginTransaction() {
		// nothing to do
	}

	public void commit() throws IOException {
		res.save(null);
	}

	public void remove(EObject oldObj) {
		EcoreUtil.delete(oldObj);
	}

	public void saveOrUpdate(EObject value) {
		if (value.eResource() == null)
			res.getContents().add(value);
	}

	public <T extends EObject> T resolveReference(T proxy) throws Exception {
		if (!proxy.eIsProxy())
			throw new Exception("Expected to be proxy!");
		fixProxy(proxy);
		@SuppressWarnings("unchecked")
		T result = (T) EcoreUtil.resolve(proxy, res);
		if (result.eIsProxy())
			throw new Exception("Element " + proxy + " not exists!");
		return result;
	}

	@Override
	public void fixProxies(EObject obj) {
		for (Map.Entry<EObject, Collection<EStructuralFeature.Setting>> entry : EcoreUtil.ProxyCrossReferencer.find(obj).entrySet()) {
			EObject eObject = entry.getKey();
			fixProxy(eObject);
		}
	}

	protected void fixProxy(EObject proxy) {
		((EObjectImpl) proxy).eSetProxyURI(res.getURI().appendFragment(res.getURIFragment(proxy)));
	}
}
