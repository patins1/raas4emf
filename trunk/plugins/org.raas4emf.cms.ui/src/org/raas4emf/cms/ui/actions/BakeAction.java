/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.actions;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.cdo.common.lob.CDOBlob;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.core.geometry.XYZ;
import org.raas4emf.cms.ui.CMSActivator;
import org.raas4emf.cms.ui.RAASUIUtils;
import org.raas4emf.cms.ui.views.PreviewView;

import raascms.Artifact;
import IFC2X3.IFC2X3Factory;
import IFC2X3.IfcCartesianPoint;
import IFC2X3.IfcFace;
import IFC2X3.IfcFaceOuterBound;
import IFC2X3.IfcObject;
import IFC2X3.IfcPolyLoop;

public class BakeAction extends AbstractHandler {

	private Shell shell;

	public BakeAction() {
		super();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final List<Artifact> selection = RAASUIUtils.getSelection(event, Artifact.class);
		for (final Artifact artifact : selection) {
			for (final PreviewView preview : PreviewView.findView()) {
				shell = HandlerUtil.getActiveShellChecked(event);
				IRunnableWithProgress op = new IRunnableWithProgress() {
					public void run(IProgressMonitor monitor) {
						runJob(monitor, artifact, preview);
					}
				};
				shell.getDisplay().readAndDispatch();
				try {
					ProgressMonitorDialog progressMonitorDialog = new ProgressMonitorDialog(shell) {

						protected void configureShell(final Shell shell) {
							super.configureShell(shell);
							shell.setText("Baking Parametric Design...");
						}

					};
					progressMonitorDialog.run(false, true, op);
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
		}
		return null;
	}

	protected IStatus runJob(final IProgressMonitor monitor, Artifact artifact, final PreviewView preview) {
		monitor.beginTask("Read Geometry", -1);

		final List<Object> doubles = new ArrayList<Object>();
		shell.getDisplay().syncExec(new Runnable() {
			public void run() {

				final Object[] _doubles = preview.readPolygons();
				for (Object o : _doubles)
					doubles.add(o);
			}
		});
		List<XYZ> xyzs = new ArrayList<XYZ>();
		Object[] objs = doubles.toArray();
		for (int i = 0; i < objs.length; i += 3) {
			xyzs.add(PreviewView.getXYZFromArgs(objs, i));
		}
		try {
			monitor.beginTask("Read IFC file", -1);
			final Artifact ifcModel = RAASUtils.assureModelTree(RAASUtils.getModelBlob(artifact), monitor);

			IfcFace face = null;
			IfcObject context = null;
			TreeIterator<Object> it = EcoreUtil.getAllContents(Arrays.asList(ifcModel));
			while (it.hasNext()) {
				Object eo = it.next();
				if (context == null && eo instanceof IfcObject) {
					context = (IfcObject) eo;
				}
				if (eo instanceof IfcFace) {
					IfcFace ifcFace = (IfcFace) eo;
					ifcFace.getBounds().clear();
					if (face == null)
						face = ifcFace;
				}
			}
			if (face == null) {
				MessageDialog.openError(shell, "", "Found no face geometry in ifc file!");
				return Status.CANCEL_STATUS;
			}
			monitor.beginTask("Create IFC geometry", xyzs.size() / 3);
			Map<XYZ, IfcCartesianPoint> cartMap = new HashMap<XYZ, IfcCartesianPoint>();
			for (int i = 0; i < xyzs.size(); i += 3) {
				IfcFaceOuterBound ifcFaceBound = RAASUtils.addIfcObjectToModel(IFC2X3Factory.eINSTANCE.createIfcFaceOuterBound(), context);
				ifcFaceBound.setOrientation(true);
				face.getBounds().add(ifcFaceBound);
				monitor.worked(1);
				// break;
				IfcPolyLoop polyline = RAASUtils.addIfcObjectToModel(IFC2X3Factory.eINSTANCE.createIfcPolyLoop(), context);
				ifcFaceBound.setBound(polyline);
				for (int j = i; j < i + 3; j++) {
					XYZ xyz = xyzs.get(j);
					IfcCartesianPoint cart = cartMap.get(xyz);
					if (cart == null) {
						cart = RAASUtils.addIfcObjectToModel(IFC2X3Factory.eINSTANCE.createIfcCartesianPoint(), context);
						cart.getCoordinates().add(xyz.X);
						cart.getCoordinates().add(xyz.Y);
						cart.getCoordinates().add(xyz.Z);
					}
					polyline.getPolygon().add(cart);
				}
			}

			monitor.beginTask("Write IFC file", -1);
			RAASUtils.setModificationDate(ifcModel, new Date());
			InputStream is = ifcModel.asFile(ifcModel.getName(), monitor);
			ifcModel.setFileContent(new CDOBlob(is));
			ifcModel.getContents().clear();
			ifcModel.setModelDate(null);
			RAASUtils.setModificationDate(ifcModel, new Date());
			// Folder folder = (Folder) artifact.eContainer();
			// FilesView.uniqueNamesForChildren(folder, Arrays.asList(artifact));
			// folder.getArtifacts().add(ifcModel);
			// RAASUtils.doSave(folder, "Save tree editor");
			shell.getDisplay().syncExec(new Runnable() {
				public void run() {
					CMSActivator.getSessionInstance().exportPSets(ifcModel);
				}
			});
			shell.getDisplay().asyncExec(new Runnable() {
				public void run() {
					shell.getDisplay().readAndDispatch();
				}
			});
			monitor.done();
		} catch (IOException e) {
			e.printStackTrace();
			return new Status(IStatus.ERROR, CMSActivator.PLUGIN_ID, e.getMessage(), e);
		}
		return Status.OK_STATUS;
	}
}
