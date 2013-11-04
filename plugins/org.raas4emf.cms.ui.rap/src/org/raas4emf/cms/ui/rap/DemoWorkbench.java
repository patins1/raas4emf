/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.rap;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.rap.rwt.application.EntryPoint;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.raas4emf.cms.core.LoggingUtil;
import org.raas4emf.cms.ui.CMSActivator;
import org.raas4emf.cms.ui.DemoWorkbenchAdvisor;
import org.raas4emf.cms.ui.LoginDialog;

public class DemoWorkbench implements EntryPoint {

	public DemoWorkbench() {
	}

	public int createUI() {
		String remoteAddr = RWT.getRequest().getRemoteAddr();
		String osversion = RWT.getRequest().getParameter("osversion");
		String ieversion = RWT.getRequest().getParameter("ieversion");
		String username = RWT.getRequest().getParameter("username");
		String cadtool = RWT.getRequest().getParameter("cadtool");
		String ownversion = RWT.getRequest().getParameter("ownversion");
		System.out.println("remoteaddr=" + remoteAddr);
		System.out.println("osversion=" + osversion);
		System.out.println("ieversion=" + ieversion);
		System.out.println("username=" + username);
		System.out.println("cadtool=" + cadtool);
		System.out.println("ownversion=" + ownversion);
		for (String name : RWT.getRequest().getParameterMap().keySet()) {
			org.raas4emf.cms.ui.CMSActivator.getSessionInstance().setParameter(name, RWT.getRequest().getParameter(name));
		}

		boolean autoLogin = "true".equals(RWT.getRequest().getParameter("autologin"));
		LoggingUtil.logAccess(" remoteaddr=" + remoteAddr + " osversion=" + osversion + " ieversion=" + ieversion + " username=" + username + " cadtool=" + cadtool + " ownversion=" + ownversion);
		Display display = PlatformUI.createDisplay();
		display.disposeExec(new Runnable() {
			@Override
			public void run() {
				JSExecutor.executeJS("try {window.external.closeWindow();} catch (e) {}");
			}
		});

		// String dir = RAASUtils.getRAASProp("RAASSERVICEURL") + "threejs/";
		// JavaScriptLoader loader = RWT.getClient().getService(JavaScriptLoader.class);
		// loader.require(dir + "touchgen.js");

		// Display login dialog until logged in
		while (true) {
			String message = "Please sign in with your username and password:";
			final LoginDialog loginDialog = new LoginDialog(display.getActiveShell(), "Login", message);
			loginDialog.setItems("Architect", "Librarian", "Operator");
			int returnCode = autoLogin ? Window.OK : loginDialog.open();
			if (returnCode == Window.OK) {
				String userID = autoLogin ? getAutoLoginID() : loginDialog.getUsername();
				String password = autoLogin ? getAutoLoginPassword() : loginDialog.getPassword();
				org.raas4emf.cms.ui.CMSActivator.getSessionInstance().setCredentials(userID, password);
				CMSActivator.getSessionInstance();
				try {
					org.raas4emf.cms.ui.CMSActivator.getSessionInstance().getSession();
				} catch (Exception e) {
					IStatus status = new Status(IStatus.ERROR, "org.raas4emf.cms.ui", e.getMessage(), e);
					if (ErrorDialog.openError(display.getActiveShell(), "Error", "DB Login was not successful! Continue without DB connection?", status) != Dialog.OK) {
						// User authentication failed, stop application
						display.dispose();
						return PlatformUI.RETURN_EMERGENCY_CLOSE;
					}
				}
				// The user is authenticated, start the workbench
				WorkbenchAdvisor worbenchAdvisor = getWorkbenchAdvistor();
				int result = PlatformUI.createAndRunWorkbench(display, worbenchAdvisor);
				display.dispose();
				return result;
			}
			// User authentication failed, stop application
			display.dispose();
			return PlatformUI.RETURN_EMERGENCY_CLOSE;
		}

	}

	protected String getAutoLoginID() {
		return "Architect";
	}

	protected String getAutoLoginPassword() {
		return "a";
	}

	protected WorkbenchAdvisor getWorkbenchAdvistor() {
		return new DemoWorkbenchAdvisor();
	}
}
