/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.core.webgl;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

import IFC2X3.IFC2X3Package;

/**
 * Writes an IFC file read from an InputStream to an OutputStream while replacing all GUIDs with the index number (prefixed with an underscore)
 */
public class IFCGuidByIndexPatch {

	private InputStream stream;
	private final BufferedReader x;
	private final OutputStream y;

	private IProgressMonitor monitor = new NullProgressMonitor();
	private int totalWork = -1;
	private int worked;
	static public Set<String> ifcClassesWithGUID = new HashSet<String>();

	private IFCGuidByIndexPatch(BufferedReader x, OutputStream y, InputStream stream) {
		this.x = x;
		this.y = y;
		this.stream = stream;
	}

	public IFCGuidByIndexPatch(String x, OutputStream y) throws IOException {
		this(new ByteArrayInputStream(x.getBytes()), y);
	}

	public IFCGuidByIndexPatch(InputStream x, OutputStream y) throws IOException {
		this(new BufferedReader(new InputStreamReader(new DataInputStream(x))), y, x);
	}

	public void trigger() throws IOException {
		totalWork = stream.available();
		monitor.beginTask("Patch IFC file", totalWork);
		boolean firstLine = true;
		String xLine;
		while ((xLine = x.readLine()) != null) {
			if (!firstLine) {
				y.write("\n".getBytes());
			}
			add(xLine);
			firstLine = false;
		}
	}

	private void add(String line) throws IOException {
		int nowWorked = totalWork - stream.available();
		if (nowWorked > worked) {
			monitor.worked(nowWorked - worked);
			worked = nowWorked;
		}
		if (ifcClassesWithGUID.isEmpty()) {
			EClass eClassIfcRoot = (EClass) IFC2X3Package.eINSTANCE.getEClassifier("IfcRoot");
			for (EClassifier eClassifier : IFC2X3Package.eINSTANCE.getEClassifiers()) {
				if (eClassifier instanceof EClass) {
					EClass eClass = (EClass) eClassifier;
					if (eClassIfcRoot.isSuperTypeOf(eClass))
						ifcClassesWithGUID.add(eClass.getName().toUpperCase());
				}
			}
		}
		int i, openingBracket, openingQuote, closingQuote, nameStartComma, historyStartComma;
		if (line.startsWith("#") && (i = line.indexOf('=')) != -1 && (openingBracket = line.indexOf('(', i + 1)) != -1 && (openingQuote = line.indexOf('\'', openingBracket + 1)) != -1 && (closingQuote = line.indexOf('\'', openingQuote + 1)) != -1 && (historyStartComma = line.indexOf(',', closingQuote + 1)) != -1
				&& (nameStartComma = line.indexOf(',', historyStartComma + 1)) != -1 && (line.indexOf(',', nameStartComma + 1)) != -1) {
			int index = Integer.valueOf(line.substring(1, i).trim());
			if (ifcClassesWithGUID.contains(line.substring(i + 1, openingBracket).trim())) {
				int lengthSubIndex = closingQuote - (openingQuote + 1 + 22);
				line = line.substring(0, openingQuote + 1) + "_" + index + line.substring(closingQuote - Math.max(lengthSubIndex, 0));
				// line =
				// line.substring(0,openingQuote+1)+"_"+index+line.substring(closingQuote,
				// nameStartComma+1)+'\''+"_"+index+'\''+line.substring(nameEndComma);
			}
		}
		y.write(line.getBytes());
	}

	public void setProgressMonitor(IProgressMonitor progressMonitor) {
		this.monitor = progressMonitor;
	}

}
