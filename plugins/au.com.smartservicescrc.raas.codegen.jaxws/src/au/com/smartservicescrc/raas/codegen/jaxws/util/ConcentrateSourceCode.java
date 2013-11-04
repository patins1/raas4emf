/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package au.com.smartservicescrc.raas.codegen.jaxws.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Developer utility: copy source code folders in on folder to be used for source lookup in Eclipse
 */
public class ConcentrateSourceCode {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		copyDirectory(new File("C:\\dev\\cxf"), new File("C:\\dev\\cxfsrc"), false);
		// copyDirectory(new File("C:\\dev\\jaxb-ri-2_2_2.src\\jaxb-ri"), new
		// File("C:\\dev\\jaxb-ri-2_2_2.src\\src"), false);
	}

	static public void copyDirectory(File sourceLocation, File targetLocation, boolean isIn) throws IOException {

		if (sourceLocation.isDirectory()) {
			if (!targetLocation.exists()) {
				targetLocation.mkdir();
			}

			if (!isIn) {
				// isIn = sourceLocation.toString().endsWith("src\\main\\java");
				isIn = sourceLocation.toString().endsWith("\\src");
			}
			String[] children = sourceLocation.list();
			for (int i = 0; i < children.length; i++) {
				if (isIn) {
					copyDirectory(new File(sourceLocation, children[i]), new File(targetLocation, children[i]), isIn);
				} else {
					copyDirectory(new File(sourceLocation, children[i]), targetLocation, isIn);
				}
			}
		} else if (isIn) {

			InputStream in = new FileInputStream(sourceLocation);
			OutputStream out = new FileOutputStream(targetLocation);

			// Copy the bits from instream to outstream
			byte[] buf = new byte[1024];
			int len;
			while ((len = in.read(buf)) > 0) {
				out.write(buf, 0, len);
			}
			in.close();
			out.close();
		}
	}

	static public void deleteSVNDirectory(File sourceLocation) throws IOException {

		boolean isIn;
		if (sourceLocation.isDirectory()) {
			isIn = sourceLocation.toString().endsWith("\\.svn");
			if (isIn) {
				deleteDirectory(sourceLocation);
				return;
			}
			String[] children = sourceLocation.list();
			for (int i = 0; i < children.length; i++) {
				deleteDirectory(new File(sourceLocation, children[i]));
			}
		}
	}

	static public boolean deleteDirectory(File path) {
		if (path.exists()) {
			File[] files = path.listFiles();
			for (int i = 0; i < files.length; i++) {
				if (files[i].isDirectory()) {
					deleteDirectory(files[i]);
				} else {
					files[i].delete();
				}
			}
		}
		return (path.delete());
	}
}
