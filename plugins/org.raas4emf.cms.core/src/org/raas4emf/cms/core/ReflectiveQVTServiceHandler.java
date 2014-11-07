package org.raas4emf.cms.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringBufferInputStream;
import java.lang.reflect.InvocationTargetException;
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

import raascms.Artifact;
import raascms.Folder;

@SuppressWarnings("deprecation")
public abstract class ReflectiveQVTServiceHandler implements ServiceHandler {

	synchronized public void service(final HttpServletRequest request, final HttpServletResponse response) throws IOException, ServletException {
		RAASUtils.fixServiceHandlePreconditions();

		response.setContentType("application/json");
		response.setHeader("Cache-Control", "no-store");
		String message = null;

		String requestClass = RWT.getRequest().getParameter("request");
		try {
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
						File temp = File.createTempFile("temp-raas-upload", ".tmp");
						FileUtil.inputstreamToOutputstream(item.openStream(), new FileOutputStream(temp));
						embeddedRequest.eSet(feature, new FileInputStream(temp));
						temp.deleteOnExit();
					} else {
						String string = FileUtil.inputstreamToString(item.openStream());
						if (feature.getEType() instanceof EClass) {
							EClass targetType = (EClass) feature.getEType();
							Object eObject = RAASUtils.decodeJSON(string, targetType);
							embeddedRequest.eSet(feature, eObject);
						} else {
							embeddedRequest.eSet(feature, EcoreUtil.createFromString((EDataType) feature.getEType(), string));
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

			String result = processRequest(embeddedRequest);

			response.setHeader("RAASResponseMessage", "" + message);
			FileUtil.inputstreamToOutputstream(new StringBufferInputStream(result), response.getOutputStream());

		} catch (Throwable e) {
			e = getLastCause(e);
			message = e.getMessage();
			if (message == null)
				message = e.toString() + "\n" + Arrays.toString(e.getStackTrace());
			EClass eclass = findEClass("ErrorResponse");
			EObject res = eclass.getEPackage().getEFactoryInstance().create(eclass);
			res.eSet(eclass.getEStructuralFeature("errorMessage"), message);
			message = new String(RAASUtils.encodeJSON(res));
			response.setHeader("RAASResponseMessage", "" + message);
			FileUtil.inputstreamToOutputstream(new StringBufferInputStream(message), response.getOutputStream());
		}

		Activator.info(requestClass + " returned status code " + response.getStatus() + " message=" + message);

	}

	public String processRequest(final EObject embeddedRequest) throws IllegalAccessException, InvocationTargetException, IOException, Exception {
		final List<Artifact> allArtifacts = new ArrayList<Artifact>();
		final List<Folder> allFolders = new ArrayList<Folder>();
		final EMFJQVTEngine testTrafo = new EMFJQVTEngine() {

			@Override
			public <T> List<T> getInstancesFor(Class<T> clazz, String direction) {
				return ReflectiveQVTServiceHandler.this.getInstancesFor(embeddedRequest, allArtifacts, allFolders, clazz);
			}

		};

		List<Object> targetModel = new ArrayList<Object>();
		executeSpecificQVTTransformation(testTrafo, targetModel);

		if (targetModel.size() == 0)
			throw new Exception("Could not produce response for request " + embeddedRequest.eClass().getName());
		Activator.log("Produced " + targetModel.get(0).getClass());
		String result = new String(RAASUtils.encodeJSON(targetModel.get(0)));
		return result;
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

	@SuppressWarnings("unchecked")
	protected <T> List<T> getInstancesFor(final EObject embeddedRequest, final List<Artifact> allArtifacts, final List<Folder> allFolders, Class<T> clazz) {
		if (clazz == Folder.class) {
			if (!allFolders.isEmpty())
				return (List<T>) allFolders;
			String path = getRootPathForFoldersAndArtifacts();
			// RAASSessionSingleton sessionInstance = Activator.getSessionInstance();
			/**
			 * Create a completely new session, as a session can be shared when the same web client triggers multiple parsing processes! So do not use Activator.getSessionInstance()!
			 */
			RAASSessionSingleton sessionInstance = new RAASSessionSingleton();
			sessionInstance.setCredentials("Operator", "o");
			EObject eObject = RAASUtils.findByPath(sessionInstance.openView(), path.split("/"), true);
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
}