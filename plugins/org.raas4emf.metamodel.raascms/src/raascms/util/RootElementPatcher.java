package raascms.util;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

import org.eclipse.emf.ecore.EClass;

/**
 * Replaces the tag name of the XML root element by a given EClass
 */
public class RootElementPatcher {

	private InputStream stream;
	private final BufferedReader x;
	private final OutputStream y;

	private int totalWork = -1;

	private RootElementPatcher(BufferedReader x, OutputStream y, InputStream stream) {
		this.x = x;
		this.y = y;
		this.stream = stream;
	}

	public RootElementPatcher(String x, OutputStream y) throws IOException {
		this(new ByteArrayInputStream(x.getBytes()), y);
	}

	public RootElementPatcher(InputStream x, OutputStream y) throws IOException {
		this(new BufferedReader(new InputStreamReader(new DataInputStream(x))), y, x);
	}

	public void trigger(EClass rootClass) throws IOException {
		totalWork = stream.available();
		boolean firstLine = true;
		String xLine;
		String rootElementName = rootClass.getName();
		if (rootElementName.endsWith("Type"))
			rootElementName = rootElementName.substring(0, rootElementName.lastIndexOf("Type"));
		while ((xLine = x.readLine()) != null) {
			if (!firstLine) {
				y.write("\n".getBytes());
			}
			if (xLine.equals("<contents>"))
				xLine = "<" + rootElementName + ">";
			if (xLine.equals("</contents>"))
				xLine = "</" + rootElementName + ">";
			y.write(xLine.getBytes());
			firstLine = false;
		}
	}

}
