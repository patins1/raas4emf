/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.core;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileUtil {

	public static File createTempDirectory() throws IOException {
		final File temp;

		temp = File.createTempFile("temp", Long.toString(System.nanoTime()));

		if (!(temp.delete())) {
			throw new IOException("Could not delete temp file: " + temp.getAbsolutePath());
		}

		if (!(temp.mkdir())) {
			throw new IOException("Could not create temp directory: " + temp.getAbsolutePath());
		}

		return (temp);
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
		inputstreamToOutputstreamNotClosing(is, os, length);
		os.flush();
		os.close();
	}

	public static void inputstreamToOutputstream(InputStream is, OutputStream os) throws IOException {
		inputstreamToOutputstream(is, os, Long.MAX_VALUE);
	}

	/**
	 * Writes length bytes from is to os, which is not closed at the end
	 * 
	 * @param is
	 * @param os
	 * @param length
	 * @throws IOException
	 */
	public static void inputstreamToOutputstreamNotClosing(InputStream is, OutputStream os, long length) throws IOException {
		// initialize
		byte[] buffer = new byte[1024 * 1024]; // tweaking this number may
												// increase
		// performance
		int len;
		while (length > 0 && (len = is.read(buffer, 0, (int) Math.min(buffer.length, length))) != -1) {
			os.write(buffer, 0, len);
			length -= len;
		}
		is.close();
	}

	public static String inputstreamToString(InputStream is) throws IOException {
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		try {
			FileUtil.inputstreamToOutputstream(is, os);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return os.toString();
	}

}
