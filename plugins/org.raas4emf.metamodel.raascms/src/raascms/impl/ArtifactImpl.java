/**
 */
package raascms.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.cdo.common.lob.CDOBlob;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.net4j.util.HexUtil;
import org.raas4emf.cms.transformation.IArtifactTransformator;
import org.raas4emf.cms.transformation.IModelTransformator;
import org.raas4emf.cms.transformation.ITranformator;
import org.raas4emf.cms.transformation.TransformationUtils;

import raascms.Artifact;
import raascms.Folder;
import raascms.RaascmsPackage;
import raascms.util.RootElementPatcher;
import raascms.util.XMIExportResource;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Artifact</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link raascms.impl.ArtifactImpl#getFileContent <em>File Content</em>}</li>
 * <li>{@link raascms.impl.ArtifactImpl#getContents <em>Contents</em>}</li>
 * <li>{@link raascms.impl.ArtifactImpl#getState <em>State</em>}</li>
 * <li>{@link raascms.impl.ArtifactImpl#getDependentArtifact <em>Dependent Artifact</em>}</li>
 * <li>{@link raascms.impl.ArtifactImpl#getName <em>Name</em>}</li>
 * <li>{@link raascms.impl.ArtifactImpl#getModelDate <em>Model Date</em>}</li>
 * <li>{@link raascms.impl.ArtifactImpl#getBlobDate <em>Blob Date</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
@XmlType(name = "Artifact")
@XmlRootElement(name = "ArtifactElement")
public class ArtifactImpl extends CDOObjectImpl implements Artifact {
	public static File CACHE_DIR = new File(Platform.getLocation().toFile(), "cache");
	static public final String OPTION_CONTENTSLIST = EList.class.getName();
	public static final String OPTION_SAVE_PROGRESS_MONITOR = IProgressMonitor.class.getName();
	static public final String OPTION_MVD = "OPTION_MVD";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ArtifactImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RaascmsPackage.Literals.ARTIFACT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@XmlTransient
	public CDOBlob getFileContent() {
		return (CDOBlob) eGet(RaascmsPackage.Literals.ARTIFACT__FILE_CONTENT, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFileContent(CDOBlob newFileContent) {
		eSet(RaascmsPackage.Literals.ARTIFACT__FILE_CONTENT, newFileContent);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@XmlTransient
	@SuppressWarnings("unchecked")
	public EList<EObject> getContents() {
		return (EList<EObject>) eGet(RaascmsPackage.Literals.ARTIFACT__CONTENTS, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getState() {
		return (String) eGet(RaascmsPackage.Literals.ARTIFACT__STATE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setState(String newState) {
		eSet(RaascmsPackage.Literals.ARTIFACT__STATE, newState);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@XmlTransient
	public Artifact getDependentArtifact() {
		return (Artifact) eGet(RaascmsPackage.Literals.ARTIFACT__DEPENDENT_ARTIFACT, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDependentArtifact(Artifact newDependentArtifact) {
		eSet(RaascmsPackage.Literals.ARTIFACT__DEPENDENT_ARTIFACT, newDependentArtifact);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return (String) eGet(RaascmsPackage.Literals.ARTIFACT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		eSet(RaascmsPackage.Literals.ARTIFACT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Date getModelDate() {
		return (Date) eGet(RaascmsPackage.Literals.ARTIFACT__MODEL_DATE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setModelDate(Date newModelDate) {
		eSet(RaascmsPackage.Literals.ARTIFACT__MODEL_DATE, newModelDate);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Date getBlobDate() {
		return (Date) eGet(RaascmsPackage.Literals.ARTIFACT__BLOB_DATE, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBlobDate(Date newBlobDate) {
		eSet(RaascmsPackage.Literals.ARTIFACT__BLOB_DATE, newBlobDate);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Job> getJobs() {
		return new BasicEList<Job>(Arrays.asList(Job.getJobManager().find(this)));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case RaascmsPackage.ARTIFACT___GET_JOBS:
			return getJobs();
		}
		return super.eInvoke(operationID, arguments);
	}

	public InputStream asFile(String filename, IProgressMonitor monitor) throws IOException {
		Object result = getFileOrStream(filename, monitor);
		if (result instanceof File) {
			File file = (File) result;
			return new FileInputStream(file);
		}
		return (InputStream) result;
	}

	public Object getFileOrStream(String filename, IProgressMonitor monitor) throws IOException {
		if (filename.lastIndexOf('/') != -1)
			filename = filename.substring(filename.lastIndexOf('/') + 1);
		if (filename.lastIndexOf('\\') != -1)
			filename = filename.substring(filename.lastIndexOf('\\') + 1);
		String targetFileExtension = TransformationUtils.getFileExtension(filename);
		String sourceFileExtension = TransformationUtils.getFileExtension(getName());
		String pureFilename = "scene";
		if (!targetFileExtension.equals(sourceFileExtension) && !targetFileExtension.equals("xmi")) {
			if (this.eContainer() instanceof Folder) {
				Folder folder = (Folder) this.eContainer();
				for (Artifact artifact : folder.getArtifacts()) {
					if (targetFileExtension.equals(TransformationUtils.getFileExtension(artifact.getName()))) {
						return artifact.getFileOrStream(filename, monitor);
					}
				}
			}
			if (Platform.getExtensionRegistry() == null && TransformationUtils.ADDITIONAL_TRANSFORMATORS.length == 0) {
				List<IConfigurationElement> _ADDITIONAL_TRANSFORMATORS = new ArrayList<IConfigurationElement>();
				TransformationUtils.ADDITIONAL_TRANSFORMATORS = _ADDITIONAL_TRANSFORMATORS.toArray(new IConfigurationElement[] {});
			}
			List<ITranformator> chain = TransformationUtils.getConverterChain(sourceFileExtension, targetFileExtension);
			File dir = getTransformationsDirectory();
			if (chain.isEmpty()) {
				File file = new File(dir, filename);
				if (file.exists()) {
					System.out.println("Reuse " + file);
					return file;
				}
			}
			if (!chain.isEmpty()) {
				int totalWork = 0;
				for (ITranformator transformator : chain) {
					totalWork += transformator.totalWork();
				}
				monitor.beginTask("Transform", totalWork);
				try {
					Object lastArtifact = this;
					for (ITranformator transformator : chain) {
						File file = transformator.getTargetFile(dir, pureFilename);
						if (!file.exists()) {
							if (lastArtifact == this) {
								if (transformator instanceof IModelTransformator && !this.getContents().isEmpty()) {
									IModelTransformator iModelTransformator = (IModelTransformator) transformator;
									file = iModelTransformator.transform(this.getContents(), dir, pureFilename, monitor);
								} else if (transformator instanceof IArtifactTransformator) {
									IArtifactTransformator iArtifactTransformator = (IArtifactTransformator) transformator;
									file = iArtifactTransformator.transform(this, dir, pureFilename, monitor);
								} else {
									file = transformator.transform(this.getFileContent().getContents(), dir, pureFilename, monitor);
								}
							} else
								file = transformator.transform((File) lastArtifact, dir, pureFilename, monitor);
						} else {
							monitor.worked(transformator.totalWork());
							System.out.println("Reuse " + file);
						}
						if (monitor.isCanceled())
							return null;
						if (!file.exists())
							throw new RuntimeException("Transformator " + transformator.getClass().getName() + " failed, file does not exist:\n" + file);
						if (transformator == chain.get(chain.size() - 1))
							return file;
						lastArtifact = file;
					}
				} finally {
					monitor.done();
				}
			}
			throw new RuntimeException("Found no transformations from " + sourceFileExtension + " to " + targetFileExtension + " to get " + new File(dir, filename));
		}
		// if (!this.getContents().isEmpty())
		// return serializeModel(new ResourceSetImpl(), this, monitor);
		if (isBlobUpToDate())
			return this.getFileContent().getContents();
		return serializeModel(this, filename, monitor);
	}

	public File getTransformationsDirectory() {
		File artifactsDir = new File(CACHE_DIR, "transformations");
		File dir = new File(artifactsDir, HexUtil.bytesToHex(getFileContent().getID()));
		dir.mkdirs();
		return dir;
	}

	public boolean isBlobUpToDate() {
		return this.getFileContent() != null && !(this.getModelDate() != null && !this.getContents().isEmpty());
	}

	public static String getExtension(String name) {
		if (name == null)
			return "";
		int i = name.lastIndexOf('.');
		if (i == -1)
			return "";
		return name.substring(i);
	}

	public static File serializeModel(Artifact artifact, String filename, final IProgressMonitor monitor) throws IOException {
		File file = getSerializationFile(artifact, filename);
		if (file.exists() && file.length() >= 1 && artifact.cdoID() != null && !(artifact.getModelDate() != null && new Date(file.lastModified()).before(artifact.getModelDate()))) {
			System.out.println("Reuse " + file);
			return file;
		}

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getLoadOptions().put(XMLResource.OPTION_ROOT_OBJECTS, artifact.getContents());
		resourceSet.getLoadOptions().put(OPTION_CONTENTSLIST, artifact.getContents());
		resourceSet.getLoadOptions().put(OPTION_SAVE_PROGRESS_MONITOR, monitor);
		URI uri = URI.createFileURI(file.toURI().getPath());
		Resource res = resourceSet.createResource(uri);

		if (res.getClass() == XMIResourceImpl.class) {
			res = new XMIExportResource(uri, artifact.getContents());
			res.save(resourceSet.getLoadOptions());
		} else if (res instanceof XMLResource) {
			File fileUnprocessed = new File(file + ".unprocessed");
			OutputStream os = new FileOutputStream(fileUnprocessed);
			res.save(os, resourceSet.getLoadOptions());
			os.close();
			os = new FileOutputStream(file);
			RootElementPatcher repl = new RootElementPatcher(new FileInputStream(fileUnprocessed), os);
			EObject topObject = artifact.getContents().get(0);
			repl.trigger(topObject.eClass());
			os.close();
		} else {
			res.save(resourceSet.getLoadOptions());
		}

		return file;

	}

	private static File getSerializationFile(Artifact artifact, String filename) {
		File artifactsDir = new File(CACHE_DIR, "serializations");
		File dir = new File(artifactsDir, artifact.cdoID() != null ? artifact.cdoID().toURIFragment() : "temp");
		dir.mkdirs();

		File file = new File(dir, "scene" + getExtension(filename));
		return file;
	}

	@Override
	public InputStream asFile(String filename) throws IOException {
		return asFile(filename, new NullProgressMonitor());
	}

	@Override
	public InputStream asFileJpg(String filename) throws IOException {
		return asFile(filename + ".jpg", new NullProgressMonitor());
	}

} // ArtifactImpl
