package org.raas4emf.embedded.ui;

import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.raas4emf.cms.ui.DemoWorkbenchAdvisor;

public class EmbeddedWorkbenchAdvisor extends DemoWorkbenchAdvisor {

	@Override
	protected boolean isSaveAndRestore() {
		return false;
	}

	public String getInitialWindowPerspectiveId() {
		return "org.raas4emf.cms.ui.perspectiveDocument";
	}

	public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(final IWorkbenchWindowConfigurer windowConfigurer) {
		return new EmbeddedWorkbenchWindowAdvisor(windowConfigurer);
	}
}
