/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.actions;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.ifc4emf.metamodel.ifcheader.Model;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.ui.RAASUIUtils;

import raascms.Artifact;
import raascms.Folder;

public class FindGUIDAction extends AbstractHandler {

	private String message;
	private Shell shell;
	private String guid;

	public FindGUIDAction() {
		super();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		shell = HandlerUtil.getActiveShellChecked(event);
		message = "";

		InputDialog dialog = new InputDialog(shell, "Find GUID", "Enter GUID to find in IFC models:", null, null);
		if (dialog.open() != Window.OK)
			return null;
		guid = dialog.getValue();
		for (Object element : RAASUIUtils.getSelection(event)) {
			if (element instanceof Artifact) {
				final Artifact artifact = (Artifact) element;
				examine(artifact);
			}
			if (element instanceof Folder) {
				Folder folder = (Folder) element;
				examine(folder);
			}
			if (element instanceof Model) {
				Model ifcElement = (Model) element;

				examine(ifcElement);
			}
		}

		// MemoDialog.openInformation(shell, "Geometry Report", message);
		return null;
	}

	private void examine(Folder folder) {
		for (Artifact artifact : folder.getArtifacts()) {
			examine(artifact);
		}
		for (Folder subfolder : folder.getFolders()) {
			examine(subfolder);
		}
	}

	private void examine(Artifact artifact) {
		if (!RAASUtils.hasExtension(artifact, ".ifc"))
			return;
		// try {
		// artifact = RAASUtils.assureModelTree(artifact);
		// } catch (IOException e) {
		// CMSActivator.err(e);
		// return;
		// }
		examineArtifact(artifact);
	}

	private void examineArtifact(final Artifact artifact) {
		for (EObject eObject : artifact.getContents()) {
			if (eObject instanceof Model) {
				Model model = (Model) eObject;
				examine(model);
			}
		}
	}

	protected void examine(Model model) {
		long start = System.currentTimeMillis();
		Number index = RAASUtils.getIndexForGUIDStatic(model, guid);
		long end0 = System.currentTimeMillis();
		MessageDialog.openInformation(shell, "Search result", "Found #" + index + " in " + (end0 - start) + " milliseconds");

	}
}
