/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package au.com.smartservicescrc.raas.codegen.jaxws.util;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.JavaCore;
import org.osgi.framework.Bundle;

import au.com.smartservicescrc.raas.codegen.jaxws.Activator;

public class ResourceUtil {
	/**
	 * Copy a file from one eclipse project to another.
	 */
	public static IFile copyFile(IFolder folder, String from, String to, Map<String, String> replacements) throws IOException, CoreException {
		final Bundle bundle = Activator.getDefault().getBundle();
		InputStream in = FileLocator.openStream(bundle, new Path(from), false);
		return copyFile(folder, in, to, replacements);
	}

	/**
	 * Copy a file from one eclipse project to another.
	 */
	public static IFile copyFile(IFolder folder, File from, String to, Map<String, String> replacements) throws IOException, CoreException {
		InputStream in = new FileInputStream(from);
		return copyFile(folder, in, to, replacements);
	}

	/**
	 * Copy a file from one eclipse project to another.
	 */
	public static IFile copyFile(IFolder folder, InputStream in, String to, Map<String, String> replacements) throws IOException, CoreException {
		if (replacements != null && !replacements.isEmpty()) {
			String result = convertStreamToString(in);
			result = replace(result, replacements);
			in = new ByteArrayInputStream(result.getBytes());
		}
		IFile file = folder.getFile(to);
		if (file.getParent() instanceof IFolder)
			createFolder((IFolder) file.getParent(), null);
		if (file.exists()) {
			file.setContents(in, true, false, null);
		} else {
			file.create(in, true, null);
		}
		if (to.endsWith(".java"))
			JavaCore.create(file);
		return file;
	}

	/**
	 * Copy contents to a file.
	 */
	public static IFile copyContents(IFolder folder, String result, String to) throws IOException, CoreException {
		IFile file = folder.getFile(to);
		if (file.getParent() instanceof IFolder)
			createFolder((IFolder) file.getParent(), null);
		if (file.exists()) {
			file.setContents(new ByteArrayInputStream(result.getBytes()), true, false, null);
		} else {
			file.create(new ByteArrayInputStream(result.getBytes()), true, null);
		}
		JavaCore.create(file);
		return file;
	}

	public static void createFolder(IFolder folder, IProgressMonitor monitor) throws CoreException {
		if (!folder.exists()) {
			IContainer parent = folder.getParent();
			if (parent instanceof IFolder) {
				createFolder((IFolder) parent, null);
			}
			folder.create(IResource.NONE, true, monitor);
		}
	}

	/**
	 * Reads an InputStream and returns a String. There must be a shorter way to do this?
	 */
	public static String convertStreamToString(InputStream is) throws IOException {
		if (is != null) {
			StringBuilder sb = new StringBuilder();
			String line;
			try {
				BufferedReader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
				while ((line = reader.readLine()) != null) {
					sb.append(line).append("\n");
				}
			} finally {
				is.close();
			}
			return sb.toString();
		} else {
			return "";
		}
	}

	static public String replace(String result, Map<String, String> replacements) {
		for (Map.Entry<String, String> e : replacements.entrySet()) {
			result = result.replace(e.getKey(), e.getValue());
		}
		return result;
	}
}
