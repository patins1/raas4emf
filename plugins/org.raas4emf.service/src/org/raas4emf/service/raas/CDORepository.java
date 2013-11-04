/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.service.raas;

import java.io.IOException;
import java.util.List;

import org.apache.cxf.jaxrs.ext.MessageContext;
import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.common.id.CDOIDUtil;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.view.CDOQuery;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.raas4emf.service.AuthenticationHandler;

/**
 * Implements {@link IRepository} using an {@link CDOResource}. This enables resolving of proxies.
 * 
 */
public class CDORepository extends ResourceRepository {

	public CDORepository(EPackage[] packages) throws IOException {
	}

	private void setupResource(MessageContext context) throws IOException {
		CDOView view = (CDOView) context.getContextualProperty(CDOView.class.getName());
		if (view.isClosed()) {
			view = AuthenticationHandler.SINGLETON.authenticate();
		}
		res = (Resource) view.getRootResource().getContents().get(0);
	}

	public void openSession(MessageContext context) throws IOException {
		// if (res != null) {
		// res.unload();
		// res = null;
		// }
		setupResource(context);
	}

	public void closeSession() {
		// TODO: uncomment
		// res.unload();
		// EObjectRefAdapter.proxyResource = null;
		// res = null;
	}

	@Override
	public List<?> query(String queryString) {
		if (queryString.toLowerCase().startsWith("select") || queryString.toLowerCase().startsWith("alter table")) {
			CDOView view = ((CDOResource) res).cdoView();
			CDOQuery q = view.createQuery("sql", queryString);
			if (!queryString.toLowerCase().startsWith("select"))
				q.setParameter("queryStatement", false);
			q.setParameter("cdoObjectQuery", false);
			List<Object> result = q.getResult();
			for (Object x : result) {
				System.out.println(x.getClass());
				System.out.println(x);
			}
			return result;
		}
		CDOQuery q = createOclQuery(queryString);
		return q.getResult();
	}

	private CDOQuery createOclQuery(String queryString) {
		CDOView view = ((CDOResource) res).cdoView();
		CDOQuery result = view.createQuery("ocl", queryString);
		return result;
	}

	@SuppressWarnings("unchecked")
	public List<? extends EObject> getAllInstances(EClass eClass) throws IOException {
		CDOQuery q = createOclQuery(eClass.getEPackage().getNsPrefix() + "::" + eClass.getName() + ".allInstances()");
		List<? extends EObject> result = q.getResult();
		return result;
	}

	public <T extends EObject> T resolveReference(T proxy) throws Exception {
		if (!proxy.eIsProxy())
			throw new Exception("Expected to be proxy!");
		fixProxy(proxy);
		String uriFragment = ((InternalEObject) proxy).eProxyURI().fragment();
		CDOID id = CDOIDUtil.read(uriFragment);
		T result = (T) ((CDOResource) res).cdoView().getObject(id);
		if (result.eIsProxy())
			throw new Exception("Element " + proxy + " not exists!");
		return result;
	}
}
