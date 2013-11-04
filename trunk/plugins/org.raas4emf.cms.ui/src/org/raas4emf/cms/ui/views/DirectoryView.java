/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.views;

import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.raas4emf.cms.core.ILogicalParentChildRelationship;
import org.raas4emf.cms.ui.RAASUIUtils;
import org.raas4emf.cms.ui.CMSActivator;
import org.raas4emf.cms.ui.discriminator.RAASSessionSingleton;

import raascms.Artifact;
import raascms.Folder;

public class DirectoryView extends FilesView {

	public static final String ID = DirectoryView.class.getName();

	public void createPartControl(final Composite parent) {
		super.createPartControl(parent);
		getViewer().setComparator(new ViewerComparator(new Comparator<Object>() {

			public int compare(Object s1, Object s2) {
				return ((String) s1).toLowerCase().compareTo(((String) s2).toLowerCase());
			}

		}) {

			@Override
			public int category(Object element) {

				return getCategory(element);
			}

		});
	}

	protected int getCategory(Object element) {
		if (element instanceof Folder)
			return 1;
		if (element instanceof Artifact)
			return 2;
		return 0;
	}

	@Override
	public boolean showElement(Object element) {
		return super.showElement(element);
	}

	@Override
	public String getLabelFor(Object object) {
		String s = super.getLabelFor(object);
		if (s != null && !"".equals(s))
			return DetailsView.getLabelFor(object) + " " + s;
		return s;
	}

	@Override
	public Image getImageFor(Object element) {
		// use default image
		if (element instanceof Folder || element instanceof Artifact)
			return super.getImageFor(element);
		return null;
	}

	@Override
	public Boolean hasChildrenFor(Object object) {
		Collection<EObject> children = getLogicalChildren(object);
		if (children != null)
			return children.size() >= 1;
		return super.hasChildrenFor(object);
	}

	public EObject[] getChildrenFor(Object object) {
		Collection<EObject> children = getLogicalChildren(object);
		if (children != null)
			return children.toArray(new EObject[] {});
		return null;
	}

	public static Collection<EObject> getLogicalChildren(Object object) {
		if (object instanceof Folder) {
			Folder folder = (Folder) object;
			if (!canRead(folder)) {
				return Collections.emptyList();
			}
		}
		Object adapter = Platform.getAdapterManager().getAdapter(object, ILogicalParentChildRelationship.class);
		if (adapter instanceof ILogicalParentChildRelationship) {
			ILogicalParentChildRelationship iLogicalParentChildRelationship = (ILogicalParentChildRelationship) adapter;
			return iLogicalParentChildRelationship.getLogicalChildren();
		}
		return null;
	}

	public static boolean canRead(Folder folder) {
		return canRead(folder, CMSActivator.getSessionInstance());
	}

	public static boolean canRead(Folder folder, RAASSessionSingleton sessionInstance) {
		if (sessionInstance.isOperator())
			return true;
		if (canWrite(folder, sessionInstance))
			return true;
		while (true) {
			String s = folder.getName();
			if (!allowed(s, false, sessionInstance))
				return false;
			if (folder.eContainer() instanceof Folder) {
				folder = (Folder) folder.eContainer();
				continue;
			}
			return true;
		}
	}

	private static boolean canWrite(Folder folder, RAASSessionSingleton sessionInstance) {
		if (sessionInstance.isOperator())
			return true;
		if (!sessionInstance.isLibarian())
			return false;
		while (true) {
			String s = folder.getName();
			if (allowed(s, true, sessionInstance))
				return true;
			if (folder.eContainer() instanceof Folder) {
				folder = (Folder) folder.eContainer();
				continue;
			}
			return false;
		}
	}

	public static boolean checkCanWrite(EObject eObject, Shell shell) {
		return checkCanWrite(eObject, shell, CMSActivator.getSessionInstance());
	}

	public static boolean checkCanWrite(EObject eObject, Shell shell, RAASSessionSingleton sessionInstance) {
		boolean result;
		if (eObject instanceof Folder) {
			Folder folder = (Folder) eObject;
			result = canWrite(folder, sessionInstance);
		} else {
			result = sessionInstance.isOperator();
		}
		if (!result && shell != null) {
			MessageDialog.openError(shell, "Error", "You don't have sufficient permissions to do this action!");
		}
		return result;
	}

	private static boolean allowed(String s, boolean requiresWriteAccess, RAASSessionSingleton sessionInstance) {
		boolean encounteredRead = false;
		int q;
		if ((q = s.indexOf('&')) != -1) {
			for (String part : s.substring(q + 1).split("&")) {
				part = part.trim();
				if (part.startsWith("read=")) {
					if (!requiresWriteAccess && hasPswFor(part.substring("read=".length()), sessionInstance)) {
						return true;
					}
					encounteredRead = true;
				}
				if (part.startsWith("write=")) {
					if (requiresWriteAccess && hasPswFor(part.substring("write=".length()), sessionInstance)) {
						return true;
					}
				}
			}
		}
		if (requiresWriteAccess)
			return false;
		else
			return !encounteredRead;
	}

	private static boolean hasPswFor(String fingerprint, RAASSessionSingleton sessionInstance) {
		String passwords = sessionInstance.getPasswordList();
		if (passwords.equals(CMSActivator.getSessionInstance().getUserObject("cachedPasswords"))) {
			return ((Collection<?>) CMSActivator.getSessionInstance().getUserObject("cachedFingerprints")).contains(fingerprint);
		}
		Set<String> fingerprints = new HashSet<String>();
		for (String password : passwords.split("\n")) {
			try {
				fingerprints.add(RAASUIUtils.getFingerprint(password.trim()));
			} catch (NoSuchAlgorithmException e) {
				e.printStackTrace();
			}
		}
		CMSActivator.getSessionInstance().setUserObject("cachedFingerprints", fingerprints);
		CMSActivator.getSessionInstance().setUserObject("cachedPasswords", passwords);
		return fingerprints.contains(fingerprint);
	}

	/**
	 * Opposite of {@link #getChildrenFor(Object)}
	 */
	@Override
	public EObject getParentFor(Object object) {
		return getAssertedContainer(object);
	}

	static public EObject getAssertedContainer(Object object) {
		Object adapter = Platform.getAdapterManager().getAdapter(object, ILogicalParentChildRelationship.class);
		if (adapter instanceof ILogicalParentChildRelationship) {
			ILogicalParentChildRelationship iLogicalParentChildRelationship = (ILogicalParentChildRelationship) adapter;
			return iLogicalParentChildRelationship.getAssertedContainer();
		}
		return null;
	}

	protected Object getInitialInput(CDOView trans) {
		EObject result = trans.getRootResource().eContents().get(0);
		result = result.eContents().get(0);
		return result;
	}

}
