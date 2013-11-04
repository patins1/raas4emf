/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.raas4emf.cms.ui.views.PreviewView;

public class PerspectiveDocument implements IPerspectiveFactory {

	public void createInitialLayout(final IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(true);
		IFolderLayout topRight = layout.createFolder("topRight", IPageLayout.RIGHT, 0.50f, editorArea);
		topRight.addView(PreviewView.ID);
		IFolderLayout bottom = layout.createFolder("bottom", IPageLayout.BOTTOM, 0.50f, editorArea);
		bottom.addView("org.eclipse.ui.views.PropertySheet");
	}
}
