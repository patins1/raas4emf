/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.transformation;

import java.io.File;
import java.io.IOException;

import org.eclipse.core.runtime.IProgressMonitor;

public interface IArtifactTransformator {

	/**
	 * Transforms the input located at the given URL.
	 * 
	 * @param artifact
	 * @param desiredOutputDirectory
	 *            desired output directory
	 * @param desiredPureFilename
	 *            desired output file name without extension
	 * @param monitor
	 * @return the resulting file of the transformation
	 * @throws IOException
	 */
	File transform(Object artifact, File desiredOutputDirectory, String desiredPureFilename, IProgressMonitor monitor) throws IOException;

}
