/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.graf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Shell;
import org.raas4emf.cms.core.IGeometricCenter;
import org.raas4emf.cms.core.geometry.XYZ;
import org.raas4emf.cms.core.graf.IEdge;
import org.raas4emf.cms.core.graf.IGrafFactory;
import org.raas4emf.cms.core.graf.IVertex;
import org.raas4emf.cms.ui.CMSActivator;
import org.raas4emf.cms.ui.views.PreviewView;

import raascms.Artifact;

public class GrafUtil {

	private XYZ fromPosition;
	private XYZ toPosition;

	public static IGrafFactory getDefaultFactory() {
		IGrafFactory result = (IGrafFactory) CMSActivator.getSessionInstance().getUserObject("DEFAULT_FACTORY");
		return result;
	}

	public static void setDefaultFactory(IGrafFactory iGrafFactory) {
		CMSActivator.getSessionInstance().setUserObject("DEFAULT_FACTORY", iGrafFactory);
	}

	public static List<EObject> getLastDoorPath() {
		@SuppressWarnings("unchecked")
		List<EObject> lastDoorPath = (List<EObject>) CMSActivator.getSessionInstance().getUserObject("lastDoorPath");
		if (lastDoorPath == null) {
			lastDoorPath = new ArrayList<EObject>();
			CMSActivator.getSessionInstance().setUserObject("lastDoorPath", lastDoorPath);
		}
		return lastDoorPath;
	}

	public static GraphAlgorithms drawLines(Shell shell) {
		return new GrafUtil().drawLines(shell, null, null);
	}

	public GraphAlgorithms drawLines(Shell shell, XYZ start, XYZ to) {
		fromPosition = start;
		toPosition = to;
		return drawLines(shell, GrafUtil.getDefaultFactory().getVerticesFrom(GrafUtil.getDefaultFactory().getStartPoints()), GrafUtil.getDefaultFactory().getVerticesFrom(GrafUtil.getDefaultFactory().getEndPoints()), new HashSet<IVertex>(), false);
	}

	public GraphAlgorithms drawLines(Shell shell, Set<IVertex> startPoints, Set<IVertex> endPoints, Set<IVertex> blackList, boolean isolate) {
		if (startPoints.isEmpty())
			return null;
		Map<EObject, Object> infos = new HashMap<EObject, Object>();
		GraphAlgorithms bestAlgo = GrafUtil.getBestPath(startPoints, endPoints, blackList);
		System.out.println("bestAlgo:" + (bestAlgo != null ? bestAlgo.getWays().size() : "no path"));
		Set<EObject> newSel = new HashSet<EObject>();
		if (bestAlgo != null) {
			for (List<Object> way : bestAlgo.getWays()) {
				for (Object object : way) {
					if (object instanceof IEdge) {
						IEdge iEdge = (IEdge) object;
						if (iEdge.getUserObject() instanceof EObject)
							newSel.add((EObject) iEdge.getUserObject());
					}
					if (object instanceof IVertex) {
						IVertex iVertex = (IVertex) object;
						if (iVertex.getUserObject() instanceof EObject) {
							newSel.add(iVertex.getUserObject());
						}
					}
				}
			}
		}
		List<EObject> doors = new ArrayList<EObject>();
		if (bestAlgo != null) {
			for (List<Object> way : bestAlgo.getWays()) {
				for (Object object : way) {
					if (object instanceof IEdge) {
						IEdge iEdge = (IEdge) object;
						if (iEdge.getUserObject() instanceof EObject)
							doors.add((EObject) iEdge.getUserObject());
					}
					if (object instanceof IVertex) {
						IVertex iVertex = (IVertex) object;
						if (iVertex.getUserObject() instanceof EObject) {
							EObject eVertex = (EObject) iVertex.getUserObject();
							infos.put(eVertex, Math.round((bestAlgo.getCost(iVertex))));
							doors.add(eVertex);
						}
					}
				}
				doors.add(null);
			}
		}
		Artifact artifact = PreviewView.getArtifact(startPoints.iterator().next().getUserObject());
		if (isolate) {
			for (PreviewView preview : PreviewView.findView(artifact)) {
				preview.isolate(newSel);
			}
		}
		String prefix = "Door number: ";
		if (GrafUtil.getDefaultFactory().hasMaxCostGoal())
			prefix = "Required security clearance: ";
		if (GrafUtil.getDefaultFactory().hasTotalCostGoal())
			prefix = "Distance in meter: ";
		String message = (bestAlgo != null ? prefix + Math.round(bestAlgo.getHighestCost()) : "No path found!");
		drawLines(shell, doors, artifact, infos, prefix, message, false);
		return bestAlgo;
	}

	public static GraphAlgorithms getBestPath(Set<IVertex> startPoints, Set<IVertex> endPoints, Set<IVertex> penaltyPoints) {
		GraphAlgorithms algo = new GraphAlgorithms();
		algo.setPenalties(penaltyPoints);
		GraphAlgorithms bestAlgo = null;
		while (algo.doBFS(startPoints, endPoints)) {
			bestAlgo = algo;
			if (!GrafUtil.getDefaultFactory().hasMaxCostGoal())
				break;
			algo = new GraphAlgorithms(bestAlgo.getHighestCost());
			algo.setPenalties(penaltyPoints);
		}
		return bestAlgo;
	}

	public String doDrawLines(Shell shell, List<? extends EObject> products, Artifact artifact, Map<? extends EObject, Object> infos, String prefix, String message, boolean doCount) {
		Map<XYZ, Object> newInfos = new HashMap<XYZ, Object>();
		Set<EObject> visited = new HashSet<EObject>();
		Map<XYZ, Integer> accounting = new HashMap<XYZ, Integer>();
		getLastDoorPath().clear();
		int wayCount = 0;
		List<XYZ> pts = new ArrayList<XYZ>();
		XYZ lastProduct = null;
		Object lastInfo = null;
		boolean prune = false;
		System.out.println();
		for (int i = 0; i < products.size(); i++) {
			EObject product = products.get(i);
			if (product == null) {
				pts.add(null);
				lastProduct = null;
				lastInfo = null;
				prune = false;
				wayCount++;
			} else if (!prune) {
				// System.out.println("class=" + product.eClass().getName() + " " + GrafUtil.getDefaultFactory().getVerticesFrom(Arrays.asList(product)).iterator().next().getName());
				if (infos.get(product) != null)
					lastInfo = infos.get(product);
				Object adapter = Platform.getAdapterManager().getAdapter(product, IGeometricCenter.class);
				if (adapter instanceof IGeometricCenter) {
					IGeometricCenter iGeometricCenter = (IGeometricCenter) adapter;
					if (!(iGeometricCenter.isAir() && products.get(i + 1) != null && lastProduct != null)) {
						XYZ point = iGeometricCenter.getAbsoluteCenter();
						if (GrafUtil.getDefaultFactory().getEndPoints().contains(product) && toPosition != null) {
							point = new XYZ(toPosition.X, toPosition.Y, point.Z);
							toPosition = null;
						} else if (GrafUtil.getDefaultFactory().getStartPoints().contains(product) && fromPosition != null) {
							point = fromPosition;
							fromPosition = null;
						}
						XYZ dir = iGeometricCenter.getOpeningDirection();
						XYZ pointSecond = null;
						if (dir != null && lastProduct != null) {
							XYZ point1 = point.add(dir.multiply(500));
							XYZ point2 = point.add(dir.multiply(-500));
							if (point1.distanceTo(lastProduct) < point2.distanceTo(lastProduct)) {
								point = point1;
								pointSecond = point2;
							} else {
								point = point2;
								pointSecond = point1;
							}
						}
						if (iGeometricCenter.isAir() && lastProduct != null)
							point = new XYZ(point.X, point.Y, lastProduct.Z);
						pts.add(point);
						newInfos.put(point, lastInfo);
						if (pointSecond != null) {
							point = pointSecond;
							pts.add(point);
							newInfos.put(point, lastInfo);
						}
						lastProduct = point;
						if (doCount)
							accounting.put(point, accounting.get(point) != null ? accounting.get(point) + 1 : 1);
						else if (!visited.add(product))
							prune = true;
					}
				}
				if (wayCount == 0)
					getLastDoorPath().add(product);
			}
		}
		if (doCount) {
			for (Map.Entry<XYZ, Object> entry : newInfos.entrySet()) {
				newInfos.put(entry.getKey(), entry.getValue() + " (totally accessed " + accounting.get(entry.getKey()) + " times)");
			}
		}
		Collections.reverse(getLastDoorPath());

		return PreviewView.doDrawLines(artifact, pts, newInfos, prefix, message);

	}

	public void drawLines(Shell shell, List<? extends EObject> products, Artifact artifact, Map<? extends EObject, Object> infos, String prefix, String message, boolean doCount) {
		for (PreviewView preview : PreviewView.findView(artifact)) {
			preview.drawLines(doDrawLines(shell, products, artifact, infos, prefix, message, doCount));
		}
	}

}
