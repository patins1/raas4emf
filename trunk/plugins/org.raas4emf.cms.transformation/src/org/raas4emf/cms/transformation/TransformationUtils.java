/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.transformation;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.Platform;

public class TransformationUtils {

	public static final String TRANSFORMATOR_CLASS = "class";
	public static final String SOURCE_FILE_EXTENSION = "sourceFileExtension";
	static final String TARGET_FILE_EXTENSION = "targetFileExtension";
	private static final String DESCRIPTION = "description";
	public static IConfigurationElement[] ADDITIONAL_TRANSFORMATORS = new IConfigurationElement[] {};
	static private Map<String, Collection<IConfigurationElement>> extensionMap = new HashMap<String, Collection<IConfigurationElement>>();

	/**
	 * @param path
	 * @return the given path, quoted if it contains a space
	 */
	public static String quote(File path) {
		if (path.toString().contains(" "))
			return "\"" + path.toString() + "\"";
		return path.toString();
	}

	/**
	 * Writes length bytes from is to os
	 * 
	 * @param is
	 * @param os
	 * @param length
	 * @throws IOException
	 */
	public static void inputstreamToOutputstream(InputStream is, OutputStream os, long length) throws IOException {
		// initialize
		byte[] buffer = new byte[1024 * 1024]; // tweaking this number may increase
		// performance
		int len;
		while (length > 0 && (len = is.read(buffer, 0, (int) Math.min(buffer.length, length))) != -1) {
			os.write(buffer, 0, len);
			length -= len;
		}
		os.flush();
		is.close();
		os.close();
	}

	public static void stringToFile(File file, String gsmContent) throws IOException {
		InputStream in = new ByteArrayInputStream(gsmContent.getBytes());
		OutputStream out = new FileOutputStream(file);

		// Copy the bits from instream to outstream
		byte[] buf = new byte[1024];
		int len;
		while ((len = in.read(buf)) > 0) {
			out.write(buf, 0, len);
		}
		in.close();
		out.close();
	}

	public static String stringFromFile(File sourceLocation) throws IOException {
		InputStream in = new FileInputStream(sourceLocation);
		ByteArrayOutputStream out = new ByteArrayOutputStream();

		// Copy the bits from instream to outstream
		byte[] buf = new byte[1024];
		int len;
		while ((len = in.read(buf)) > 0) {
			out.write(buf, 0, len);
		}
		in.close();
		out.close();

		return new String(out.toByteArray());
	}

	/**
	 * Find all converters for the given file extension
	 */
	public static Collection<IConfigurationElement> getConvertersFor(String fileExtension) {
		assureInitialized();
		Set<IConfigurationElement> result = new HashSet<IConfigurationElement>();
		Set<String> handledFileExtensions = new HashSet<String>();
		collectConverters(result, handledFileExtensions, fileExtension);
		return result;
	}

	private static void assureInitialized() {
		synchronized (extensionMap) {
			if (extensionMap.isEmpty()) {
				if (Platform.getExtensionRegistry() != null) {
					IExtension[] extensions = Platform.getExtensionRegistry().getExtensionPoint(Activator.getDefault().getBundle().getSymbolicName(), "transformator").getExtensions();
					for (IExtension extension : extensions) {
						IConfigurationElement[] configurationElements = extension.getConfigurationElements();
						addConfigurationElements(configurationElements);
					}
				}
				addConfigurationElements(ADDITIONAL_TRANSFORMATORS);
			}
		}
	}

	private static void addConfigurationElements(IConfigurationElement[] configurationElements) {
		for (IConfigurationElement element : configurationElements) {
			String sourceFileExtension = element.getAttribute(SOURCE_FILE_EXTENSION); //$NON-NLS-1$
			Collection<IConfigurationElement> transformers = extensionMap.get(sourceFileExtension);
			if (transformers == null) {
				transformers = new ArrayList<IConfigurationElement>();
				extensionMap.put(sourceFileExtension, transformers);
			}
			transformers.add(element);
		}
	}

	private static void collectConverters(Set<IConfigurationElement> result, Set<String> handledFileExtensions, String fileExtension) {
		if (!handledFileExtensions.add(fileExtension))
			return;
		Collection<IConfigurationElement> transformers = extensionMap.get(fileExtension);
		if (transformers != null)
			for (IConfigurationElement element : transformers) {
				collectConverters(result, handledFileExtensions, element.getAttribute(TARGET_FILE_EXTENSION));
				result.add(element);
			}
	}

	private static boolean collectConverterChain(List<ITranformator> result, Set<String> handledFileExtensions, String fileExtension, String targetFileExtension) {
		if (!handledFileExtensions.add(fileExtension))
			return false;
		if (targetFileExtension.equals(fileExtension)) {
			return true;
		}
		Collection<IConfigurationElement> transformers = extensionMap.get(fileExtension);
		if (transformers != null)
			for (IConfigurationElement element : transformers) {
				if (collectConverterChain(result, handledFileExtensions, element.getAttribute(TARGET_FILE_EXTENSION), targetFileExtension)) {
					try {
						result.add(0, (ITranformator) element.createExecutableExtension(TRANSFORMATOR_CLASS));
					} catch (CoreException e) {
						throw new RuntimeException(e);
					}
					return true;
				}
			}
		return false;
	}

	public static String getFileExtension(String name) {
		if (name == null)
			return "";
		int index = name.lastIndexOf('.');
		if (index != -1)
			return name.substring(index + 1);
		return "";
	}

	public static String getPureFilename(String name) {
		if (name == null)
			return "";
		int index = name.indexOf('.');
		if (index != -1)
			return name.substring(0, index);
		return "";
	}

	public static List<ITranformator> getConverterChain(String sourceFileExtension, String targetFileExtension) {
		assureInitialized();
		List<ITranformator> result = new ArrayList<ITranformator>();
		Set<String> handledFileExtensions = new HashSet<String>();
		collectConverterChain(result, handledFileExtensions, sourceFileExtension, targetFileExtension);
		return result;
	}

	public static String getTargetFileExtension(IConfigurationElement transformator) {
		return transformator.getAttribute(TARGET_FILE_EXTENSION);
	}

	public static String getDescription(IConfigurationElement transformator) {
		return transformator.getAttribute(DESCRIPTION);
	}

	static public File getResourceAsTempFile(Class<?> clazz, String relPath) throws IOException {
		InputStream s = clazz.getResourceAsStream(relPath);
		String tmpDir = System.getProperty("java.io.tmpdir");
		File file = new File(tmpDir, relPath);
		// create parent folders
		file.getParentFile().mkdirs();
		// extract from jar file to local file
		inputstreamToOutputstream(s, new FileOutputStream(file), Integer.MAX_VALUE);

		return file;
	}

}
