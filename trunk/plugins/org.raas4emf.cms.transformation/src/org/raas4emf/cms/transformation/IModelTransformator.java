/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.transformation;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;

public interface IModelTransformator {

	/**
	 * Transforms the given model input, which is normally an EMF representation of the corresponding file.
	 * 
	 * @param inputModel
	 * @param desiredOutputDirectory
	 *            desired output directory
	 * @param desiredPureFilename
	 *            desired output file name without extension
	 * @param monitor
	 * @return the resulting file of the transformation
	 * @throws IOException
	 */
	File transform(List<?> inputModel, File desiredOutputDirectory, String desiredPureFilename, IProgressMonitor monitor) throws IOException;

}
