/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui;

import org.eclipse.ui.application.IWorkbenchConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

public class DemoWorkbenchAdvisor extends WorkbenchAdvisor {

	public void initialize(IWorkbenchConfigurer configurer) {
		getWorkbenchConfigurer().setSaveAndRestore(isSaveAndRestore());
		super.initialize(configurer);
	}

	protected boolean isSaveAndRestore() {
		return true;
	}

	public String getInitialWindowPerspectiveId() {
		return "org.raas4emf.cms.ui.perspectiveViewer";
	}

	public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(final IWorkbenchWindowConfigurer windowConfigurer) {
		return new DemoWorkbenchWindowAdvisor(windowConfigurer);
	}
}
