/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package au.com.smartservicescrc.raas.codegen.jaxb.wizard;

import org.eclipse.ltk.core.refactoring.Refactoring;
import org.eclipse.ltk.ui.refactoring.RefactoringWizard;

public class JAXBAugmentationWizard extends RefactoringWizard {
	public JAXBAugmentationWizard(Refactoring refactoring, int flags) {
		super(refactoring, flags);
		setWindowTitle("JAXB augmentation");
	}

	@Override
	protected void addUserInputPages() {
		// add no pages
	}
}
