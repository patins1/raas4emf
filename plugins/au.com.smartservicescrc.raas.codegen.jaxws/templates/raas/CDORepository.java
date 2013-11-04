package qut.bim.raas.raas;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.net4j.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.view.CDOQuery;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import qut.bim.core.Utils;


/**
 * Implements {@link IRepository} using an {@link CDOResource}. This
 * enables resolving of proxies.
 * 
 */
public class CDORepository extends ResourceRepository {

	public CDORepository(EPackage[] packages) throws IOException {
		setupResource();
	}

	private void setupResource() throws IOException {
		CDOSession session = Utils.getCDOSession();
		CDOTransaction trans = session.openTransaction();
		res = (Resource) trans.getRootResource().getContents().get(0);
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
		CDOQuery q = createOclQuery(queryString);
		return q.getResult();
	}

	private CDOQuery createOclQuery(String queryString) {
		CDOView view = ((CDOResource)res).cdoView();
		CDOQuery result = view.createQuery("ocl", queryString);
		return result;
	}

	@SuppressWarnings("unchecked")
	public List<? extends EObject> getAllInstances(EClass eClass) throws IOException {
		CDOQuery q = createOclQuery(eClass.getEPackage().getNsPrefix()+"::"+eClass.getName()+".allInstances()");
		List<? extends EObject> result = q.getResult();
		return result;
	}
}
