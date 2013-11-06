package org.ifc4emf.metamodel.ifc.samples;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;

/**
 * Checks two IFC files on equality, assuming that both IFC files use the same indices. Only equality of the indexed lines is checked.
 */
public class IFCComparer {

	private static Pattern REALPattern;
	private static InputStream stream;
	private final BufferedReader x;
	private final BufferedReader y;

	private final Map<Integer, String> xLines = new HashMap<Integer, String>();
	private final Map<Integer, String> yLines = new HashMap<Integer, String>();

	private int maxSize = 0;
	protected IProgressMonitor monitor = new NullProgressMonitor();
	private int totalWork;
	private int worked;

	private IFCComparer(BufferedReader x, BufferedReader y) {
		this.x = x;
		this.y = y;
	}

	public IFCComparer(InputStream x, InputStream y) {
		this(new BufferedReader(new InputStreamReader(stream = x)), new BufferedReader(new InputStreamReader(y)));
	}

	public IFCComparer(String x, String y) {
		this(new ByteArrayInputStream(x.getBytes()), new ByteArrayInputStream(y.getBytes()));
	}

	public IFCComparer(File x, File y) throws FileNotFoundException {
		this(new DataInputStream(new FileInputStream(x.getAbsolutePath())), new DataInputStream(new FileInputStream(y.getAbsolutePath())));
	}

	static {
		// as defined in StepClearText.jjt
		String DIGIT = "[0-9]";
		String SIGN = "[+-]";
		String DOT = "\\.";
		String REAL = " (<SIGN>)? <DIGIT> (<DIGIT>)* <DOT> (<DIGIT>)* (E (<SIGN>)? <DIGIT> (<DIGIT>)* )?".replace("<SIGN>", SIGN).replace("<DIGIT>", DIGIT).replace("<DOT>", DOT).replace(" ", "");
		REALPattern = Pattern.compile(REAL);
	}

	public void assertEqual() throws IOException {
		totalWork = stream.available();
		monitor.beginTask("Compare IFC files", totalWork);

		// scroll to the first index
		String xLine;
		while ((xLine = x.readLine()) != null && add(xLine, xLines, yLines, true) == 0) {
		}
		String yLine;
		while ((yLine = y.readLine()) != null && add(yLine, yLines, xLines, false) == 0) {
		}
		// now compare
		do {
			while ((xLine = x.readLine()) != null && add(xLine, xLines, yLines, true) < 0) {
			}
			while ((yLine = y.readLine()) != null && add(yLine, yLines, xLines, false) < 0) {
			}
			if (yLine == null) {
				printMissingLines(xLines, true);
			}
			if (xLine == null) {
				printMissingLines(yLines, false);
			}
			maxSize = Math.max(Math.max(maxSize, xLines.size()), yLines.size());
			if (monitor.isCanceled())
				break;
		} while (xLine != null || yLine != null);

		System.out.println("maximal map size:" + maxSize);
	}

	private void printMissingLines(Map<Integer, String> xLines, boolean isOriginal) {
		for (int index : xLines.keySet()) {
			handleMismatch("#" + index + " = " + xLines.get(index), isOriginal);
			if (monitor.isCanceled())
				break;
		}
	}

	/**
	 * Adds a line to the given map and asserts equality if a line with the same index is present in the other map
	 * 
	 * @param line
	 * @param map
	 * @param otherMap
	 * @param isOriginal
	 *            whether map corresponds to the original IFC file (or otherMap otherwise)
	 * @return <code>0</code> if no index could be parsed, <code>&gt;0</code> if an index could be parsed but the index is not present in the other map, <code>&lt;0</code> if an index could be parsed and the index is present in the other map,
	 * @throws IOException
	 */
	private int add(String line, Map<Integer, String> map, Map<Integer, String> otherMap, boolean isOriginal) throws IOException {
		int nowWorked = totalWork - stream.available();
		if (nowWorked > worked) {
			monitor.worked(nowWorked - worked);
			worked = nowWorked;
		}
		int i;
		if (line.startsWith("#") && (i = line.indexOf("=")) != -1) {
			int index = Integer.valueOf(line.substring(1, i).trim());
			line = normalize(line.substring(i + 1));
			String otherLine = otherMap.remove(index);
			String xLine = isOriginal ? line : otherLine;
			String yLine = isOriginal ? otherLine : line;
			if (otherLine != null) {
				if (!line.equals(otherLine)) {
					handleMismatch("#" + index + " = " + xLine, true);
					handleMismatch("#" + index + " = " + yLine, false);
				}
				return -index;
			} else
				map.put(index, line);
			return index;
		}
		return 0;
	}

	protected void handleMismatch(String string, boolean isOriginal) {
		throw new RuntimeException(string);
	}

	private String normalize(String line) {
		int i;

		line = line.replace(" ", "");

		// remove multiple-added point in polyline (from the original)
		if (line.startsWith("IFCPOLYLINE((") || line.startsWith("IFCPROPERTYSET(")) {
			int m = 0, n;
			while ((m = line.indexOf("#", m + 1)) != -1 && (n = line.indexOf(",", m)) != -1) {
				line = line.substring(0, n) + line.substring(n).replace("," + line.substring(m, n), "");
			}
		}

		// normalize REAL
		Matcher matcher = REALPattern.matcher(line);
		String newLine = "";
		i = 0;
		while (matcher.find()) {
			newLine += line.substring(i, matcher.start()) + Double.valueOf(matcher.group()).toString();
			i = matcher.end();
		}
		line = newLine + line.substring(i);

		// see migration comments
		line = line.replace("()", "$");

		return line;
	}

	public void setProgressMonitor(IProgressMonitor progressMonitor) {
		this.monitor = progressMonitor;
	}

	public static boolean isIfcNumber(String input) {
		if (input.indexOf('.') == -1)
			return REALPattern.matcher(input + ".").matches();
		return REALPattern.matcher(input).matches();
	}

	public static double asIfcNumber(String input) {
		return Double.parseDouble(new Float(Double.parseDouble(input)).toString());
	}

	public static String normalizeIfcNumber(String value) {
		return "" + asIfcNumber(value);
	}

	public static String normalizeIfcValue(String value) {
		if (value == null)
			return "";
		if (isIfcNumber(value))
			return normalizeIfcNumber(value);
		return value.trim();
	}

}
