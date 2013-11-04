/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.editor.editor;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.viewers.ISelection;

public class PersistentRAASActionBarContributor extends RAASActionBarContributor {

	private String viewID;

	public PersistentRAASActionBarContributor(String viewID) {
		super();
		this.viewID = viewID;
		loadResourceAction = null;
		validateAction = null;
		controlAction = null;
	}

	@Override
	protected Collection<IAction> generateCreateChildActions(Collection<?> descriptors, ISelection selection) {
		return new ArrayList<IAction>();
	}

	@Override
	protected Collection<IAction> generateCreateSiblingActions(Collection<?> descriptors, ISelection selection) {
		return new ArrayList<IAction>();
	}

	@Override
	public void menuAboutToShow(IMenuManager menuManager) {
		IMenuManager nestedMenu = menuManager.findMenuUsingPath(viewID + ".editing");
		super.menuAboutToShow(nestedMenu != null ? nestedMenu : menuManager);
	}

}
