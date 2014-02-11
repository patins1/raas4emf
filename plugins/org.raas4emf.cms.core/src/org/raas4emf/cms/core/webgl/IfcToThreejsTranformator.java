/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.core.webgl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringBufferInputStream;
import java.util.Date;

import org.eclipse.core.runtime.IProgressMonitor;
import org.raas4emf.cms.core.Activator;
import org.raas4emf.cms.core.FileUtil;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.transformation.ITranformator;
import org.raas4emf.cms.transformation.StreamGobbler;
import org.raas4emf.cms.transformation.TransformationUtils;

public class IfcToThreejsTranformator implements ITranformator {

	public static final boolean USE_GUIDS = true;
	static File DEFAULT_BLENDER_LOCATION = null;
	private int worked;
	private String errorMessages = "";

	public IfcToThreejsTranformator() {
		// nothing to do
	}

	public File transform(InputStream ifcStream, File dir, String pureFilename, final IProgressMonitor monitor) throws IOException {
		Activator.log("Start transforming " + pureFilename);
		worked = 0;
		Date started = new Date();
		monitor.subTask("Prepare IFC file");
		File ifcFile = new File(dir, pureFilename + ".ifc");
		File blendFile = new File(dir, pureFilename + ".blend");
		File targetFile = new File(dir, pureFilename + getExportExt());
		File errorFile = new File(dir, pureFilename + getExportExt() + ".error");
		try {
			FileOutputStream y = new FileOutputStream(ifcFile);
			if (USE_GUIDS)
				FileUtil.inputstreamToOutputstream(ifcStream, y);
			else
				new IFCGuidByIndexPatch(ifcStream, y).trigger();
			y.flush();
			y.close();
			ifcStream.close();
			monitor.worked(1);
			if (monitor.isCanceled())
				return null;
			monitor.subTask("Creating geometry");
			if (errorFile.exists())
				errorFile.delete();
			File untitledBlenderFile = TransformationUtils.getResourceAsTempFile(IfcToThreejsTranformator.class, "untitled.blend");
			// TODO Toowoomba-2012-05-17_optimized.ifc and Door Sliding have problem with splitting, so disable for now
			File script = TransformationUtils.getResourceAsTempFile(IfcToThreejsTranformator.class, "IfcImportExport.py");
			if (DEFAULT_BLENDER_LOCATION == null)
				DEFAULT_BLENDER_LOCATION = new File(RAASUtils.getRAASProp("BLENDER"));
			try {
				DEFAULT_BLENDER_LOCATION.setExecutable(true);
			} catch (Exception e) {
				Activator.err("Cannot set blender to be executable!", e);
			}

			String cmd = TransformationUtils.quote(DEFAULT_BLENDER_LOCATION) + " -nojoystick -noaudio -b " + TransformationUtils.quote(untitledBlenderFile) + " -P " + TransformationUtils.quote(script) + " -- " + TransformationUtils.quote(ifcFile) + " " + TransformationUtils.quote(targetFile);
			Activator.log("Executing " + cmd);
			String[] envp = null;
			if (System.getProperty("LD_LIBRARY_PATH") != null)
				envp = new String[] { "LD_LIBRARY_PATH=" + System.getProperty("LD_LIBRARY_PATH") };
			Process process = Runtime.getRuntime().exec(cmd, envp);
			StreamGobbler errorGobbler = new StreamGobbler(process.getErrorStream(), "ERROR") {

				@Override
				protected void println(String line) {
					super.println(line);
					errorMessages += line + "\n";
				}

			};
			StreamGobbler outputGobbler = new StreamGobbler(process.getInputStream(), "OUTPUT") {
				@Override
				protected void println(String line) {
					super.println(line);
					if (line.startsWith("[")) {
						int routes = 0;
						for (int i = 0; i < line.length(); i++) {
							if (line.charAt(i) == '#') {
								routes++;
							}
						}
						monitor.worked(routes - worked);
						worked = routes;
					}
					if (line.contains("Done creating geometry")) {
						monitor.worked(50 - worked);
					}
					if (line.contains("Processing relations")) {
						monitor.subTask("Building hierarchy");
					}
					if (line.contains("Done processing relations")) {
						monitor.worked(1);
						monitor.subTask("Finishing model import");
					}
					if (line.contains("RENAME")) {
						monitor.worked(1);
						monitor.subTask("Renaming objects");
					}
					if (line.contains("SAVEASBLEND")) {
						monitor.worked(1);
						monitor.subTask("Saving Blender file");
					}
					if (line.contains("EXPORT")) {
						monitor.worked(1);
						monitor.subTask("Exporting to 3D format");
					}
					if (line.contains("FINISHED")) {
						monitor.worked(1);
						monitor.subTask("Finishing Blender execution");
					}
				}
			};
			errorGobbler.start();
			outputGobbler.start();
			process.waitFor();
			int exitValue = process.exitValue();
			if (exitValue != 0) {
				Activator.err("IFC transformation error:\n" + errorMessages);
				FileUtil.inputstreamToOutputstream(new StringBufferInputStream("Blender exit value = " + exitValue + "\n" + errorMessages), new FileOutputStream(errorFile));
			}
			Activator.log("Exit value=" + exitValue);
			Activator.log("Written to " + targetFile);
			Date ended = new Date();
			Activator.log("Seconds elapsed =  " + (ended.getTime() - started.getTime()) / 1000);
			// ifcFile.delete();
			if (!blendFileRequired())
				blendFile.delete();
			monitor.worked(1);
		} catch (Exception e) {
			FileUtil.inputstreamToOutputstream(new StringBufferInputStream(e.getMessage()), new FileOutputStream(errorFile));
			Activator.err("Stopped conversion with message: " + e.getMessage(), e);
		}
		return targetFile;
	}

	protected boolean blendFileRequired() {
		return false;
	}

	@Override
	public File transform(File inputFile, File dir, String pureFilename, IProgressMonitor monitor) throws IOException {
		return transform(new FileInputStream(inputFile), dir, pureFilename, monitor);
	}

	@Override
	public int totalWork() {
		return 1 + 50 + 6;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public File getTargetFile(File dir, String pureFilename) {
		return new File(dir, pureFilename + ".js");
	}

	public String getExportExt() {
		return ".js";
	}

}
