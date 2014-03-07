package org.raas4emf.cms.ui.rap;

import java.io.IOException;
import java.io.StringBufferInputStream;
import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jqvt.runtime.EMFJQVTEngine;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.rap.rwt.service.ServiceHandler;
import org.raas4emf.cms.core.FileUtil;
import org.raas4emf.cms.ui.CMSActivator;
import org.raas4emf.cms.ui.RAASUIUtils;

import raascms.Artifact;
import raascms.Folder;

@SuppressWarnings("deprecation")
public abstract class ReflectiveQVTServiceHandler implements ServiceHandler {

	public void service(final HttpServletRequest request, final HttpServletResponse response) throws IOException, ServletException {

		response.setContentType("application/octet-stream");
		response.setHeader("Cache-Control", "no-store");

		try {
			if (CMSActivator.getDefault().remoteProvisioningStatus != null) {
				if (CMSActivator.getDefault().remoteProvisioningStatus.contains("Downloading")) {
					if (CMSActivator.getDefault().remoteProvisioningStatus.indexOf(" (") >= 0)
						CMSActivator.getDefault().remoteProvisioningStatus = CMSActivator.getDefault().remoteProvisioningStatus.substring(0, CMSActivator.getDefault().remoteProvisioningStatus.indexOf(" ("));
					double mb = CMSActivator.getDefault().remoteProvisioningZip.length() / 1024.0 / 1024.0;
					CMSActivator.getDefault().remoteProvisioningStatus += " (" + new DecimalFormat("#.00").format(mb) + " MB downloaded)";
				}
				throw new Exception("Wait until this task is finished: " + CMSActivator.getDefault().remoteProvisioningStatus);
			}

			String requestClass = RWT.getRequest().getParameter("request");
			EClass eclass = findEClass(requestClass);
			if (eclass == null) {
				response.sendError(404, "Unknown RAAS Request: " + requestClass);
				return;
			}

			Activator.log("Handling " + requestClass);

			String token = null;
			final EObject embeddedRequest = eclass.getEPackage().getEFactoryInstance().create(eclass);
			for (String paramName : RWT.getRequest().getParameterMap().keySet()) {
				if ("token".equals(paramName)) {
					token = RWT.getRequest().getParameter(paramName);
					continue;
				}
				if ("servicehandler".equals(paramName) || "request".equals(paramName) || "cid".equals(paramName))
					continue;
				EStructuralFeature feature = embeddedRequest.eClass().getEStructuralFeature(paramName);
				if (feature == null) {
					response.setStatus(400);
					throw new Exception("Unknown parameter: " + paramName);
				}
				embeddedRequest.eSet(feature, EcoreUtil.createFromString((EDataType) feature.getEType(), RWT.getRequest().getParameter(paramName)));
			}
			if (ServletFileUpload.isMultipartContent(request)) {
				ServletFileUpload fileUpload = new ServletFileUpload();
				FileItemIterator items = fileUpload.getItemIterator(request);
				while (items.hasNext()) {
					FileItemStream item = items.next();
					if ("token".equals(item.getFieldName())) {
						token = FileUtil.inputstreamToString(item.openStream());
						continue;
					}
					EStructuralFeature feature = embeddedRequest.eClass().getEStructuralFeature(item.getFieldName());
					if (feature == null) {
						response.setStatus(400);
						throw new Exception("Unknown parameter: " + item.getFieldName());
					}
					if (!item.isFormField()) {
						embeddedRequest.eSet(feature, item.openStream());
						break; // dont call items.hasNext as the stream is not read yet!
					} else {
						String string = FileUtil.inputstreamToString(item.openStream());
						if (feature.getEType() instanceof EClass) {
							EClass targetType = (EClass) feature.getEType();
							Object eObject = CMSActivator.getSessionInstance().decodeJSON(string, targetType);
							embeddedRequest.eSet(feature, eObject);
						} else {
							embeddedRequest.eSet(feature, string);
						}
					}
				}
			}

			String apiToken = getAPITokenFor(requestClass);
			if (apiToken != null && !apiToken.equals(token)) {
				response.setStatus(401);
				return;
			}

			for (EStructuralFeature feature : embeddedRequest.eClass().getEStructuralFeatures()) {
				if (feature.getLowerBound() >= 1 && !embeddedRequest.eIsSet(feature)) {
					response.setStatus(400);
					throw new Exception("Missing parameter: " + feature.getName());
				}
			}

			final List<Artifact> allArtifacts = new ArrayList<Artifact>();
			final List<Folder> allFolders = new ArrayList<Folder>();
			final EMFJQVTEngine testTrafo = new EMFJQVTEngine() {

				@SuppressWarnings("unchecked")
				@Override
				public <T> List<T> getInstancesFor(Class<T> clazz, String direction) {
					if (clazz == Folder.class) {
						if (!allFolders.isEmpty())
							return (List<T>) allFolders;
						String path = getRootPathForFoldersAndArtifacts();
						org.raas4emf.cms.ui.CMSActivator.getSessionInstance().setCredentials("Operator", "o");
						EObject eObject = RAASUIUtils.findByPath(path.split("/"), true);
						try {
							eObject.eResource().save(null);
						} catch (IOException e) {
							Activator.err(e);
							throw new RuntimeException(e);
						}
						if (eObject instanceof Folder) {
							Folder folder = (Folder) eObject;
							allFolders.addAll(folder.getFolders());
							allFolders.add(folder);
							return (List<T>) allFolders;
						}
					}
					if (clazz == Artifact.class) {
						if (!allArtifacts.isEmpty())
							return (List<T>) allArtifacts;
						for (Folder folder : allFolders)
							allArtifacts.addAll(folder.getArtifacts());
						return (List<T>) allArtifacts;
					}
					if (clazz.isInstance(embeddedRequest))
						return (List<T>) Arrays.asList(embeddedRequest);
					return Collections.emptyList();// super.getInstancesFor(clazz, direction);
				}

			};

			List<Object> targetModel = new ArrayList<Object>();
			executeSpecificQVTTransformation(testTrafo, targetModel);

			if (targetModel.size() == 0)
				throw new Exception("Could not produce response for request " + requestClass);
			String result = new String(CMSActivator.getSessionInstance().encodeJSON(targetModel.get(0)));

			FileUtil.inputstreamToOutputstream(new StringBufferInputStream(result), response.getOutputStream());
			Activator.log("Produced " + targetModel.get(0).getClass());

		} catch (Throwable e) {
			e = getLastCause(e);
			String message = e.getMessage();
			if (message == null)
				message = e.toString() + "\n" + Arrays.toString(e.getStackTrace());
			EClass eclass = findEClass("ErrorResponse");
			EObject res = eclass.getEPackage().getEFactoryInstance().create(eclass);
			res.eSet(eclass.getEStructuralFeature("errorMessage"), message);
			message = new String(CMSActivator.getSessionInstance().encodeJSON(res));
			FileUtil.inputstreamToOutputstream(new StringBufferInputStream(message), response.getOutputStream());
		}

	}

	private Throwable getLastCause(Throwable e) {
		if (e.getCause() != null)
			return getLastCause(e.getCause());
		return e;
	}

	abstract protected EClass findEClass(String requestedClass);

	abstract protected void executeSpecificQVTTransformation(final EMFJQVTEngine testTrafo, List<Object> targetModel) throws IllegalAccessException, InvocationTargetException, IOException;

	abstract protected String getAPITokenFor(String requestClass);

	abstract protected String getRootPathForFoldersAndArtifacts();
}