/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package au.com.smartservicescrc.raas.codegen.jaxws.wizard;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.wizard.Wizard;

public class JaxwsWizard extends Wizard {
	private final GenModel genModel;
	private RootsWizardPage rootsWizardPage;
	private TargetWizardPage targetWizardPage;
	private Object[] selectedClasses;

	public JaxwsWizard(GenModel genModel) {
		this.genModel = genModel;
		setWindowTitle("RAAS wizard");
	}

	@Override
	public void addPages() {
		addPage(targetWizardPage = new TargetWizardPage());
		addPage(rootsWizardPage = new RootsWizardPage(genModel));
	}

	@Override
	public boolean performFinish() {
		selectedClasses = rootsWizardPage.getCheckboxTableViewer().getCheckedElements();

		GenerateJAXWS gen = new GenerateJAXWS(genModel, this);
		try {
			getContainer().run(false, true, gen);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			return false;
		}

		return true;
	}

	public String getSourceFolder() {
		return targetWizardPage.getPackageFragmentRootText();
	}

	public String getSelectedPackage() {
		return targetWizardPage.getPackageText();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Collection<EClass> getSelectedClasses() {
		return new ArrayList(Arrays.asList(selectedClasses));
	}

}
