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

public class ColladaToGLTFTranformator implements ITranformator {

	static File DEFAULT_CONVERTER_LOCATION = new File("C:\\bim\\NOLServer\\gltf\\collada2gltf.exe");

	public ColladaToGLTFTranformator() {
		// nothing to do
	}

	@Override
	public File transform(File daeFile, File dir, String pureFilename, IProgressMonitor monitor) throws IOException {
		monitor.subTask("Transform Collada to WebGL");
		if (DEFAULT_CONVERTER_LOCATION == null)
			DEFAULT_CONVERTER_LOCATION = new File(RAASUtils.getRAASProp("GLTFCONVERTER"));
		File sceneFile = getTargetFile(dir, pureFilename);
		String cmd = TransformationUtils.quote(DEFAULT_CONVERTER_LOCATION) + " -p -f " + TransformationUtils.quote(daeFile) + " -o " + TransformationUtils.quote(sceneFile);
		System.out.println("Executing " + cmd);
		try {
			Process process = Runtime.getRuntime().exec(cmd, null, DEFAULT_CONVERTER_LOCATION.getParentFile());
			StreamGobbler errorGobbler = new StreamGobbler(process.getErrorStream(), "ERROR"); //$NON-NLS-1$
			StreamGobbler outputGobbler = new StreamGobbler(process.getInputStream(), "OUTPUT"); //$NON-NLS-1$
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
		File sourceFile = new File(dir, pureFilename + ".dae");
		TransformationUtils.inputstreamToOutputstream(inputStream, new FileOutputStream(sourceFile), Integer.MAX_VALUE);
		return transform(sourceFile, dir, pureFilename, monitor);
	}

	@Override
	public File getTargetFile(File dir, String pureFilename) {
		return new File(dir, "scene.json");
	}

	@Override
	public int totalWork() {
		return 1;
	}

}
