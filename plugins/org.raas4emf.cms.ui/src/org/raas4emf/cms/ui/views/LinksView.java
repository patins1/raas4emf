/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.views;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.transformation.TransformationUtils;
import org.raas4emf.cms.ui.CMSActivator;

import raascms.Artifact;
import raascms.Folder;

public class LinksView extends ViewPart implements ISelectionListener {

	public static final String ID = LinksView.class.getName();
	private static final boolean OWN_PROVISION = true;
	Browser browser;
	private Combo combo;
	private ISelection lastSelection;

	public void createPartControl(final Composite parent) {
		parent.setLayout(new GridLayout(1, false));
		browser = new Browser(parent, SWT.NONE);
		GridData gd_composite_1 = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_composite_1.heightHint = 113;
		gd_composite_1.widthHint = 258;
		browser.setLayoutData(gd_composite_1);

		Composite composite_2 = new Composite(parent, SWT.NONE);
		composite_2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));

		Label lblDrive = new Label(composite_2, SWT.NONE);
		lblDrive.setBounds(10, 10, 35, 13);
		lblDrive.setText("Drive");

		combo = new Combo(composite_2, SWT.NONE);
		combo.setBounds(63, 7, 45, 21);
		combo.setItems(new String[] { "D:", "E:", "F:", "G:", "H:", "I:", "J:", "K:", "L:", "M:", "N:", "O:", "P:", "Q:", "R:", "S:", "T:", "U:", "V:", "W:", "X:", "Y:", "Z:" });

		selectionChanged(null, getSite().getPage().getSelection());
		createSelectionListener();
	}

	public void setFocus() {
		browser.setFocus();
	}

	private void createSelectionListener() {
		getSite().getPage().addSelectionListener(this);

		combo.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				if (lastSelection != null)
					selectionChanged(null, lastSelection);
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				if (lastSelection != null)
					selectionChanged(null, lastSelection);
			}

		});
	}

	@Override
	public void dispose() {
		getSite().getPage().removeSelectionListener(this);
		super.dispose();
	}

	public void selectionChanged(final IWorkbenchPart part, final ISelection selection) {
		if (!browser.isDisposed()) {
			if (selection != null) {
				IStructuredSelection sselection = (IStructuredSelection) selection;
				Object firstElement = sselection.getFirstElement();
				StringBuilder html = new StringBuilder();
				html.append("<span style=\"font-family:Tahoma\">");
				if (firstElement instanceof Artifact) {
					Artifact artifact = (Artifact) firstElement;
					appendWebDavURI(buildPath(artifact), html);
					processArtifact(artifact, html, artifact.getName());
				}
				if (firstElement instanceof Folder) {
					Folder folder = (Folder) firstElement;
					Artifact propFile = RAASUtils.getPropertiesFile(folder);
					if (propFile != null && RAASUtils.hasExtension(propFile, ".xls")) {
						appendWebDavURI(buildPath(propFile), html);
						processArtifact(propFile, html, folder.getName());
					} else {
						propFile = null;
					}
					for (Artifact artifact : RAASUtils.getArtifacts(folder)) {
						if (artifact != propFile)
							processArtifact(artifact, html, folder.getName());
					}
				}
				html.append("</span> ");
				browser.setText(html.toString());
			}
		}
		lastSelection = selection;
	}

	private void processArtifact(Artifact artifact, StringBuilder html, String fileName) {
		String raasUri = null;
		html.append("<br>");
		fileName = RAASUtils.getSerializationName(artifact, RAASUtils.withoutExtension(fileName) + RAASUtils.getExtension(artifact));
		String pureFilename = TransformationUtils.getPureFilename(fileName);
		String artifactUri = OWN_PROVISION ? CMSActivator.getSessionInstance().createFullDownloadUrl(artifact) : RAASUtils.getRAASProp("RAASSERVICEURL") + "services/Artifact/GetArtifact/" + artifact.cdoID().toURIFragment() + "/";
		raasUri = artifactUri + fileName;
		html.append("<a href=\"");
		html.append(raasUri);
		html.append("\">");
		html.append(fileName);
		html.append("</a> ");

		Collection<IConfigurationElement> transformators = TransformationUtils.getConvertersFor(TransformationUtils.getFileExtension(fileName));
		for (IConfigurationElement transformator : transformators) {
			String derivedFilename = pureFilename + "." + TransformationUtils.getTargetFileExtension(transformator);
			String derivedUri = artifactUri + derivedFilename;
			html.append("<br>");
			html.append("<a href=\"");
			html.append(derivedUri);
			html.append("\">");
			html.append(derivedFilename + " (" + TransformationUtils.getDescription(transformator) + ")");
			html.append("</a> ");
		}

		if (PreviewView.isWebGL(Arrays.asList(artifact)) || PreviewView.isCollada(Arrays.asList(artifact)) || PreviewView.isGeometryModel(Arrays.asList(artifact))) {
			html.append("<br>");
			String renderer = CMSActivator.getSessionInstance().getRenderer().toLowerCase();
			final boolean doThreejs = !renderer.contains("o3d");
			String webglUri = RAASUtils.getRAASProp("RAASSERVICEURL") + (doThreejs ? "threejs/" : "o3d/") + "modelviewer.html?artifact=" + artifact.cdoID().toURIFragment();
			if (renderer.contains("canvas"))
				webglUri += "&renderer=canvas";
			if (renderer.contains("svg"))
				webglUri += "&renderer=svg";
			if (renderer.contains("software"))
				webglUri += "&renderer=software";
			final String filename = PreviewView.getScene3dName();
			webglUri += "&filename=" + filename;
			html.append("<a href=\"");
			html.append(webglUri);
			html.append("\">");
			html.append("Standalone View");
			html.append("</a> ");

		}
	}

	private void appendWebDavURI(String path, StringBuilder html) {
		String lastDriveSelection = combo.getText();
		if (lastDriveSelection != null && !"".equals(lastDriveSelection)) {
			String webdavUri = lastDriveSelection + path;
			html.append("<br>");
			html.append("<a href=\"");
			html.append("file:///" + webdavUri);
			html.append("\">");
			html.append(webdavUri);
			html.append("</a> ");
		}
	}

	private String buildPath(EObject artifact) {
		EObject namedObject = artifact;
		EStructuralFeature nameFeature;
		Object folderName;
		String path = "";
		while (namedObject != null && (nameFeature = namedObject.eClass().getEStructuralFeature("name")) != null && (folderName = namedObject.eGet(nameFeature)) instanceof String) {
			path = "/" + folderName + path;
			if (namedObject.eContainer() != null)
				namedObject = namedObject.eContainer();
			else if (namedObject.eResource() != namedObject)
				namedObject = (CDOResource) namedObject.eResource();
			else
				break;
		}
		return path;
	}

}
