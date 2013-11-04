/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.views;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;
import org.raas4emf.cms.core.RAASUtils;

import raascms.Artifact;
import raascms.Folder;

public class DetailsView extends ViewPart implements ISelectionListener {

	public static final String ID = DetailsView.class.getName();
	private Text textFilename;
	private Text textSize;
	private Label lblState;
	private Label lblSize;
	private Text textState;
	private ProgressBar progressBar;
	private Label lblProgress;
	private Label lblFileName;
	private Label lblModified;
	private Text textModified;

	public void createPartControl(final Composite parent) {
		Composite composite_1 = parent;
		GridLayout gl_composite_1 = new GridLayout(2, false);
		gl_composite_1.horizontalSpacing = 15;
		gl_composite_1.verticalSpacing = 15;
		composite_1.setLayout(gl_composite_1);

		lblFileName = new Label(composite_1, SWT.NONE);
		lblFileName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblFileName.setText("File name ");

		textFilename = new Text(composite_1, SWT.BORDER);
		textFilename.setEditable(false);
		textFilename.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		lblModified = new Label(composite_1, SWT.NONE);
		lblModified.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblModified.setText("Modified ");

		textModified = new Text(composite_1, SWT.BORDER | SWT.V_SCROLL | SWT.MULTI);
		textModified.setEditable(false);
		textModified.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		lblProgress = new Label(composite_1, SWT.NONE);
		lblProgress.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblProgress.setText("Progress ");

		progressBar = new ProgressBar(composite_1, SWT.NONE);
		progressBar.setToolTipText("");
		progressBar.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		lblSize = new Label(composite_1, SWT.NONE);
		lblSize.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblSize.setText("Size ");

		textSize = new Text(composite_1, SWT.BORDER);
		textSize.setEditable(false);
		textSize.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		lblState = new Label(composite_1, SWT.NONE);
		lblState.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblState.setText("State ");

		textState = new Text(composite_1, SWT.BORDER | SWT.V_SCROLL | SWT.MULTI);
		textState.setEditable(false);
		textState.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		selectionChanged(null, getSite().getPage().getSelection());
		getSite().getPage().addSelectionListener(this);
	}

	public void setFocus() {
		// list.setFocus();
	}

	@Override
	public void dispose() {
		getSite().getPage().removeSelectionListener(this);
		super.dispose();
	}

	public static String getLabelFor(Object firstElement) {

		// if (firstElement instanceof Artifact) {
		// Artifact artifact = (Artifact) firstElement;
		// return "Artifact";
		// }
		// if (firstElement instanceof Folder) {
		// Folder folder = (Folder) firstElement;
		//
		// if (!RAASUtils.getArtifacts(folder).isEmpty())
		// return "Version";
		// else
		// for (Folder subFolder : folder.getFolders())
		// if (!RAASUtils.getArtifacts(subFolder).isEmpty()) {
		// return "Project";
		// }
		// return "Category";
		// }
		return "";
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		IStructuredSelection sselection = (IStructuredSelection) selection;
		Object firstElement = sselection instanceof IStructuredSelection ? ((IStructuredSelection) selection).getFirstElement() : null;

		textSize.setVisible(firstElement instanceof Artifact);
		textState.setVisible(firstElement instanceof Artifact);
		lblState.setVisible(firstElement instanceof Artifact);
		lblSize.setVisible(firstElement instanceof Artifact);
		lblProgress.setVisible(firstElement instanceof Artifact);
		progressBar.setVisible(firstElement instanceof Artifact);
		textModified.setVisible(firstElement instanceof CDOObject);
		lblModified.setVisible(firstElement instanceof CDOObject);
		lblFileName.setVisible(firstElement instanceof Artifact || firstElement instanceof Folder);
		textFilename.setVisible(firstElement instanceof Artifact || firstElement instanceof Folder);

		if (getLabelFor(firstElement) != null && !"".equals(getLabelFor(firstElement)))
			lblFileName.setText(getLabelFor(firstElement) + "  ");

		if (firstElement instanceof Artifact) {
			Artifact artifact = (Artifact) firstElement;
			textFilename.setText(artifact.getName());
			progressBar.setSelection(0);
			for (EObject model : artifact.getContents()) {
				Double ratio = RAASUtils.getCompletionRatio(model);
				if (ratio != null) {
					progressBar.setSelection((int) (100 * ratio));
				}
			}
			progressBar.setToolTipText(progressBar.getSelection() + "%");
			textSize.setText(artifact.getFileContent() != null ? "" + artifact.getFileContent().getSize() : "");
			textState.setText(artifact.getState() != null ? artifact.getState() : "");
		}
		if (firstElement instanceof Folder) {
			Folder folder = (Folder) firstElement;
			textFilename.setText(folder.getName());
		}
		if (firstElement instanceof CDOObject) {
			textModified.setText("" + RAASUtils.getModificationDate((CDOObject) firstElement));
		}
	}

}
