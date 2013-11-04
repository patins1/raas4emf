/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.transformation;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.runtime.IProgressMonitor;

/**
 * Implementors perform a transformation of an input to an output file. When one of the transform() methods is called, the output file should be overwritten if already existent. The {@link #getTargetFile(File, String)} method just returns the (not yet existent) expected output file, thus enabling the framework to skip triggering
 * the transform() methods if the output file already exist. In such a case that a cached result is reused, the progress monitor would be increased by {@link #totalWork()}. Note that this interface makes no assumptions about file name extensions (they are relevant only for the extension
 * <code>org.raas4emf.cms.transformation.transformator</code> ).
 * 
 * @author kiegelan
 */
public interface ITranformator {

	/**
	 * Transforms the given file input. Note that the resulting file should be written into the given directory having the given pure file name (without extension).
	 * 
	 * @param inputFile
	 * @param desiredOutputDirectory
	 *            desired output directory
	 * @param desiredPureFilename
	 *            desired output file name without extension
	 * @param monitor
	 * @return the resulting file of the transformation
	 * @throws IOException
	 */
	File transform(File inputFile, File desiredOutputDirectory, String desiredPureFilename, IProgressMonitor monitor) throws IOException;

	/**
	 * Same as the other transform method, but passing an input stream instead of an file as input.
	 * 
	 * @param inputStream
	 * @param desiredOutputDirectory
	 *            desired output directory
	 * @param desiredPureFilename
	 *            desired output file name without extension
	 * @param monitor
	 * @return
	 * @throws IOException
	 */
	File transform(InputStream inputStream, File desiredOutputDirectory, String desiredPureFilename, IProgressMonitor monitor) throws IOException;

	/**
	 * @param desiredOutputDirectory
	 *            desired output directory
	 * @param desiredPureFilename
	 *            desired output file name without extension; note that implementors can choose there own filename
	 * @return the file which is returned by one of the transform() methods.
	 */
	File getTargetFile(File desiredOutputDirectory, String desiredPureFilename);

	/**
	 * @return the total work which is done by one of the transform() methods.
	 */
	int totalWork();

}
