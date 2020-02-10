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

public class ColladaToGLTFTranformator implements ITranformator {

	@Override
	public File transform(File daeFile, File dir, String pureFilename, IProgressMonitor monitor) throws IOException {
		monitor.subTask("Transform Collada to glTF");
		File sceneFile = getTargetFile(dir, pureFilename);
		boolean isWindows = System.getProperty("os.name").contains("Windows");

		File DEFAULT_CONVERTER_LOCATION = new File(
				FileLocator.resolve(new URL("platform:/plugin/org.raas4emf.cms.core/binaries/collada2gltf/"
						+ (isWindows ? "windows/COLLADA2GLTF-bin.exe" : "linux/COLLADA2GLTF-bin"))).getFile());
		try {
			Files.setPosixFilePermissions( DEFAULT_CONVERTER_LOCATION.toPath(), Collections.singleton(PosixFilePermission.OWNER_EXECUTE));
		} catch (Exception e) {
			// Ignore.. permission bit tested below
		}
		Activator.log("DEFAULT_CONVERTER_LOCATION=" + DEFAULT_CONVERTER_LOCATION+" canExecute="+DEFAULT_CONVERTER_LOCATION.canExecute());		
		
		String cmd = TransformationUtils.quote(DEFAULT_CONVERTER_LOCATION) + (isBinary() ? " -b" : "") + " -i " + TransformationUtils.quote(daeFile) + " -o " + TransformationUtils.quote(sceneFile);

		Activator.log("Executing " + cmd);
		try {


			Process process = Runtime.getRuntime().exec(cmd, null, DEFAULT_CONVERTER_LOCATION.getParentFile());
			StreamGobbler errorGobbler = new StreamGobbler(process.getErrorStream(), "ERROR"); //$NON-NLS-1$
			StreamGobbler outputGobbler = new StreamGobbler(process.getInputStream(), "OUTPUT"); //$NON-NLS-1$
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

	protected boolean isBinary() {
		return false;
	}

	@Override
	public File transform(InputStream inputStream, File dir, String pureFilename, IProgressMonitor monitor) throws IOException {
		File sourceFile = new File(dir, pureFilename + ".dae");
		TransformationUtils.inputstreamToOutputstream(inputStream, new FileOutputStream(sourceFile), Integer.MAX_VALUE);
		return transform(sourceFile, dir, pureFilename, monitor);
	}

	@Override
	public File getTargetFile(File dir, String pureFilename) {
		return new File(dir, "scene.gltf");
	}

	@Override
	public int totalWork() {
		return 1;
	}

}
