/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.progress.WorkbenchJob;
import org.raas4emf.cms.ui.actions.ExpandAllAction;

public class FilteredTreeWithoutExpansion extends FilteredTree {

	public FilteredTreeWithoutExpansion(Composite parent, int treeStyle, PatternFilter filter, boolean useNewLook) {
		super(parent, treeStyle, filter, useNewLook);
	}

	/**
	 * Difference to super method is: dont change the expanded state of any treeitems
	 */
	protected WorkbenchJob doCreateRefreshJob() {
		return new WorkbenchJob("Refresh Filter") {//$NON-NLS-1$
			public IStatus runInUIThread(IProgressMonitor monitor) {
				if (treeViewer.getControl().isDisposed()) {
					return Status.CANCEL_STATUS;
				}

				String text = getFilterString();
				if (text == null) {
					return Status.OK_STATUS;
				}

				boolean initial = initialText != null && initialText.equals(text);
				if (initial) {
					getPatternFilter().setPattern(null);
				} else if (text != null) {
					getPatternFilter().setPattern(text);
				}

				Control redrawFalseControl = treeComposite != null ? treeComposite : treeViewer.getControl();
				try {
					// don't want the user to see updates that will be made to
					// the tree
					// we are setting redraw(false) on the composite to avoid
					// dancing scrollbar
					redrawFalseControl.setRedraw(false);
					// RAP [if] workaround for bug 262504
					// if (!narrowingDown) {
					treeViewer.refresh(true);

					if (text.length() > 0 && !initial) {
						// enabled toolbar - there is text to clear
						// and the list is currently being filtered
						updateToolbar(true);
					} else {
						// disabled toolbar - there is no text to clear
						// and the list is currently not filtered
						updateToolbar(false);
					}
				} finally {
					// done updating the tree - set redraw back to true
					TreeItem[] items = getViewer().getTree().getItems();
					if (items.length > 0 && getViewer().getTree().getSelectionCount() == 0) {
						treeViewer.getTree().setTopItem(items[0]);
					}
					redrawFalseControl.setRedraw(true);
				}
				if (!"".equals(text))
					ExpandAllAction.expand(FilteredTreeWithoutExpansion.this.getViewer(), FilteredTreeWithoutExpansion.this.getPatternFilter());
				// FilteredTreeWithoutExpasion.this.getViewer().reveal(((IStructuredSelection) FilteredTreeWithoutExpasion.this.getViewer().getSelection()).getFirstElement());
				return Status.OK_STATUS;
			}

		};
	}

}
