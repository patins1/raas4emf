/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.PartInitException;

public class ViewAsEditor implements IEditorPart, IEditingDomainProvider, ISelectionProvider {

	private final IViewPart view;
	private final IEditingDomainProvider editingDomainProvider;
	private final ISelectionProvider selectionProvider;

	public ViewAsEditor(IViewPart view, IEditingDomainProvider editingDomainProvider, ISelectionProvider selectionProvider) {
		this.view = view;
		this.editingDomainProvider = editingDomainProvider;
		this.selectionProvider = selectionProvider;
	}

	@Override
	public void addPropertyListener(IPropertyListener listener) {
		view.addPropertyListener(listener);
	}

	@Override
	public void createPartControl(Composite parent) {
		view.createPartControl(parent);
	}

	@Override
	public void dispose() {
		view.dispose();
	}

	@Override
	public IWorkbenchPartSite getSite() {
		return view.getSite();
	}

	@Override
	public String getTitle() {
		return view.getTitle();
	}

	@Override
	public Image getTitleImage() {
		return view.getTitleImage();
	}

	@Override
	public String getTitleToolTip() {
		return view.getTitleToolTip();
	}

	@Override
	public void removePropertyListener(IPropertyListener listener) {
		view.removePropertyListener(listener);
	}

	@Override
	public void setFocus() {
		view.setFocus();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class adapter) {
		return view.getAdapter(adapter);
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
	}

	@Override
	public void doSaveAs() {
	}

	@Override
	public boolean isDirty() {
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	@Override
	public boolean isSaveOnCloseNeeded() {
		return false;
	}

	@Override
	public IEditorInput getEditorInput() {
		return null;
	}

	@Override
	public IEditorSite getEditorSite() {
		return null;
	}

	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
	}

	@Override
	public EditingDomain getEditingDomain() {
		return editingDomainProvider.getEditingDomain();
	}

	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		selectionProvider.addSelectionChangedListener(listener);
	}

	@Override
	public ISelection getSelection() {
		return selectionProvider.getSelection();
	}

	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		selectionProvider.removeSelectionChangedListener(listener);
	}

	@Override
	public void setSelection(ISelection selection) {
		selectionProvider.setSelection(selection);
	}
}
