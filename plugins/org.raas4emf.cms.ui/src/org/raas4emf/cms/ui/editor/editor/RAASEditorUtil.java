/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.editor.editor;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.edit.ui.util.EditUIUtil;
import org.eclipse.net4j.util.ObjectUtil;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorDescriptor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.raas4emf.cms.ui.CMSActivator;

public final class RAASEditorUtil {

	/**
	 * Returns an implementation of CDOEditorInput interface
	 * 
	 * @param modelElement
	 * @param persistent
	 */
	public static IEditorInput createCDOEditorInput(CDOView view, String resourcePath, CDOObject modelElement, boolean persistent) {
		return new RAASEditorInputImpl(view, resourcePath, modelElement, persistent);
	}
	

	public static IWorkbenchPage openURIEditor(String resourcePath) throws PartInitException {
		IEditorDescriptor ed = EditUIUtil.getDefaultEditor(resourcePath);
		if (ed==null)
			return null;
		URI uri = createRestURI(resourcePath,"");
		IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().openEditor(new URIEditorInput(uri), ed.getId(), true);
		IWorkbenchPage page = editor.getEditorSite().getPage();
		return page;
	}


	public static URI createRestURI(String resourcePath, String query) {
		for (String name:org.raas4emf.cms.ui.CMSActivator.getSessionInstance().getParameters().keySet()) {
			query=query+"&"+name+"="+org.raas4emf.cms.ui.CMSActivator.getSessionInstance().getParameter(name);
		}
		if (query.startsWith("&"))
			query="?"+query.substring(1);
		String g_path = CMSActivator.getSessionInstance().createFullDownloadUrl(null) ;							
		URI uri = URI.createURI(g_path.substring(0, g_path.indexOf("?"))+"/"+resourcePath+query);
		return uri;
	}

	/**
	 * Opens the specified resource in CDOEditor
	 * 
	 * @param page
	 *            The page in which the editor will be open
	 * @param view
	 *            the CDOView that will be used to access the resource
	 * @param resourcePath
	 *            absolute path to the resource in the repository
	 * @param modelElement
	 * @param activate
	 */
	public static void openEditor(final IWorkbenchPage page, final CDOView view, final String resourcePath, final CDOObject modelElement, final boolean persistent, final boolean activate) {
		Display display = page.getWorkbenchWindow().getShell().getDisplay();
		display.asyncExec(new Runnable() {
			public void run() {
				try {
					if (openURIEditor(resourcePath)!=null) {
						return;
					}
					IEditorInput input = RAASEditorUtil.createCDOEditorInput(view, resourcePath, modelElement, persistent);
					IEditorReference[] references = findEditor(page, input);
					if (references.length != 0) {
						if (activate) {
							IEditorPart editor = references[0].getEditor(true);
							page.activate(editor);
						}
					} else {
						page.openEditor(input, RAASEditor.EDITOR_ID, activate);
					}
				} catch (Exception ex) {
					throw new RuntimeException(ex);
				}
			}
		});
	}

	/**
	 * Returns references to possibly opened instances of CDOEditor with certain CDOView and resource
	 * 
	 * @param page
	 *            The page where to search for opened editors
	 * @param input
	 *            The editors are editing the CDOResource specified with this path
	 */
	public static IEditorReference[] findEditor(IWorkbenchPage page, IEditorInput input) {
		List<IEditorReference> result = new ArrayList<IEditorReference>();
		IEditorReference[] editorReferences = page.getEditorReferences();
		for (IEditorReference editorReference : editorReferences) {
			try {
				if (ObjectUtil.equals(editorReference.getId(), RAASEditor.EDITOR_ID)) {
					IEditorInput editorInput = editorReference.getEditorInput();
					if (editorInput instanceof RAASEditorInput) {
						RAASEditorInput cdoInput = (RAASEditorInput) editorInput;
						if (cdoInput.equals(input)) {
							result.add(editorReference);
						}
					}
				}
			} catch (PartInitException ex) {
				throw new RuntimeException(ex);
			}
		}

		return result.toArray(new IEditorReference[result.size()]);
	}

	/**
	 * Refreshes all editor's viewers that are using certain CDOView.
	 * 
	 * @param page
	 *            the IWorkbenchPage where CDOEditor is opened
	 * @param view
	 *            instance of CDOView our editors are using
	 */
	// public static void refreshEditors(IWorkbenchPage page, CDOView view) {
	// IEditorReference[] references = findEditor(page, view, null);
	// for (IEditorReference reference : references) {
	// RAASEditorExt editor = (RAASEditorExt) reference.getEditor(false);
	// if (editor != null) {
	// editor.refreshViewer(null);
	// }
	// }
	// }
}
