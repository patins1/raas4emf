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
import java.net.URL;
import java.util.Date;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.raas4emf.cms.core.Activator;
import org.raas4emf.cms.core.FileUtil;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.transformation.IArtifactTransformator;
import org.raas4emf.cms.transformation.ITranformator;
import org.raas4emf.cms.transformation.StreamGobbler;
import org.raas4emf.cms.transformation.TransformationUtils;

import raascms.Artifact;

public class IfcToThreejsTranformator implements IArtifactTransformator, ITranformator {

	public static RemoteGeometryStorage REMOTE_STORAGE = null;
	static File DEFAULT_BLENDER_LOCATION = null;
	private int worked;
	private String errorMessages = "";

	public IfcToThreejsTranformator() {
		// nothing to do
	}

	public File transform(Object oArtifact, File dir, String pureFilename, final IProgressMonitor monitor) throws IOException {
		Exception throwEx = null;
		Artifact artifact = (Artifact) oArtifact;
		Activator.log("Start transforming " + pureFilename);
		worked = 0;
		Date started = new Date();
		monitor.subTask("Prepare IFC file");
		File targetFile = new File(dir, pureFilename + getExportExt());
		File errorFile = new File(dir, pureFilename + getExportExt() + ".error");
		try {

			if (errorFile.exists())
				errorFile.delete();
			String cmd = null;
			File blendFile = null;

			String REMOTE_BLENDER_URL = System.getProperty("REMOTE_BLENDER_URL");

			String fingerprint = artifact.getFingerPrint();
			String ifcUrl = System.getProperty(fingerprint + ".ifc");
			String jsUrl = System.getProperty(fingerprint + ".js");
			System.setProperty(fingerprint + ".ifc", "");
			System.setProperty(fingerprint + ".js", "");
			if (REMOTE_STORAGE != null) {
				try {
					if (REMOTE_STORAGE.saveAsFile(fingerprint, targetFile)) {
						return targetFile;
					}
				} catch (Exception e) {
					throwEx = e;
					Activator.err("REMOTE_STORAGE.saveAsFile not succesfull!", e);
				}
			}

			boolean useRemoteConversion = REMOTE_BLENDER_URL != null;
			if (!useRemoteConversion) {
				File ifcFile = new File(dir, pureFilename + ".ifc");
				blendFile = new File(dir, pureFilename + ".blend");
				FileOutputStream y = new FileOutputStream(ifcFile);
				InputStream ifcStream = artifact.getFileContent().getContents();
				FileUtil.inputstreamToOutputstream(ifcStream, y);
				ifcStream.close();

				if (DEFAULT_BLENDER_LOCATION == null)
					DEFAULT_BLENDER_LOCATION = new File(RAASUtils.getRAASProp("BLENDER"));
				try {
					DEFAULT_BLENDER_LOCATION.setExecutable(true);
				} catch (Exception e) {
					Activator.err("Cannot set blender to be executable!", e);
				}

				File untitledBlenderFile = TransformationUtils.getResourceAsTempFile(IfcToThreejsTranformator.class, "untitled.blend");
				// TODO Toowoomba-2012-05-17_optimized.ifc and Door Sliding have problem with splitting, so disable for now
				File script = TransformationUtils.getResourceAsTempFile(IfcToThreejsTranformator.class, "IfcImportExport.py");

				cmd = TransformationUtils.quote(DEFAULT_BLENDER_LOCATION) + " -nojoystick -noaudio -b " + TransformationUtils.quote(untitledBlenderFile) + " -P " + TransformationUtils.quote(script) + " -- " + TransformationUtils.quote(ifcFile) + " " + TransformationUtils.quote(targetFile);

			} else {
				if (ifcUrl == null || "".equals(ifcUrl)) {
					throw (throwEx != null ? throwEx : (throwEx = new RuntimeException("Geometry not available")));
				}
				boolean isWindows = System.getProperty("os.name").contains("Windows");

				String key = new File(FileLocator.resolve(new URL("platform:/plugin/org.raas4emf.cms.core/scripting/" + (isWindows ? "blenderfarm.ppk" : "blenderfarm.pem"))).getFile()).toString();
				if (!isWindows) {
					try {
						Process process = Runtime.getRuntime().exec("chmod 400 " + key, null);
						int exitValue = process.waitFor();
						if (exitValue != 0) {
							Activator.err("CHMOD exit value: " + exitValue);
						}
					} catch (Exception e) {
						Activator.err("CHMOD exception", e);
					}
				}

				File commandsTemplate = new File(new File(key).getParentFile(), "commands_template.sh");

				String commands = "bin/ifc2jshttp.sh %FINGERPRINT% \"%IFCURL%\" \"%JSURL%\""; // TransformationUtils.stringFromFile(commandsTemplate);
				commands = commands.replace("%IFCURL%", ifcUrl);
				commands = commands.replace("%JSURL%", jsUrl);
				if (isWindows)
					TransformationUtils.stringToFile(commandsTemplate, commands);
				String sshCommand;
				if (isWindows)
					sshCommand = "plink.exe -batch -i %SSHKEYFILE% -P 22 -ssh %REMOTE_BLENDER_URL% -m \"%EXTERNALCOMMANDFILE%\"";
				else
					sshCommand = "ssh -o StrictHostKeyChecking=no -i %SSHKEYFILE% %REMOTE_BLENDER_URL% bin/ifc2jshttp.sh %FINGERPRINT% \"%IFCURL%\" \"%JSURL%\" %IFCSIZE%";

				try {
					if (RAASUtils.getRAASProp("BLENDER_SSH_COMMAND") != null)
						sshCommand = RAASUtils.getRAASProp("BLENDER_SSH_COMMAND");
				} catch (Exception e) {

				}

				try {
					if (RAASUtils.getRAASProp("SSHKEYFILE") != null)
						key = RAASUtils.getRAASProp("SSHKEYFILE");
				} catch (Exception e) {

				}

				sshCommand = sshCommand.replace("%SSHKEYFILE%", key);
				sshCommand = sshCommand.replace("%REMOTE_BLENDER_URL%", REMOTE_BLENDER_URL);
				sshCommand = sshCommand.replace("%EXTERNALCOMMANDFILE%", commandsTemplate.toString());
				sshCommand = sshCommand.replace("%IFCURL%", ifcUrl);
				sshCommand = sshCommand.replace("%JSURL%", jsUrl);
				sshCommand = sshCommand.replace("%FINGERPRINT%", fingerprint);
				sshCommand = sshCommand.replace("%IFCSIZE%", "" + artifact.getFileContent().getSize());

				cmd = sshCommand;
				// cmd = "putty.exe -i " + TransformationUtils.quote(key) + " -ssh " + REMOTE_BLENDER_URL + " 22 -m " + TransformationUtils.quote(commands);

			}

			monitor.worked(1);
			if (monitor.isCanceled())
				return null;
			monitor.subTask("Creating geometry");

			Activator.info("Executing " + cmd);
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
			int exitValue = process.waitFor();
			Activator.log("Exit value=" + exitValue);
			Activator.log("Written to " + targetFile);
			if (exitValue != 0 || !targetFile.exists()) {
				Activator.err("IFC transformation error:\n" + errorMessages);
				FileUtil.inputstreamToOutputstream(new StringBufferInputStream("Blender exit value = " + exitValue + "\n" + errorMessages), new FileOutputStream(errorFile));
			}
			Date ended = new Date();
			Activator.log("Seconds elapsed =  " + (ended.getTime() - started.getTime()) / 1000);
			// ifcFile.delete();
			if (blendFile != null && !blendFileRequired())
				blendFile.delete();

			monitor.worked(1);
		} catch (Exception e) {
			if (throwEx != null)
				throw (RuntimeException) throwEx;
			String message = e.getMessage() != null ? e.getMessage() : e.getClass().getName();
			FileUtil.inputstreamToOutputstream(new StringBufferInputStream(message + "\n" + errorMessages), new FileOutputStream(errorFile));
			Activator.err("Stopped conversion with message: " + message, e);
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

	@Override
	public File transform(InputStream inputStream, File desiredOutputDirectory, String desiredPureFilename, IProgressMonitor monitor) throws IOException {
		throw new IOException("Not implemented");
	}

}
