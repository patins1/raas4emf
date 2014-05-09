/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.eclipse.jqvt.jvmmodel;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jqvt.jQVT.Relation;
import org.eclipse.jqvt.jQVT.impl.RelationImpl;

public class FakeRelation extends RelationImpl {

	List<Relation> circledRelations;

	public FakeRelation() {
		circledRelations = new ArrayList<Relation>();
	}

	public void add(Relation relation) {
		circledRelations.add(relation);
	}

	public List<Relation> getMembers() {
		return circledRelations;
	}

	@Override
	public boolean isTopRelation() {
		for (Relation relation : this.circledRelations)
			if (relation.isTopRelation())
				return true;
		return false;
	}

	@Override
	public String getName() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (Relation r : circledRelations) {
			sb.append(r.getName());
			sb.append("|");
		}
		if (sb.lastIndexOf("|") != -1)
			sb.delete(sb.length() - 1, sb.length());
		sb.append("]");
		return sb.toString();
	}

}
