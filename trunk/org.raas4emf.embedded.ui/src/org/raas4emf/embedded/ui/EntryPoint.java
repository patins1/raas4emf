package org.raas4emf.embedded.ui;

import org.eclipse.ui.application.WorkbenchAdvisor;

public class EntryPoint extends org.raas4emf.cms.ui.rap.DemoWorkbench {

	public EntryPoint() {
	}

	@Override
	public int createUI() {
		return super.createUI();
	}

	@Override
	protected WorkbenchAdvisor getWorkbenchAdvistor() {
		return new EmbeddedWorkbenchAdvisor();
	}

	protected String getAutoLoginID() {
		return "Operator";
	}

	protected String getAutoLoginPassword() {
		return "o";
	}

}
