/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.core;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class LoggingUtil {

	static LoggingUtil SINGLETON = new LoggingUtil(new File(RAASUtils.ROOTPATH + "/debug/raas.log"));
	static LoggingUtil ACCESSLOG = new LoggingUtil(new File(RAASUtils.ROOTPATH + "/debug/access.log"));

	static public enum AppType {
		FileServer, RaasServer, RAP
	}

	private File logFile;
	private PrintWriter out;;

	public LoggingUtil(File file) {
		logFile = file;
	}

	public void log2(String message) {
		try {
			if (!logFile.exists()) {
				if (!new File(RAASUtils.ROOTPATH).exists())
					return;
				logFile.getParentFile().mkdirs();
				logFile.createNewFile();
			}
			if (out == null) {
				FileWriter fstream = new FileWriter(logFile.toString(), true);
				out = new PrintWriter(fstream);
				out.println("Created log file");
			}
			out.println(new Date() + "\t" + message);
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void log2(String message, Throwable e) {
		log2(message);
		log2("WTH FOLLOWING ERROR:");
		e.printStackTrace(out);
		out.flush();
		out.println();
		out.println();
	}

	static public void log(String message) {
		SINGLETON.log2(message);
	}

	static public void log(String message, Throwable e) {
		SINGLETON.log2(message, e);
	}

	static public void logAccess(String message) {
		ACCESSLOG.log2(message);
	}

	static public File getAccessLogFile() {
		return ACCESSLOG.logFile;
	}
}
