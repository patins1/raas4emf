/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Dictionary;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.ICoolBarManager;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.ToolBarContributionItem;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IPerspectiveRegistry;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.WorkbenchException;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.actions.ContributionItemFactory;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.browser.IWebBrowser;
import org.eclipse.ui.browser.IWorkbenchBrowserSupport;
import org.eclipse.ui.menus.IMenuService;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.Constants;
import org.raas4emf.cms.core.FileUtil;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.transformation.StreamGobbler;
import org.raas4emf.cms.transformation.TransformationUtils;
import org.raas4emf.cms.ui.actions.AddArtifactAction;
import org.raas4emf.cms.ui.actions.ComboInputDialog;
import org.raas4emf.cms.ui.actions.EditAction;
import org.raas4emf.cms.ui.actions.IsolateAction;
import org.raas4emf.cms.ui.actions.MemoDialog;
import org.raas4emf.cms.ui.actions.ZipAction;
import org.raas4emf.cms.ui.views.FilesView;
import org.raas4emf.cms.ui.views.PreviewView;
import org.raas4emf.cms.ui.views.TypeSelectionView;

import raascms.Artifact;
import raascms.Folder;

public class DemoActionBarAdvisor extends ActionBarAdvisor {

	public static final String USER_INTERFACE = "User-Interface";
	private static int typeActionsCount = 0;
	private IWebBrowser browser;
	private IWorkbenchAction exitAction;
	private Action aboutAction;
	private Action rapWebSiteAction;
	private MenuManager showViewMenuMgr;
	private IWorkbenchAction preferencesAction;
	private Action browserAction;
	private IWorkbenchAction resetPerspectiveAction;
	private List<Action> typeActions = new ArrayList<Action>();
	public IWorkbenchAction saveAction;
	private IWorkbenchAction saveAllAction;
	private IWorkbenchAction closeAction;
	private IWorkbenchAction closeAllAction;
	private Action showEclipseLogAction;
	private Action restartRAASServerAction;
	private Action changeProjectionModeAction;
	private Action changeFillModeAction;
	private List<Action> configActions = new ArrayList<Action>();
	private IToolBarManager mainToolBar;
	private Action loadBackup;
	private Action saveBackup;
	private Action changeRendererAction, change3dFormatAction;
	private Action shutdownServerAction;
	private Action promptAction;
	private Action generateFingerprintAction;
	private Action downloadDirectAction;
	private Action setPasswordList;
	private Action originalConfigAction;
	private static int browserIndex;

	public DemoActionBarAdvisor(final IActionBarConfigurer configurer) {
		super(configurer);
	}

	protected void makeActions(final IWorkbenchWindow window) {
		exitAction = ActionFactory.QUIT.create(window);
		register(exitAction);

		resetPerspectiveAction = ActionFactory.RESET_PERSPECTIVE.create(window);
		register(resetPerspectiveAction);
		resetPerspectiveAction.setText("Restore UI");

		saveAction = ActionFactory.SAVE.create(window);
		register(saveAction);

		saveAllAction = ActionFactory.SAVE_ALL.create(window);
		register(saveAllAction);

		closeAction = ActionFactory.CLOSE.create(window);
		register(closeAction);

		closeAllAction = ActionFactory.CLOSE_ALL.create(window);
		register(closeAllAction);

		preferencesAction = ActionFactory.PREFERENCES.create(window);
		register(preferencesAction);

		aboutAction = new Action() {
			public void run() {
				Shell shell = window.getShell();
				Bundle bundle = Platform.getBundle(CMSActivator.PLUGIN_ID);
				Dictionary<?, ?> headers = bundle.getHeaders();
				Object version = headers.get(Constants.BUNDLE_VERSION);
				MessageDialog.openInformation(shell, "RAAS Server", "RAAS version " + version);
			}
		};
		aboutAction.setText("About");
		aboutAction.setId("org.eclipse.rap.demo.about");
		register(aboutAction);

		rapWebSiteAction = new Action() {
			public void run() {
				IWorkbenchBrowserSupport browserSupport;
				browserSupport = PlatformUI.getWorkbench().getBrowserSupport();
				try {
					int style = IWorkbenchBrowserSupport.AS_EXTERNAL;
					browser = browserSupport.createBrowser(style, null, "", "");
					IWorkbenchPage page = window.getActivePage();
					IWorkbenchPart part = page.getActivePart();
					if (part != null)
						browser.openURL(new URL("https://sites.google.com/site/nolwebinterfacetutorial/home#" + part.getSite().getId().substring(part.getSite().getId().lastIndexOf('.') + 1)));
					else
						browser.openURL(new URL("https://sites.google.com/site/nolwebinterfacetutorial/home"));
					CMSActivator.log("title=" + part.getTitle());
					CMSActivator.log("id=" + part.getSite().getId());
				} catch (Exception e) {
					CMSActivator.err(e);
				}
			}
		};
		rapWebSiteAction.setText("Help");
		rapWebSiteAction.setId("org.eclipse.rap.demo.rapWebSite");
		register(rapWebSiteAction);
		showViewMenuMgr = new MenuManager("Show View", "showView");
		IContributionItem showViewMenu = ContributionItemFactory.VIEWS_SHORTLIST.create(window);
		showViewMenuMgr.add(showViewMenu);

		generateFingerprintAction = new Action() {
			public void run() {
				try {
					Shell shell = window.getShell();
					InputDialog dialog = new InputDialog(shell, "Password", "Enter password", "", null);
					if (dialog.open() == Window.OK) {
						String name = dialog.getValue();
						if (name.length() < 3) {
							MessageDialog.openError(shell, "Error", "Enter at least 3 characters!");
							return;
						}
						String fingerprint = RAASUIUtils.getFingerprint(name);
						MemoDialog.openInformation(shell, "Generated Fingerprint", fingerprint);
					}
					return;
				} catch (NoSuchAlgorithmException e) {
					CMSActivator.err(e);
				}

			}

		};
		generateFingerprintAction.setText("Generate Fingerprint");
		generateFingerprintAction.setId("org.raas4emf.cms.ui.GenerateFingerprintAction");
		register(generateFingerprintAction);

		downloadDirectAction = new Action() {
			public void run() {
				Shell shell = window.getShell();
				InputDialog dialog = new InputDialog(shell, "Specify Name", "Enter name for file", null, null);
				if (dialog.open() == Window.OK) {
					String name = dialog.getValue();
					File file = new File(name);
					if (file.isDirectory()) {
						String list = "";
						for (String child : file.list()) {
							File f = new File(file, child);
							list += f + " canExecute=" + f.canExecute() + " canRead=" + f.canRead() + " canWrite=" + f.canWrite() + "\n";
						}
						MemoDialog.openInformation(window.getShell(), "Directory contents", list);

					} else
						CMSActivator.getSessionInstance().exportFolderContents(file);
				}
			}

		};
		downloadDirectAction.setText("Download Direct");
		downloadDirectAction.setId("org.raas4emf.cms.ui.DownloadDirectAction");
		register(downloadDirectAction);

		setPasswordList = new Action() {
			public void run() {
				Shell shell = window.getShell();
				MemoDialog dialog = new MemoDialog(shell, "Enter password list", CMSActivator.getSessionInstance().getPasswordList()) {

					@Override
					protected Point getInitialSize() {
						return new Point(400, 400);
					}

				};
				dialog.setEditable(true);
				if (dialog.open() == 0) {
					CMSActivator.getSessionInstance().setPasswordList(dialog.getValue());
				}

			}
		};
		setPasswordList.setText("Set Password List");
		setPasswordList.setId("org.raas4emf.cms.ui.SetPasswordList");
		register(setPasswordList);
		CMSActivator.getSessionInstance().loadPasswordList();

		showEclipseLogAction = new Action() {
			public void run() {
				try {
					File file = Platform.getLogFileLocation().toFile();
					MemoDialog.openInformation(window.getShell(), "Eclipse Log", "File=" + file);
					MemoDialog.openInformation(window.getShell(), "Eclipse Log", TransformationUtils.stringFromFile(file));
				} catch (IOException e) {
					MemoDialog.openInformation(window.getShell(), "Error", e.getMessage());
					throw new RuntimeException(e);
				}
			}
		};
		showEclipseLogAction.setText("Show Eclipse Log");
		showEclipseLogAction.setId("org.raas4emf.cms.ui.ShowEclipseLogAction");
		register(showEclipseLogAction);

		changeProjectionModeAction = new Action() {
			public void run() {
				ComboInputDialog inputdialog = new ComboInputDialog(new String[] { "Orthogonal", "3d" }, window.getShell(), "Change WebGL Projection Mode", "Select projection mode:", "", null);
				if (inputdialog.open() == Window.OK) {
					boolean ortho = "Orthogonal".equals(inputdialog.getValue());
					CMSActivator.getSessionInstance().setOrtho(ortho);
					for (PreviewView preview : PreviewView.findView()) {
						preview.changeProjectionMode(ortho);
					}
				}
			}
		};
		changeProjectionModeAction.setText("Change Projection Mode");
		changeProjectionModeAction.setId("org.raas4emf.cms.ui.ChangeProjectionModeAction");
		register(changeProjectionModeAction);

		changeFillModeAction = new Action() {
			public void run() {
				ComboInputDialog inputdialog = new ComboInputDialog(new String[] { "Point", "Wireframe", "Solid" }, window.getShell(), "Change WebGL Fill Mode", "Select fill mode:", CMSActivator.getSessionInstance().getFillMode(), null);
				if (inputdialog.open() == Window.OK) {
					String fillMode = inputdialog.getValue();
					CMSActivator.getSessionInstance().setFillMode(fillMode);
					for (PreviewView preview : PreviewView.findView()) {
						preview.changeFillMode(fillMode);
					}
				}
			}
		};
		changeFillModeAction.setText("Change Fill Mode");
		changeFillModeAction.setId("org.raas4emf.cms.ui.ChangeFillModeAction");
		register(changeFillModeAction);

		changeRendererAction = new Action() {
			public void run() {
				ComboInputDialog inputdialog = new ComboInputDialog(new String[] { "O3D - WebGL", "three.js - WebGL", "three.js - Canvas" }, window.getShell(), "Change WebGL Renderer", "Select renderer:", CMSActivator.getSessionInstance().getRenderer(), null);
				if (inputdialog.open() == Window.OK) {
					String renderer = inputdialog.getValue();
					CMSActivator.getSessionInstance().setRenderer(renderer);
					for (PreviewView preview : PreviewView.findView()) {
						preview.reload();
					}
				}
			}
		};
		changeRendererAction.setText("Change Renderer");
		changeRendererAction.setId("org.raas4emf.cms.ui.ChangeRendererAction");
		register(changeRendererAction);

		change3dFormatAction = new Action() {
			public void run() {
				ComboInputDialog inputdialog = new ComboInputDialog(new String[] { ".js - three.js internal JSON format", ".dae - COLLADA", ".obj - Wafefront" }, window.getShell(), "Change 3D format", "Select 3D file format:", CMSActivator.getSessionInstance().get3dFormat(), null);
				if (inputdialog.open() == Window.OK) {
					String format = inputdialog.getValue();
					CMSActivator.getSessionInstance().set3dFormat(format);
					for (PreviewView preview : PreviewView.findView()) {
						preview.reload();
					}
				}
			}
		};
		change3dFormatAction.setText("Change 3D Format");
		change3dFormatAction.setId("org.raas4emf.cms.ui.Change3dFormatAction");
		register(change3dFormatAction);

		restartRAASServerAction = new Action() {
			public void run() {
				if (MessageDialog.openQuestion(window.getShell(), "", "Do you really want to restart the server?")) {
					try {
						Runtime.getRuntime().exec("cmd /c start C:" + RAASUtils.ROOTPATH.replace('/', '\\') + "\\update_and_restart.bat");
					} catch (IOException e) {
						CMSActivator.err(e);
					}
				}
			}
		};
		restartRAASServerAction.setText("Restart RaaS Server");
		restartRAASServerAction.setId("org.raas4emf.cms.ui.RestartRAASServerAction");
		register(restartRAASServerAction);

		promptAction = new Action() {
			public void run() {
				String cmd = "";
				InputDialog dialog;
				while ((dialog = new InputDialog(window.getShell(), "Prompt", "Execute command:", cmd, null)).open() == Window.OK) {
					final StringBuffer sb = new StringBuffer();
					try {
						cmd = dialog.getValue();
						if (cmd.startsWith("platform:")) {
							URL fileURL = new URL(cmd);
							URL u = FileLocator.resolve(fileURL);
							String fileName = u.getFile();
							MemoDialog.openInformation(window.getShell(), "Resolve", fileName);
							return;
						}
						if (cmd.startsWith("setExecutable ")) {
							File file = new File(cmd.substring("setExecutable ".length()));
							try {
								MessageDialog.openInformation(window.getShell(), "Result", "setExecutable returned" + file.setExecutable(true));
							} catch (Throwable e) {
								MessageDialog.openError(window.getShell(), "Error", e.getMessage());
							}
							return;
						}

						if (cmd.equals("upload")) {

							FileDialog fileDialog = new FileDialog(window.getShell(), SWT.TITLE | SWT.MULTI);
							fileDialog.setFilterNames(new String[] { "All Files" });
							fileDialog.setFilterExtensions(new String[] { "*.*" });
							fileDialog.setText("Upload Files Into Workspace");
							fileDialog.setFilterIndex(0);
							if (fileDialog.open() == null)
								return;
							final String[] fileNames = fileDialog.getFileNames();
							int i = 0;
							for (String f : fileNames) {
								if (!new File(f).exists()) {
									fileNames[i] = f = new File(new File(fileDialog.getFilterPath()), f).toString();
								}
								i++;
							}
							for (String f : fileNames) {
								File file = new File(f);
								File targetFile = new File(Platform.getLocation().toFile(), file.getName());
								FileUtil.inputstreamToOutputstream(new FileInputStream(file), new FileOutputStream(targetFile));
								CMSActivator.log("Uploaded as " + targetFile);
							}

							return;
						}

						Process process = Runtime.getRuntime().exec(cmd, new String[] { "LD_LIBRARY_PATH=" + System.getProperty("LD_LIBRARY_PATH") });
						StreamGobbler outputGobbler = new StreamGobbler(process.getInputStream(), "OUTPUT") {

							@Override
							protected void println(String line) {
								super.println(line);
								sb.append("OUTPUT" + ">" + line + "\n");
							}

						};

						StreamGobbler errorGobbler = new StreamGobbler(process.getErrorStream(), "ERROR") {

							@Override
							protected void println(String line) {
								super.println(line);
								sb.append("ERROR" + ">" + line + "\n");
							}

						};

						outputGobbler.start();
						errorGobbler.start();
						process.waitFor();
						int exitValue = process.exitValue();
						MemoDialog.openInformation(window.getShell(), "Prompt result", "Exit code=" + exitValue + "\n" + sb.toString());

					} catch (Exception e) {
						MessageDialog.openError(window.getShell(), "Exception occured", e.getMessage() + "\n" + sb.toString());
						CMSActivator.err(sb.toString(), e);
					}
				}
			}
		};
		promptAction.setText("Execute Prompt Command");
		promptAction.setId("org.raas4emf.cms.ui.PromptAction");
		register(promptAction);

		shutdownServerAction = new Action() {
			public void run() {
				if (MessageDialog.openQuestion(window.getShell(), "", "Do you really want to shutdown the server?")) {
					CMSActivator.dbapp.stop();
					window.close();
				}
			}
		};
		shutdownServerAction.setText("Shutdown RaaS Server");
		shutdownServerAction.setToolTipText("Shudown database and web ui");
		shutdownServerAction.setId("org.raas4emf.cms.ui.ShutdownRaaSServerAction");
		register(shutdownServerAction);

		loadBackup = new Action() {
			public void run() {
				try {
					Folder repoRoot = (Folder) RAASUIUtils.findByPath("RepositoryRoot");
					if (repoRoot == null)
						MessageDialog.openError(window.getShell(), "Error", "Cannot find root folder \"RepositoryRoot\". Your database may be corrupt.");
					new AddArtifactAction().execute(repoRoot, window.getShell(), true, new Runnable() {

						@Override
						public void run() {
							window.getShell().getDisplay().asyncExec(new Runnable() {
								public void run() {
									originalConfigAction.run();
								}
							});

						}
					});
				} catch (Exception e) {
					MessageDialog.openError(window.getShell(), "Error", e.getMessage());
					CMSActivator.err(e);
				}
			}
		};
		loadBackup.setText("Load database from zip file");
		loadBackup.setToolTipText("Performs file download to the root folder");
		loadBackup.setId("org.raas4emf.cms.ui.LoadBackupAction");
		register(loadBackup);

		saveBackup = new Action() {
			public void run() {
				try {
					List<EObject> selection = new ArrayList<EObject>();
					Folder root = (Folder) RAASUIUtils.findByPath("RepositoryRoot");
					selection.addAll(root.getArtifacts());
					for (Folder folder : root.getFolders())
						if (!FilesView.RECYCLE_BIN.equals(folder.getName()))
							selection.add(folder);
					new ZipAction().execute(window, selection);
				} catch (ExecutionException e) {
					CMSActivator.err(e);
				}
			}
		};
		saveBackup.setText("Save database to zip file");
		saveBackup.setId("org.raas4emf.cms.ui.SaveBackupAction");
		register(saveBackup);

		final File raasServerDir = new File(RAASUtils.ROOTPATH);
		String[] list = raasServerDir.list();
		if (list == null)
			list = new String[] {};
		for (final String filename : list) {
			if (filename.endsWith(".ini") && filename.startsWith("config")) {
				Action configAction = new Action() {
					public void run() {
						try {
							try {
								// clear UI
								IWorkbenchPage page = window.getActivePage();
								if (page != null) {
									if (!page.closeAllEditors(true))
										return;
								}
								mainToolBar.removeAll();
								for (IViewPart view : IsolateAction.findView(null, null, false, true)) {
									if (view instanceof IInputChanged)
										((IInputChanged) view).clearInput();
								}
								// change config
								if (!"config.ini".equals(filename)) {
									String newContent = TransformationUtils.stringFromFile(new File(raasServerDir, filename));
									TransformationUtils.stringToFile(new File(raasServerDir, "config.ini"), newContent);
								}
								CMSActivator.getSessionInstance().resetDBConnection();
								CMSActivator.getSessionInstance().openTransaction();
								// update UI
								for (IViewPart view : IsolateAction.findView(null, null, false, true)) {
									if (view instanceof IInputChanged)
										((IInputChanged) view).updateInput();
								}
								buildUserInterface(window);
								for (Action action : typeActions)
									mainToolBar.add(action);
							} finally {
								getActionBarConfigurer().getCoolBarManager().update(true);
							}
						} catch (Exception e) {
							IStatus status = new Status(IStatus.ERROR, "org.raas4emf.cms.ui", e.getMessage(), e);
							ErrorDialog.openError(window.getShell(), "Error", "DB Login was not successful!", status);
						}
					}
				};
				configAction.setText("Load \"" + filename + "\"");
				configAction.setToolTipText("Replaces config.ini in " + RAASUtils.ROOTPATH + " by " + filename);
				configActions.add(configAction);
				if ("config.ini".equals(filename)) {
					originalConfigAction = configAction;
				}
			}
		}

		browserAction = new Action() {
			public void run() {
				browserIndex++;
				try {
					window.getActivePage().showView(PreviewView.ID, String.valueOf(browserIndex), IWorkbenchPage.VIEW_ACTIVATE);
				} catch (PartInitException e) {
					CMSActivator.err(e);
				}
			}
		};
		browserAction.setText("Open new Preview View");
		browserAction.setId("org.eclipse.rap.demo.browser");
		register(browserAction);

		buildUserInterface(window);
	}

	private void buildUserInterface(final IWorkbenchWindow window) {
		typeActions.clear();

		Action mainMenu = new Action() {
		};
		mainMenu.setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(CMSActivator.PLUGIN_ID, "icons/MenuItem.gif"));
		mainMenu.setMenuCreator(new MenuCreator() {

			@Override
			protected void fillMenu(MenuManager dropDownMenuMgr) {
				fillMenuBar(dropDownMenuMgr);
			}

		});
		typeActions.add(mainMenu);

		final Action perspectiveMenu = new Action() {
		};
		perspectiveMenu.setDescription("Change Perspective");
		perspectiveMenu.setImageDescriptor(AbstractUIPlugin.imageDescriptorFromPlugin(CMSActivator.PLUGIN_ID, "icons/new_persp.gif"));
		perspectiveMenu.setMenuCreator(new MenuCreator() {

			@Override
			protected void fillMenu(MenuManager dropDownMenuMgr) {
				IPerspectiveRegistry registry = window.getWorkbench().getPerspectiveRegistry();
				for (final IPerspectiveDescriptor pers : registry.getPerspectives()) {
					final Action persAction = new Action(pers.getLabel(), IAction.AS_RADIO_BUTTON) {
						public void run() {
							try {
								if (this.isChecked())
									window.getWorkbench().showPerspective(pers.getId(), window);
							} catch (WorkbenchException e) {
								CMSActivator.err(e);
							}
						}
					};
					persAction.setChecked(pers.getId().equals(window.getActivePage().getPerspective().getId()));
					dropDownMenuMgr.add(persAction);
				}
			}

		});
		typeActions.add(perspectiveMenu);

		loadMenuFromDatabase();
	}

	protected void loadMenuFromDatabase() {
		try {
			EObject userInterface = RAASUIUtils.findByPath("RepositoryRoot", "Experiments", USER_INTERFACE);
			if (userInterface instanceof Folder) {
				Folder folder = (Folder) userInterface;
				List<Folder> sortedFolders = new ArrayList<Folder>(folder.getFolders());
				Collections.sort(sortedFolders, new Comparator<Folder>() {
					@Override
					public int compare(Folder o1, Folder o2) {
						return o1.getName().compareTo(o2.getName());
					}
				});
				for (final Folder typeFolder : sortedFolders) {
					final String type = typeFolder.getName().length() > 3 ? typeFolder.getName().substring(3) : typeFolder.getName();
					Action typeAction = new Action() {
						public void run() {
							TypeSelectionView.selectType(type);
						}
					};
					if (addImage(typeFolder, typeAction))
						typeAction.setToolTipText(type);
					else
						typeAction.setText(type);
					typeAction.setId("org.raas4emf.cms.ui.toolType" + typeActionsCount++);
					register(typeAction);
					createSubMenu(typeFolder, typeAction, type);
					typeActions.add(typeAction);
				}
			}
		} catch (Exception e) {
			// do nothing
		}
	}

	private void createSubMenu(final Folder typeFolder, Action typeAction, final String mainType) {
		if (typeFolder.getFolders().isEmpty())
			return;
		typeAction.setMenuCreator(new MenuCreator() {

			@Override
			protected void fillMenu(MenuManager dropDownMenuMgr) {
				for (final Folder subTypeFolder : typeFolder.getFolders()) {

					final String subtype = subTypeFolder.getName();
					Action subtypeAction = new Action(subtype) {
						public void run() {
							if (RAASUtils.getPropertiesFile(subTypeFolder) != null)
								EditAction.openEditor(new StructuredSelection(subTypeFolder));
							else
								TypeSelectionView.selectType(mainType + " " + subtype);
						}
					};
					subtypeAction.setId("org.raas4emf.cms.ui.toolSubType" + +typeActionsCount++);
					register(subtypeAction);
					createSubMenu(subTypeFolder, subtypeAction, mainType);
					addImage(subTypeFolder, subtypeAction);
					dropDownMenuMgr.add(subtypeAction);
				}
			}
		});
	}

	private boolean addImage(final Folder typeFolder, Action typeAction) {
		for (Artifact artifact : typeFolder.getArtifacts()) {
			if (PreviewView.isImage(artifact)) {
				String url = CMSActivator.getSessionInstance().createFullDownloadUrl(artifact);
				try {
					if (url != null)
						typeAction.setImageDescriptor(ImageDescriptor.createFromURL(new URL(url)));
				} catch (MalformedURLException e) {
					CMSActivator.err(e);
				}
				return true;
			}
		}
		return false;
	}

	protected void fillMenuBar(final IMenuManager menuBar) {
		MenuManager fileMenu = new MenuManager("File", IWorkbenchActionConstants.M_FILE);
		MenuManager windowMenu = new MenuManager("Window", IWorkbenchActionConstants.M_WINDOW);
		MenuManager helpMenu = new MenuManager("Help", IWorkbenchActionConstants.M_HELP);
		MenuManager adminMenu = new MenuManager("Administrator", "org.raas4emf.cms.ui.main.menu.administrator");
		MenuManager webGlMenu = new MenuManager("WebGL");
		MenuManager permisssionsMenu = new MenuManager("Permissions", "org.raas4emf.cms.ui.main.menu.permissions");
		menuBar.add(fileMenu);
		fileMenu.add(saveAction);
		fileMenu.add(saveAllAction);
		fileMenu.add(closeAction);
		fileMenu.add(closeAllAction);
		fileMenu.add(downloadDirectAction);
		if (CMSActivator.getSessionInstance().isOperator())
			fileMenu.add(adminMenu);
		permisssionsMenu.add(generateFingerprintAction);
		permisssionsMenu.add(setPasswordList);
		fileMenu.add(permisssionsMenu);
		fileMenu.add(exitAction);

		IMenuService service = (IMenuService) PlatformUI.getWorkbench().getService(IMenuService.class);
		service.populateContributionManager(fileMenu, "popup:" + fileMenu.getId());

		adminMenu.add(restartRAASServerAction);
		adminMenu.add(shutdownServerAction);
		adminMenu.add(showEclipseLogAction);
		adminMenu.add(promptAction);
		adminMenu.add(loadBackup);
		adminMenu.add(saveBackup);
		for (Action action : configActions)
			adminMenu.add(action);
		webGlMenu.add(changeProjectionModeAction);
		webGlMenu.add(changeFillModeAction);
		webGlMenu.add(changeRendererAction);
		webGlMenu.add(change3dFormatAction);
		windowMenu.add(showViewMenuMgr);
		windowMenu.add(preferencesAction);
		windowMenu.add(resetPerspectiveAction);
		windowMenu.add(browserAction);
		windowMenu.add(webGlMenu);
		menuBar.add(windowMenu);
		menuBar.add(helpMenu);
		helpMenu.add(rapWebSiteAction);
		helpMenu.add(new Separator("about"));
		helpMenu.add(aboutAction);
	}

	protected void fillCoolBar(final ICoolBarManager coolBar) {
		mainToolBar = createToolBar(coolBar, "main");
		// editorToolBar = createToolBar(coolBar, "editor");
	}

	private IToolBarManager createToolBar(final ICoolBarManager coolBar, final String name) {
		IToolBarManager toolbar = new ToolBarManager(SWT.FLAT | SWT.RIGHT);
		coolBar.add(new ToolBarContributionItem(toolbar, name));
		if (name != "editor") {
			// toolbar.add( wizardAction );
			// toolbar.add(browserAction);
			// toolbar.add(rapWebSiteAction);
			// toolbar.add(aboutAction);
			// toolbar.add(exitAction);
			for (Action action : typeActions)
				toolbar.add(action);
		} else {
			// toolbar.add( newEditorAction );
			// toolbar.add(saveAction);
			// toolbar.add(saveAllAction);
		}
		return toolbar;
	}

	protected void fillStatusLine(final IStatusLineManager statusLine) {
		// statusLine.add(aboutAction);
	}
}
