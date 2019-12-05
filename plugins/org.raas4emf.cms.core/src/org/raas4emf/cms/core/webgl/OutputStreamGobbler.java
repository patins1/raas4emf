package org.raas4emf.cms.core.webgl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.StringBufferInputStream;

import org.eclipse.core.runtime.IProgressMonitor;
import org.raas4emf.cms.core.FileUtil;
import org.raas4emf.cms.transformation.StreamGobbler;

public final class OutputStreamGobbler extends StreamGobbler {

	private final IProgressMonitor monitor;
	private final File errorFile;
	int worked = 0;
	String errorMessages = "";

	public OutputStreamGobbler(InputStream is, String type, IProgressMonitor monitor, File errorFile) {
		super(is, type);
		this.monitor = monitor;
		this.errorFile = errorFile;
	}

	@Override
	protected void println(String line) {
		super.println(line);
		this.errorMessages += "OUTPUT" + ">" + line + "\n";
		if (line.startsWith("[")) {
			int routes = 0;
			for (int i = 0; i < line.length(); i++) {
				if (line.charAt(i) == '#') {
					routes++;
				}
			}
			monitor.worked(routes - this.worked);
			this.worked = routes;
		}
		if (line.contains("Done creating geometry")) {
			monitor.worked(50 - this.worked);
		}
		if (line.contains("Processing relations")) {
			monitor.subTask("Building hierarchy");
		}
		if (line.contains("Done processing relations")) {
			monitor.worked(1);
			monitor.subTask("Finishing model import");
		}
		if (line.contains("RENAME")) {
			monitor.worked(1);
			monitor.subTask("Renaming objects");
		}
		if (line.contains("SAVEASBLEND")) {
			monitor.worked(1);
			monitor.subTask("Saving Blender file");
		}
		if (line.contains("EXPORT")) {
			monitor.worked(1);
			monitor.subTask("Exporting to 3D format");
		}
		if (line.contains("FINISHED")) {
			monitor.worked(1);
			monitor.subTask("Finishing Blender execution");
		}
		try {
			FileUtil.inputstreamToOutputstream(new StringBufferInputStream("(In Progress)" + "\n" + this.errorMessages), new FileOutputStream(errorFile));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}