/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package au.com.smartservicescrc.raas.codegen.jaxb.actions;

import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.util.ImportManager;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.internal.corext.fix.CleanUpRefactoring;
import org.eclipse.jdt.internal.ui.actions.CleanUpAction;
import org.eclipse.jdt.internal.ui.refactoring.actions.RefactoringStarter;
import org.eclipse.jdt.ui.cleanup.ICleanUp;
import org.eclipse.jdt.ui.refactoring.RefactoringSaveHelper;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ltk.ui.refactoring.RefactoringWizard;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchSite;

import au.com.smartservicescrc.raas.codegen.jaxb.Activator;
import au.com.smartservicescrc.raas.codegen.jaxb.classes.JaxbGenInfo;
import au.com.smartservicescrc.raas.codegen.jaxb.jet.MyInterfaceImplAdapter_Generator;
import au.com.smartservicescrc.raas.codegen.jaxb.jet.MyInterfaceRefAdapter_Generator;
import au.com.smartservicescrc.raas.codegen.jaxb.jet.MyInterfaceRef_Generator;
import au.com.smartservicescrc.raas.codegen.jaxb.util.ResourceUtil;
import au.com.smartservicescrc.raas.codegen.jaxb.wizard.JAXBAugmentationWizard;

public class MultiJaxbAction extends CleanUpAction {
	private JaxbGenInfo jaxbGenInfo;
	public static String jaxbUtilPackage;

	public MultiJaxbAction(IWorkbenchSite site) {
		super(site);
	}

	@Override
	protected ICleanUp[] getCleanUps(ICompilationUnit[] units) {
		return new ICleanUp[] { new JaxbCleanUp(Collections.EMPTY_MAP, jaxbGenInfo) };
	}

	@Override
	protected String getActionName() {
		return "JAXB augmentation";
	}

	@Override
	public void run(IStructuredSelection selection) {
		jaxbGenInfo = new JaxbGenInfo();
		Object[] selected = selection.toArray();
		try {
			for (Object element : selected) {
				if (element instanceof GenModel) {
					GenModel genModel = (GenModel) element;
					Set<IJavaElement> newSelection = new HashSet<IJavaElement>();
					for (GenPackage genPackage : genModel.getGenPackages()) {
						IFolder src = ResourcesPlugin.getWorkspace().getRoot().getFolder(new Path(genModel.getModelDirectory()));
						if (!src.exists()) {
							continue;
						}
						IProject project = src.getProject();
						IJavaProject javaProject = JavaCore.create(project);
						String myPackage = genPackage.getQualifiedPackageName();
						String myPackagePath = myPackage.replace(".", "/");
						Map<String, String> replacements = new HashMap<String, String>();
						jaxbUtilPackage = "org.eclipse.emf.ecore.jaxb";
						replacements.put("MyPackage", jaxbUtilPackage);
						String[] javaFiles = new String[] { "EObjectImplAdapter.java", "EObjectRef.java", "EObjectRefAdapter.java", "TimeZoneAdapter.java", "TimeZoneID.java" };
						for (String next : javaFiles) {
							String p = jaxbUtilPackage.replace(".", "/") + "/" + next;
							ResourceUtil.copyFile(src, "template/src/util/" + next, p, replacements);
						}
						for (GenClass genClass : genPackage.getGenClasses()) {
							IType itftype = javaProject.findType(genClass.getQualifiedInterfaceName());
							if (itftype == null) {
								continue;
							}
							jaxbGenInfo.setGenClass(itftype.getElementName(), genClass);
							newSelection.add(itftype);
							IType type = javaProject.findType(genClass.getQualifiedClassName());
							if (type != null) {
								jaxbGenInfo.setGenClass(type.getElementName(), genClass);
								newSelection.add(type);
							}
							String myInterface = genClass.getInterfaceName();
							genModel.setImportManager(new ImportManager(myPackage + ".jaxb", myInterface + "ImplAdapter"));
							ResourceUtil.copyContents(src, new MyInterfaceImplAdapter_Generator().generate(genClass, jaxbUtilPackage), myPackagePath + "/jaxb/" + myInterface + "ImplAdapter.java");
							genModel.setImportManager(new ImportManager(myPackage + ".jaxb", myInterface + "Ref.java"));
							ResourceUtil.copyContents(src, new MyInterfaceRef_Generator().generate(genClass, jaxbUtilPackage), myPackagePath + "/jaxb/" + myInterface + "Ref.java");
							// if ((type.getFlags() & Flags.AccAbstract) == 0)
							genModel.setImportManager(new ImportManager(myPackage + ".jaxb", myInterface + "RefAdapter.java"));
							ResourceUtil.copyContents(src, new MyInterfaceRefAdapter_Generator().generate(genClass, jaxbUtilPackage), myPackagePath + "/jaxb/" + myInterface + "RefAdapter.java");
						}
					}
					super.run(new StructuredSelection(newSelection.toArray()));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, e.getMessage(), e);
			ErrorDialog.openError(Display.getCurrent().getActiveShell(), "Error", "Exception occured during JAXB generation!", status);
		}
	}

	@Override
	protected void performRefactoring(ICompilationUnit[] units, ICleanUp[] cleanUps) throws InvocationTargetException {
		String actionName = getActionName();
		boolean useOptionsFromProfile = !false;
		ICompilationUnit[] cus = units;
		Shell shell = getShell();
		final CleanUpRefactoring refactoring = new CleanUpRefactoring(actionName);
		for (int i = 0; i < cus.length; i++) {
			refactoring.addCompilationUnit(cus[i]);
		}
		refactoring.setUseOptionsFromProfile(useOptionsFromProfile);
		for (int i = 0; i < cleanUps.length; i++) {
			refactoring.addCleanUp(cleanUps[i]);
		}
		RefactoringWizard refactoringWizard = new JAXBAugmentationWizard(refactoring, RefactoringWizard.DIALOG_BASED_USER_INTERFACE);
		RefactoringStarter starter = new RefactoringStarter();
		starter.activate(refactoringWizard, shell, actionName, RefactoringSaveHelper.SAVE_REFACTORING);
	}
}