package org.raas4emf.cms.core.webgl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Collections;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.raas4emf.cms.core.Activator;
import org.raas4emf.cms.transformation.ITranformator;
import org.raas4emf.cms.transformation.StreamGobbler;
import org.raas4emf.cms.transformation.TransformationUtils;

public class IfcToColladaTranformator implements ITranformator {

	@Override
	public File transform(File ifcName, File dir, String pureFilename, IProgressMonitor monitor) throws IOException {
		monitor.subTask("Transform IFC to Collada");
		File sceneFile = getTargetFile(dir, pureFilename);
		boolean isWindows = System.getProperty("os.name").contains("Windows");

		File DEFAULT_CONVERTER_LOCATION = new File(
				FileLocator.resolve(new URL("platform:/plugin/org.raas4emf.cms.core/binaries/ifcconvert/"
						+ (isWindows ? "windows/IfcConvert.exe" : "linux/IfcConvert"))).getFile());
		try {
			Files.setPosixFilePermissions( DEFAULT_CONVERTER_LOCATION.toPath(), Collections.singleton(PosixFilePermission.OWNER_EXECUTE));
		} catch (Exception e) {
			// Ignore.. permission bit tested below
		}
		Activator.log("DEFAULT_CONVERTER_LOCATION=" + DEFAULT_CONVERTER_LOCATION+" canExecute="+DEFAULT_CONVERTER_LOCATION.canExecute());

		String cmd = TransformationUtils.quote(DEFAULT_CONVERTER_LOCATION)	+ " --weld-vertices" + getOptions() + " --use-element-types --orient-shells " + TransformationUtils.quote(ifcName) + " " + TransformationUtils.quote(sceneFile);
		final File errorFile = new File(dir, pureFilename + getExportExt() + ".error");
		Activator.log("Executing " + cmd);
		try {
			if (errorFile.exists())
				errorFile.delete();
			Process process = Runtime.getRuntime().exec(cmd, null, DEFAULT_CONVERTER_LOCATION.getParentFile());
			StreamGobbler errorGobbler = new StreamGobbler(process.getErrorStream(), "ERROR"); //$NON-NLS-1$
			StreamGobbler outputGobbler = new OutputStreamGobbler(process.getInputStream(), "OUTPUT", monitor, errorFile); //$NON-NLS-1$
			errorGobbler.start();
			outputGobbler.start();
			process.waitFor();
			Activator.log("Exit value=" + process.exitValue());
			Activator.log("Written to " + sceneFile);
		} catch (Exception e) {
			Activator.log("Stopped conversion with message: " + e.getMessage());
			e.printStackTrace();
		}
		monitor.worked(1);
		return sceneFile;
	}

	protected String getOptions() {
		return " --use-element-hierarchy";
	}

	@Override
	public File transform(InputStream inputStream, File dir, String pureFilename, IProgressMonitor monitor) throws IOException {
		File sourceFile = new File(dir, pureFilename + ".ifc");
		TransformationUtils.inputstreamToOutputstream(inputStream, new FileOutputStream(sourceFile), Integer.MAX_VALUE);
		return transform(sourceFile, dir, pureFilename, monitor);
	}

	@Override
	public File getTargetFile(File dir, String pureFilename) {
		return new File(dir, "scene.dae");
	}

	@Override
	public int totalWork() {
		return 1 + 50;
	}

	public String getExportExt() {
		return ".dae";
	}

}
