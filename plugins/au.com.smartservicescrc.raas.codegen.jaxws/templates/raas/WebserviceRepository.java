package qut.bim.raas.raas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class WebserviceRepository {
	static protected IRepository repos;

	public WebserviceRepository(EPackage... packages) throws IOException {
		if (repos!=null) return;
		repos = new CDORepository(packages);
		// repos = new HibernateResourceRepository(packages);
	}

	protected List<?> query(String queryString) throws IOException {
		repos.openSession();
		try {
			List<?> result = repos.query(queryString);
			return result;
		} finally {
			repos.closeSession();
		}
	}

	protected <T extends EObject> T create(T obj) throws IOException {
		// assure all new objects must have an ID set
		if (EcoreUtil.getID(obj) == null)
			EcoreUtil.setID(obj, EcoreUtil.generateUUID());
		TreeIterator<Object> it = EcoreUtil.getAllContents(obj, true);
		while (it.hasNext()) {
			EObject o = (EObject) it.next();
			if (EcoreUtil.getID(o) == null)
				EcoreUtil.setID(o, EcoreUtil.generateUUID());
		}
		repos.openSession();
		try {
			repos.fixProxies(obj);
			repos.beginTransaction();
			repos.saveOrUpdate(obj);
			repos.commit();
		} finally {
			repos.closeSession();
		}
		return obj;
	}

	protected <T extends EObject> void update(T proxy, T value) throws Exception {
		repos.openSession();
		try {
			if (EcoreUtil.getID(value) == null)
				throw new Exception("Expected ID of updating object to be set!");
			repos.fixProxies(value);
			// Load the object
			T oldObj = repos.resolveReference(proxy);
			repos.beginTransaction();
			// If id changed, we need to delete it, since Hibernate cannot
			// change the old id!
			if (!EcoreUtil.getID(oldObj).equals(EcoreUtil.getID(value))) {
				repos.remove(oldObj);
				// simply add the new object and return!
				repos.saveOrUpdate(value);
				repos.commit();
				return;
			}
			// Update the object
			Updater updater = new Updater(oldObj, value);
			updater.doUpdate();
			// Save the updated object
			repos.saveOrUpdate(oldObj);
			repos.commit();
		} finally {
			repos.closeSession();
		}
	}

	protected void delete(EObject proxy) throws Exception {
		repos.openSession();
		try {
			repos.beginTransaction();
			EObject persistentObject = repos.resolveReference(proxy);
			repos.remove(persistentObject);
			repos.commit();
		} finally {
			repos.closeSession();
		}
	}

	@SuppressWarnings("unchecked")
	protected <T extends EObject> List<T> getAllInstances(EClass eClass) throws Exception {
		repos.openSession();
		try {
			return (List<T>) repos.getAllInstances(eClass);
		} finally {
			repos.closeSession();
		}
	}

	protected <T extends EObject> T get(T proxy) throws Exception {
		repos.openSession();
		try {
			return repos.resolveReference(proxy);
		} finally {
			repos.closeSession();
		}
	}

	protected <T> T getter(EObject root, EStructuralFeature feature) throws Exception {
		repos.openSession();
		try {
			root = repos.resolveReference(root);
			return (T) root.eGet(feature);
		} finally {
			repos.closeSession();
		}
	}

	protected void setter(EObject root, EStructuralFeature feature, Object value) throws Exception {
		repos.openSession();
		try {
			repos.beginTransaction();
			root = repos.resolveReference(root);
			if (feature instanceof EReference) {
				if (value instanceof List) {
					List<EObject> list = new ArrayList<EObject>();
					for (EObject eObject : (List<EObject>) value) {
						list.add(repos.resolveReference(eObject));
					}
					value = list;
				} else if (value != null) {
					value = repos.resolveReference((EObject) value);
				}
			}
			if (value == null && feature.isMany())
				value = new ArrayList<Object>();
			root.eSet(feature, value);
			repos.saveOrUpdate(root);
			repos.commit();
		} finally {
			repos.closeSession();
		}
	}
}
