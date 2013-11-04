/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.actions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.WorkbenchPage;
import org.raas4emf.cms.ui.RAASUIUtils;
import org.raas4emf.cms.ui.views.PreviewView;

@SuppressWarnings("restriction")
public class IsolateAction extends AbstractHandler {

	public IsolateAction() {
		super();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	static public <T> List<T> findView(Class<T> clazz, boolean restore, boolean allowHidden) {
		return (List) findView(clazz.getName(), null, restore, allowHidden);
	}

	static public <T> List<T> findView(Class<T> clazz, boolean restore) {
		return findView(clazz, restore, restore);
	}

	/**
	 * @param id
	 *            the ID of the view
	 * @param secondaryId
	 * @param restore
	 *            if <code>true</code>, matching views do not need to be initialized, in which case they get initialized<br>
	 *            if <code>false</code>, matching views need to be initialized and visible<br>
	 * @return all matching views
	 */
	static public List<IViewPart> findView(String id, String secondaryId, boolean restore, boolean allowHidden) {
		List<IViewPart> result = new ArrayList<IViewPart>();
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
		WorkbenchPage page = (WorkbenchPage) window.getActivePage();
		IViewReference refs[] = page.getViewReferences();
		for (int i = 0; i < refs.length; i++) {
			IViewReference ref = refs[i];
			if ((id == null || id.equals(ref.getId())) && (secondaryId == null ? true : secondaryId.equals(ref.getSecondaryId()))) {
				IViewPart view = ref.getView(restore);
				if (view != null && (allowHidden || page.isPartVisible(view)))
					result.add(view);
			}
		}
		return result;
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		for (PreviewView preview : PreviewView.findView()) {
			preview.isolate(RAASUIUtils.getSelection(event, EObject.class));
		}
		return null;
	}

}
