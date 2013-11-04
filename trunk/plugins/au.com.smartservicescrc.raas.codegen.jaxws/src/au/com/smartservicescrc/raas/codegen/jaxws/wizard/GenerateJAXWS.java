package au.com.smartservicescrc.raas.codegen.jaxws.wizard;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.util.ImportManager;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.pde.internal.ui.wizards.tools.ConvertProjectToPluginOperation;
import org.eclipse.swt.widgets.Display;
import org.osgi.framework.Bundle;

import au.com.smartservicescrc.raas.codegen.jaxws.Activator;
import au.com.smartservicescrc.raas.codegen.jaxws.jet.CXF_Servlet_Generator;
import au.com.smartservicescrc.raas.codegen.jaxws.jet.RepositoryInterface_Generator;
import au.com.smartservicescrc.raas.codegen.jaxws.jet.Repository_Generator;
import au.com.smartservicescrc.raas.codegen.jaxws.jet.Sun_Jaxws_Generator;
import au.com.smartservicescrc.raas.codegen.jaxws.jet.Web_Generator;
import au.com.smartservicescrc.raas.codegen.jaxws.util.DeploymentAssemblyHelper;
import au.com.smartservicescrc.raas.codegen.jaxws.util.MetamodelUtil;
import au.com.smartservicescrc.raas.codegen.jaxws.util.PDEHelper;
import au.com.smartservicescrc.raas.codegen.jaxws.util.ResourceUtil;

@SuppressWarnings("restriction")
public class GenerateJAXWS implements IRunnableWithProgress {

	private static final boolean useCXF = true;
	private static final boolean enableLogging = true;
	public static final boolean enableJAXRS = true;
	public static boolean allInOneService = false;
	public static boolean changeLibraries = false;
	public static final String mimeTypes = "{\"application/xml\", \"application/json\"}";
	private final JaxwsWizard wizard;
	private final GenModel genModel;

	public GenerateJAXWS(GenModel genModel, JaxwsWizard wizard) {
		this.genModel = genModel;
		this.wizard = wizard;

	}

	@Override
	public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {

		IFolder src = ResourcesPlugin.getWorkspace().getRoot().getFolder(new Path(wizard.getSourceFolder()));
		IProject project = src.getProject();
		IFolder folderWebContent = project.getFolder("WebContent");
		IFolder srcModel = ResourcesPlugin.getWorkspace().getRoot().getFolder(new Path(genModel.getModelDirectory()));

		try {

			monitor.beginTask("Generate Web services", 3);

			monitor.subTask("Configure plugin dependencies..");
			ConvertProjectToPluginOperation convertOperation = new ConvertProjectToPluginOperation(new IProject[] { project }, false);
			convertOperation.run(null);
			if (changeLibraries)
				// Perform the modification of the manifest file
				PDEHelper.addPluginDependencies(project, new String[] { genModel.getModelPluginID(), "org.eclipse.core.runtime", "org.eclipse.emf.ecore.xmi", "org.hibernate", "org.eclipse.emf.teneo", "org.eclipse.emf.teneo.annotations", "org.eclipse.emf.teneo.annotations.source", "org.eclipse.emf.teneo.hibernate",
						"org.eclipse.emf.teneo.hibernate.mapper", "org.eclipse.emf.teneo.hibernate.mapper.source", "org.eclipse.emf.teneo.hibernate.source", "org.eclipse.emf.teneo.source", "org.apache.commons.logging", "org.hsqldb", "org.dom4j", "javax.persistence", "org.apache.log4j" });

			monitor.worked(1);

			monitor.subTask("Configure deployment assembly..");
			if (changeLibraries)
				configureDeploymentAssembly(genModel, project);
			monitor.worked(1);

			monitor.subTask("Generate code..");
			String packageName = wizard.getSelectedPackage();
			String packagePath = packageName.replace(".", "/");
			Map<EClass, GenClass> genClassOfClass = MetamodelUtil.getGenClassOfClassMap(genModel);
			// generate List instead of EList
			genModel.setSuppressEMFTypes(true);
			List<String> implementors = new ArrayList<String>();
			Collection<String> packagesToExport = new HashSet<String>();
			Collection<GenClass> allTopClasses = new HashSet<GenClass>();
			Collection<GenClass> allRootClasses = new HashSet<GenClass>();
			for (EClass eRepositoryRoot : wizard.getSelectedClasses()) {
				String serviceName = eRepositoryRoot.getName() + "Repository";
				ImportManager importManager = new ImportManager(packageName, serviceName);
				genModel.setImportManager(importManager);
				importManager.addImport("java.util.List");
				Collection<EClass> eTopClasses = MetamodelUtil.getTopClasses(eRepositoryRoot, genModel);
				Collection<GenClass> genTopClasses = MetamodelUtil.getGenClassesOfClasses(eTopClasses, genClassOfClass);
				GenClass genRepositoryRoot = genClassOfClass.get(eRepositoryRoot);
				if (allInOneService) {
					allRootClasses.add(genRepositoryRoot);
					allTopClasses.addAll(genTopClasses);
					continue;
				}
				String modelPackage = genRepositoryRoot.getGenPackage().getQualifiedPackageName();
				String contents = new Repository_Generator().generate(Arrays.asList(genRepositoryRoot), genTopClasses, packageName, serviceName, modelPackage);
				ResourceUtil.copyContents(src, contents, packagePath + "/" + serviceName + "Impl.java");
				implementors.add(packageName + "." + serviceName + "Impl");

				String modelPackagePath = modelPackage.replace(".", "/");
				contents = new RepositoryInterface_Generator().generate(Arrays.asList(genRepositoryRoot), genTopClasses, modelPackage + ".jaxws", serviceName, modelPackage);
				ResourceUtil.copyContents(srcModel, contents, modelPackagePath + "/jaxws/" + serviceName + ".java");
				packagesToExport.add(modelPackage + ".jaxws");
			}
			if (allInOneService) {
				String serviceName = "RootRepository";
				ImportManager importManager = new ImportManager(packageName, serviceName);
				genModel.setImportManager(importManager);
				importManager.addImport("java.util.List");

				String modelPackage = "org.eclipse.emf.ecore";
				String contents = new Repository_Generator().generate(allRootClasses, allTopClasses, packageName, serviceName, modelPackage);
				ResourceUtil.copyContents(src, contents, packagePath + "/" + serviceName + "Impl.java");
				implementors.add(packageName + "." + serviceName + "Impl");

				String modelPackagePath = modelPackage.replace(".", "/");
				contents = new RepositoryInterface_Generator().generate(allRootClasses, allTopClasses, modelPackage + ".jaxws", serviceName, modelPackage);
				ResourceUtil.copyContents(srcModel, contents, modelPackagePath + "/jaxws/" + serviceName + ".java");
				packagesToExport.add(modelPackage + ".jaxws");
			}
			if (changeLibraries)
				PDEHelper.exportPackages(srcModel.getProject(), packagesToExport.toArray(new String[] {}));
			if (useCXF) {
				String contentsCXFServlet = new CXF_Servlet_Generator().generate(implementors, enableLogging);
				ResourceUtil.copyContents(folderWebContent, contentsCXFServlet, "WEB-INF/cxf-servlet.xml");
			} else {
				String contentsSUNServlet = new Sun_Jaxws_Generator().generate(implementors, enableLogging);
				ResourceUtil.copyContents(folderWebContent, contentsSUNServlet, "WEB-INF/sun-jaxws.xml");
			}
			String contentsWeb = new Web_Generator().generate(packageName, useCXF);
			ResourceUtil.copyContents(folderWebContent, contentsWeb, "WEB-INF/web.xml");

			Map<String, String> replacements = new HashMap<String, String>();
			replacements.put("raas.experiments.jaxbased.webservice", packageName);
			String[] javaFiles = new String[] { "FileRepository.java", "HibernateRepository.java", "HibernateResourceRepository.java", "IRepository.java", "ResourceRepository.java", "TeneoUtil.java", "Updater.java", "WebserviceRepository.java" };
			for (String next : javaFiles) {
				String p = packagePath + "/raas/" + next;
				ResourceUtil.copyFile(src, "templates/raas/" + next, p, replacements);
			}
			monitor.worked(1);

			monitor.subTask("Copy libraries..");
			String[] jaxbLibs = new String[] { "jaxb-api.jar", "jaxb-impl.jar", "jaxb-xjc.jar" };
			if (changeLibraries)
				for (String next : jaxbLibs) {
					String p = "WEB-INF/lib/" + next;
					ResourceUtil.copyFile(folderWebContent, "templates/jaxb_libs/" + next, p, null);
				}
			final Bundle bundle = Activator.getDefault().getBundle();
			File file = FileLocator.getBundleFile(bundle);
			File cxf_libs = new File(new File(file, "templates"), "cxf_libs");
			if (changeLibraries)
				for (String next : cxf_libs.list()) {
					if (next.toLowerCase().endsWith(".jar")) {
						File fs = new File(cxf_libs, next);
						String p = "WEB-INF/lib/" + next;
						ResourceUtil.copyFile(folderWebContent, fs, p, null);
					}
				}
			monitor.worked(1);
		} catch (Exception e) {
			e.printStackTrace();
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
			ErrorDialog.openError(Display.getCurrent().getActiveShell(), "Error", "Exception occured during service generation!", status);
		}
	}

	public void configureDeploymentAssembly(final GenModel genModel, IProject project) throws CoreException, JavaModelException {
		DeploymentAssemblyHelper depl = new DeploymentAssemblyHelper(project);
		depl.ProjectReferenceWizardFragment_performFinish(ResourcesPlugin.getWorkspace().getRoot().getProject(genModel.getModelPluginID()), new NullProgressMonitor());
		/**
		 * Deploy teneo/emf/etc plugins by deploying required plugins. Also remove the CXF library folder from the Deployment Assembly, for two reasons:<br>
		 * <li>
		 * First, we do not want to deploy the jaxb libs included with CXF to get deployed, so we will just deploy any other jar file in the lib folder.<br> <li>
		 * Second some jar would be deployed both by the CXF folder and by Hibernate, which is not allowed (but since its the same library, would not matter).
		 */
		depl.deployRequiredPlugins("org.eclipse.pde.core.requiredPlugins", "org.eclipse.jst.ws.cxf.core.CXF_CLASSPATH_CONTAINER");
		/*
		 * String cxfVersion = CXFCorePlugin.getDefault().getCXFRuntimeVersion(project); CXFInstall cxfInstall = CXFCorePlugin.getDefault().getJava2WSContext().getInstallations ().get(cxfVersion); if (cxfInstall != null) { String cxfLocation = cxfInstall.getLocation(); if (cxfLocation != null && !"".equals(cxfLocation)) {
		 * Collection<IPath> paths = new ArrayList<IPath>(); File cxfLibDir = new File(new File(cxfLocation), "lib"); if (!cxfLibDir.exists()) cxfLibDir = new File("C:\\dev\\apache-cxf-2.4.0-SNAPSHOT"); if (!cxfLibDir.exists()) throw new RuntimeException("Expected that CXF lib directory exists!\n" + cxfLibDir); for (String cfxLib :
		 * cxfLibDir.list()) { if (cfxLib.endsWith(".jar") && !cfxLib.startsWith("jaxb-")) { paths.add(Path.fromOSString(new File(cxfLibDir, cfxLib).toString())); } } depl.ExternalJarReferenceWizardFragment_performFinish(paths); } }
		 */
		depl.saveReferenceChanges();
	}

}
