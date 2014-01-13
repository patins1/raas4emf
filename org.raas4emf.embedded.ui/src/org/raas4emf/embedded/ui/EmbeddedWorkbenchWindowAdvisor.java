package org.raas4emf.embedded.ui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.raas4emf.cms.ui.DemoActionBarAdvisor;
import org.raas4emf.cms.ui.DemoWorkbenchWindowAdvisor;
import org.raas4emf.cms.ui.views.PreviewView;

public class EmbeddedWorkbenchWindowAdvisor extends DemoWorkbenchWindowAdvisor {

	public EmbeddedWorkbenchWindowAdvisor(final IWorkbenchWindowConfigurer configurer) {
		super(configurer);
	}

	public ActionBarAdvisor createActionBarAdvisor(final IActionBarConfigurer configurer) {
		return new DemoActionBarAdvisor(configurer) {

			@Override
			protected void loadMenuFromDatabase() {
				// do nothing
			}

		};
	}

	public void preWindowOpen() {
		super.preWindowOpen();
		IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
		configurer.setShowProgressIndicator(false);
		configurer.setShowCoolBar(false);
	}

	@Override
	public void postWindowCreate() {
		super.postWindowCreate();

		Display.getDefault().asyncExec(new Runnable() {
			public void run() {

				for (PreviewView view : PreviewView.findView()) {
					view.setViewState(IWorkbenchPage.STATE_MAXIMIZED);
				}

				// load into preview view
				// RbacToIfcAdapterFactory.displayIfcModel(rbacRoot, attachedOnLoad2);

			}

		});

	}

}
