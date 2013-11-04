/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.core.webgl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.eclipse.core.runtime.IProgressMonitor;
import org.raas4emf.cms.core.LoggingUtil;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.transformation.ITranformator;
import org.raas4emf.cms.transformation.StreamGobbler;
import org.raas4emf.cms.transformation.TransformationUtils;

public class IfcToThreejsTranformator implements ITranformator {

	static File DEFAULT_BLENDER_LOCATION = null;
	private int worked;
	private String errorMessages = "";

	public IfcToThreejsTranformator() {
		// nothing to do
	}

	public File transform(InputStream ifcStream, File dir, String pureFilename, final IProgressMonitor monitor) throws IOException {
		System.out.println("Start transforming " + pureFilename);
		if (DEFAULT_BLENDER_LOCATION == null)
			DEFAULT_BLENDER_LOCATION = new File(RAASUtils.getRAASProp("BLENDER"));
		worked = 0;
		Date started = new Date();
		monitor.subTask("Prepare IFC file");
		File ifcFile = new File(dir, pureFilename + ".ifc");
		File blendFile = new File(dir, pureFilename + ".blend");
		FileOutputStream y = new FileOutputStream(ifcFile);
		new IFCGuidByIndexPatch(ifcStream, y).trigger();
		y.flush();
		y.close();
		ifcStream.close();
		monitor.worked(1);
		if (monitor.isCanceled())
			return null;
		monitor.subTask("Creating geometry");
		File targetFile = new File(dir, pureFilename + getExportExt());
		File untitledBlenderFile = TransformationUtils.getResourceAsTempFile(IfcToThreejsTranformator.class, "untitled.blend");
		// TODO Toowoomba-2012-05-17_optimized.ifc and Door Sliding have problem with splitting, so disable for now
		File script = TransformationUtils.getResourceAsTempFile(IfcToThreejsTranformator.class, "IfcImportExport.py");
		String cmd = TransformationUtils.quote(DEFAULT_BLENDER_LOCATION) + " -nojoystick -noaudio -b " + TransformationUtils.quote(untitledBlenderFile) + " -P " + TransformationUtils.quote(script) + " -- " + TransformationUtils.quote(ifcFile) + " " + TransformationUtils.quote(targetFile);
		System.out.println("Executing " + cmd);
		try {
			Process process = Runtime.getRuntime().exec(cmd, null);
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
				LoggingUtil.log("IFC transformation error:");
				LoggingUtil.log(errorMessages);
			}
			System.out.println("Exit value=" + exitValue);
			System.out.println("Written to " + targetFile);
			Date ended = new Date();
			System.out.println("Seconds elapsed =  " + (ended.getTime() - started.getTime()) / 1000);
			// ifcFile.delete();
			if (!blendFileRequired())
				blendFile.delete();
			monitor.worked(1);
		} catch (Exception e) {
			System.out.println("Stopped conversion with message: " + e.getMessage());
			LoggingUtil.log(e.getMessage(), e);
			e.printStackTrace();
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
