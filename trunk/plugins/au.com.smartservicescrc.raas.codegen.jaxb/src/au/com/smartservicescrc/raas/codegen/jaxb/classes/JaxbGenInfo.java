/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package au.com.smartservicescrc.raas.codegen.jaxb.classes;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;

/**
 * Associates itf/impl class names to corresponding {@link GenClass} instances
 */
public class JaxbGenInfo {
	private Map<String, GenClass> map = new HashMap<String, GenClass>();

	public GenClass getGenClass(String string) {
		return map.get(string);
	}

	public void setGenClass(String elementName, GenClass genClass) {
		map.put(elementName, genClass);
	}
}
