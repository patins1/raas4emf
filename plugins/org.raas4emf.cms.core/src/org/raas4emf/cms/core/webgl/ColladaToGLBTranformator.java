package org.raas4emf.cms.core.webgl;

import java.io.File;

public class ColladaToGLBTranformator extends ColladaToGLTFTranformator {


	
	
	
	@Override
	public File getTargetFile(File dir, String pureFilename) {
		return new File(dir, "scene.glb");
	}

	protected boolean isBinary() {
		return true;
	}

}
