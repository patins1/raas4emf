/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.views;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.FilteredTree;
import org.raas4emf.cms.ui.CMSActivator;
import org.raas4emf.cms.ui.RAASUIUtils;
import org.raas4emf.cms.ui.actions.IsolateAction;

import raascms.Folder;

public class TypeSelectionView extends PreviewView {

	public static final String ID = TypeSelectionView.class.getName();
	public static final String TEMPLATE_TYPE_SELECTION_BUILDING = "Template Type Selection Building";

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		try {
			Folder sampleBuilding = (Folder) RAASUIUtils.findByPath("RepositoryRoot", "Experiments", TEMPLATE_TYPE_SELECTION_BUILDING);
			loadSelectionIntoBrowser(new StructuredSelection(sampleBuilding));
		} catch (Exception e) {
			browser.setText(e.getMessage());
		}
	}

	@Override
	public Object browserHookFunction(Object[] arguments) {
		String type = (String) arguments[1];
		type = type.replace("Ifc", "");
		type = type.replace("StandardCase", "");
		selectType(type);
		return new Object[] {};
	}

	public static void selectType(String type) {
		try {
			List<IViewPart> result = new ArrayList<IViewPart>();
			for (int i = 0; i <= 1; i++) {
				boolean restore = i == 1;
				for (IViewPart view : IsolateAction.findView(null, null, restore, restore)) {
					if (result.isEmpty() && view instanceof FilesView)
						result.add(view);
				}
			}
			for (IViewPart viewVisibleOrNotVisible : result) {
				FilesView view = (FilesView) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView(viewVisibleOrNotVisible.getClass().getName(), null, IWorkbenchPage.VIEW_ACTIVATE);
				if (view.tree instanceof FilteredTree) {
					FilteredTree filteredTree = (FilteredTree) view.tree;
					filteredTree.getFilterControl().setText(type);
				}
			}
		} catch (PartInitException e) {
			CMSActivator.err(e);
		}
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		// do nothing
	}

}
