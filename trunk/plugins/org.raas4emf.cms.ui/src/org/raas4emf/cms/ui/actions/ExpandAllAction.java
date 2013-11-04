/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.actions;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.handlers.HandlerUtil;
import org.raas4emf.cms.ui.views.FilesView;

import raascms.Folder;

public class ExpandAllAction extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		FilesView view = (FilesView) HandlerUtil.getActivePart(event);
		expand(view.getViewer(), view.patternFilter);
		return null;
	}

	public static void expand(TreeViewer viewer, PatternFilter patternFilter) {
		Collection<Folder> expandElements = new HashSet<Folder>();
		for (TreeItem item : viewer.getTree().getItems()) {
			if (item.getData() instanceof Folder) {
				Folder folder = (Folder) item.getData();
				collectExpandElements(folder, expandElements, viewer, patternFilter);
			}
		}
		viewer.setExpandedElements(expandElements.toArray());
	}

	static boolean collectExpandElements(Folder folder, Collection<Folder> expandElements, TreeViewer viewer, PatternFilter patternFilter) {
		if (patternFilter.isElementVisible(viewer, folder)) {
			boolean childIsVisible = false;
			for (Folder child : folder.getFolders()) {
				if (collectExpandElements(child, expandElements, viewer, patternFilter))
					childIsVisible = true;
			}
			if (childIsVisible) {
				// only if a child folder is visible, expand current folder
				expandElements.add(folder);
			}
			return true;
		}
		return false;
	}

}
