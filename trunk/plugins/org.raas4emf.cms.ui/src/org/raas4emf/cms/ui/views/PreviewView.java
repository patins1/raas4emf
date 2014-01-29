/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.views;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SafeRunner;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.util.SafeRunnable;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWTException;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.BrowserFunction;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.raas4emf.cms.core.FileUtil;
import org.raas4emf.cms.core.IGeometricCenter;
import org.raas4emf.cms.core.IGeometricClick;
import org.raas4emf.cms.core.IGeometricDoubleClick;
import org.raas4emf.cms.core.IGeometricDrop;
import org.raas4emf.cms.core.IGeometricHighlighter;
import org.raas4emf.cms.core.IGeometricIDBuilder;
import org.raas4emf.cms.core.IGeometricIDResolver;
import org.raas4emf.cms.core.IGeometricSelectionResolver;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.core.geometry.BoundingBoxXYZ;
import org.raas4emf.cms.core.geometry.XYZ;
import org.raas4emf.cms.ui.CMSActivator;
import org.raas4emf.cms.ui.actions.GeometryJob;
import org.raas4emf.cms.ui.actions.IsolateAction;
import org.raas4emf.cms.ui.graf.GrafUtil;

import raascms.Artifact;
import raascms.Folder;

public class PreviewView extends ViewPart implements ISelectionProvider, ISelectionListener {

	public static final String ID = PreviewView.class.getName();
	public Browser browser;

	List<ISelectionChangedListener> listeners = new ArrayList<ISelectionChangedListener>();
	boolean causedSelection = false;

	ISelection theSelection = StructuredSelection.EMPTY;
	private List<Artifact> currentlyDisplayedArtifact = Collections.emptyList();
	private int artifactsToProcess;
	private MenuManager menuMgr;
	private Menu menu;
	public String attachedOnLoad = null;

	public String attachedImmediately = null;

	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		listeners.add(listener);
	}

	public ISelection getSelection() {
		return theSelection;
	}

	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		listeners.remove(listener);
	}

	public void setSelection(ISelection selection) {
		theSelection = selection;
		final SelectionChangedEvent e = new SelectionChangedEvent(this, selection);
		Object[] listenersArray = listeners.toArray();

		for (int i = 0; i < listenersArray.length; i++) {
			final ISelectionChangedListener l = (ISelectionChangedListener) listenersArray[i];
			SafeRunner.run(new SafeRunnable() {

				public void run() {
					l.selectionChanged(e);
				}
			});
		}
	}

	public void createPartControl(final Composite parent) {
		browser = new Browser(parent, CMSActivator.getSessionInstance().getBrowserType());
		selectionChanged(null, getSite().getPage().getSelection());
		getSite().getPage().addSelectionListener(this);
		getSite().setSelectionProvider(this);

		IActionBars actionBars = ((IViewSite) getSite()).getActionBars();
		menuMgr = (MenuManager) actionBars.getMenuManager();
		menuMgr.setRemoveAllWhenShown(true);
		getSite().registerContextMenu(menuMgr, this);
	}

	public void setFocus() {
		if (!browser.isDisposed()) {
			browser.setFocus();
			browser.execute("window.focus();");
		}
	}

	@Override
	public void dispose() {
		getSite().getPage().removeSelectionListener(this);
		super.dispose();
	}

	public void selectionChanged(final IWorkbenchPart part, final ISelection selection) {
		if (selection != null && !selection.equals(getSelection()) && !causedSelection && !browser.isDisposed() && browser.isVisible()) {
			if (selection instanceof IStructuredSelection) {
				IStructuredSelection sselection = (IStructuredSelection) selection;
				if (loadSelectionIntoBrowser(sselection))
					theSelection = selection;
			}
		}
	}

	protected boolean loadSelectionIntoBrowser(IStructuredSelection sselection) {
		Object[] array = sselection.toArray();
		List<Artifact> candWebGL = new ArrayList<Artifact>();
		List<Artifact> candImage = new ArrayList<Artifact>();
		for (Object object : array) {
			if (object instanceof Folder) {
				Folder folder = (Folder) object;
				boolean isGeometryModel = false;
				for (Artifact artifact : folder.getArtifacts()) {
					if (isGeometryModel(Arrays.asList(artifact)) && artifact.getName().startsWith("index.")) {
						candWebGL.add(artifact);
						isGeometryModel = true;
						break;
					}
				}
				if (!isGeometryModel) {
					for (Artifact artifact : folder.getArtifacts()) {
						if (isGeometryModel(Arrays.asList(artifact))) {
							candWebGL.add(artifact);
							break;
						}
					}
				}
				boolean isImageModel = false;
				for (Artifact artifact : folder.getArtifacts()) {
					if (isImage(artifact)) {
						candImage.add(artifact);
						isImageModel = true;
						break;
					}
				}
				if (!isImageModel) {
					for (Artifact artifact : folder.getArtifacts()) {
						if (isImage(artifact) && artifact.getName().startsWith("index.")) {
							candImage.add(artifact);
							break;
						}
					}
				}
			}
			if (object instanceof Artifact) {
				Artifact artifact = (Artifact) object;
				if (isGeometryModel(Arrays.asList(artifact)) || isCollada(Arrays.asList(artifact))) {
					candWebGL.add(artifact);
				}
				if (isImage(artifact)) {
					candImage.add(artifact);
				}
			}
		}
		if (!candWebGL.isEmpty() && canDisplayWebGL()) {
			return processAsSet(candWebGL);
		}
		if (!candImage.isEmpty()) {
			return processImage(candImage.get(0));
		}
		if (!candWebGL.isEmpty() && !canDisplayWebGL()) {
			browser.setText("Internet Explorer version 9 or higher required, but found version " + CMSActivator.getSessionInstance().getIEVersion());
			return true;
		}
		Set<EObject> roots = new HashSet<EObject>();
		Artifact modelArtifact = null;
		for (Object object : array) {
			Object adapted = Platform.getAdapterManager().getAdapter(object, IGeometricHighlighter.class);
			if (adapted instanceof IGeometricHighlighter) {
				IGeometricHighlighter iGeometricHighlighter = (IGeometricHighlighter) adapted;
				if (currentlyDisplayedArtifact.contains(iGeometricHighlighter.getModelArtifact())) {
					roots.addAll(iGeometricHighlighter.getElementsToHighlight());
					modelArtifact = iGeometricHighlighter.getModelArtifact();
				}
			}
			if (object instanceof EObject) {
				EObject eRoot = (EObject) object;
				roots.add(eRoot);
			}
		}
		return selectShape(roots, modelArtifact);
	}

	public boolean selectShape(Collection<? extends EObject> roots, Artifact modelArtifact) {
		return executeF("selectShape", roots, modelArtifact);
	}

	private static String executeFJavaScript(String f, Collection<? extends EObject> eObjects, Artifact artifact) {
		StringBuffer buf = new StringBuffer();
		for (EObject eObject : eObjects) {
			Object adapter = Platform.getAdapterManager().getAdapter(eObject, IGeometricIDBuilder.class);
			if (adapter instanceof IGeometricIDBuilder) {
				IGeometricIDBuilder iGeometricIDBuilder = (IGeometricIDBuilder) adapter;
				String id = iGeometricIDBuilder.buildID();
				if (id != null)
					buf.append("'" + id + "',");
			}
		}
		if (artifact == null)
			artifact = getArtifact(eObjects);
		if (artifact != null && artifact.cdoID() != null) {
			return f + "([" + RAASUtils.pruneLastChar(buf.toString()) + "],'" + artifact.cdoID().toURIFragment() + "');";
		}
		return null;
	}

	private boolean executeF(String f, Collection<? extends EObject> array, Artifact artifact) {
		if (artifact == null)
			artifact = getArtifact(array);
		String js = executeFJavaScript(f, array, artifact);
		return evaluate(js, artifact);
	}

	/**
	 * Draws lines connecting the given point.
	 * 
	 * @param modelArtifact
	 * @param pts
	 *            may contain <code>null</code> after which a new polyline is started
	 * @param prefix
	 * @param message
	 * @return
	 */
	static public String doDrawLines(Artifact modelArtifact, List<XYZ> pts, Map<XYZ, Object> infos, String prefix, String message) {
		System.out.println("Draw lines begins, length=" + pts.size());
		String artifactId = modelArtifact.cdoID().toURIFragment();
		StringBuffer buf = new StringBuffer();
		for (XYZ xyz : pts) {
			if (xyz == null)
				buf.append("null,");
			else {
				buf.append(xyz.toMillimeters());
				Object info = infos.get(xyz);
				buf.append(info instanceof String ? ("'" + info + "',") : (info + ","));
			}
		}
		if (artifactId != null) {
			try {
				return "printLines([" + RAASUtils.pruneLastChar(buf.toString()) + "],'" + artifactId + "','" + prefix + "','" + message + "');";
			} catch (SWTException e) {
				System.out.println("Could not execute printLines()");
			}
		}
		return null;
	}

	public void drawLines(String command) {
		long start = System.currentTimeMillis();
		if (command != null) {
			try {
				browser.evaluate(command);
			} catch (SWTException e) {
				System.out.println("Could not execute printLines()");
			}
		}
		System.out.println("Draw lines ends, elapsed=" + (System.currentTimeMillis() - start));
	}

	/**
	 * Draws cameras
	 * 
	 * @param artifact
	 * @param pts
	 *            may contain <code>null</code> after which a new camera is started
	 */
	public void drawCameras(Artifact artifact, String ids) {
		String artifactId = artifact.cdoID().toURIFragment();
		if (artifactId != null) {
			try {
				browser.evaluate("printCameras([" + RAASUtils.pruneLastChar(ids) + "],'" + artifactId + "');");
			} catch (SWTException e) {
				System.out.println("Could not execute printCameras()");
			}
		}
	}

	public void changeFillMode(String mode_string) {
		for (Artifact artifact : currentlyDisplayedArtifact) {
			String artifactId = artifact.cdoID().toURIFragment();
			if (artifactId != null) {
				try {
					browser.evaluate("changeFillMode('" + mode_string + "','" + artifactId + "');");
				} catch (SWTException e) {
					System.out.println("Could not execute changeFillMode()");
				}
			}
		}
	}

	public void changeProjectionMode(boolean orthogonal) {
		for (Artifact artifact : currentlyDisplayedArtifact) {
			String artifactId = artifact.cdoID().toURIFragment();
			if (artifactId != null) {
				try {
					browser.evaluate("changeProjectionMode(" + orthogonal + ",'" + artifactId + "');");
				} catch (SWTException e) {
					System.out.println("Could not execute changeProjectionMode()");
				}
			}
		}
	}

	static public Artifact getArtifact(EObject parent) {
		while (parent != null) {
			if (parent instanceof Artifact) {
				Artifact artifact = (Artifact) parent;
				return artifact;
			}
			parent = parent.eContainer();
		}
		return null;
	}

	static public Artifact getArtifact(Collection<? extends EObject> eObjects) {
		for (EObject parent : eObjects) {
			while (parent != null) {
				if (parent instanceof Artifact) {
					Artifact artifact = (Artifact) parent;
					return artifact;
				}
				parent = parent.eContainer();
			}
		}
		return null;
	}

	static public boolean canBePreviewed(Artifact artifact) {
		return isImage(artifact) || isWebGL(Arrays.asList(artifact)) || isCollada(Arrays.asList(artifact)) || isGeometryModel(Arrays.asList(artifact));
	}

	private boolean processImage(Artifact artifact) {
		if (isImage(artifact) && !alreadyDisplayed(true, Arrays.asList(artifact))) {
			String url = LinksView.getArtifactUri(artifact);
			StringBuilder html = new StringBuilder();
			if (isPdf(artifact)) {
				html.append("<object data=\"" + url + "\" type=\"application/pdf\" width=\"100%\" height=\"100%\">");
				html.append("<p>Your web browser doesn't have a PDF plugin. Instead you can <a href=\"" + url + "\">click here to download the PDF file.</a></p>");
				html.append("</object>");
			} else if (RAASUtils.hasExtension(artifact, ".html")) {
				try {
					html.append(FileUtil.inputstreamToString(artifact.asFile("index.html")));
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else {
				html.append("<img alt=\"[Preview image]\" src=\"");
				html.append(url);
				html.append("\">");
			}
			browser.setText(html.toString());
			currentlyDisplayedArtifact = Arrays.asList(artifact);
			return true;
		}
		return false;
	}

	private boolean canDisplayWebGL() {
		Integer ieVersion = CMSActivator.getSessionInstance().getIEVersion();
		return ieVersion == null || ieVersion >= 9;
	}

	private boolean processWebGL(final List<Artifact> artifacts) {
		if ((isWebGL(artifacts) || isCollada(artifacts) || isGeometryModel(artifacts)) && !alreadyDisplayed(true, artifacts)) {
			currentlyDisplayedArtifact = artifacts;
			final boolean doThreejs = isThreeJS();
			String renderer = CMSActivator.getSessionInstance().getRenderer().toLowerCase();
			String dir = CMSActivator.getSessionInstance().get3dRendererUrl();
			String ids = "";
			for (Artifact artifact : artifacts) {
				ids += "," + artifact.cdoID().toURIFragment();
			}
			final String fids = ids.substring(1);
			String g_path = CMSActivator.getSessionInstance().createDownloadUrl(fids) + "&filename=" + getScene3dName();
			// scroll bar for safari & chrome
			String scss = "";
			scss += "::-webkit-scrollbar {width: 25px; height: 25px;}\n";
			scss += "::-webkit-scrollbar-button:start:decrement, ::-webkit-scrollbar-button:end:increment {height: 1px; display: block; background-color: #EFF7FF;}\n";
			scss += "::-webkit-scrollbar-button:horizontal:start:decrement, ::-webkit-scrollbar-button:horizontal:end:increment {height: 1px; display: block; background-color: #EFF7FF;}\n";
			scss += "::-webkit-scrollbar-track-piece {background-color: #EFF7FF;}\n";
			scss += "::-webkit-scrollbar-thumb:vertical, ::-webkit-scrollbar-thumb:horizontal, button {background-color: white; border: 1px solid #639ACE; -webkit-border-radius: 6px; }\n";
			scss += "#progress { z-index:20; color:red; top:7em; width: 100%; font-size:3em; font-variant:small-caps; font-weight:bold; position:absolute; z-index:100; text-align: center; text-shadow: #000 0px 0px 10px; display:none; }";
			scss += ".shadow {-moz-box-shadow: 0px 0px 5px #000; -webkit-box-shadow: 0px 0px 5px #000; box-shadow: 0px 0px 5px #000; }\n";
			scss += "#progressbar { text-align: center; background: white; width: 250px; height: 10px; }\n";
			scss += "#bar { background:#d00; width:0px; height:10px; }\n";

			String colors = CMSActivator.getSessionInstance().getColors();
			if (colors == null) {
				Folder folder = (Folder) artifacts.get(0).eContainer();
				colors = RAASUtils.getDefaultConfig(folder, "default.colorscheme");
			}

			if (attachedOnLoad == null)
				attachedOnLoad = "";

			String text = "";
			text += "<!DOCTYPE html>";
			text += "<html lang=\"en\">";
			text += "	<head>";
			text += "		<title>RAAS Viewer</title>";
			text += "		<meta charset=\"utf-8\">";
			text += "		<meta name=\"viewport\" content=\"width=device-width, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0\">";
			text += "<style type=\"text/css\">";
			text += scss;
			text += "html, body {margin: 0; padding: 0; border: 0; height: 100%; }</style>\n";
			if (colors != null)
				attachedOnLoad += "g_colors=" + colors + ";\n";
			text += "		<script src=\"" + dir + "../requirejs-plugins/lib/require.js\"></script> <!-- include require.js library -->";
			text += "		<script type=\"text/javascript\" id=\"o3dscript\">var g_path=\"" + g_path + "\";</script>\n";
			text += "<script type=\"text/javascript\">var g_ortho=" + CMSActivator.getSessionInstance().getOrtho() + ";</script>\n";
			text += "<script type=\"text/javascript\">var g_fillmode=\"" + CMSActivator.getSessionInstance().getFillMode() + "\";</script>\n";
			text += "		<script type=\"text/javascript\">var g_dir=\"" + dir + "\";</script>\n";
			text += "		<script src=\"" + dir + "webglhelper.js\" type=\"text/javascript\"></script>";
			if (doThreejs) {
				text += "		<script src=\"" + dir + "js/libs/stats.min.js\"></script>";
				// text += "		<script src=\"" + dir + "touchgen.js\"></script>";
				text += "		<script src=\"" + dir + "modelviewer.js\"></script>";
				if (renderer.contains("canvas"))
					text += "	<script type=\"text/javascript\">var g_renderer=\"canvas\";</script>\n";
				if (renderer.contains("svg"))
					text += "	<script type=\"text/javascript\">var g_renderer=\"svg\";</script>\n";
				if (renderer.contains("software"))
					text += "	<script type=\"text/javascript\">var g_renderer=\"software\";</script>\n";
				String overrideSettings = "";
				for (Map.Entry<String, String> entry : CMSActivator.getSessionInstance().getParameters().entrySet()) {
					overrideSettings += "\"" + entry.getKey() + "\"" + ":" + "\"" + entry.getValue() + "\"" + ",";
				}
				if (!"".equals(overrideSettings))
					text += "	<script type=\"text/javascript\">var overrideSettings={" + overrideSettings.substring(0, overrideSettings.length() - 1) + "};</script>\n";
				text += "<div id=\"progress\"><span id=\"message\">Loading ...</span><center><div id=\"progressbar\" class=\"shadow\"><div id=\"bar\" class=\"shadow\"></div></div></center></div>";
			} else {
				text += "<script type=\"text/javascript\" >\n";
				text += "//emulate legacy getter/setter API using ES5 APIs\n";
				text += "try {\n";
				text += "   if (!Object.prototype.__defineGetter__ &&\n";
				text += "        Object.defineProperty({},\"x\",{get: function(){return true}}).x) {\n";
				text += "      Object.defineProperty(Object.prototype, \"__defineGetter__\",\n";
				text += "         {enumerable: false, configurable: true,\n";
				text += "          value: function(name,func)\n";
				text += "             {Object.defineProperty(this,name,\n";
				text += "                 {get:func,enumerable: true,configurable: true});\n";
				text += "      }});\n";
				text += "      Object.defineProperty(Object.prototype, \"__defineSetter__\",\n";
				text += "         {enumerable: false, configurable: true,\n";
				text += "          value: function(name,func)\n";
				text += "             {Object.defineProperty(this,name,\n";
				text += "                 {set:func,enumerable: true,configurable: true});\n";
				text += "      }});\n";
				text += "   }\n";
				text += "} catch(defPropException) {/*Do nothing if an exception occurs*/};\n";
				text += "</script>\n";
				text += "<script type=\"text/javascript\" src=\"" + dir + "o3d-webgl/base.js\"></script>\n";
				text += "<script type=\"text/javascript\" src=\"" + dir + "o3djs/base.js\"></script>\n";
				text += "<script type=\"text/javascript\" src=\"" + dir + "modelviewer.js\"></script>\n";

			}
			if (attachedImmediately != null)
				text += "<script type=\"text/javascript\">" + attachedImmediately + "</script>\n";
			if (attachedOnLoad != null)
				text += "<script type=\"text/javascript\">var g_customInit=function() {" + attachedOnLoad + "};</script>\n";
			attachedOnLoad = null;
			text += "</head>\n";
			text += "<body style=\"overflow:hidden; \" onload=\"try{start();}catch(e2){var t=document.getElementById('clients'); var s='The RaaS server at " + RAASUtils.getRAASProp("RAASSERVICEURL") + " does not respond.&lt;br&gt;This URL can be configured on server side in " + RAASUtils.ROOTPATH
					+ "/config.ini. ('+e2+')'; t.innerHTML=s;}\" onunload=\"try{uninit();}catch(e2){}\" oncontextmenu=\"return false;\">\n";
			text += "<div style=\"color: gray;\" id=\"loading\"></div>\n";
			if (artifacts.size() != 1)
				text += "<div style=\"overflow:auto; width:100%; height:100%; position:absolute; top:0; left:0; \"><table style=\"width: 100%;" + (artifacts.size() == 1 ? "height: 100%; " : "") + " \"><tbody id=\"clients\"></tbody></table></div>\n";
			else
				text += "<div id=\"clients\" style=\"position:absolute; left:0px; top:0px; right:0px; bottom:0px; z-index:2; \"></div>\n";
			text += "<div id=\"ellipsis_menu\" tabindex=\"1\" style=\"display:none; background-color:white; position: absolute; z-index: 1000000; outline: none; background-image: -webkit-gradient(linear, 0% 0%, 0% 100%, from(rgb(244, 244, 244)), to(rgb(255, 255, 255))); overflow: hidden; -webkit-box-shadow: rgb(171, 171, 171) 0px 0px 4px; border: 1px solid rgb(160, 179, 202); border-top-left-radius: 2px; border-top-right-radius: 2px; border-bottom-right-radius: 2px; border-bottom-left-radius: 2px; width: 164px; height: 27px; left: 100px; top: 337px; background-position: initial initial; background-repeat: initial initial;\"><div style=\"position: absolute; outline: none; width: 162px; height: 25px; left: 0px; right: 0px; top: 0px; bottom: 0px;\"><div tabindex=\"1\" style=\"position: absolute; overflow: hidden; -webkit-user-select: none; cursor: default; color: rgb(189, 189, 189); text-align: left; outline: none; width: 162px; height: 25px; left: 0px; top: 0px;\"><div style=\"position: absolute; border: 0px none; overflow: hidden; font-family: verdana, 'lucida sans', arial, helvetica, sans-serif; font-size: 14px; font-weight: normal; font-style: normal; left: 25px; width: 112px; top: 4px; height: 17px;\">...</div></div></div></div>";
			text += "<div style=\"font-family: sans-serif; font-size: large; position:absolute; left:0; top:0; z-index:3;\" id=\"pickInfo\"></div>\n";
			text += "<div id=\"map_canvas\" style=\"position:absolute; left:0px; top:0px; width:100%; height:100%; z-index:1;\"></div>";
			text += "</body>\n" + "</html>";
			final String ftext = text;

			artifactsToProcess = artifacts.size();
			for (final Artifact artifact : artifacts) {
				// if (JobManager.getInstance().find(artifact))
				Job job = new GeometryJob(artifact) {

					protected IStatus run(final IProgressMonitor monitor) {
						final IStatus status = super.run(monitor);
						if (monitor.isCanceled())
							return status;
						if (status.getSeverity() == IStatus.OK) {
							artifactsToProcess--;
							if (artifactsToProcess == 0)
								getSite().getShell().getDisplay().asyncExec(new Runnable() {
									public void run() {
										if (!alreadyDisplayed(false, artifacts))
											return;
										if (CMSActivator.getSessionInstance().loadWebGLFromRaaSServer())
											browser.setUrl(RAASUtils.getRAASProp("RAASSERVICEURL") + "o3d/modelviewer.html?artifact=" + fids);
										else
											browser.setText(ftext);
										new CustomFunction(browser, "theJavaFunction");
									}
								});
						}
						if (status.getSeverity() == IStatus.ERROR) {
							artifactsToProcess--;
							if (artifactsToProcess >= 0)
								getSite().getShell().getDisplay().asyncExec(new Runnable() {
									public void run() {
										if (!alreadyDisplayed(false, artifacts))
											return;
										browser.setText("Error when generating WebGL for " + artifact.getName() + ":" + status.getMessage());
									}
								});
							artifactsToProcess = -1;
						}
						return status;
					}

				};
				if (Job.getJobManager().find(artifact).length > 0)
					return true;
				job.schedule();
			}
			return true;
		}
		return false;
	}

	public static String getScene3dName() {
		final boolean doThreejs = isThreeJS();
		return "scene" + (doThreejs ? CMSActivator.getSessionInstance().get3dFormat().substring(0, CMSActivator.getSessionInstance().get3dFormat().indexOf(" ")) : "o3djson");
	}

	public static boolean isThreeJS() {
		String renderer = CMSActivator.getSessionInstance().getRenderer().toLowerCase();
		final boolean doThreejs = !renderer.contains("o3d");
		return doThreejs;
	}

	private boolean alreadyDisplayed(boolean makeVisible, List<Artifact> artifacts) {
		return !findView(artifacts, makeVisible).isEmpty();
	}

	static boolean isWebGL(List<Artifact> artifacts) {
		for (Artifact artifact : artifacts)
			if (RAASUtils.hasExtension(artifact, ".json") || RAASUtils.hasExtension(artifact, ".o3djson"))
				return true;
		return false;
	}

	static boolean isGeometryModel(List<Artifact> artifacts) {
		for (Artifact artifact : artifacts)
			if (RAASUtils.hasExtension(artifact, ".ifc"))
				return true;
		return false;
	}

	static boolean isCollada(List<Artifact> artifacts) {
		for (Artifact artifact : artifacts)
			if (RAASUtils.hasExtension(artifact, ".dae") || RAASUtils.hasExtension(artifact, ".js"))
				return true;
		return false;
	}

	public static boolean isImage(Artifact artifact) {
		return RAASUtils.hasExtension(artifact, ".png") || RAASUtils.hasExtension(artifact, ".gif") || RAASUtils.hasExtension(artifact, ".jpeg") || RAASUtils.hasExtension(artifact, ".jpg") || RAASUtils.hasExtension(artifact, ".bmp") || isPdf(artifact) || RAASUtils.hasExtension(artifact, ".html");
	}

	static boolean isPdf(Artifact artifact) {
		return RAASUtils.hasExtension(artifact, ".pdf");
	}

	private class CustomFunction extends BrowserFunction {

		CustomFunction(Browser browser, String name) {
			super(browser, name);
		}

		public Object function(Object[] arguments) {
			return browserHookFunction(arguments);
		}

	}

	public Object browserHookFunction(Object[] arguments) {

		Object returnValue = new Object[] {};
		List<String> guids = new ArrayList<String>();
		for (String guid : ((String) arguments[0]).split(" ")) {
			if (guid.length() > 1) {
				if (guid.endsWith("-mesh"))
					guid = guid.substring(0, guid.length() - "-mesh".length());
				guids.add(guid);
			}
		}
		String artifactId = "" + arguments[2];
		if (artifactId.startsWith("o3d"))
			artifactId = artifactId.substring("o3d".length());
		if (artifactId.startsWith("threejs"))
			artifactId = artifactId.substring("threejs".length());
		Artifact artifact = null;
		for (Artifact artifact_ : currentlyDisplayedArtifact) {
			if (artifactId.equals(artifact_.cdoID().toURIFragment())) {
				artifact = artifact_;
				if (guids.isEmpty() && !arguments[6].equals("StartPointMoved")) {
					Folder folder = (Folder) artifact_.eContainer();
					select(Arrays.asList(theSelection instanceof IStructuredSelection && ((IStructuredSelection) theSelection).toList().contains(folder) ? folder : artifact_));
					processOneOfCandidates(Arrays.asList(artifact_));
					return returnValue;
				}
			}
		}
		List<Object> newSel = new ArrayList<Object>();
		for (String guid : guids) {
			Object eObject = null;
			Object adapter = Platform.getAdapterManager().getAdapter(guid, IGeometricIDResolver.class);
			if (adapter instanceof IGeometricIDResolver) {
				IGeometricIDResolver iGeometricIDResolver = (IGeometricIDResolver) adapter;
				eObject = iGeometricIDResolver.resolve(artifact);
			}
			String selector = null;
			if (eObject == null) {
				int secondIndex = guid.lastIndexOf("_");
				if (secondIndex >= 1) {
					selector = guid.substring(secondIndex + 1);
					guid = guid.substring(0, secondIndex); // consider also splitted shapes
					adapter = Platform.getAdapterManager().getAdapter(guid, IGeometricIDResolver.class);
					if (adapter instanceof IGeometricIDResolver) {
						IGeometricIDResolver iGeometricIDResolver = (IGeometricIDResolver) adapter;
						eObject = iGeometricIDResolver.resolve(artifact);
					}
				}
			}
			if (eObject != null) {
				if (selector != null) {
					Object adapter2 = Platform.getAdapterManager().getAdapter(eObject, IGeometricSelectionResolver.class);
					if (adapter2 instanceof IGeometricSelectionResolver) {
						IGeometricSelectionResolver iGeometricSelectionResolver = (IGeometricSelectionResolver) adapter2;
						Object newObject = iGeometricSelectionResolver.resolve(selector);
						if (newObject != null) {
							newSel.add(newObject);
							continue;
						}
					}
				}
				newSel.add(eObject);
			}
		}
		if (!newSel.isEmpty())
			select(newSel);
		if (arguments[6].equals("click") && getIntFromJSArgument(arguments[5]) == 3 && !newSel.isEmpty()) {
			int x = getIntFromJSArgument(arguments[3]);
			int y = getIntFromJSArgument(arguments[4]);
			Control c = browser;
			while (c != null) {
				x += c.getLocation().x;
				y += c.getLocation().y;
				c = c.getParent();
			}
			if (menu == null)
				menu = menuMgr.createContextMenu(browser);
			menu.setLocation(x, y);
			menu.setVisible(true);

		} else {
			if (menu != null) {
				menu.dispose();
				menu = null;
			}
		}

		if (arguments[6].equals("click") && getIntFromJSArgument(arguments[5]) == 1 && !newSel.isEmpty()) {
			for (Object object : newSel) {
				Object adapter = Platform.getAdapterManager().getAdapter(object, IGeometricClick.class);
				if (adapter instanceof IGeometricClick) {
					IGeometricClick iGeometricClick = (IGeometricClick) adapter;
					iGeometricClick.click(getXYZFromArgs(arguments, 7), getXYZFromArgs(arguments, 10));
				}
			}
		}

		if (arguments[6].equals("dblclick")) {
			for (Object object : newSel) {
				Object adapter = Platform.getAdapterManager().getAdapter(object, IGeometricDoubleClick.class);
				if (adapter instanceof IGeometricDoubleClick) {
					IGeometricDoubleClick iGeometricDoubleClick = (IGeometricDoubleClick) adapter;
					iGeometricDoubleClick.doubleClick();
				}
			}
		}

		if (arguments[6].equals("drop")) {
			for (Object object : newSel) {
				Object adapter = Platform.getAdapterManager().getAdapter(object, IGeometricDrop.class);
				if (adapter instanceof IGeometricDrop) {
					IGeometricDrop iGeometricDrop = (IGeometricDrop) adapter;
					int x = ((Double) (getDoubleFromJSArgument(arguments[3]) * 1000)).intValue();
					int y = ((Double) (getDoubleFromJSArgument(arguments[4]) * 1000)).intValue();
					iGeometricDrop.drop(x, y);
				}
			}
		}
		if (arguments[6].equals("StartPointMoved")) {
			GrafUtil.getDefaultFactory().startPointMoved(getXYZFromArgs(arguments, 3), getXYZFromArgs(arguments, 7), null);
		}

		return returnValue;
	}

	public static XYZ getXYZFromArgs(Object[] arguments, int i) {
		if (i < arguments.length)
			return new XYZ(getDoubleFromJSArgument(arguments[i]) * 1000, getDoubleFromJSArgument(arguments[i + 1]) * 1000, getDoubleFromJSArgument(arguments[i + 2]) * 1000);
		return null;
	}

	private int getIntFromJSArgument(Object object) {
		return Double.valueOf("" + object).intValue();
	}

	private static double getDoubleFromJSArgument(Object object) {
		return Double.valueOf("" + object);
	}

	private <T extends Object> void select(List<T> toSelect) {
		causedSelection = true;
		try {
			setSelection(new StructuredSelection(toSelect));
		} finally {
			causedSelection = false;
		}
		if (getSite().getPage().getActivePart() != PreviewView.this) {

			getSite().getShell().getDisplay().syncExec(new Runnable() {
				public void run() {
					getSite().getPage().activate(PreviewView.this);
				}
			});
		}
	}

	public boolean processAsSet(List<Artifact> multipleArtifacts) {
		long size = 0;
		if (multipleArtifacts.size() >= 2)
			for (Artifact artifact : multipleArtifacts) {
				if (artifact.getFileContent() != null) {
					long oldSize = size;
					size += artifact.getFileContent().getSize();
					if (size > 10 * 1024 * 1024) {
						if (oldSize == 0) {
							// if already the first object is so big, dont display anything at all
							return false;
						}
						// display only the preceding artifacts
						multipleArtifacts = multipleArtifacts.subList(0, multipleArtifacts.indexOf(artifact));
						break;
					}
				}
			}
		return processWebGL(multipleArtifacts);
	}

	public boolean processOneOfCandidates(List<Artifact> candidates) {
		if (canDisplayWebGL()) {
			for (Artifact artifact : candidates) {
				if (isGeometryModel(Arrays.asList(artifact))) {
					processWebGL(Arrays.asList(artifact));
					return true;
				}
			}
			for (Artifact artifact : candidates) {
				if (isWebGL(Arrays.asList(artifact))) {
					processWebGL(Arrays.asList(artifact));
					return true;
				}
			}
			for (Artifact artifact : candidates) {
				if (isCollada(Arrays.asList(artifact))) {
					processWebGL(Arrays.asList(artifact));
					return true;
				}
			}
		}
		for (Artifact artifact : candidates) {
			if (isImage(artifact)) {
				processImage(artifact);
				return true;
			}
		}
		return false;
	}

	public static String isolateJavaScript(Collection<? extends EObject> eObjects) {
		return executeFJavaScript("isolateShape", eObjects, null);
	}

	public void isolate(Collection<? extends EObject> eObjects) {
		evaluate(isolateJavaScript(eObjects), getArtifact(eObjects));
	}

	public boolean locate(Collection<? extends EObject> eObjects) {
		return executeF("locateShape", eObjects, null);
	}

	public void showBoundingBox(Collection<? extends EObject> eObjects) {
		// executeF("printBoundingBox", eObjects, null);
		for (EObject eObject : eObjects) {
			Object adapter = Platform.getAdapterManager().getAdapter(eObject, IGeometricCenter.class);
			if (adapter instanceof IGeometricCenter) {
				IGeometricCenter iGeometricCenter = (IGeometricCenter) adapter;
				BoundingBoxXYZ bbox = iGeometricCenter.getBoundingBox();
				Artifact artifact = getArtifact(eObject);
				if (artifact == null)
					continue;
				String artifactId = artifact.cdoID().toURIFragment();
				String js = "";
				js += bbox.getMin().toMillimeters();
				js += bbox.getMax().toMillimeters();

				adapter = Platform.getAdapterManager().getAdapter(eObject, IGeometricIDBuilder.class);
				if (adapter instanceof IGeometricIDBuilder) {
					IGeometricIDBuilder iGeometricIDBuilder = (IGeometricIDBuilder) adapter;
					String id = iGeometricIDBuilder.buildID();
					if (id != null)
						js += "'" + id + "',";
				}

				browser.evaluate("printBoundingBox([" + RAASUtils.pruneLastChar(js) + "],'" + artifactId + "');");
			}
		}
	}

	public void lookAt(Collection<? extends EObject> eObjects) {
		for (EObject eObject : eObjects) {
			Object adapter = Platform.getAdapterManager().getAdapter(eObject, IGeometricCenter.class);
			if (adapter instanceof IGeometricCenter) {
				IGeometricCenter iGeometricCenter = (IGeometricCenter) adapter;
				XYZ point = iGeometricCenter.getAbsoluteCenter();
				Artifact artifact = getArtifact(eObject);
				if (artifact == null)
					continue;
				String artifactId = artifact.cdoID().toURIFragment();
				String js = "";
				js += "var artifactId = '" + artifactId + "';";
				js += "var g_client = resolveArtifact(artifactId);";
				js += "var g_camera = g_client.g_camera;";
				js += "var target =  [" + RAASUtils.pruneLastChar(point.toMeters()) + "];";
				// js += "g_camera.eye =  [" + point.X / 1000 + "," + point.Y / 1000 + "," + (point.Z + 1000 * 10) / 1000 + "];";
				js += "doSetCamera(g_camera.eye,target,g_angle,null,20,g_client);";
				browser.evaluate(js);
			}
		}
	}

	static public String toggleSpaceJavaScript(Artifact artifact) {
		String artifactId = artifact.cdoID().toURIFragment();
		String js = "";
		js += "{var artifactId = '" + artifactId + "';";
		js += "var g_client = resolveArtifact(artifactId);";
		js += "toggleVisibility(g_client.root, 'Space', g_client.hideSpaces = true);}";
		return js;
	}

	public Object[] readCamera(Artifact artifact) {
		String artifactId = artifact.cdoID().toURIFragment();
		Object result = browser.evaluate("return readCamera('" + artifactId + "');");
		return (Object[]) result;
	}

	public Object[] readPolygons() {
		Object result = browser.evaluate("return readPolygons();");
		return (Object[]) result;
	}

	public boolean evaluate(String js, Artifact artifact) {
		if (js == null || !currentlyDisplayedArtifact.contains(artifact))
			return false;
		try {
			browser.evaluate(js);
		} catch (SWTException e) {
			if (js.indexOf("(") != -1) {
				System.out.println("Could not execute " + js.substring(0, js.indexOf("(")) + "()");
			} else {
				System.out.println("Could not execute javascript!");
			}
		}
		return true;
	}

	static public String setCameraJavaScript(Artifact artifact, XYZ eye, XYZ target, int angle, Boolean orthogonal) {
		int steps = 20;
		String artifactId = artifact.cdoID().toURIFragment();
		String ids = "";
		ids += eye.toMeters();
		ids += target.toMeters();
		ids += angle + ",";
		ids += orthogonal;
		return "setCamera([" + ids + "]," + steps + ",'" + artifactId + "');";
	}

	public void hide(Collection<? extends EObject> eObjects) {
		executeF("hideShape", eObjects, null);
	}

	public void reload() {
		List<Artifact> artifacts = currentlyDisplayedArtifact;
		currentlyDisplayedArtifact = Collections.emptyList();
		processAsSet(artifacts);
	}

	static public List<PreviewView> findView() {
		return IsolateAction.findView(PreviewView.class, false);
	}

	static public List<PreviewView> findView(boolean allowHidden) {
		return IsolateAction.findView(PreviewView.class, false, allowHidden);
	}

	static public List<PreviewView> findView(Artifact artifact) {
		return findView(Arrays.asList(artifact), true);
	}

	static public List<PreviewView> findView(List<Artifact> artifacts, boolean makeVisible) {
		List<PreviewView> result = new ArrayList<PreviewView>();
		for (final PreviewView view : IsolateAction.findView(PreviewView.class, false, true)) {
			if (view.currentlyDisplayedArtifact.equals(artifacts)) {
				if (makeVisible && !findView().contains(view)) {
					try {
						view.getSite().getPage().showView(view.getViewSite().getId(), view.getViewSite().getSecondaryId(), IWorkbenchPage.VIEW_VISIBLE);
					} catch (PartInitException e) {
						e.printStackTrace();
					}
					makeVisible = false;
				}
				result.add(view);
			}
		}
		return result;
	}

	static public List<? extends PreviewView> findOrCreateView() {
		List<TypeSelectionView> result2 = IsolateAction.findView(TypeSelectionView.class, true);
		if (!result2.isEmpty())
			return result2;
		List<PreviewView> result = IsolateAction.findView(PreviewView.class, true);
		if (!result.isEmpty())
			return result;
		try {
			PreviewView view = (PreviewView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(PreviewView.ID, null, IWorkbenchPage.VIEW_CREATE);
			return Arrays.asList(view);
		} catch (PartInitException e) {
			return Collections.emptyList();
		}
	}

	public void setViewState(int state) {
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		int currentState = page.getPartState(page.getReference(this));
		if (currentState != state) {
			page.activate(this);
			page.setPartState(page.getReference(this), state);
		}
	}

	public int getViewState() {
		IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		int currentState = page.getPartState(page.getReference(this));
		return currentState;
	}

	@Override
	public void setPartName(String partName) {
		super.setPartName(partName);
	}
}
