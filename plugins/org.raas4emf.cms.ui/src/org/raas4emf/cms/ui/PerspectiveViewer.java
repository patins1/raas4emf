/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.raas4emf.cms.ui.views.DirectoryView;
import org.raas4emf.cms.ui.views.PreviewView;

public class PerspectiveViewer implements IPerspectiveFactory {

	public void createInitialLayout(final IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(false);
		IFolderLayout topLeft = layout.createFolder("topLeft", IPageLayout.LEFT, 0.25f, editorArea);
		topLeft.addView(DirectoryView.ID);
		IFolderLayout topRight = layout.createFolder("topRight", IPageLayout.RIGHT, 0.50f, editorArea);
		topRight.addView(PreviewView.ID);
		IFolderLayout bottom = layout.createFolder("bottomLeft", IPageLayout.BOTTOM, 0.50f, "topLeft");
		bottom.addView("org.eclipse.ui.views.PropertySheet");
	}
}
