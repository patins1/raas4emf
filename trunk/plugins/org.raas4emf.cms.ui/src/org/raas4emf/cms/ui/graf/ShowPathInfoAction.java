/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.graf;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.raas4emf.cms.core.graf.IEdge;
import org.raas4emf.cms.core.graf.IVertex;

public class ShowPathInfoAction extends AbstractHandler {

	private Set<IVertex> _blackList = new HashSet<IVertex>();

	public ShowPathInfoAction() {
		super();
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		calcAndShowPath(GrafUtil.getDefaultFactory().getVerticesFrom(GrafUtil.getDefaultFactory().getStartPoints()), GrafUtil.getDefaultFactory().getVerticesFrom(GrafUtil.getDefaultFactory().getEndPoints()), HandlerUtil.getActiveShell(event));
		return null;
	}

	public void calcAndShowPath(Set<IVertex> startPoints, Set<IVertex> endPoints, Shell shell) {
		if (startPoints.isEmpty()) {
			new MessageDialog(shell, "Error", null, "A starting/end point must be selected first!", MessageDialog.ERROR, new String[] { "Close" }, 0).open();
			return;
		}

		GraphAlgorithms bestAlgo = new GrafUtil().drawLines(shell, startPoints, endPoints, _blackList, true);
		String message;
		if (bestAlgo != null) {
			String newLowest = bestAlgo.getHighestCost() != Integer.MIN_VALUE ? "" + bestAlgo.getHighestCost() : "undefined as no edge was passed";
			List<Object> way = bestAlgo.getWays().iterator().next();
			message = "Lowest cost is " + newLowest + "          Length is " + way.size() + "\n\n";
			for (Object w : way) {
				if (w instanceof IEdge) {
					IEdge edge = (IEdge) w;
					message += "                         " + edge.getName() + " [" + edge.getCost() + "]\n";
				}
				if (w instanceof IVertex) {
					IVertex vertex = (IVertex) w;
					message += "" + vertex.getName() + " [" + vertex.getCost() + "]\n";
				}
			}
		} else
			message = "Found no path";
		MessageDialog dialog = new MessageDialog(shell, "Path Information", null, message, MessageDialog.INFORMATION, new String[] { "OK", "Black-list", "Clear" }, 0);

		int res = dialog.open();
		if (res == 1) {
			if (bestAlgo != null) {
				List<Object> way = bestAlgo.getWays().iterator().next();
				for (Object object : way.subList(1, way.size() - 1))
					if (object instanceof IVertex)
						_blackList.add((IVertex) object);
			}
			calcAndShowPath(startPoints, endPoints, shell);
		} else if (res == 2) {
			_blackList.clear();
			calcAndShowPath(startPoints, endPoints, shell);
		} else {
			_blackList.clear();
		}
	}

}
