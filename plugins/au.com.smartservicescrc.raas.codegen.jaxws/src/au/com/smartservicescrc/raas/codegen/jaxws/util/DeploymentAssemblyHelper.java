/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package au.com.smartservicescrc.raas.codegen.jaxws.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jst.common.ui.internal.assembly.wizard.ExternalJarReferenceWizardFragment;
import org.eclipse.jst.j2ee.classpathdep.ClasspathDependencyUtil;
import org.eclipse.jst.j2ee.internal.componentcore.JavaEEModuleHandler;
import org.eclipse.osgi.util.NLS;
import org.eclipse.wst.common.componentcore.ComponentCore;
import org.eclipse.wst.common.componentcore.ModuleCoreNature;
import org.eclipse.wst.common.componentcore.datamodel.properties.IAddReferenceDataModelProperties;
import org.eclipse.wst.common.componentcore.internal.operation.AddReferenceDataModelProvider;
import org.eclipse.wst.common.componentcore.internal.resources.VirtualArchiveComponent;
import org.eclipse.wst.common.componentcore.internal.resources.VirtualReference;
import org.eclipse.wst.common.componentcore.resources.IVirtualComponent;
import org.eclipse.wst.common.componentcore.resources.IVirtualReference;
import org.eclipse.wst.common.componentcore.ui.Messages;
import org.eclipse.wst.common.componentcore.ui.ModuleCoreUIPlugin;
import org.eclipse.wst.common.componentcore.ui.internal.propertypage.ProjectReferenceWizardFragment;
import org.eclipse.wst.common.componentcore.ui.propertypage.AddModuleDependenciesPropertiesPage;
import org.eclipse.wst.common.componentcore.ui.propertypage.IReferenceWizardConstants;
import org.eclipse.wst.common.componentcore.ui.propertypage.IReferenceWizardConstants.ProjectConverterOperationProvider;
import org.eclipse.wst.common.frameworks.datamodel.DataModelFactory;
import org.eclipse.wst.common.frameworks.datamodel.IDataModel;
import org.eclipse.wst.common.frameworks.datamodel.IDataModelOperation;
import org.eclipse.wst.common.frameworks.datamodel.IDataModelProvider;
import org.eclipse.wst.common.project.facet.core.ProjectFacetsManager;

/**
 * This class represents some of the logic of the Deployment Assembly preference page. Call ExternalJarReferenceWizardFragment_performFinish() to add external jars, call ProjectReferenceWizardFragment_performFinish() to add a project, or call deployRequiredPlugins() to add/remove a class path entry to the deployment assembly. At
 * the end, call saveReferenceChanges() to persist the changes. <br>
 * <br>
 * Note: changes of deployRequiredPlugins() are immediately persisted.
 */
@SuppressWarnings("restriction")
public class DeploymentAssemblyHelper {

	private final IProject project;

	final protected IVirtualComponent rootComponent;

	protected String runtimeLoc = "/WEB-INF/lib";
	/**
	 * See {@link IReferenceWizardConstants#FINAL_REFERENCE}
	 */
	List<IVirtualReference> FINAL_REFERENCE = new ArrayList<IVirtualReference>();

	/**
	 * See {@link AddModuleDependenciesPropertiesPage#currentReferences}
	 */
	List<IVirtualReference> currentReferences = new ArrayList<IVirtualReference>();

	/**
	 * See {@link AddModuleDependenciesPropertiesPage#originalReferences}
	 */
	protected ArrayList<IVirtualReference> originalReferences = new ArrayList<IVirtualReference>();

	public DeploymentAssemblyHelper(IProject project) {
		this.project = project;
		rootComponent = ComponentCore.createComponent(project);
		initialize();
	}

	/**
	 * See {@link J2EEModuleDependenciesPropertyPage#saveReferenceChanges()} and {@link AddJavaBuildPathEntriesWizardFragment#handleSelectionChanged()}
	 * 
	 * @throws JavaModelException
	 */
	public void deployRequiredPlugins(String toAdd, String toRemove) throws JavaModelException {
		IJavaProject javaProject = JavaCore.create(project);
		/**
		 * see {@link J2EEModuleDependenciesPropertyPage#saveReferenceChanges()}
		 */
		List<IClasspathEntry> newClasspath = new ArrayList<IClasspathEntry>();
		for (IClasspathEntry entry : javaProject.getRawClasspath()) {
			IPath path = entry.getPath();
			if (toAdd.equals(path.toString())) {
				/**
				 * see {@link AddJavaBuildPathEntriesWizardFragment#handleSelectionChanged()}
				 */
				IClasspathEntry newClassPath = ClasspathDependencyUtil.modifyDependencyPath(entry, ClasspathDependencyUtil.WEB_INF_LIB_PATH);
				newClasspath.add(newClassPath);
			} else if (!toRemove.equals(path.toString()))
				newClasspath.add(entry);
		}
		javaProject.setRawClasspath(newClasspath.toArray(new IClasspathEntry[newClasspath.size()]), null);
	}

	/**
	 * See {@link AddModuleDependenciesPropertiesPage#addOneReference()}
	 * 
	 * @param ref
	 * @throws CoreException
	 */
	protected void addOneReference(IVirtualReference ref) throws CoreException {

		IDataModelProvider provider = getAddReferenceDataModelProvider(ref);
		IDataModel dm = DataModelFactory.createDataModel(provider);
		dm.setProperty(IAddReferenceDataModelProperties.SOURCE_COMPONENT, rootComponent);
		dm.setProperty(IAddReferenceDataModelProperties.TARGET_REFERENCE_LIST, Arrays.asList(ref));

		IStatus stat = dm.validateProperty(IAddReferenceDataModelProperties.TARGET_REFERENCE_LIST);
		if (stat != IDataModelProvider.OK_STATUS)
			throw new CoreException(stat);
		try {
			dm.getDefaultOperation().execute(new NullProgressMonitor(), null);
		} catch (ExecutionException e) {
			ModuleCoreUIPlugin.logError(e);
		}
	}

	/**
	 * See {@link AddModuleDependenciesPropertiesPage#getAddReferenceDataModelProvider()}
	 * 
	 * @param component
	 */
	protected IDataModelProvider getAddReferenceDataModelProvider(IVirtualReference component) {
		return new AddReferenceDataModelProvider();
	}

	/**
	 * See CustomWebProjectReferenceWizardFragment#performFinish() and {@link ProjectReferenceWizardFragment#performFinish(IProgressMonitor)}
	 * 
	 * @param proj
	 * @param monitor
	 * @return
	 * @throws CoreException
	 */
	public void ProjectReferenceWizardFragment_performFinish(IProject proj, IProgressMonitor monitor) throws CoreException {
		ProjectConverterOperationProvider converter = null;
		if (!ModuleCoreNature.isFlexibleProject(proj)) {
			convertProject(proj, converter, monitor);
		}
		VirtualReference ref = new VirtualReference(rootComponent, ComponentCore.createComponent(proj, false));
		ref.setArchiveName(new Path(getArchiveName(proj, ref.getReferencedComponent())).lastSegment());
		ref.setRuntimePath(new Path(runtimeLoc).makeAbsolute());
		FINAL_REFERENCE.add(ref);
	}

	/**
	 * See {@link ProjectReferenceWizardFragment#getArchiveName()}
	 * 
	 * @param proj
	 * @param comp
	 * @return
	 */
	protected String getArchiveName(IProject proj, IVirtualComponent comp) {
		return getModuleHandler().getArchiveName(proj, comp);
	}

	/**
	 * See {@link ProjectReferenceWizardFragment#getModuleHandler()}
	 * 
	 * @return
	 */
	private JavaEEModuleHandler getModuleHandler() {
		return new JavaEEModuleHandler();
	}

	/**
	 * See {@link ProjectReferenceWizardFragment#convertProject()}
	 * 
	 * @param proj
	 * @param converter
	 * @param monitor
	 */
	protected void convertProject(IProject proj, ProjectConverterOperationProvider converter, IProgressMonitor monitor) {
		if (converter != null) {
			IDataModelOperation operation = converter.getConversionOperation(proj);
			if (operation != null) {
				try {
					operation.execute(monitor, null);
					return;
				} catch (ExecutionException ee) {
					ModuleCoreUIPlugin.log(NLS.bind(Messages.ProjectConversionError, proj.getName()), ee);
				}
			}
		}
		try {
			if (!ModuleCoreNature.isFlexibleProject(proj)) {
				ModuleCoreNature.addModuleCoreNatureIfNecessary(proj, monitor);
				ProjectFacetsManager.create(proj, true, monitor);
			}
		} catch (CoreException ce) {
			ModuleCoreUIPlugin.log(NLS.bind(Messages.ProjectConversionError, proj.getName()), ce);
		}
	}

	/**
	 * See {@link AddModuleDependenciesPropertiesPage#initialize()}
	 */
	protected void initialize() {
		Map<String, Object> options = new HashMap<String, Object>();
		IVirtualReference[] refs = rootComponent.getReferences(options);
		originalReferences.addAll(Arrays.asList(refs));
		currentReferences.addAll(Arrays.asList(cloneReferences(refs)));
	}

	/**
	 * See {@link AddModuleDependenciesPropertiesPage#cloneReferences()}
	 */
	protected IVirtualReference[] cloneReferences(IVirtualReference[] refs) {
		IVirtualReference[] result = new IVirtualReference[refs.length];
		VirtualReference temp;
		for (int i = 0; i < result.length; i++) {
			temp = new VirtualReference(refs[i].getEnclosingComponent(), refs[i].getReferencedComponent());
			temp.setDependencyType(refs[i].getDependencyType());
			temp.setDerived(refs[i].isDerived());
			temp.setArchiveName(refs[i].getArchiveName());
			temp.setRuntimePath(refs[i].getRuntimePath());
			result[i] = temp;
		}
		return result;
	}

	/**
	 * See {@link AddModuleDependenciesPropertiesPage#saveReferenceChanges()}
	 * 
	 * @return
	 */
	public boolean saveReferenceChanges() {

		/**
		 * See {@link AddModuleDependenciesPropertiesPage#handleAddDirective()}
		 */
		currentReferences.addAll(FINAL_REFERENCE);

		// Fill our delta lists
		ArrayList<IVirtualReference> added = new ArrayList<IVirtualReference>();
		ArrayList<IVirtualReference> removed = new ArrayList<IVirtualReference>();

		HashMap<IVirtualComponent, IVirtualReference> map = new HashMap<IVirtualComponent, IVirtualReference>();
		Iterator<IVirtualReference> k = currentReferences.iterator();
		IVirtualReference v1;
		while (k.hasNext()) {
			v1 = k.next();
			map.put(v1.getReferencedComponent(), v1);
		}

		Iterator<IVirtualReference> j = originalReferences.iterator();
		IVirtualReference origRef, newRef;
		while (j.hasNext()) {
			origRef = j.next();
			newRef = map.get(origRef.getReferencedComponent());
			if (newRef == null)
				removed.add(origRef);
			else if (!AddModuleDependenciesPropertiesPage.getSafeRuntimePath(origRef).equals(AddModuleDependenciesPropertiesPage.getSafeRuntimePath(newRef))) {
				removed.add(origRef);
				added.add(newRef);
			}
			map.remove(origRef.getReferencedComponent());
		}

		added.addAll(map.values());

		NullProgressMonitor monitor = new NullProgressMonitor();
		boolean subResult = preHandleChanges(monitor);
		if (!subResult)
			return false;

		handleRemoved(removed);
		handleAdded(added);

		subResult &= postHandleChanges(monitor);

		originalReferences.clear();
		originalReferences.addAll(currentReferences);
		currentReferences.clear();
		IVirtualReference[] currentTmp = originalReferences.toArray(new IVirtualReference[originalReferences.size()]);
		currentReferences.addAll(Arrays.asList(cloneReferences(currentTmp)));
		return subResult;

	}

	/**
	 * See {@link AddModuleDependenciesPropertiesPage#handleAdded()}
	 */
	protected void handleAdded(ArrayList<IVirtualReference> added) {
		final ArrayList<IVirtualReference> refs = new ArrayList<IVirtualReference>();
		Iterator<IVirtualReference> i = added.iterator();
		IVirtualReference o;
		while (i.hasNext()) {
			o = i.next();
			refs.add(o);
		}

		IWorkspaceRunnable runnable = new IWorkspaceRunnable() {
			public void run(IProgressMonitor monitor) throws CoreException {
				addReferences(refs);
			}
		};
		try {
			ResourcesPlugin.getWorkspace().run(runnable, new NullProgressMonitor());
		} catch (CoreException e) {
			ModuleCoreUIPlugin.logError(e);
		}
	}

	/**
	 * See {@link AddModuleDependenciesPropertiesPage#addReferences()}
	 */
	protected void addReferences(ArrayList<IVirtualReference> refs) throws CoreException {
		Iterator<IVirtualReference> i = refs.iterator();
		while (i.hasNext()) {
			addOneReference(i.next());
		}
	}

	/**
	 * See {@link AddModuleDependenciesPropertiesPage#handleRemoved()}
	 */
	protected void handleRemoved(ArrayList<IVirtualReference> removed) {
		if (!removed.isEmpty())
			throw new RuntimeException("not implemented");
	}

	/**
	 * See {@link AddModuleDependenciesPropertiesPage#preHandleChanges()}
	 */
	protected boolean preHandleChanges(IProgressMonitor monitor) {
		return true;
	}

	/**
	 * See {@link AddModuleDependenciesPropertiesPage#postHandleChanges()}
	 */
	protected boolean postHandleChanges(IProgressMonitor monitor) {
		return true;
	}

	/**
	 * See {@link ExternalJarReferenceWizardFragment#performFinish(IProgressMonitor) )}
	 * 
	 * @param paths
	 * @throws CoreException
	 */
	public void ExternalJarReferenceWizardFragment_performFinish(Collection<IPath> paths) throws CoreException {
		ArrayList<IVirtualReference> refList = new ArrayList<IVirtualReference>();
		for (IPath path : paths) {
			// IPath fullPath = project.getFile(selected[i]).getFullPath();
			String type = VirtualArchiveComponent.LIBARCHIVETYPE + IPath.SEPARATOR;
			IVirtualComponent archive = ComponentCore.createArchiveComponent(rootComponent.getProject(), type + path.toString());
			VirtualReference ref = new VirtualReference(rootComponent, archive);
			ref.setArchiveName(path.lastSegment());
			if (runtimeLoc != null) {
				ref.setRuntimePath(new Path(runtimeLoc).makeAbsolute());
			}
			refList.add(ref);
		}
		FINAL_REFERENCE.addAll(refList);
	}
}
