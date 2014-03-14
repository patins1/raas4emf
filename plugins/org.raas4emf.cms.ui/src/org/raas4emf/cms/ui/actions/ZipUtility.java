/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.actions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.raas4emf.cms.core.FileUtil;
import org.raas4emf.cms.core.RAASSessionSingleton;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.ui.CMSActivator;
import org.raas4emf.cms.ui.views.DirectoryView;

import raascms.Artifact;
import raascms.Folder;
import raascms.RaascmsFactory;
import raascms.impl.ArtifactImpl;

public class ZipUtility {

	private final IProgressMonitor monitor;

	private long totalSize = 0;

	private long started = System.currentTimeMillis();

	private List<Status> stati = new ArrayList<Status>();

	private RAASSessionSingleton sessionInstance;

	public ZipUtility(IProgressMonitor monitor, RAASSessionSingleton sessionInstance) {
		this.monitor = monitor;
		this.sessionInstance = sessionInstance;
	}

	public final void zip(List<EObject> selection, File zip, int level) throws IOException {
		ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(zip));
		zos.setLevel(level);
		for (Object file : selection) {
			if (file instanceof Folder) {
				Folder folder = (Folder) file;
				zip(folder, folder.getName(), zos);
			}
			if (file instanceof Artifact) {
				Artifact artifact = (Artifact) file;
				zip(artifact, "", zos);
			}
		}
		zos.close();
	}

	public final void zip(Folder directory, String base, ZipOutputStream zos) throws IOException {
		if (!DirectoryView.canRead(directory, sessionInstance)) {
			stati.add(new Status(IStatus.ERROR, CMSActivator.PLUGIN_ID, "No permission to read directory " + RAASUtils.getPath(directory)));
			return;
		}
		for (Folder folder : directory.getFolders()) {
			String subfolderName = (!"".equals(base) ? base + "/" : "") + folder.getName();
			ZipEntry entry = new ZipEntry(subfolderName + "/");
			zos.putNextEntry(entry);
			entry.setTime(RAASUtils.getModificationDate(folder).getTime());
			zip(folder, subfolderName, zos);
			if (monitor.isCanceled())
				break;
		}
		for (Artifact artifact : directory.getArtifacts()) {
			zip(artifact, base, zos);
			if (monitor.isCanceled())
				break;
		}
	}

	private void zip(Artifact artifact, String base, ZipOutputStream zos) throws IOException {
		String name = RAASUtils.getSerializationNameForExport(artifact);
		ZipEntry entry = new ZipEntry((!"".equals(base) ? base + "/" : "") + name);
		zos.putNextEntry(entry);

		try {
			InputStream is;
			long size = 0;
			if (artifact.isBlobUpToDate()) {
				is = artifact.getFileContent().getContents();
				size = artifact.getFileContent().getSize();
			} else if (!artifact.getContents().isEmpty()) {
				File file = ArtifactImpl.serializeModel(artifact, name, new NullProgressMonitor());
				is = new FileInputStream(file);
				size = file.length();
			} else
				return;
			entry.setTime(RAASUtils.getModificationDate(artifact).getTime());
			entry.setSize(size);
			if (artifact.getState() != null && !"OK".equals(artifact.getState()) && !"".equals(artifact.getState()))
				entry.setComment(artifact.getState());
			if (totalSize != 0 && System.currentTimeMillis() > started)
				monitor.subTask("Zipping at " + totalSize / (System.currentTimeMillis() - started) * 1000 / 1024 + "kb/sec (" + name + ")");
			totalSize += size;
			FileUtil.inputstreamToOutputstreamNotClosing(is, zos, size);
		} catch (Exception e) {
			System.err.println("Could not zip file " + RAASUtils.getPath(artifact) + ": " + e);
			stati.add(new Status(IStatus.ERROR, CMSActivator.PLUGIN_ID, "Could not zip file " + RAASUtils.getPath(artifact), e));
		}
	}

	public final void unzip(InputStream inputStream, Folder directory) throws IOException {
		ZipInputStream archive = new ZipInputStream(inputStream);
		ZipEntry entry;
		while ((entry = archive.getNextEntry()) != null) {
			String[] segments = entry.getName().split("/");
			Folder folder = directory;
			for (int i = 0; i <= segments.length - (entry.isDirectory() ? 1 : 2); i++) {
				Folder subFolder = null;
				Object child = RAASUtils.getChildWithName(folder, segments[i]);
				if (child instanceof Folder) {
					folder = (Folder) child;
					continue;
				}
				if (child != null) {
					stati.add(new Status(IStatus.ERROR, CMSActivator.PLUGIN_ID, "Entry with name already exists: " + RAASUtils.getPath(folder) + "/" + RAASUtils.getNameOf(child) + " (of type " + child.getClass().getName() + ")"));
					folder = null;
					break;
				}
				subFolder = RaascmsFactory.eINSTANCE.createFolder();
				subFolder.setName(segments[i]);
				folder.getFolders().add(subFolder);
				folder = subFolder;
			}
			if (!entry.isDirectory() && folder != null) {
				String name = RAASUtils.getIntendedNameForExport(segments[segments.length - 1]);
				try {
					if (totalSize != 0 && System.currentTimeMillis() > started)
						monitor.subTask("Unzipping at " + totalSize / (System.currentTimeMillis() - started) * 1000 / 1024 + "kb/sec (" + name + ")");
					if (!stati.isEmpty())
						continue;
					Artifact artifact = RAASUtils.addFile(folder, null, name, archive);
					totalSize += artifact.getFileContent().getSize();
					RAASUtils.setModificationDate(artifact, new Date(entry.getTime()));
					if (entry.getComment() != null) {
						artifact.setState(entry.getComment());
					}
				} catch (Exception e2) {
					stati.add(new Status(IStatus.ERROR, CMSActivator.PLUGIN_ID, "Could not unzip file " + RAASUtils.getPath(folder) + "/" + name, e2));
				}
			}
			if (monitor.isCanceled())
				break;
		}
	}

	public List<Status> getStati() {
		return stati;
	}
}