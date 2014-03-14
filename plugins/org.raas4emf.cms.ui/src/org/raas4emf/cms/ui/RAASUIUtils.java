/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.net4j.util.HexUtil;
import org.eclipse.ui.handlers.HandlerUtil;
import org.raas4emf.cms.core.RAASUtils;

import raascms.Artifact;
import raascms.Folder;

public class RAASUIUtils extends RAASUtils {

	public static List<? extends Object> getSelection(ExecutionEvent event) {
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		return getSelection(selection);
	}

	public static List<? extends Object> getSelection(ISelection selection) {
		if (selection != null & selection instanceof IStructuredSelection) {
			IStructuredSelection sel = (IStructuredSelection) selection;
			return Arrays.asList(sel.toList().toArray());
		}
		return Collections.emptyList();
	}

	@SuppressWarnings("unchecked")
	public static <T extends Object> List<T> getSelection(ISelection selection, Class<T> clazz) {
		List<T> result = new ArrayList<T>();
		for (Object object : getSelection(selection)) {
			object = Platform.getAdapterManager().getAdapter(object, clazz);
			if (clazz.isInstance(object)) {
				result.add((T) object);
			}
		}
		return result;
	}

	public static <T extends Object> List<T> getSelection(ExecutionEvent event, Class<T> clazz) {
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		return getSelection(selection, clazz);
	}

	@SuppressWarnings("unchecked")
	public static <T> T getAdapter(Object adaptable, Class<T> adapterType) {
		T result = (T) Platform.getAdapterManager().getAdapter(adaptable, adapterType);
		if (result == null)
			throw new RuntimeException("Could not find " + adapterType.getName());
		return result;
	}

	@SuppressWarnings("unchecked")
	public static <T> T getAdapterIfExists(Object adaptable, Class<T> adapterType) {
		T result = (T) Platform.getAdapterManager().getAdapter(adaptable, adapterType);
		return result;
	}

	public static String getPath(EObject val) {
		String result = "";
		EObject cont = val;
		while (cont != null) {
			if (cont instanceof Artifact || cont instanceof Folder) {
				result = RAASUtils.getNameOf(cont);
				while ((cont = cont.eContainer()) instanceof Folder) {
					result = ((Folder) cont).getName() + "/" + result;
				}
				return result;
			}
			cont = cont.eContainer();
		}
		return "unknown";
	}

	public static String getFingerprint(String password) throws NoSuchAlgorithmException {
		MessageDigest digest = MessageDigest.getInstance("SHA-1");
		digest.update(password.getBytes());
		byte[] id = digest.digest();
		String fingerprint = HexUtil.bytesToHex(id);
		return fingerprint;
	}

}
