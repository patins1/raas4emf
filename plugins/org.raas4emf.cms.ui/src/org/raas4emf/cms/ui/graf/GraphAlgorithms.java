/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.cms.ui.graf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.raas4emf.cms.core.graf.IEdge;
import org.raas4emf.cms.core.graf.IGrafFactory;
import org.raas4emf.cms.core.graf.IVertex;

public class GraphAlgorithms {

	private final double forbiddenCost;

	HashMap<IVertex, IEdge> comesFrom = new HashMap<IVertex, IEdge>();
	HashMap<IVertex, IVertex> comesFromVertex = new HashMap<IVertex, IVertex>();
	Collection<List<Object>> ways = new HashSet<List<Object>>();
	Set<IVertex> visited = new HashSet<IVertex>();

	private Set<IVertex> penaltyPoints = new HashSet<IVertex>();

	// private Map<IVertex, List<Object>> wayToVertex = new HashMap<IVertex, List<Object>>();

	private Map<IVertex, Double> totalCostOf = new HashMap<IVertex, Double>();

	private Set<IVertex> theStopVertices;

	private final IGrafFactory graf;

	public GraphAlgorithms(double ownSecurityAccessLevel, IGrafFactory graf) {
		this.forbiddenCost = ownSecurityAccessLevel;
		this.graf = graf;
	}

	public GraphAlgorithms(IGrafFactory graf) {
		this(Integer.MAX_VALUE, graf);
	}

	public GraphAlgorithms() {
		this(GrafUtil.getDefaultFactory());
	}

	public GraphAlgorithms(double ownSecurityAccessLevel) {
		this(ownSecurityAccessLevel, GrafUtil.getDefaultFactory());
	}

	public boolean doBFS(Set<IVertex> initialStartVertices, Set<IVertex> stopVertices) {
		boolean result = false;
		this.theStopVertices = stopVertices;
		visited.addAll(initialStartVertices);
		Set<IVertex> startVertices = initialStartVertices;
		if (initialStartVertices.equals(stopVertices)) {
			// case path within single room
			for (IVertex vertex : initialStartVertices)
				if (vertex.getCost() < forbiddenCost && !penaltyPoints.contains(vertex))
					comesFromVertex.put(vertex, vertex);
				else
					return false;
			return true;
		}
		while (!startVertices.isEmpty()) {
			Set<IVertex> newVertices = new HashSet<IVertex>();
			for (IVertex startIVertex : startVertices) {
				for (IEdge edge : startIVertex.getEdges()) {
					if (edge.getCost() < forbiddenCost)
						for (IVertex vertex : edge.getVertices())
							if (vertex.getCost() < forbiddenCost && !vertex.equals(startIVertex) && !penaltyPoints.contains(vertex)) {
								if (visited.add(vertex) || graf.hasTotalCostGoal() && getTotalCost(vertex) > getTotalCost(startIVertex) + edge.getCost()) {
									setTotalCost(vertex, getTotalCost(startIVertex) + edge.getCost());
									comesFrom.put(vertex, edge);
									comesFromVertex.put(vertex, startIVertex);
									if (stopVertices.contains(vertex)) {
										if (!graf.hasTotalCostGoal())
											return true;
										result = true;
									} else {
										newVertices.add(vertex);
										if (stopVertices.isEmpty())
											result = true;
									}
								}
								// else if (ALLOW_CIRCLE && stopVertices.equals(initialStartVertices) && (startVertices.contains(vertex))) {
								// stopAt(vertex); // collect foreign path
								// comesFrom.put(vertex, edge);
								// comesFromVertex.put(vertex, startIVertex);
								// bestPath.remove(vertex);
								// way.remove(vertex);
								// stopAt(vertex); // collect own path
								// return true;
								// }
							}
				}
			}
			startVertices = newVertices;
		}
		return result;
	}

	private void setTotalCost(IVertex vertex, double d) {
		totalCostOf.put(vertex, d);
	}

	private double getTotalCost(IVertex vertex) {
		Double result = totalCostOf.get(vertex);
		if (result == null)
			result = 0.0;
		return result;
	}

	public double getCost(IVertex vertex) {
		if (graf.hasTotalCostGoal()) {
			return getTotalCost(vertex) / 1000;
		}
		int count = 0;
		double maxCost = vertex.getCost();
		while (comesFrom.containsKey(vertex)) {
			IEdge edge = comesFrom.get(vertex);
			maxCost = Math.max(maxCost, edge.getCost());
			maxCost = Math.max(maxCost, vertex.getCost());
			vertex = comesFromVertex.get(vertex);
			count++;
		}
		if (graf.hasMaxCostGoal())
			return maxCost;
		return count;
	}

	private void stopAt(IVertex vertex) {
		// if (wayToVertex.get(vertex) != null)
		// return;
		List<Object> way = new ArrayList<Object>();
		way.add(vertex);
		while (comesFrom.containsKey(vertex)) {
			IEdge pathEdge = comesFrom.get(vertex);
			way.add(pathEdge);
			vertex = comesFromVertex.get(vertex);
			// ways.remove(wayToVertex.get(vertex));
			// wayToVertex.put(vertex, way);
			way.add(vertex);
		}
		if (way.size() == 1) {
			// case path within single room
			way.add(vertex);
		}
		if (way.size() > 1)
			ways.add(way);

	}

	public Set<IVertex> getVisited() {
		return visited;
	}

	public void setVisited(Set<IVertex> visited) {
		this.visited = visited;
	}

	public Collection<List<Object>> getWays() {
		if (ways.isEmpty()) {
			for (IVertex vertex : !theStopVertices.isEmpty() ? theStopVertices : comesFrom.keySet()) {
				stopAt(vertex);
			}
		}
		return ways;
	}

	public Set<IEdge> getDoorsOfVisited() {
		Set<IEdge> allDoors = new HashSet<IEdge>();
		for (IVertex v : getVisited())
			allDoors.addAll(v.getEdges());
		return allDoors;
	}

	public void setPenalties(Set<IVertex> penaltyPoints) {
		this.penaltyPoints = penaltyPoints;
	}

	public double getHighestCost() {
		double maxCost = Integer.MIN_VALUE;
		for (IVertex vertex : !theStopVertices.isEmpty() ? theStopVertices : comesFrom.keySet()) {
			maxCost = Math.max(maxCost, getCost(vertex));
		}
		return maxCost;
	}
}
