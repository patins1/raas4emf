package org.raas4emf.cms.core;

import raascms.Artifact;

public interface StatusChangeCallback {

	void stateChanged(Artifact artifact);

}
