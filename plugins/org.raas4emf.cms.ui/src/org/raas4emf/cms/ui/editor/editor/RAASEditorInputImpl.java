/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.editor.editor;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.common.lob.CDOBlob;
import org.eclipse.emf.cdo.common.util.CDOCommonUtil;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.net4j.util.ObjectUtil;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.IPersistableElement;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.ui.CMSActivator;

import raascms.Artifact;

public class RAASEditorInputImpl extends URIEditorInput implements RAASEditorInput {
	private CDOView view;

	private CDOObject modelElement;

	private boolean persistent;

	public RAASEditorInputImpl(CDOView view, String resourcePath, CDOObject modelElement, boolean persistent) {
		super(URI.createURI(resourcePath));
		this.view = view;
		this.modelElement = modelElement;
		this.persistent = persistent;
	}

	public RAASEditorInputImpl(IMemento memento) {
		super(memento);
		this.view = CMSActivator.getSessionInstance().openView();
		this.modelElement = (CDOObject) RAASUtils.findByPath(this.view, getResourcePath().split("\\/"));
		this.persistent = true;
		if (modelElement instanceof Artifact) {
			Artifact artifact = (Artifact) modelElement;
			if (artifact.getContents().isEmpty()) {
				try {
					modelElement = RAASUtils.assureModelTree(artifact);
					view = null;
				} catch (Exception e) {
					// treat as blob
				}
			}
		}
	}

	public CDOView getView() {
		return view;
	}

	public String getResourcePath() {
		return getURI().toString();
	}

	public boolean exists() {
		return true;
	}

	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	public String getName() {
		int fileSep, dirSep;
		if (modelElement instanceof Artifact && (fileSep = getResourcePath().lastIndexOf("/")) != -1 && (dirSep = getResourcePath().lastIndexOf("/", fileSep - 1)) != -1) {
			Artifact artifact = (Artifact) modelElement;
			if (RAASUtils.hasExtension(artifact, ".xls") || RAASUtils.hasExtension(artifact, ".psd")) {
				String dirName = getResourcePath().substring(dirSep + 1, fileSep);
				return dirName;
			}
		}
		if (modelElement != null && RAASUtils.getNameOf(modelElement) != null)
			return RAASUtils.getNameOf(modelElement);
		if (getResourcePath() != null) {
			return new Path(getResourcePath()).lastSegment();
		}

		return view.getSession().getRepositoryInfo().getName();
	}

	public IPersistableElement getPersistable() {
		if (!isPersistent())
			return null;
		return super.getPersistable();
	}

	public String getToolTipText() {
		if (view == null) {
			return RAASUtils.getNameOf(modelElement);
		}
		if (view.isClosed()) {
			return "View closed"; //$NON-NLS-1$
		}

		CDOSession session = view.getSession();
		String repositoryName = session.getRepositoryInfo().getName();

		StringBuilder builder = new StringBuilder();
		builder.append(repositoryName);
		if (getURI() != null) {
			builder.append(getURI());
		}

		builder.append(" ["); //$NON-NLS-1$
		builder.append(session.getSessionID());
		builder.append(":"); //$NON-NLS-1$
		builder.append(view.getViewID());
		builder.append("]"); //$NON-NLS-1$

		if (view.isReadOnly()) {
			builder.append(" readonly"); //$NON-NLS-1$
		}

		long timeStamp = view.getTimeStamp();
		if (timeStamp != CDOView.UNSPECIFIED_DATE) {
			builder.append(CDOCommonUtil.formatTimeStamp(timeStamp));
		}

		return builder.toString();
	}

	@Override
	public int hashCode() {
		return ObjectUtil.hashCode(view) ^ ObjectUtil.hashCode(getURI()) ^ ObjectUtil.hashCode(modelElement);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}

		if (obj instanceof RAASEditorInputImpl) {
			RAASEditorInputImpl that = (RAASEditorInputImpl) obj;
			return ObjectUtil.equals(view, that.view) && ObjectUtil.equals(getURI(), that.getURI()) && ObjectUtil.equals(modelElement, that.modelElement);
		}

		return false;
	}

	@Override
	public EObject getModelElement() {
		return modelElement;
	}

	protected String getBundleSymbolicName() {
		return CMSActivator.getContext().getBundle().getSymbolicName();
	}

	@Override
	public boolean isPersistent() {
		return persistent;
	}

	@Override
	public void doSave(IProgressMonitor progressMonitor) {
		if (view == null) {
			Artifact blobArtifact = getPersistenArtifact();
			if (blobArtifact.getContents().isEmpty()) {
				Artifact artifact = (Artifact) modelElement;
				try {
					InputStream is = artifact.asFile(artifact.getName());
					blobArtifact.setFileContent(new CDOBlob(is));
					final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
					saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
					blobArtifact.cdoResource().save(saveOptions);
				} catch (IOException e) {
					e.printStackTrace();
					throw new RuntimeException(e);
				}
			}
		}
	}

	public Artifact getPersistenArtifact() {
		if (view != null) {
			if (modelElement instanceof Artifact) {
				Artifact artifact = (Artifact) modelElement;
				return artifact;
			}
		} else {
			CDOView aView = CMSActivator.getSessionInstance().openView();
			CDOObject child = (CDOObject) RAASUtils.findByPath(aView, getResourcePath().split("\\/"));
			if (child instanceof Artifact) {
				Artifact artifact = (Artifact) child;
				return artifact;
			}
		}
		return null;
	}
}
