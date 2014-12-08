package org.raas4emf.cms.core;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.ProgressMonitorWrapper;

public class RAASMonitor extends ProgressMonitorWrapper {
	
	Map<String,Object> properties=new HashMap<String,Object>();

	protected RAASMonitor(IProgressMonitor monitor) {
		super(monitor);
	}

	public void setProperty(String key, Object value) {
		properties.put(key, value);
	}

	public Object getProperty(String key) {
		return properties.get(key);
	}

}
