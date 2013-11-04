/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.actions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.raas4emf.cms.core.RAASUtils;
import org.raas4emf.cms.core.geometry.GeometryAlgorithms;
import org.raas4emf.cms.core.geometry.XYZ;
import org.raas4emf.cms.ui.RAASUIUtils;

import raascms.Artifact;
import raascms.Folder;
import IFC2X3.IfcArbitraryClosedProfileDef;
import IFC2X3.IfcArbitraryProfileDefWithVoids;
import IFC2X3.IfcAxis2Placement3D;
import IFC2X3.IfcCartesianPoint;
import IFC2X3.IfcConnectedFaceSet;
import IFC2X3.IfcCurve;
import IFC2X3.IfcDirection;
import IFC2X3.IfcElement;
import IFC2X3.IfcExtrudedAreaSolid;
import IFC2X3.IfcFace;
import IFC2X3.IfcFaceBasedSurfaceModel;
import IFC2X3.IfcFaceBound;
import IFC2X3.IfcFillAreaStyle;
import IFC2X3.IfcLocalPlacement;
import IFC2X3.IfcManifoldSolidBrep;
import IFC2X3.IfcMappedItem;
import IFC2X3.IfcObjectPlacement;
import IFC2X3.IfcPolyline;
import IFC2X3.IfcPresentationStyleAssignment;
import IFC2X3.IfcPresentationStyleSelect;
import IFC2X3.IfcProduct;
import IFC2X3.IfcProfileDef;
import IFC2X3.IfcRectangleProfileDef;
import IFC2X3.IfcRepresentation;
import IFC2X3.IfcRepresentationContext;
import IFC2X3.IfcRepresentationItem;
import IFC2X3.IfcRepresentationMap;
import IFC2X3.IfcShell;
import IFC2X3.IfcShellBasedSurfaceModel;
import IFC2X3.IfcStyledItem;
import IFC2X3.IfcSurfaceStyle;

public class ExamineGeometryAction extends AbstractHandler {

	private boolean doPrint;
	private boolean isInteresting;

	Map<String, Integer> countedPrint = new HashMap<String, Integer>();
	private String message;

	public ExamineGeometryAction() {
		super();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Shell shell = HandlerUtil.getActiveShellChecked(event);
		message = "";
		for (Object element : RAASUIUtils.getSelection(event)) {
			if (element instanceof Artifact) {
				final Artifact artifact = (Artifact) element;
				examine(artifact);
			}
			if (element instanceof Folder) {
				Folder folder = (Folder) element;
				examine(folder);
			}
			if (element instanceof IfcProduct) {
				IfcProduct ifcElement = (IfcProduct) element;
				doPrint = true;
				String indent = "                 ";
				IfcObjectPlacement objectPlacement = ifcElement.getObjectPlacement();

				XYZ xyz = GeometryAlgorithms.getAbsoluteCenterOf(ifcElement);
				println(indent + "Absolute Location=" + xyz);

				printPlacement(indent, objectPlacement);
				// println("                 ObjectPlacement.Axis=" + ifcElement.getObjectPlacement().get));
				examine(ifcElement);
			}
		}

		MemoDialog.openInformation(shell, "Geometry Report", message);
		return null;
	}

	private void printPlacement(String indent, IfcObjectPlacement objectPlacement) {
		if (objectPlacement == null)
			return;
		println(indent + "ObjectPlacement=" + objectPlacement);
		println(indent + "ObjectPlacement.PlacesObject=" + objectPlacement.getPlacesObject());
		if (objectPlacement instanceof IfcLocalPlacement) {
			IfcLocalPlacement ifcLocalPlacement = (IfcLocalPlacement) objectPlacement;
			println(indent + "IfcLocalPlacement=" + ifcLocalPlacement.getRelativePlacement());
			if (ifcLocalPlacement.getRelativePlacement() instanceof IfcAxis2Placement3D) {
				IfcAxis2Placement3D position = (IfcAxis2Placement3D) ifcLocalPlacement.getRelativePlacement();
				println(indent + "Position.Axis=" + getDir(position.getAxis()));
				println(indent + "Position.RefDirection=" + getDir(position.getRefDirection()));
				println(indent + "Position Location=" + getPoint(position.getLocation()));
			}
			printPlacement(indent + "  ", ifcLocalPlacement.getPlacementRelTo());
		}
	}

	private void examine(Folder folder) {
		for (Artifact artifact : folder.getArtifacts()) {
			examine(artifact);
		}
		for (Folder subfolder : folder.getFolders()) {
			examine(subfolder);
		}
	}

	private void examine(Artifact artifact) {
		if (!RAASUtils.hasExtension(artifact, ".ifc"))
			return;
		try {
			artifact = RAASUtils.assureModelTree(RAASUtils.getModelBlob(artifact));
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		isInteresting = false;
		doPrint = false;
		examineArtifact(artifact);
		if (isInteresting) {
			doPrint = true;
			examineArtifact(artifact);
		}
	}

	private void examineArtifact(final Artifact artifact) {
		if (!artifact.getContents().isEmpty()) {
			println("artifact=" + artifact.getName());
			TreeIterator<EObject> it = artifact.eAllContents();
			while (it.hasNext()) {
				EObject eo = it.next();
				if (eo instanceof IfcElement) {
					IfcElement ifcElement = (IfcElement) eo;

					String indent = "                 ";
					IfcObjectPlacement objectPlacement = ifcElement.getObjectPlacement();

					XYZ xyz = GeometryAlgorithms.getAbsoluteCenterOf(ifcElement);
					println(indent + "Element=" + ifcElement);
					println(indent + "Absolute Location=" + xyz);

					printPlacement(indent, objectPlacement);

					examine(ifcElement);
				}
			}
		}
	}

	protected void examine(IfcProduct ifcElement) {
		if (ifcElement.getRepresentation() != null) {
			for (IfcRepresentation ifcRepresentation : ifcElement.getRepresentation().getRepresentations()) {
				String indent = "                                 ";
				IfcRepresentationContext context = ifcRepresentation.getContextOfItems();
				println(indent + ifcElement.getRepresentation().getClass().getName() + "/" + ifcRepresentation.getClass().getName());
				if (context != null) {
					println(indent + "context=" + context.getClass().getName() + " type=" + context.getContextType() + " identifier=" + context.getContextIdentifier());
				}
				for (IfcRepresentationItem item : ifcRepresentation.getItems()) {
					examineRepresentationItem(item, "                                 ");
				}
			}
		}

	}

	private void examineRepresentationItem(IfcRepresentationItem item, String indent) {
		indent += "                 ";
		println(indent + item.getClass().getName());
		if (item instanceof IfcStyledItem) {
			IfcStyledItem ifcStyledItem = (IfcStyledItem) item;
			examineStyle(ifcStyledItem, indent);
		}
		if (item.getStyledByItem() != null) {
			examineStyle(item.getStyledByItem(), indent);
		}
		if (item instanceof IfcExtrudedAreaSolid) {
			IfcExtrudedAreaSolid ifcExtrudedAreaSolid = (IfcExtrudedAreaSolid) item;
			indent += "       ";
			IfcAxis2Placement3D position = ifcExtrudedAreaSolid.getPosition();
			println(indent + "Position.Axis=" + getDir(position.getAxis()));
			println(indent + "Position.RefDirection=" + getDir(position.getRefDirection()));
			println(indent + "Position Location=" + getPoint(position.getLocation()));
			println(indent + "Depth=" + ifcExtrudedAreaSolid.getDepth());
			println(indent + "ExtrudedDirection=" + getDir(ifcExtrudedAreaSolid.getExtrudedDirection()));
			IfcProfileDef sweptArea = ifcExtrudedAreaSolid.getSweptArea();
			println(indent + "SweptArea=" + sweptArea.getClass().getName());
			if (sweptArea instanceof IfcRectangleProfileDef) {
				IfcRectangleProfileDef ifcRectangleProfileDef = (IfcRectangleProfileDef) sweptArea;
				println(indent + "x=" + ifcRectangleProfileDef.getXDim());
				println(indent + "y=" + ifcRectangleProfileDef.getYDim());
				if (!isInteresting) {
					isInteresting = !(ifcExtrudedAreaSolid.getDepth() == 800.0 && ifcRectangleProfileDef.getXDim() == 400.0 && ifcRectangleProfileDef.getYDim() == 600.0);
					if (isInteresting)
						isInteresting = !(ifcExtrudedAreaSolid.getDepth() == 300.0 && ifcRectangleProfileDef.getXDim() == 300.0 && ifcRectangleProfileDef.getYDim() == 100.0);
				}
			} else if (sweptArea instanceof IfcArbitraryClosedProfileDef) {
				IfcArbitraryClosedProfileDef ifcArbitraryClosedProfileDef = (IfcArbitraryClosedProfileDef) sweptArea;
				IfcCurve curve = ifcArbitraryClosedProfileDef.getOuterCurve();
				println(indent + "curve=" + curve.getClass().getName());
				if (curve instanceof IfcPolyline) {
					IfcPolyline ifcPolyline = (IfcPolyline) curve;
					println(indent + "#point=" + ifcPolyline.getPoints().size());
				}
				if (ifcArbitraryClosedProfileDef instanceof IfcArbitraryProfileDefWithVoids) {
					IfcArbitraryProfileDefWithVoids ifcArbitraryProfileDefWithVoids = (IfcArbitraryProfileDefWithVoids) ifcArbitraryClosedProfileDef;
					println(indent + "#innerCurves=" + ifcArbitraryProfileDefWithVoids.getInnerCurves().size());
				}
				isInteresting = true;
			} else
				isInteresting = true;
		} else if (item instanceof IfcShellBasedSurfaceModel) {
			IfcShellBasedSurfaceModel ifcShellBasedSurfaceModel = (IfcShellBasedSurfaceModel) item;
			for (IfcShell shell : ifcShellBasedSurfaceModel.getSbsmBoundary()) {
				println(indent + "shell=" + shell.getClass().getName());
				if (shell instanceof IfcConnectedFaceSet) {
					IfcConnectedFaceSet ifcConnectedFaceSet = (IfcConnectedFaceSet) shell;
					for (IfcFace face : ifcConnectedFaceSet.getCfsFaces()) {
						printlnCounted(indent + "face=" + face.getClass().getName());
						for (IfcFaceBound bound : face.getBounds()) {
							printlnCounted(indent + "bound=" + bound.getBound().getClass().getName());
						}
					}
					flushCounted();
				}
			}
			isInteresting = true;
		} else if (item instanceof IfcFaceBasedSurfaceModel) {
			IfcFaceBasedSurfaceModel ifcFaceBasedSurfaceModel = (IfcFaceBasedSurfaceModel) item;
			for (IfcConnectedFaceSet fae : ifcFaceBasedSurfaceModel.getFbsmFaces()) {
				println(indent + "shell=" + fae.getClass().getName());
				if (fae instanceof IfcConnectedFaceSet) {
					IfcConnectedFaceSet ifcConnectedFaceSet = (IfcConnectedFaceSet) fae;
					for (IfcFace face : ifcConnectedFaceSet.getCfsFaces()) {
						printlnCounted(indent + "face=" + face.getClass().getName());
						for (IfcFaceBound bound : face.getBounds()) {
							printlnCounted(indent + "bound=" + bound.getBound().getClass().getName());
						}
					}
					flushCounted();
				}
			}
			isInteresting = true;
		} else if (item instanceof IfcManifoldSolidBrep) {
			IfcManifoldSolidBrep ifcManifoldSolidBrep = (IfcManifoldSolidBrep) item;
			IfcShell shell = ifcManifoldSolidBrep.getOuter();
			if (shell != null) {
				println(indent + "shell=" + shell.getClass().getName());
				if (shell instanceof IfcConnectedFaceSet) {
					IfcConnectedFaceSet ifcConnectedFaceSet = (IfcConnectedFaceSet) shell;
					for (IfcFace face : ifcConnectedFaceSet.getCfsFaces()) {
						printlnCounted(indent + "face=" + face.getClass().getName());
						for (IfcFaceBound bound : face.getBounds()) {
							printlnCounted(indent + "bound=" + bound.getBound().getClass().getName());
						}
					}
					flushCounted();
				}
			}
			isInteresting = true;
		} else if (item instanceof IfcMappedItem) {
			IfcMappedItem solid = (IfcMappedItem) item;
			IfcRepresentationMap repMap = solid.getMappingSource();
			IfcRepresentation rep = repMap.getMappedRepresentation();
			for (IfcRepresentationItem repItem : rep.getItems()) {
				examineRepresentationItem(repItem, indent);
			}
		} else
			isInteresting = true;
	}

	private void examineStyle(IfcStyledItem ifcStyledItem, String indent) {
		for (IfcPresentationStyleAssignment as : ifcStyledItem.getStyles()) {
			for (IfcPresentationStyleSelect sel : as.getStyles()) {
				IfcSurfaceStyle surfaceStyle = sel.getIfcSurfaceStylevalue();
				if (surfaceStyle != null) {
					println(indent + "#################surfaceStyle=" + surfaceStyle.getName());
					continue;
				}
				IfcFillAreaStyle fillAreaStyl = sel.getIfcFillAreaStylevalue();
				if (fillAreaStyl != null) {
					println(indent + "#############fillAreaStyle=" + fillAreaStyl.getName());
					continue;
				}
				println(indent + "#############unknown style!=");
			}
		}
		if (ifcStyledItem.getStyledByItem() != null) {
			indent += "       ";
			examineStyle(ifcStyledItem.getStyledByItem(), indent);
		}
	}

	private String getPoint(IfcCartesianPoint location) {
		String result = "";
		for (double d : location.getCoordinates()) {
			result += " " + d;
		}
		return result;
	}

	private void flushCounted() {
		for (String string : countedPrint.keySet())
			println(string + " [" + countedPrint.get(string) + "]");
		countedPrint.clear();
	}

	private void println(String string) {
		if (doPrint)
			message += string + "\n";
	}

	private void printlnCounted(String string) {
		if (doPrint) {
			Integer integer = countedPrint.get(string);
			if (integer == null)
				integer = 0;
			countedPrint.put(string, integer + 1);
		}
	}

	private String getDir(IfcDirection extrudedDirection) {
		if (extrudedDirection == null)
			return "not defined";
		String result = "";
		for (double d : extrudedDirection.getDirectionRatios()) {
			result += " " + d;
		}
		return result;
	}

}
