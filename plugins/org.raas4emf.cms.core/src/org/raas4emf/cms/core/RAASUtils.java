/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.core;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringBufferInputStream;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Annotation;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TimeZone;

import javax.ws.rs.core.MediaType;

import org.apache.cxf.jaxrs.impl.MetadataMap;
import org.apache.cxf.jaxrs.provider.JSONProvider;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.common.id.CDOIDUtil;
import org.eclipse.emf.cdo.common.lob.CDOBlob;
import org.eclipse.emf.cdo.common.revision.CDORevision;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.internal.server.bundle.CDOServerApplication;
import org.eclipse.emf.cdo.net4j.CDONet4jSession;
import org.eclipse.emf.cdo.net4j.CDONet4jSessionConfiguration;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.view.CDOQuery;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.PackageNotFoundException;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.internal.util.bundle.AbstractPlatform;
import org.eclipse.net4j.jvm.JVMUtil;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.ContainerUtil;
import org.eclipse.net4j.util.container.IManagedContainer;
import org.eclipse.net4j.util.om.monitor.MonitorCanceledException;
import org.eclipse.net4j.util.security.IPasswordCredentials;
import org.eclipse.net4j.util.security.IPasswordCredentialsProvider;
import org.eclipse.osgi.framework.internal.core.FrameworkProperties;
import org.ifc4emf.metamodel.ifcheader.Model;
import org.ifc4emf.part21.loader.ContainmentTreeOrderedByNumberHelper;
import org.ifc4emf.part21.loader.Part21ResourceImpl;

import raascms.Artifact;
import raascms.Folder;
import raascms.RaascmsFactory;
import raascms.RaascmsPackage;
import raascms.impl.ArtifactImpl;
import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcDerivedUnit;
import IFC2X3.IfcDoor;
import IFC2X3.IfcGeometricSet;
import IFC2X3.IfcMappedItem;
import IFC2X3.IfcMonetaryUnit;
import IFC2X3.IfcNamedUnit;
import IFC2X3.IfcObject;
import IFC2X3.IfcProduct;
import IFC2X3.IfcProperty;
import IFC2X3.IfcPropertySet;
import IFC2X3.IfcPropertySetDefinition;
import IFC2X3.IfcPropertySingleValue;
import IFC2X3.IfcRelDefines;
import IFC2X3.IfcRelDefinesByProperties;
import IFC2X3.IfcRepresentation;
import IFC2X3.IfcRepresentationItem;
import IFC2X3.IfcRepresentationMap;
import IFC2X3.IfcRoot;
import IFC2X3.IfcSimpleProperty;
import IFC2X3.IfcSpace;
import IFC2X3.IfcUnit;
import IFC2X3.IfcValue;

public class RAASUtils {

	private static final Properties RAASPROPERTIES = new Properties();
	private static long configLastModified = 0;
	private static final String A_PROJECT_WITH_NAME = "An artifact with name \"";
	public static String ROOTPATH = "/bim/NOLServer";
	public static final String repositoryName = "bim";
	public static final String ROOT_RESOURCE_NAME = "bim";
	public static Runnable fixServiceHandlePreconditionsRunnable = null;

	public static String KEY0 = "KEY";
	public static String VALUE0 = "VALUE";
	public static String oldSql;

	public static Collection<String> otherSearchStrings = new ArrayList<String>();

	static public CDOServerApplication dbapp;

	public static EObject findObjectById(String id) {
		CDOView trans = Activator.getSessionInstance().openView();
		Resource res = (Resource) trans.getRootResource().getContents().get(0);
		return RAASUtils.findObjectById(id, res);
	}

	public static EObject findByPath(String... path) {
		return findByPath(path, false);
	}

	public static EObject findByPath(String[] path, boolean force) {
		CDOView trans = Activator.getSessionInstance().openView();
		return RAASUtils.findByPath(trans, path, force);
	}

	public static Artifact generateModel(ResourceSetImpl resourceSet, URI uri, CDOObject root, IProgressMonitor progressMonitor) throws IOException {
		Artifact artifact = null;
		uri = correctModelUri(uri);
		if (root instanceof Artifact) {
			artifact = (Artifact) root;
		} else {
			Folder folder = (Folder) root;
			artifact = addFile(folder, uri);
		}
		artifact.setState("Intermediate model safe");
		doSave(artifact, "initialSave");
		generateModel(resourceSet, uri, artifact, progressMonitor, null);
		return artifact;
	}

	private static void generateModel(ResourceSetImpl resourceSet, URI uri, Artifact artifact, IProgressMonitor progressMonitor, InputStream is) throws IOException {
		uri = correctModelUri(uri);
		artifact.setState("Intermediate model safe");
		try {
			resourceSet.getLoadOptions().put(ArtifactImpl.OPTION_CONTENTSLIST, artifact.getContents());
			resourceSet.getLoadOptions().put(ArtifactImpl.OPTION_SAVE_PROGRESS_MONITOR, progressMonitor);
			Resource res = resourceSet.createResource(uri);
			if (is == null)
				is = artifact.getFileContent().getContents();
			try {
				res.load(is, resourceSet.getLoadOptions());
			} catch (IOException e) {
				boolean tryAsXMI = !"xmi".equals(uri.fileExtension());
				if (e.getCause() instanceof PackageNotFoundException && artifact.getFileContent() != null) {
					PackageNotFoundException packageNotFoundException = (PackageNotFoundException) e.getCause();
					if ("http://www.omg.org/XMI".equals(packageNotFoundException.uri())) {
						tryAsXMI = true;
					}
				}
				if (tryAsXMI) {
					res = resourceSet.createResource(URI.createURI(uri.toString() + ".xmi"));
					is = artifact.getFileContent().getContents();
					try {
						res.load(is, resourceSet.getLoadOptions());
					} catch (IOException e2) {
						throw e;
					}
				} else
					throw e;
			}
			removeLegacyContent(res);
			Collection<EObject> contentsToAdd = new ArrayList<EObject>();
			for (EObject eObject : res.getContents()) {
				if (eObject.eClass().getName().equals("DocumentRoot")) {
					contentsToAdd.addAll(eObject.eContents());
				} else
					contentsToAdd.add(eObject);
			}
			artifact.getContents().addAll(contentsToAdd);
			// truncateStringsTo255Length(artifact);
			artifact.setState(null);
		} catch (Exception e) {
			if (artifact.cdoResource() != null)
				handleFailure(artifact, "generateModel", e);
			else
				throw new IOException(e);
		}
		doSave(artifact, "saveAtCompletion");
	}

	protected static void truncateStringsTo255Length(Artifact artifact) {
		TreeIterator<Object> it = EcoreUtil.getAllProperContents(artifact, true);
		while (it.hasNext()) {
			Object o = it.next();
			if (o instanceof EObject) {
				EObject eObject = (EObject) o;
				for (EAttribute eAttribute : eObject.eClass().getEAllAttributes()) {
					if (eAttribute.getEType().getInstanceClass() == String.class) {
						Object val = eObject.eGet(eAttribute);
						if (val instanceof List) {
							@SuppressWarnings("unchecked")
							List<String> list = (List<String>) val;
							List<String> newList = new ArrayList<String>();
							for (int i = 0; i < list.size(); i++) {
								if (list.get(i) instanceof String) {
									String string = (String) list.get(i);
									int maxLength = 255;// string.substring(0, 255).replace("\n", "").length();
									if (string.length() > maxLength) {
										// string = string.replace("\n", " ");
										String s1 = string.substring(0, maxLength);
										String s2 = string.substring(maxLength);
										newList.add(s1);
										newList.add(s2);
										// list.set(i, s1);
										// list.add(i + 1, s2);
									} else
										newList.add(string);
								}
							}
							if (newList.size() > list.size()) {
								list.clear();
								list.addAll(newList);
							}
						} else if (val instanceof String) {
							String string = (String) val;
							int maxLength = 255;// string.substring(0, 255).replace("\n", "").length();
							if (string.length() > maxLength) {
								Activator.err("Cannot truncate " + string);
							}
						}
					}
				}
			}
		}
	}

	private static void removeLegacyContent(Resource res) {
		Set<EObject> legacyContent = new HashSet<EObject>();
		TreeIterator<EObject> it = res.getAllContents();
		while (it.hasNext()) {
			EObject next = it.next();
			if (!(next instanceof CDOObject)) {
				legacyContent.add(next);
			}
		}
		for (EObject eObject : legacyContent) {
			if (eObject.eResource() == res) {
				EcoreUtil.remove(eObject);
			}
		}
	}

	private static void doSave(CDOObject modelElement, String message, Map<Object, Object> saveOptions) {
		if (modelElement.eResource() == null)
			return;
		try {
			modelElement.eResource().save(saveOptions);
			Activator.log(message);
		} catch (Throwable e) {
			handleFailure(modelElement, message, e);
		}
	}

	public static void doSave(CDOObject modelElement, String message) {
		doSave(modelElement, message, Collections.emptyMap());
	}

	private static void handleFailure(CDOObject modelElement, String message, Throwable e) {
		Activator.err(message, e);
		CDOTransaction transaction = (CDOTransaction) modelElement.cdoResource().cdoView();
		transaction.rollback();
		if (modelElement instanceof Artifact) {
			Artifact artifact = (Artifact) modelElement;
			if (isMonitorCanceled(e))
				artifact.setState("Model upload canceled by user");
			else if (e.getMessage() == null || !e.getMessage().startsWith(A_PROJECT_WITH_NAME))
				artifact.setState(e.getMessage());
			try {
				modelElement.eResource().save(Collections.EMPTY_MAP);
			} catch (IOException e1) {
				throw new RuntimeException(e);
			}
		}
		if (isMonitorCanceled(e))
			return;
		if (e instanceof RuntimeException)
			throw (RuntimeException) e;
		throw new RuntimeException(e);
	}

	public static Artifact addFile(Folder folder, URI uri) throws IOException, FileNotFoundException {
		File file = new File(uri.toFileString());
		String name = file.getName();
		return addFile(folder, uri, name);
	}

	public static Artifact addFile(Folder folder, URI uri, String name, InputStream is) throws IOException, FileNotFoundException {
		if (getChildWithName(folder, name) != null) {
			throw new IOException(A_PROJECT_WITH_NAME + name + "\" already exists!");
		}
		Artifact artifact = RaascmsFactory.eINSTANCE.createArtifact();
		artifact.setName(name);
		folder.getArtifacts().add(artifact);
		// artifact.setFileContent(new CDOClob(new BufferedReader(new
		// FileReader(file), (int)file.length())));
		artifact.setFileContent(new CDOBlob(is));
		return artifact;
	}

	public static Artifact addFile(Folder folder, URI uri, String name) throws IOException, FileNotFoundException {
		File file = new File(uri.toFileString());
		return addFile(folder, uri, name, new FileInputStream(file));
	}

	private static boolean isMonitorCanceled(Throwable e) {
		return e instanceof MonitorCanceledException || e.getCause() != null && e.getCause() != e && isMonitorCanceled(e.getCause());
	}

	static public URI correctModelUri(URI uri) throws IOException {
		if (uri.fileExtension() != null && uri.fileExtension().toLowerCase().equals("ifc"))
			return uri.trimFileExtension().appendFileExtension(uri.fileExtension().toLowerCase());
		return uri;
	}

	static public List<URI> correctModelUris(List<URI> uris) throws IOException {
		List<URI> result = new ArrayList<URI>();
		for (URI uri : uris) {
			uri = RAASUtils.correctModelUri(uri);
			if (uri != null)
				result.add(uri);
		}
		return result;
	}

	public static boolean isLibrarian(String userID) {
		return "Librarian".equals(userID) || isOperator(userID);
	}

	public static boolean isOperator(String userID) {
		return "Operator".equals(userID);
	}

	static public CDOView authenticate(String user, String pwd, Map<String, CDOView> viewByUser) {
		try {
			String key = user + "|" + pwd;
			CDOView view = viewByUser.get(key);
			if (view != null) {
				if (view.isClosed())
					viewByUser.remove(key);
				else
					return view;
			}
			if (!RAASUtils.isLibrarian(user) && !viewByUser.isEmpty()) {
				// reuse existing view if possible for efficiency
				return viewByUser.values().iterator().next();
			}
			CDONet4jSession session = RAASUtils.getCDOSession(user, pwd);
			if (RAASUtils.isLibrarian(user))
				view = session.openTransaction();
			else
				view = session.openView();
			viewByUser.put(key, view);
			return view;
		} catch (Exception e) {
			return null;
		}
	}

	public static void registerRAASCMSMetamodels() {
		// register metamodel packages
		EPackage.Registry.INSTANCE.put(RaascmsPackage.eNS_URI, RaascmsPackage.eINSTANCE);

		// register resource factories
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xml", new XMIResourceFactoryImpl());
	}

	public static CDONet4jSession getCDOSession(final String userID, final String password) {
		// CDOUtil.setLegacyModeDefault(true);

		boolean isJVM = "jvm".equals(getRAASProp("RAASSERVER"));

		// Enable logging and tracing
		// OMPlatform.INSTANCE.setDebugging(true);
		// OMPlatform.INSTANCE.addLogHandler(PrintLogHandler.CONSOLE);
		// OMPlatform.INSTANCE.addTraceHandler(PrintTraceHandler.CONSOLE);

		// Prepare container
		IManagedContainer container;

		// if (isJVM)
		// container = IPluginContainer.INSTANCE;
		// else
		container = ContainerUtil.createContainer();
		Net4jUtil.prepareContainer(container); // Register Net4j factories
		if (isJVM)
			JVMUtil.prepareContainer(container); // Register JVM factories
		else
			TCPUtil.prepareContainer(container); // Register TCP factories

		CDONet4jUtil.prepareContainer(container); // Register CDO factories
		container.activate();

		// Create connector
		IConnector connector;
		if (isJVM)
			connector = JVMUtil.getConnector(container, "default:0");
		else
			connector = TCPUtil.getConnector(container, getRAASProp("RAASSERVER")); //$NON-NLS-1$

		// Create configuration
		CDONet4jSessionConfiguration configuration = CDONet4jUtil.createNet4jSessionConfiguration();
		configuration.setConnector(connector);
		configuration.setRepositoryName(repositoryName); //$NON-NLS-1$

		if (userID != null && password != null) {
			IPasswordCredentialsProvider prov = new IPasswordCredentialsProvider() {

				@Override
				public boolean isInteractive() {
					return false;
				}

				@Override
				public IPasswordCredentials getCredentials() {
					return new IPasswordCredentials() {

						@Override
						public String getUserID() {
							return userID;
						}

						@Override
						public char[] getPassword() {
							return password.toCharArray();
						}

					};
				}

			};
			configuration.setCredentialsProvider(prov);
		}

		// configuration.setSignalTimeout(10 * 60 * 1000); // if uncommmented, cannot connect to DB at all!
		CDONet4jSession session = configuration.openNet4jSession();
		return session;
	}

	public static String getNameOf(Object object) {
		if (object instanceof EObject) {
			EObject eObject = (EObject) object;
			EStructuralFeature nameFeature = eObject.eClass().getEStructuralFeature("name");
			if (nameFeature != null && eObject.eGet(nameFeature) instanceof String)
				return (String) eObject.eGet(nameFeature);
			if (nameFeature != null && eObject.eGet(nameFeature) instanceof List)
				return concat((List<?>) eObject.eGet(nameFeature));
			return "";
		}
		return "unknown";
	}

	public static void setNameOf(EObject modelElement, String newName) {
		modelElement.eSet(modelElement.eClass().getEStructuralFeature("name"), newName);
	}

	private static EList<EObject> getContents(Object element) {
		if (element instanceof Folder) {
			Folder folder = (Folder) element;
			return folder.eContents();
		}
		if (element instanceof CDOResource) {
			CDOResource cdoResource = (CDOResource) element;
			return cdoResource.getContents();
		}
		return null;
	}

	public static Object getChildWithName(EObject parent, String name) {
		for (Object aFile : getContents(parent)) {
			if (name.toLowerCase().equals(RAASUtils.getNameOf(aFile).toLowerCase())) {
				return aFile;
			}
		}
		return null;
	}

	static {
		try {
			String rootPath = getRAASProp("ROOTPATH");
			if (rootPath != null)
				ROOTPATH = rootPath;
		} catch (Exception e) {
			// catch any exception - or this class is not initialized
		}
		try {
			String cacheDir = getRAASProp("CACHE_DIR");
			if (cacheDir != null)
				ArtifactImpl.CACHE_DIR = new File(cacheDir);
		} catch (Exception e) {
			// catch any exception - or this class is not initialized
		}
	}

	public static String getRAASProp(String name) {

		final String value = System.getProperty(name);
		if (value != null) {
			return value;
		}

		String configIni = RAASUtils.ROOTPATH + "/config.ini";

		synchronized (RAASPROPERTIES) {
			long lastModified = new File(configIni).lastModified();
			if (lastModified == 0)
				throw new RuntimeException("Cannot read config file at " + configIni + " to read property '" + name + "'!\nNote: You can also provide this property using an environment variable.");
			if (configLastModified != lastModified) {
				configLastModified = lastModified;
				// Read properties file.
				try {
					FileInputStream fis = new FileInputStream(configIni);
					RAASPROPERTIES.load(fis);
					fis.close();
				} catch (IOException e) {
					Activator.err(e);
					throw new RuntimeException(e);
				}
			}
		}
		return RAASPROPERTIES.getProperty(name);

	}

	/**
	 * Null safe
	 * 
	 * @param folder
	 * @return
	 */
	public static List<Artifact> getArtifacts(final Folder folder) {
		List<Artifact> result = new ArrayList<Artifact>(folder.getArtifacts());
		removeNulls(folder, result);
		// if (result.remove(null)) {
		// while (result.remove(null)) {
		// Activator.log("Removed null");
		// i++;
		// }
		// folder.getArtifacts().clear();
		// folder.getArtifacts().addAll(result);
		// RAASUtils.doSave(folder, "Delete " + i + " nulls in " + folder.getName());
		// }
		return result;
	}

	public static void removeNulls(final Object container, List<?> result) {
		int i;
		while ((i = result.indexOf(null)) != -1) {
			Activator.log("Delete #" + i + " in " + RAASUtils.getNameOf(container));
			if (i - 1 >= 0 && result.get(i - 1) != null) {
				Activator.log("Came before in " + RAASUtils.getNameOf(result.get(i - 1)));
			}
			if (i + 1 <= result.size() - 1 && result.get(i + 1) != null) {
				Activator.log("Came after " + RAASUtils.getNameOf(result.get(i + 1)));
			}
			result.remove(i);
		}
	}

	public static List<EObject> getNamedChildren(final Folder folder) {
		List<EObject> result = new ArrayList<EObject>(folder.eContents());
		while (result.remove(null))
			Activator.log("Removed null");
		return result;
	}

	public static Set<String> getNamesOfChildren(EObject parent) {
		Set<String> result = new HashSet<String>();
		for (EObject eObject : parent.eContents()) {
			result.add(getNameOf(eObject));
		}
		return result;
	}

	public static String withoutExtension(String name) {
		int i = name.lastIndexOf('.');
		if (i != -1)
			return name.substring(0, i);
		return name;
	}

	public static String getSerializationName(Artifact artifact, String desiredName) {
		if (artifact.getFileContent() == null && artifact.getContents().size() >= 2) {
			// multiple "roots" are only supported by xmi format
			return desiredName + ".xmi";
		}
		return desiredName;
	}

	public static String getSerializationName(Artifact artifact) {
		return getSerializationName(artifact, artifact.getName());
	}

	public static String getSerializationNameForExport(Artifact artifact) {
		if (artifact.getFileContent() == null && artifact.getContents().size() >= 2) {
			return artifact.getName() + ".xmi";
		}
		return artifact.getName();
	}

	public static String getIntendedNameForExport(String name) {
		if (name.endsWith(".xmi")) {
			String newName = name.substring(0, name.lastIndexOf(".xmi"));
			if (newName.indexOf(".") != -1) {
				return newName;
			}
		}
		return name;
	}

	/**
	 * Copies the given list so that accessing the result will not cause a {@link ConcurrentModificationException}
	 * 
	 * @param list
	 * @return
	 */
	public static <T extends Object> List<T> safeList(List<T> list) {
		for (int i = 0; i < 10; i++) {
			try {
				return new ArrayList<T>(list);
			} catch (java.util.ConcurrentModificationException e) {
				// next try..
			}
		}
		return new ArrayList<T>(list);
	}

	public static void doSaveAsSubTask(CDOObject modelElement, String message, IProgressMonitor monitor) {
		Activator.log("Begin saving");
		monitor.subTask("Save changes");
		final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
		saveOptions.put(CDOResource.OPTION_SAVE_PROGRESS_MONITOR, monitor);
		doSave(modelElement, message, saveOptions);
	}

	public static EObject findByPath(CDOView trans, String... path) {
		return findByPath(trans, path, false);
	}

	public static EObject findByPath(CDOView trans, String[] path, boolean forceExisting) {
		if (trans.getRootResource().eContents().isEmpty()) {
			if (forceExisting) {
				((CDOTransaction) trans).createResource(RAASUtils.ROOT_RESOURCE_NAME);
			} else {
				return null;
			}
		}
		EObject root = trans.getRootResource().eContents().get(0);
		EObject sampleBuilding = selectByPath(root, path, forceExisting);
		return sampleBuilding;
	}

	private static EObject selectByPath(EObject root, String[] path, boolean forceExisting) {
		for (String string : path) {
			EObject child = getNamedChild(root, string);
			if (child == null) {
				if (forceExisting) {
					Folder folder = RaascmsFactory.eINSTANCE.createFolder();
					folder.setName(string);
					RAASUtils.addToContent(root, folder);
					child = folder;
				} else
					return null;
			}
			root = child;
		}
		return root;
	}

	public static EObject getNamedChild(EObject root, String string) {
		for (EObject child : root.eContents()) {
			if (string.equals(RAASUtils.getNameOf(child))) {
				return child;
			}
		}
		return null;
	}

	public static String concat(List<?> name) {
		if (name.size() == 0)
			return "";
		String result = "";
		for (Object item : name) {
			result += "/" + item;
		}
		return result.substring(1);
	}

	public static String getPath(Folder folder) {
		String result = folder.getName();
		while (!"RepositoryRoot".equals(folder.getName()) && (folder = (Folder) folder.eContainer()) != null) {
			result = folder.getName() + "/" + result;
		}
		return result;
	}

	public static String getPath(Artifact artifact) {
		return getPath((Folder) artifact.eContainer()) + "/" + artifact.getName();
	}

	public static String getPath(EObject eObject) {
		if (eObject instanceof Artifact) {
			return getPath((Artifact) eObject);
		} else {
			return getPath((Folder) eObject);
		}
	}

	static public Artifact getGeometryArtifact(Object product, String ext) {
		if (product instanceof Folder) {
			Folder folder = (Folder) product;
			return getGeometryArtifact(folder, ext);
		}
		if (product instanceof Artifact) {
			Artifact artifact = (Artifact) product;
			if (hasExtension(artifact, ext)) {
				return artifact;
			}
		}
		return null;
	}

	static public Artifact getGeometryArtifact(Folder folder, String ext) {
		if (folder != null)
			for (Artifact artifact : folder.getArtifacts()) {
				if (RAASUtils.hasExtension(artifact, ext) && !artifact.getName().startsWith("index."))
					return artifact;
			}
		return null;
	}

	public static Folder getPropertiesFolder(String queryString, CDOView view) {
		String s = queryString.substring(queryString.lastIndexOf('.') + 1);
		if (s.startsWith("Ifc"))
			s = s.substring("Ifc".length());
		if (s.endsWith("s"))
			s = s.substring(0, s.length() - 1);
		if ("Structural Column".equals(s))
			s = "Column";
		if ("Plumbing Basin".equals(s))
			s = "SanitaryTerminal_WASHHANDBASIN_PlumbingFixtures_US";
		else if ("Plumbing Fixture".equals(s))
			s = "SanitaryTerminal_USERDEFINED_PlumbingFixtures_US";
		else
			s = s + "_USERDEFINED_US";
		return (Folder) RAASUtils.findByPath(view, "RepositoryRoot", "Templates", s);
	}

	/**
	 * @param folder
	 * @return the properties file representing the template of the folder
	 */
	public static Artifact getPropertiesFile(Folder folder) {
		Artifact result = null;
		for (Artifact artifact : RAASUtils.getArtifacts(folder)) {
			if (RAASUtils.hasExtension(artifact, ".xls")) {
				result = artifact;
				break;
			}
		}
		for (Artifact artifact : RAASUtils.getArtifacts(folder)) {
			if (RAASUtils.hasExtension(artifact, ".psd")) {
				result = artifact;
				break;
			}
		}
		return result;
	}

	/**
	 * @param artifact
	 * @return a copy of the given properties file (for the purpose to be opened in the editor)
	 */
	public static Artifact getPropertiesFileCopy(Artifact artifact) {
		if (RAASUtils.hasExtension(artifact, ".psd") || RAASUtils.hasExtension(artifact, ".xls")) {
			if (artifact.getContents().isEmpty()) {
				try {
					return assureModelTree(artifact);
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
			return EcoreUtil.copy(artifact);
		}
		if (artifact.getContents().isEmpty()) {
			try {
				return assureModelTree(artifact);
			} catch (Exception e) {
				// treat as blob
			}
		}
		return artifact;
	}

	public static Artifact assureModelTree(Artifact artifact, IProgressMonitor monitor) throws IOException {
		if (!artifact.getContents().isEmpty())
			return artifact;
		Artifact transformed = RaascmsFactory.eINSTANCE.createArtifact();
		transformed.setFileContent(artifact.getFileContent());
		transformed.setName(artifact.getName());
		generateModel(new ResourceSetImpl(), URI.createFileURI("/dev/sample/" + artifact.getName()), transformed, monitor, null);
		return transformed;
	}

	public static Artifact getModelBlob(Artifact artifact) throws IOException {
		if (artifact.getContents().isEmpty())
			return artifact;
		Artifact transformed = RaascmsFactory.eINSTANCE.createArtifact();
		transformed.setFileContent(artifact.getFileContent());
		transformed.setName(artifact.getName());
		return transformed;
	}

	public static Artifact getModelBlobCopy(Artifact artifact) throws IOException {
		Artifact transformed = RaascmsFactory.eINSTANCE.createArtifact();
		transformed.setFileContent(artifact.getFileContent());
		transformed.setName(artifact.getName());
		return transformed;
	}

	public static Artifact assureModelTree(Artifact artifact) throws IOException {
		return assureModelTree(artifact, new NullProgressMonitor());
	}

	public static void assurePersistentModelTree(Artifact artifact, IProgressMonitor monitor) throws IOException {
		if (!artifact.getContents().isEmpty())
			return;
		generateModel(new ResourceSetImpl(), URI.createFileURI("/dev/sample/" + artifact.getName()), artifact, monitor, null);
	}

	public static boolean hasExtension(Artifact artifact, String ext) {
		String name = artifact.getName();
		return name != null && name.endsWith(ext);
	}

	public static String getExtension(Artifact artifact) {
		String name = artifact.getName();
		if (name == null)
			return "";
		int i = name.lastIndexOf('.');
		if (i == -1)
			return "";
		return name.substring(i);
	}

	public static void addToContent(EObject root, Artifact child) {
		if (root instanceof Folder) {
			Folder folder = (Folder) root;
			folder.getArtifacts().add(child);
		} else if (root instanceof CDOResource) {
			CDOResource cdoResource = (CDOResource) root;
			cdoResource.getContents().add(child);
		} else {
			root.eContents().add(child);
		}
	}

	public static void addToContent(EObject root, Folder child) {
		if (root instanceof Folder) {
			Folder folder = (Folder) root;
			folder.getFolders().add(child);
		} else if (root instanceof CDOResource) {
			CDOResource cdoResource = (CDOResource) root;
			cdoResource.getContents().add(child);
		} else {
			root.eContents().add(child);
		}
	}

	public static Date getModificationDate(CDOObject cdoObject) {
		if (cdoObject instanceof Artifact) {
			Artifact artifact = (Artifact) cdoObject;
			if (artifact.getBlobDate() != null && artifact.getModelDate() != null) {
				if (artifact.getBlobDate().after(artifact.getModelDate())) {
					return artifact.getBlobDate();
				} else {
					return artifact.getModelDate();
				}
			}
			if (artifact.getBlobDate() != null) {
				return artifact.getBlobDate();
			}
			if (artifact.getModelDate() != null) {
				return artifact.getModelDate();
			}
		}
		if (cdoObject.cdoRevision() != null)
			return new Date(cdoObject.cdoRevision().getTimeStamp());
		return new Date();
	}

	public static void setModificationDate(Artifact artifact, Date date) {
		if (!artifact.getContents().isEmpty())
			artifact.setModelDate(date);
		else
			artifact.setBlobDate(date);
	}

	public static String getBlobAsString(Artifact artifact) {
		try {
			return FileUtil.inputstreamToString(artifact.getFileContent().getContents());
		} catch (Exception e) {
			return null;
		}
	}

	public static String getDefaultConfig(Folder folder, String configName) {
		while (folder != null) {
			for (Artifact artifact : folder.getArtifacts()) {
				if (configName.equals(artifact.getName())) {
					return RAASUtils.getBlobAsString(artifact);
				}
			}
			if (folder.eContainer() instanceof Folder) {
				folder = (Folder) folder.eContainer();
			} else {
				folder = null;
			}
		}
		return null;
	}

	public static Properties getPropertyVisibilities(Folder folder) {
		String s = getDefaultConfig(folder, "default.propertyvisibility");
		Properties result = new Properties();
		try {
			if (s != null)
				result.load(new ByteArrayInputStream(s.getBytes()));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return result;
	}

	public static Boolean getPropertyVisibility(Properties properties, String name) {
		String value = properties.getProperty(name);
		if (value != null)
			return Boolean.parseBoolean(properties.getProperty(name));
		return null;

	}

	public static EObject findObjectById(String id, Resource res) {
		try {
			CDOID cdoid = CDOIDUtil.createLong(Double.valueOf(id).longValue());
			return ((CDOResource) res).cdoView().getObject(cdoid);
		} catch (Exception e) {
			return null;
		}
	}

	public static boolean isNotEmptyString(String name) {
		return name != null && !"".equals(name);
	}

	public static String toGMTString(Date date) {
		DateFormat df = new SimpleDateFormat("dd MMM yyyy HH:mm:ss z");
		df.setTimeZone(TimeZone.getTimeZone("GMT"));
		return df.format(date);
	}

	public static String pruneLastChar(String string) {
		if (!"".equals(string))
			return string.substring(0, string.length() - 1);
		return string;
	}

	public static int getCompletionRatio(Artifact artifact) {
		for (EObject model : artifact.getContents()) {
			Double ratio = RAASUtils.getCompletionRatio(model);
			if (ratio != null) {
				return (int) (100 * ratio);
			}
		}
		return 0;
	}

	public static Double getCompletionRatio(EObject model) {
		try {
			java.lang.reflect.Method method = model.getClass().getMethod("getCompletionRatio");
			if (method != null) {
				Object x = method.invoke(model);
				if (x instanceof Double)
					return (Double) x;
			}
		} catch (Exception e) {
			// do nothing
		}
		return null;
	}

	static public void examine(IfcProduct ifcElement, Collection<IfcRepresentationItem> result) {
		if (ifcElement.getRepresentation() != null) {
			for (IfcRepresentation ifcRepresentation : ifcElement.getRepresentation().getRepresentations()) {
				for (IfcRepresentationItem item : ifcRepresentation.getItems()) {
					if (item instanceof IfcMappedItem) {
						IfcMappedItem solid = (IfcMappedItem) item;
						IfcRepresentationMap repMap = solid.getMappingSource();
						IfcRepresentation rep = repMap.getMappedRepresentation();
						for (IfcRepresentationItem repItem : rep.getItems()) {
							addItem(result, repItem);
						}
					} else
						addItem(result, item);
				}
			}
		}

	}

	private static void addItem(Collection<IfcRepresentationItem> result, IfcRepresentationItem item) {
		if (item instanceof IfcGeometricSet)
			return;
		result.add(item);
	}

	public static String getSpaceName(IfcSpace space) {
		return (getPropVal(space, "PSet_Revit_Identity Data", "Name", space.getName()) + " " + getPropVal(space, "PSet_Revit_Identity Data", "Number", "")).trim();
	}

	public static String getDoorName(IfcDoor door) {
		return (getPropVal(door, "PSet_Revit_Identity Data", "Room Name", door.getName()) + " " + getPropVal(door, "PSet_Revit_Identity Data", "Mark", "")).trim();
	}

	public static String getMappedName(IfcRoot root) {
		if (root instanceof IfcSpace) {
			IfcSpace ifcSpace = (IfcSpace) root;
			return getSpaceName(ifcSpace);
		}
		if (root instanceof IfcDoor) {
			IfcDoor ifcDoor = (IfcDoor) root;
			return getDoorName(ifcDoor);
		}
		return root.getName();
	}

	public static String getPropVal(IfcObject ifcObject, String psetName, String propName, String def) {
		IfcPropertySet pset = findPSet(ifcObject, psetName);
		if (pset != null) {
			IfcPropertySingleValue prop = (IfcPropertySingleValue) findProp(pset, propName);
			if (prop != null) {
				return getSimplePropertyValue(prop);
				// return prop.getNominalValue().getIfcTextvalue();
			}
		}
		return def;
	}

	public static IfcPropertySet findPSet(IfcObject ifcObject, String pSetRbac) {
		for (IfcRelDefines definedBy : ifcObject.getIsDefinedBy()) {
			if (definedBy instanceof IfcRelDefinesByProperties) {
				IfcRelDefinesByProperties ifcRelDefinesByProperties = (IfcRelDefinesByProperties) definedBy;
				IfcPropertySetDefinition relatingPropertyDefinition = ifcRelDefinesByProperties.getRelatingPropertyDefinition();
				if (relatingPropertyDefinition != null) {
					if (pSetRbac.equals(relatingPropertyDefinition.getName()))
						return (IfcPropertySet) relatingPropertyDefinition;
				}
			}
		}
		return null;
	}

	public static IfcProperty findProp(IfcPropertySet pset, String propName) {
		for (IfcProperty prop : pset.getHasProperties()) {
			if (propName.equals(prop.getName()))
				return prop;
		}
		return null;
	}

	static public String getSimplePropertyValue(IfcSimpleProperty ifcSimpleProperty) {
		if (ifcSimpleProperty instanceof IfcPropertySingleValue) {
			IfcPropertySingleValue ifcPropertySingleValue = (IfcPropertySingleValue) ifcSimpleProperty;
			IfcValue val = ifcPropertySingleValue.getNominalValue();
			if (val != null) {
				String sunit = getUnit(ifcPropertySingleValue);
				String result = getStringFromIfcValue(val, sunit);
				return result;
			}
		}
		return "unknown - " + ifcSimpleProperty.eClass().getName();
	}

	public static String getUnit(IfcPropertySingleValue ifcPropertySingleValue) {
		String sunit = "";
		IfcUnit unit = ifcPropertySingleValue.getUnit();
		if (unit instanceof IfcNamedUnit) {
			IfcNamedUnit ifcNamedUnit = (IfcNamedUnit) unit;
			if (RAASUtils.isNotEmptyString(ifcNamedUnit.getUnitType().getName())) {
				sunit = " " + ifcNamedUnit.getUnitType().getName();
			} else if (ifcNamedUnit.getDimensions() != null) {
				// sunit = " "+ifcNamedUnit.getUnitType().getName();
			}
		}
		if (unit instanceof IfcMonetaryUnit) {
			IfcMonetaryUnit ifcMonetaryUnit = (IfcMonetaryUnit) unit;
			if (RAASUtils.isNotEmptyString(ifcMonetaryUnit.getCurrency().getName())) {
				sunit = "" + ifcMonetaryUnit.getCurrency().getName();
			}
		}
		if (unit instanceof IfcDerivedUnit) {
			IfcDerivedUnit ifcDerivedUnit = (IfcDerivedUnit) unit;
			if (RAASUtils.isNotEmptyString(ifcDerivedUnit.getUserDefinedType())) {
				sunit = " " + ifcDerivedUnit.getUserDefinedType();
			} else if (RAASUtils.isNotEmptyString(ifcDerivedUnit.getUnitType().getName())) {
				sunit = " " + ifcDerivedUnit.getUnitType().getName();
			}
		}
		return sunit;
	}

	public static String getStringFromIfcValue(IfcValue val, String sunit) {
		String result = "";
		for (EStructuralFeature feature : val.eClass().getEAllStructuralFeatures()) {
			if (feature.getName().endsWith("value") && val.eIsSet(feature)) {
				result += "::" + val.eGet(feature) + sunit;
			}
		}
		if (!result.isEmpty())
			result = result.substring(2);
		return result;
	}

	public static <T extends EObject> T addIfcObjectToModel(T eObject, IfcObject context) {
		if (eObject instanceof IfcRoot) {
			IfcRoot ifcRoot = (IfcRoot) eObject;
			// ifcRoot.setGlobalId(GuidCompressor.getNewIfcGloballyUniqueId());
			ifcRoot.setGlobalId("" + Math.random() * Integer.MAX_VALUE);
			ifcRoot.setOwnerHistory(context.getOwnerHistory());
		}
		Part21ResourceImpl.addToModel(eObject, context);
		return eObject;
	}

	public static void setPropValue(IfcObject ifcObject, String psetName, String propName, String value) {
		IfcPropertySet pset = RAASUtils.findPSet(ifcObject, psetName);
		if (pset == null) {
			IfcRelDefinesByProperties props = RAASUtils.addIfcObjectToModel(IFC2X3Factory.eINSTANCE.createIfcRelDefinesByProperties(), ifcObject);
			ifcObject.getIsDefinedBy().add(props);
			pset = addIfcObjectToModel(IFC2X3Factory.eINSTANCE.createIfcPropertySet(), ifcObject);
			props.setRelatingPropertyDefinition(pset);
			pset.setName(psetName);
		}
		IfcPropertySingleValue prop = (IfcPropertySingleValue) RAASUtils.findProp(pset, propName);
		if (prop == null) {
			prop = addIfcObjectToModel(IFC2X3Factory.eINSTANCE.createIfcPropertySingleValue(), ifcObject);
			pset.getHasProperties().add(prop);
			prop.setName(propName);
		}
		IfcValue val = prop.getNominalValue();
		if (val == null) {
			val = IFC2X3Factory.eINSTANCE.createIfcValue();
			prop.setNominalValue(val);
		}
		val.setIfcTextvalue(value);
		EObject parent = ifcObject;
		while ((parent = parent.eContainer()) != null) {
			if (parent instanceof Artifact) {
				Artifact artifact = (Artifact) parent;
				artifact.setModelDate(new Date());
				break;
			}
		}
	}

	public static boolean isModelComplete(Artifact artifact) {
		for (EObject model : artifact.getContents()) {
			Double ratio = getCompletionRatio(model);
			if (ratio != null) {
				return ratio == 1;
			}
		}
		return !artifact.getContents().isEmpty();
	}

	public static void increaseSessionTimeout(final CDOObject root) {
		CDOSession session = root.cdoView().getSession();
		((CDONet4jSession.Options) session.options()).setCommitTimeout(10 * 60);
	}

	public static IfcRoot getObjectForGUID(Model model, String guid) {
		Integer index = getIndexForGUIDStatic(model, guid);
		if (index != null) {
			EObject eObject = getFromIndex(index, (Artifact) model.eContainer());
			if (eObject instanceof IfcRoot) {
				IfcRoot ifcRoot = (IfcRoot) eObject;
				return ifcRoot;
			}
		}
		return null;
	}

	public static Integer getIndexForGUIDStatic(Model model, String guid) {
		try {
			// long id;
			// // Object obj = ((CDORevisionImpl) model.cdoRevision()).get(Part21Package.eINSTANCE.getModel_GuidToPart21(), -1);
			// // if (obj instanceof CDOID) {
			// // CDOID cdoid = (CDOID) obj;
			// // id = CDOIDUtil.getLong(cdoid);
			// // } else {
			//
			// CDOView view = model.cdoResource().cdoView();
			// GuidToPart21Container guidToPart21;
			// CDOCollectionLoadingPolicy or = view.getSession().options().getCollectionLoadingPolicy();
			// view.getSession().options().setCollectionLoadingPolicy(CDOUtil.createCollectionLoadingPolicy(0, 10));
			// try {
			// // CDORevisionPrefetchingPolicy ori = view.options().getRevisionPrefetchingPolicy();
			// // view.options().setRevisionPrefetchingPolicy(CDOUtil.createRevisionPrefetchingPolicy(10));
			//
			// guidToPart21 = model.getGuidToPart21();
			// view.getSession().options().setCollectionLoadingPolicy(CDOUtil.createCollectionLoadingPolicy(or.getInitialChunkSize(), or.getResolveChunkSize()));
			// } finally {
			// }

			CDORevision revision = model.getGuidToPart21().cdoRevision();
			int branch = revision.getBranch().getID();
			// int branch = model.cdoRevision().getBranch().getID();
			long id = CDOIDUtil.getLong(revision.getID());

			String sql = "SELECT map." + VALUE0 + " FROM IFCHEADER_GUIDTOPART21MAP map, IFCHEADER_GUIDTOPART21CONTAINER_GUIDTOPART21_LIST list";
			// String sql = "SELECT map."+VALUE+" FROM IFCHEADER_GUIDTOPART21MAP map, IFCHEADER_MODEL_GUIDTOPART21_LIST list";
			sql += " WHERE map.CDO_ID=list.CDO_VALUE AND map.CDO_BRANCH=" + branch + " AND (map.CDO_REVISED=0) ";
			sql += " AND list.CDO_SOURCE=" + id + " AND list.CDO_BRANCH=" + branch + " AND list.CDO_VERSION=" + revision.getVersion();
			// sql += " AND model.CDO_ID=" + id + " AND model.CDO_BRANCH=" + branch + " AND (model.CDO_REVISED=0)";
			sql += " AND map." + KEY0 + "='" + guid + "'";

			// sql = "CREATE INDEX GUID_INDEX ON IFCHEADER_GUIDTOPART21MAP ("+KEY0+")";

			// sql = "EXPLAIN SELECT map."+VALUE+" FROM IFCHEADER_GUIDTOPART21MAP map ";
			// sql += " WHERE map."+KEY0+"='" + guid + "'";

			// sql = "SELECT * FROM information_schema.indexes WHERE table_schema = 'PUBLIC' AND table_name='IFCHEADER_GUIDTOPART21MAP';";
			// sql = "CREATE INDEX GUID4_INDEX ON IFCHEADER_GUIDTOPART21MAP(CDO_ID, CDO_BRANCH, "+KEY0+")";

			// sql = "DROP INDEX GUID_INDEX";

			otherSearchStrings.remove(oldSql);
			otherSearchStrings.add(oldSql = sql);

			List<Object> result = execSql(sql, model.cdoResource().cdoView());
			if (result.size() == 1 && result.get(0) instanceof String) {
				Activator.log((String) result.get(0));
			}
			if (result.size() == 1 && result.get(0) instanceof Integer) {
				return (Integer) result.get(0);
			}

		} catch (Exception e) {
			if (e.getMessage().contains("Column \"MAP.VALUE\" not found")) {
				VALUE0 = "VALUE0";
				KEY0 = "KEY0";
				return getIndexForGUIDStatic(model, guid);
			}
		}
		return null;
	}

	public static EObject getFromIndex(int integer, Artifact artifact) {
		for (EObject content : artifact.getContents()) {
			if (content instanceof Model) {
				Model model = (Model) content;
				long start = System.currentTimeMillis();
				ContainmentTreeOrderedByNumberHelper helper = new ContainmentTreeOrderedByNumberHelper(model);
				EObject result = helper.get(integer);
				long end = System.currentTimeMillis();
				Activator.log("Find EObject from index " + (end - start) + " milliseconds");
				return result;
			}
		}
		return null;
	}

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
		// // Activator.log("Should look ahead " + feature.getName() + "[" + accessIndex + "]");
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

	public static void setupCDOServer() throws MalformedURLException, IOException, FileNotFoundException, URISyntaxException, UnsupportedEncodingException {
		URL fileURL = new URL("platform:/plugin/org.raas4emf.server/config/cdo-server.template.xml");
		URL u = FileLocator.resolve(fileURL);
		String fileName = u.getFile();
		File file = new File(fileName);
		String contents = FileUtil.inputstreamToString(new FileInputStream(file));

		String jdbc = System.getProperty("JDBC_CONNECTION_STRING");
		if (jdbc == null || "".equals(jdbc)) {
			String dbName = System.getProperty("RDS_DB_NAME");
			String userName = System.getProperty("RDS_USERNAME");
			String password = System.getProperty("RDS_PASSWORD");
			String hostname = System.getProperty("RDS_HOSTNAME");
			String port = System.getProperty("RDS_PORT");
			if (hostname != null)
				jdbc = "jdbc:postgresql://" + hostname + ":" + port + "/" + dbName + "?user=" + userName + "&password=" + password;
		}
		if (jdbc == null)
			jdbc = "jdbc:hsqldb:mem:repo1";
		Activator.log("JDBC_CONNECTION_STRING=" + jdbc);

		for (String db : new String[] { "h2", "hsqldb", "postgresql" }) {
			if (jdbc.contains(db)) {
				int fromIndex = contents.indexOf("<!--<dbAdapter name=\"" + db);
				contents = contents.substring(0, fromIndex) + contents.substring(fromIndex + "<!--".length());
				contents = replaceAttribute(contents, fromIndex, "url", jdbc);
				contents = replaceAttribute(contents, fromIndex, "URL", jdbc);
				java.net.URI jdbcurl = new java.net.URI(jdbc.substring("jdbc:".length()));
				if (jdbcurl.getHost() != null)
					contents = replaceAttribute(contents, fromIndex, "serverName", jdbcurl.getHost());
				if (jdbcurl.getPath() != null)
					contents = replaceAttribute(contents, fromIndex, "databaseName", jdbcurl.getPath().substring("/".length()));
				if (jdbcurl.getPort() != -1)
					contents = replaceAttribute(contents, fromIndex, "portNumber", "" + jdbcurl.getPort());
				for (Map.Entry<String, List<String>> param : getUrlParameters(jdbc).entrySet())
					contents = replaceAttribute(contents, fromIndex, param.getKey(), param.getValue().get(0));
				FileUtil.inputstreamToOutputstream(new StringBufferInputStream(contents), new FileOutputStream(new File(file.getParentFile(), "cdo-server.xml")));
				Activator.log("Created cdo-server.xml from template using " + jdbc);
			}
		}
		Activator.log("Read config file from " + file.getParentFile().toString());
		FrameworkProperties.setProperty(AbstractPlatform.SYSTEM_PROPERTY_NET4J_CONFIG, file.getParentFile().toString());

		try {
			RAASUtils.getRAASProp("RAASSERVER");
		} catch (Exception e) {
			// not defined, set default
			System.setProperty("RAASSERVER", "localhost:2036");
		}

		Thread t = new Thread() {
			@Override
			public void run() {
				try {
					dbapp = new CDOServerApplication();
					dbapp.start(null);
				} catch (Exception e) {
					Activator.err(e);
				}
			}

		};
		t.start();
	}

	private static String replaceAttribute(String contents, int fromIndex, String attribute, String value) {
		int index = contents.lastIndexOf(attribute + "=\"", contents.indexOf("-->", fromIndex));
		if (index >= fromIndex && contents.charAt(index - 1) != '&') {
			index += (attribute + "=\"").length();
			value = value.replace("&", "&amp;");
			return contents.substring(0, index) + value + contents.substring(contents.indexOf('"', index));
		}
		return contents;
	}

	public static Map<String, List<String>> getUrlParameters(String url) throws UnsupportedEncodingException {
		Map<String, List<String>> params = new HashMap<String, List<String>>();
		String[] urlParts = url.split("\\?");
		if (urlParts.length > 1) {
			String query = urlParts[1];
			for (String param : query.split("&")) {
				String pair[] = param.split("=");
				String key = URLDecoder.decode(pair[0], "UTF-8");
				String value = "";
				if (pair.length > 1) {
					value = URLDecoder.decode(pair[1], "UTF-8");
				}
				List<String> values = params.get(key);
				if (values == null) {
					values = new ArrayList<String>();
					params.put(key, values);
				}
				values.add(value);
			}
		}
		return params;
	}

	public static void encodeJSON(Object arg, OutputStream outputStream, List<String> arrayKeys, boolean dropRootElement) {

		JSONProvider writer = new JSONProvider();

		writer.setDropRootElement(dropRootElement);
		writer.setSerializeAsArray(true);
		writer.setArrayKeys(arrayKeys);

		try {
			writer.writeTo(arg, arg.getClass(), arg.getClass(), new Annotation[] {}, MediaType.APPLICATION_JSON_TYPE, new MetadataMap<String, Object>(), outputStream);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Object decodeJSON(InputStream inputStream, EClass eClass) {

		JSONProvider reader = new JSONProvider();

		// writer.setExtraClass(new Class[] { ProductLineResponseImpl.class, ObjectLibraryResponseImpl.class });
		reader.setDropRootElement(true);

		Class targetType = eClass.getInstanceClass();
		try {
			return reader.readFrom(targetType, targetType, new Annotation[] {}, MediaType.APPLICATION_JSON_TYPE, new MetadataMap<String, String>(), inputStream);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static void fixServiceHandlePreconditions() {
		if (fixServiceHandlePreconditionsRunnable != null)
			fixServiceHandlePreconditionsRunnable.run();
	}
}
