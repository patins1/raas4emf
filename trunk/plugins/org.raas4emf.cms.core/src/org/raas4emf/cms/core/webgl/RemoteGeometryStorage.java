package org.raas4emf.cms.core.webgl;

import java.io.File;

public interface RemoteGeometryStorage {

	boolean saveAsFile(String fingerprint, File file);

}
