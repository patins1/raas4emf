package org.raas4emf.cms.core.webgl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.core.runtime.IProgressMonitor;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.transformation.ITranformator;
import org.raas4emf.cms.transformation.StreamGobbler;
import org.raas4emf.cms.transformation.TransformationUtils;

public class IfcToColladaTranformator implements ITranformator {

	static File DEFAULT_CONVERTER_LOCATION = new File("C:\\bim\\NOLServer\\IfcConvert\\IfcConvert.exe");

	public IfcToColladaTranformator() {
		// nothing to do
	}

	@Override
	public File transform(File ifcName, File dir, String pureFilename, IProgressMonitor monitor) throws IOException {
		monitor.subTask("Transform IFC to Collada");
		if (DEFAULT_CONVERTER_LOCATION == null)
			DEFAULT_CONVERTER_LOCATION = new File(RAASUtils.getRAASProp("COLLADACONVERTER"));
		File sceneFile = getTargetFile(dir, pureFilename);
		String cmd = TransformationUtils.quote(DEFAULT_CONVERTER_LOCATION) + " --sew-shells --weld-vertices --use-element-hierarchy --use-element-types " + TransformationUtils.quote(ifcName) + " " + TransformationUtils.quote(sceneFile);
		final File errorFile = new File(dir, pureFilename + getExportExt() + ".error");
		System.out.println("Executing " + cmd);
		try {
			if (errorFile.exists())
				errorFile.delete();
			Process process = Runtime.getRuntime().exec(cmd, null, DEFAULT_CONVERTER_LOCATION.getParentFile());
			StreamGobbler errorGobbler = new StreamGobbler(process.getErrorStream(), "ERROR"); //$NON-NLS-1$
			StreamGobbler outputGobbler = new OutputStreamGobbler(process.getInputStream(), "OUTPUT", monitor, errorFile); //$NON-NLS-1$
			errorGobbler.start();
			outputGobbler.start();
			process.waitFor();
			System.out.println("Exit value=" + process.exitValue());
			System.out.println("Written to " + sceneFile);
		} catch (Exception e) {
			System.out.println("Stopped conversion with message: " + e.getMessage());
			e.printStackTrace();
		}
		monitor.worked(1);
		return sceneFile;
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
