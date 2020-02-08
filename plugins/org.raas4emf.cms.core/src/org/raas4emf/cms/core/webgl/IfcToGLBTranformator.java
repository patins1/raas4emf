package org.raas4emf.cms.core.webgl;

import java.io.File;

public class IfcToGLBTranformator extends IfcToColladaTranformator{

	private String getOptions() {
		return "";
	}

	@Override
	public File getTargetFile(File dir, String pureFilename) {
		return new File(dir, "scene.glb");
	}

	public String getExportExt() {
		return ".glb";
	}
	
}
