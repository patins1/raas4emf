/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.actions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.cdo.common.revision.CDOList;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.view.CDOQuery;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.ui.CMSActivator;
import org.raas4emf.cms.ui.RAASUIUtils;
import org.raas4emf.cms.ui.views.PreviewView;

import raascms.Artifact;

public class QueryAction extends AbstractHandler {

	private String message;
	private Resource res;
	private EObject context;
	public static Collection<String> otherSearchStrings = new ArrayList<String>();

	public QueryAction() {
		super();
	}

	public List<?> query(String queryString) {

		int v = queryString.indexOf('v');
		if (queryString.startsWith("OID") && v >= 0) {
			queryString = queryString.substring("OID".length(), v);
			EObject eObject = RAASUtils.findObjectById(queryString, res);
			if (eObject != null)
				return Arrays.asList(eObject);
		}
		if (queryString.toLowerCase().startsWith("select") || queryString.toLowerCase().startsWith("alter table")) {
			CDOView view = ((CDOResource) res).cdoView();
			List<Object> result = execSql(queryString, view);
			for (Object x : result) {
				CMSActivator.log("" + x.getClass());
				CMSActivator.log("" + x);
			}
			return result;
		}
		CDOQuery q = createOclQuery(queryString);
		return q.getResult();
	}

	static public CDOList oldList;

	public static List<Object> execSql(String queryString, CDOView view) {
		// Options options = view.options();
		// CDORevisionPrefetchingPolicy pref = options.getRevisionPrefetchingPolicy();
		// CDOSession session = view.getSession();
		// org.eclipse.emf.cdo.session.CDOSession.Options options2 = session.options();
		// CDOCollectionLoadingPolicy collLoad = options2.getCollectionLoadingPolicy();

		// view.options().setRevisionPrefetchingPolicy(new CDORevisionPrefetchingPolicyImpl(1000000) {
		// @Override
		// public List<CDOID> loadAhead(CDORevisionManager revisionManager, CDOBranchPoint branchPoint, EObject eObject, EStructuralFeature feature, CDOList list, int accessIndex, CDOID accessID) {
		// // if (oldList == list)
		// // CMSActivator.log("Should look ahead " + feature.getName() + "[" + accessIndex + "]");
		// // oldList = list;
		// return super.loadAhead(revisionManager, branchPoint, eObject, feature, list, accessIndex, accessID);
		// }
		// });
		CDOQuery q = view.createQuery("sql", queryString);
		if (!queryString.toLowerCase().startsWith("select") && !queryString.toLowerCase().startsWith("explain"))
			q.setParameter("queryStatement", false);
		q.setParameter("cdoObjectQuery", false);
		List<Object> result = q.getResult();
		return result;
	}

	private CDOQuery createOclQuery(String queryString) {
		CDOView view = ((CDOResource) res).cdoView();
		CDOQuery result = view.createQuery("ocl", queryString, context);
		return result;
	}

	public List<? extends EObject> getAllInstances(EClass eClass) throws IOException {
		CDOQuery q = createOclQuery(getAllInstancesQuery(eClass));
		List<? extends EObject> result = q.getResult();
		return result;
	}

	protected String getAllInstancesQuery(EClass eClass) {
		return eClass.getEPackage().getNsPrefix() + "::" + eClass.getName() + ".allInstances()";
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		try {
			final Shell shell = HandlerUtil.getActiveShell(event);
			List<Artifact> modelFiles = RAASUIUtils.getSelection(event, Artifact.class);

			for (Artifact modelFile2 : modelFiles) {

				final Artifact modelFile = RAASUtils.assureModelTree(modelFile2);
				TreeIterator<EObject> it = modelFile.eAllContents();
				while (it.hasNext()) {
					EObject o = it.next();
					context = o;
					if (context.eContainer() != modelFile) {
						// prefer inner contained objects as context as the outer ones can be just wrapper objects
						break;
					}
				}
				res = modelFile.eResource();

				List<String> sorted = new ArrayList<String>();
				sorted.addAll(otherSearchStrings);

				ComboInputDialog dialog = new ComboInputDialog(sorted.toArray(new String[] {}), shell, "Specify Query", "Query:", null, null) {

					@Override
					protected int getInputTextStyle() {
						return super.getInputTextStyle() & ~SWT.READ_ONLY;
					}

					protected void buttonPressed(int buttonId) {
						if (buttonId == IDialogConstants.OK_ID) {
							String queryString = getText().getText();

							try {

								StringBuilder builder = new StringBuilder();
								message = "";
								long started = System.currentTimeMillis();
								List<?> x = query(queryString);
								long ended = System.currentTimeMillis();
								message += "Returned " + x.size() + " results in " + (ended - started) + " milliseconds\n";
								Collection<EObject> roots = new HashSet<EObject>();
								for (Object object : x) {
									builder.append((object instanceof Object[] ? Arrays.toString((Object[]) object) : object) + "\n");
									if (object instanceof EObject) {
										roots.add((EObject) object);
									}
								}
								message += builder.toString();
								if (!roots.isEmpty()) {
									for (PreviewView view : PreviewView.findView()) {
										view.selectShape(roots, modelFile);
									}
								}
								setErrorMessage(message);
							} catch (Throwable e) {
								CMSActivator.err(e);
								setErrorMessage(e.getMessage());
							}
							return;
						}
						super.buttonPressed(buttonId);
					}

				};
				dialog.open();

			}
		} catch (IOException e) {
			CMSActivator.err(e);
		}
		return null;
	}
}
