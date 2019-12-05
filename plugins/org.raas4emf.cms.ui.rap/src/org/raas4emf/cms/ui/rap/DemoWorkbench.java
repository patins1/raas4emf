/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.rap;

import java.lang.reflect.Field;
import java.util.ArrayList;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.rap.rwt.RWT;
import org.eclipse.rap.rwt.application.EntryPoint;
import org.eclipse.rap.rwt.client.service.StartupParameters;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.internal.Workbench;
import org.eclipse.ui.statushandlers.AbstractStatusHandler;
import org.eclipse.ui.statushandlers.StatusAdapter;
import org.eclipse.ui.statushandlers.WorkbenchErrorHandler;
import org.raas4emf.cms.ui.CMSActivator;
import org.raas4emf.cms.ui.DemoWorkbenchAdvisor;
import org.raas4emf.cms.ui.LoginDialog;
import org.raas4emf.cms.ui.views.PreviewView;

import raascms.Artifact;

public class DemoWorkbench implements EntryPoint {

	public DemoWorkbench() {
	}

	public int createUI() {
		StartupParameters startupParameters = RWT.getClient().getService(StartupParameters.class);
		String remoteAddr = RWT.getRequest().getRemoteAddr();
		String osversion = startupParameters.getParameter("osversion");
		String ieversion = startupParameters.getParameter("ieversion");
		String username = startupParameters.getParameter("username");
		String cadtool = startupParameters.getParameter("cadtool");
		String ownversion = startupParameters.getParameter("ownversion");
		for (String name : startupParameters.getParameterNames()) {
			CMSActivator.getSessionInstance().setParameter(name, startupParameters.getParameter(name));
		}
		CMSActivator.getSessionInstance().setParameter("ContextPath", RWT.getRequest().getContextPath());

		boolean autoLogin = "true".equals(startupParameters.getParameter("autologin")) || doAlwaysAutoLogin();
		DemoWorkbench.fixBug347967();
		Activator.log("remoteaddr=" + remoteAddr + " osversion=" + osversion + " ieversion=" + ieversion + " username="
				+ username + " cadtool=" + cadtool + " ownversion=" + ownversion);
		Display display = PlatformUI.createDisplay();
		display.disposeExec(new Runnable() {
			@Override
			public void run() {
				JSExecutor.executeJS("try {window.external.closeWindow();} catch (e) {}");
			}
		});

		// JSExecutor.executeJS(" if (parent)
		// {parent.raasSessionId=rwt.remote.Server.getInstance().getConnectionId();
		// alert('for parent='+rwt.remote.Server.getInstance().getConnectionId());}");

		// JSExecutor.executeJS("
		// window.parent.postMessage({'raasSessionId':rwt.remote.Server.getInstance().getConnectionId()},'*');
		// ");
		String g_path = CMSActivator.getSessionInstance().createDownloadUrl("REPLACEHERE") + "&filename="
				+ PreviewView.getScene3dName(new ArrayList<Artifact>());
		g_path = "'" + g_path.replace("REPLACEHERE", "'+event.data.loadPath+'") + "'";
		JSExecutor.executeJS(
				"window.addEventListener('message', function (event) { if (event.data.select3d) Array.prototype.slice.call(document.getElementsByTagName('iframe')).forEach(function(iframe) { iframe.contentWindow.postMessage(event.data, '*');   console.log('select3d='+event.data.select3d); }); else if (event.data.loadPath) document.getElementsByTagName('iframe')[0].contentWindow.postMessage({'g_path':"
						+ g_path + "}, '*'); }, false); ");

		// String dir = RAASUtils.getRAASProp("RAASSERVICEURL") + "threejs/";
		// JavaScriptLoader loader = RWT.getClient().getService(JavaScriptLoader.class);
		// loader.require(dir + "touchgen.js");

		// Display login dialog until logged in
		while (true) {
			String message = "Please sign in with your username and password:";
			final LoginDialog loginDialog = autoLogin ? null
					: new LoginDialog(display.getActiveShell(), "Login", message, "Architect", "Librarian", "Operator");
			int returnCode = autoLogin ? Window.OK : loginDialog.open();
			if (returnCode == Window.OK && checkAdditionalConditions(display)) {
				String userID = autoLogin ? getAutoLoginID() : loginDialog.getUsername();
				String password = autoLogin ? getAutoLoginPassword() : loginDialog.getPassword();
				org.raas4emf.cms.ui.CMSActivator.getSessionInstance().setCredentials(userID, password);
				CMSActivator.getSessionInstance();
				boolean retry = true;
				try {
					org.raas4emf.cms.ui.CMSActivator.getSessionInstance().getSession();
					if (!autoLogin && !"Architect".equals(userID) && !"o".equals(password)) {
						retry = false;
						throw new RuntimeException("Wrong user/password combination!");
					}
				} catch (Exception e) {
					IStatus status = new Status(IStatus.ERROR, "org.raas4emf.cms.ui", e.getMessage(), e);
					if (!retry) {
						ErrorDialog.openError(display.getActiveShell(), "Error", "DB Login was not successful!",
								status);
						break;
					}
					if (ErrorDialog.openError(display.getActiveShell(), "Error",
							"DB Login was not successful! Continue without DB connection?", status) != Dialog.OK) {
						break;
					}
				}
				// The user is authenticated, start the workbench
				WorkbenchAdvisor worbenchAdvisor = getWorkbenchAdvistor();
				int result = PlatformUI.createAndRunWorkbench(display, worbenchAdvisor);
				display.dispose();
				return result;
			}
			break;
		}
		// User authentication failed, stop application
		display.dispose();
		return PlatformUI.RETURN_EMERGENCY_CLOSE;
	}

	protected boolean checkAdditionalConditions(Display display) {
		return true;
	}

	protected boolean doAlwaysAutoLogin() {
		return false;
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

	@SuppressWarnings("restriction")
	public static void fixBug347967() {
		// https://bugs.eclipse.org/bugs/show_bug.cgi?id=347967
		try {
			Field advisorField = Workbench.getInstance().getClass().getDeclaredField("advisor");
			advisorField.setAccessible(true);
			if (advisorField.get(Workbench.getInstance()) == null) {
				advisorField.set(Workbench.getInstance(), new WorkbenchAdvisor() {

					@Override
					public String getInitialWindowPerspectiveId() {
						return null;
					}

					public synchronized AbstractStatusHandler getWorkbenchErrorHandler() {
						return new WorkbenchErrorHandler() {
							@Override
							public void handle(StatusAdapter statusAdapter, int style) {
								// do nothing!
							}

						};
					}
				});
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
