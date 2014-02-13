/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.raas4emf.cms.ui.views.DetailsView;
import org.raas4emf.cms.ui.views.DirectoryView;
import org.raas4emf.cms.ui.views.LinksView;
import org.raas4emf.cms.ui.views.PreviewView;
import org.raas4emf.cms.ui.views.TypeSelectionView;

public class PerspectiveLibrarian implements IPerspectiveFactory {

	public void createInitialLayout(final IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(false);
		IFolderLayout topLeft = layout.createFolder("topLeft", IPageLayout.LEFT, 0.25f, editorArea);
		topLeft.addView(DirectoryView.ID);
		IFolderLayout bottomLeft = layout.createFolder("bottomLeft", IPageLayout.BOTTOM, 0.50f, "topLeft");
		bottomLeft.addView(TypeSelectionView.ID);
		bottomLeft.addView(LinksView.ID);
		bottomLeft.addView(DetailsView.ID);
		bottomLeft.addView("org.eclipse.ui.views.ProgressView");
		bottomLeft.addView("org.eclipse.ui.views.PropertySheet");
		IFolderLayout topRight = layout.createFolder("topRight", IPageLayout.RIGHT, 0.70f, editorArea);
		topRight.addView(PreviewView.ID);
	}
}
