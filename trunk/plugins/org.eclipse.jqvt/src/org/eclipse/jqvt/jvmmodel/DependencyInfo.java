/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.eclipse.jqvt.jvmmodel;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jqvt.util.JQVTUtils;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XVariableDeclaration;

/**
 * Holds dependency information for one QVT snippet
 */
@SuppressWarnings("restriction")
public class DependencyInfo {

	final EObject snippet;
	public final boolean isTarget;

	public DependencyInfo(EObject snippet, boolean isTarget) {
		this.snippet = snippet;
		this.isTarget = isTarget;
	}

	public DependencyInfo(EObject clause, DependencyInfo info) {
		this(clause, info.isTarget);
		read.addAll(info.read);
		write = new HashMap<XVariableDeclaration, JvmTypeReference>(info.write);
	}

	private Set<XVariableDeclaration> read = new HashSet<XVariableDeclaration>();
	private Map<XVariableDeclaration, JvmTypeReference> write = new HashMap<XVariableDeclaration, JvmTypeReference>();
	// variables which are sure to be written a non null value
	private Set<XVariableDeclaration> writeNonNull = new HashSet<XVariableDeclaration>();
	private Set<XVariableDeclaration> readWithoutWrite;

	/**
	 * If the variable is already bound to a value not equal to null, then this value is written again with the same value, otherwise another value is written.<br>
	 * Caution for code generation: the variable should be reset later (set to null) so that it is not considered as bound to a real value in the next iteration of a for loop
	 * 
	 * @param var
	 */
	public void readOrWrite(XVariableDeclaration var, JvmTypeReference type, boolean isWriteNonNull) {
		read.add(var);
		if (isWriteNonNull)
			writeNonNull(var, type);
		else
			write(var, type);
	}

	public void write(XVariableDeclaration var, JvmTypeReference type) {
		write.put(var, type);
	}

	public void writeNonNull(XVariableDeclaration var, JvmTypeReference type) {
		write(var, type);
		writeNonNull.add(var);
	}

	public void read(XVariableDeclaration var) {
		read.add(var);
	}

	public boolean isWrite(XVariableDeclaration var) {
		return write.containsKey(var);
	}

	public Set<XVariableDeclaration> getWrite() {
		return write.keySet();
	}

	public Set<XVariableDeclaration> getWriteNonNull() {
		return writeNonNull;
	}

	public Set<XVariableDeclaration> getRead() {
		return read;
	}

	public Set<XVariableDeclaration> getReadWithoutWrite() {
		if (readWithoutWrite == null) {
			readWithoutWrite = new HashSet<XVariableDeclaration>(read);
			readWithoutWrite.removeAll(write.keySet());
		}
		return readWithoutWrite;
	}

	public boolean isRead(XVariableDeclaration var) {
		return read.contains(var);
	}

	public void calcActualBindings(Set<XVariableDeclaration> bound, Set<XVariableDeclaration> boundNonNullVariables) {
		write.keySet().removeAll(boundNonNullVariables);
		writeNonNull.removeAll(boundNonNullVariables);
		read.retainAll(bound);
		readWithoutWrite = null;
	}

	public void orWith(DependencyInfo info) {
		read.addAll(info.read);
		write.keySet().retainAll(info.write.keySet());
		writeNonNull.retainAll(info.writeNonNull);
	}

	public void andWith(DependencyInfo info) {
		read.addAll(info.read);
		write.putAll(info.write);
		writeNonNull.addAll(info.writeNonNull);
	}

	public void discardBindings() {
		read.removeAll(write.keySet()); // tricky
		write.clear();
		writeNonNull.clear();
	}

	@Override
	public String toString() {
		return JQVTUtils.toQVT(snippet);
	}

	public JvmTypeReference getWrittenType(XVariableDeclaration var) {
		return write.get(var);
	}

}
