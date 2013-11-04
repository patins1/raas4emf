package raas.experiments.jaxbased.webservice.raas;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * Interface which a provider of a repository must implement
 */
public interface IRepository {
	/**
	 * Must be called before any communication to the repository
	 * 
	 * @throws IOException
	 */
	void openSession() throws IOException;

	/**
	 * Must be called after any communication to the repository
	 */
	void closeSession();

	/**
	 * Must be called before any write access to the repository
	 */
	void beginTransaction();

	/**
	 * Must be called after any write access to the repository
	 * 
	 * @throws IOException
	 */
	void commit() throws IOException;

	/**
	 * Called to complete delete the given object
	 * 
	 * @param oldObj
	 *            may be a proxy
	 */
	void remove(EObject oldObj);

	/**
	 * Adds/updates the given object to the repository
	 * 
	 * @param value
	 */
	void saveOrUpdate(EObject value);

	/**
	 * Performs a query
	 * 
	 * @param queryString
	 * @return the query result
	 */
	List<?> query(String queryString);

	/**
	 * Resolves the given EMF proxy
	 * 
	 * @param proxy
	 *            an EMF proxy
	 * @return
	 * @throws Exception
	 */
	<T extends EObject> T resolveReference(T proxy) throws Exception;

	List<? extends EObject> getAllInstances(EClass eClass) throws Exception;

	/**
	 * Since proxies created by unmarshalling have URIs of the form "#id", the
	 * proxy URIs shall now be fixed here, e.g. pointing to a resource
	 * 
	 * @param obj
	 */
	void fixProxies(EObject obj);
}
