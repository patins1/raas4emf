/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.transformation;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IContributor;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.InvalidRegistryObjectException;

public class TransformatorElement implements IConfigurationElement {

	private final String sourceFileExtension;
	private final String targetFileExtension;
	private final String className;

	public TransformatorElement(String sourceFileExtension, String targetFileExtension, String className) {
		this.sourceFileExtension = sourceFileExtension;
		this.targetFileExtension = targetFileExtension;
		this.className = className;
	}

	@Override
	public Object createExecutableExtension(String propertyName) throws CoreException {
		try {
			return Class.forName(getAttribute(propertyName)).getConstructors()[0].newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public String getAttribute(String name) throws InvalidRegistryObjectException {
		if (TransformationUtils.TARGET_FILE_EXTENSION.equals(name))
			return targetFileExtension;
		if (TransformationUtils.SOURCE_FILE_EXTENSION.equals(name))
			return sourceFileExtension;
		if (TransformationUtils.TRANSFORMATOR_CLASS.equals(name))
			return className;
		throw new RuntimeException("UNKNOWN ATTRIBUTE: " + name);
	}

	@Override
	public String getAttribute(String attrName, String locale) throws InvalidRegistryObjectException {
		throw new RuntimeException("NOT IMPLEMENTED");
	}

	@Override
	public String getAttributeAsIs(String name) throws InvalidRegistryObjectException {
		throw new RuntimeException("NOT IMPLEMENTED");
	}

	@Override
	public String[] getAttributeNames() throws InvalidRegistryObjectException {
		throw new RuntimeException("NOT IMPLEMENTED");
	}

	@Override
	public IConfigurationElement[] getChildren() throws InvalidRegistryObjectException {
		throw new RuntimeException("NOT IMPLEMENTED");
	}

	@Override
	public IConfigurationElement[] getChildren(String name) throws InvalidRegistryObjectException {
		throw new RuntimeException("NOT IMPLEMENTED");
	}

	@Override
	public IExtension getDeclaringExtension() throws InvalidRegistryObjectException {
		throw new RuntimeException("NOT IMPLEMENTED");
	}

	@Override
	public String getName() throws InvalidRegistryObjectException {
		throw new RuntimeException("NOT IMPLEMENTED");
	}

	@Override
	public Object getParent() throws InvalidRegistryObjectException {
		throw new RuntimeException("NOT IMPLEMENTED");
	}

	@Override
	public String getValue() throws InvalidRegistryObjectException {
		throw new RuntimeException("NOT IMPLEMENTED");
	}

	@Override
	public String getValue(String locale) throws InvalidRegistryObjectException {
		throw new RuntimeException("NOT IMPLEMENTED");
	}

	@Override
	public String getValueAsIs() throws InvalidRegistryObjectException {
		throw new RuntimeException("NOT IMPLEMENTED");
	}

	@Override
	public String getNamespace() throws InvalidRegistryObjectException {
		throw new RuntimeException("NOT IMPLEMENTED");
	}

	@Override
	public String getNamespaceIdentifier() throws InvalidRegistryObjectException {
		throw new RuntimeException("NOT IMPLEMENTED");
	}

	@Override
	public IContributor getContributor() throws InvalidRegistryObjectException {
		throw new RuntimeException("NOT IMPLEMENTED");
	}

	@Override
	public boolean isValid() {
		throw new RuntimeException("NOT IMPLEMENTED");
	}

	@Override
	public int getHandleId() {
		return className.hashCode();
	}

}
