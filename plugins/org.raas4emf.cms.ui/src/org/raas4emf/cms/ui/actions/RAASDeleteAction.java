/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.actions;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.UnexecutableCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.ui.action.DeleteAction;
import org.raas4emf.cms.ui.views.DirectoryView;

import raascms.Artifact;
import raascms.Folder;

public class RAASDeleteAction extends DeleteAction {

	public RAASDeleteAction(boolean removeAllReferencesOnDelete) {
		super(removeAllReferencesOnDelete);
	}

	@Override
	public Command createCommand(Collection<?> selection) {
		if (!canBeRemoved(selection))
			return UnexecutableCommand.INSTANCE;
		return !allFoldersOrArtifacts(selection) ? new RAASDeleteCommand(domain, selection) : RemoveCommand.create(domain, selection);
	}

	public static boolean canBeRemoved(Collection<?> selection) {
		for (Object object : selection) {
			EObject folderOrArtifact = null;
			if (object instanceof Folder || object instanceof Artifact) {
				folderOrArtifact = (EObject) object;
			} else if (object instanceof EObject) {
				folderOrArtifact = RAASDeleteCommand.getArtifact((EObject) object);
			}
			if (folderOrArtifact == null || !DirectoryView.checkCanWrite(folderOrArtifact.eContainer(), null))
				return false;
		}
		return true;
	}

	private boolean allFoldersOrArtifacts(Collection<?> selection) {
		for (Object object : selection)
			if (!(object instanceof Artifact || object instanceof Folder))
				return false;
		return true;
	}

}
