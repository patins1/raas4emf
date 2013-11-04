/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.ui.AbstractSourceProvider;

public class AuthenticationProvider extends AbstractSourceProvider {

	public final static String ROLES_VARIABLE = "org.raas4emf.cms.ui.roles";

	public void dispose() {
		//
	}

	public Map<String, List<String>> getCurrentState() {
		Map<String, List<String>> result = new HashMap<String, List<String>>();
		List<String> foo = new ArrayList<String>();
		foo.add("architect");
		if (CMSActivator.getSessionInstance().isLibarian())
			foo.add("libarian");
		result.put(ROLES_VARIABLE, foo);
		return result;
	}

	public String[] getProvidedSourceNames() {
		return new String[] { ROLES_VARIABLE };
	}

	public void updateRights() {
		fireSourceChanged(0, getCurrentState());
	}
}