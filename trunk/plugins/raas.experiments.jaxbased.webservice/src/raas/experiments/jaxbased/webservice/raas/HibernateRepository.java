package raas.experiments.jaxbased.webservice.raas;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.hibernate.Query;
import org.hibernate.SessionFactory;


/**
 * Implements {@link IRepository} using directly an Hibernate session
 * 
 */
public class HibernateRepository implements IRepository {
	private SessionFactory sessionFactory;
	private org.hibernate.classic.Session session;

	public HibernateRepository(EPackage[] packages) {
		super();
		HbDataStore dataStore = TeneoUtil.configureDataStore(packages);
		sessionFactory = dataStore.getSessionFactory();
	}

	public void openSession() {
		if (session != null)
			session.close();
		session = sessionFactory.openSession();
	}

	public void closeSession() {
		// session.close(); TODO
		// session = null
	}

	public void beginTransaction() {
		session.beginTransaction();
	}

	public void commit() throws IOException {
		session.getTransaction().commit();
	}

	public void remove(EObject oldObj) {
		session.delete(oldObj);
	}

	public void saveOrUpdate(EObject value) {
		session.saveOrUpdate(value);
	}

	@Override
	public List<?> query(String queryString) {
		Query q = session.createQuery(queryString);
		return q.list();
	}

	@SuppressWarnings("unchecked")
	public <T extends EObject> T resolveReference(T proxy) throws Exception {
		if (!proxy.eIsProxy())
			throw new Exception("Expected to be proxy!");
		Object result = session.load(proxy.eClass().getName(), EcoreUtil.getID(proxy));
		return (T) result;
	}

	@SuppressWarnings("unchecked")
	public List<? extends EObject> getAllInstances(EClass eClass) throws IOException {
		List<?> result = query("FROM " + eClass.getName());
		return (List<? extends EObject>) result;
	}

	@Override
	public void fixProxies(EObject obj) {
		// does not support proxies
	}
}
