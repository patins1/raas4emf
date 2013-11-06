/**
 * Copyright (c) 2010- 2011 QUT (Brisbane, Australia) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Jim Steel - initial API and implementation
 *    Joerg Kiegeland - extension for database storage 
 */
package IFC2X3.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BasicBiMap<K,V> implements Map<K, V> {

	private Map<K,V> mainMap;
	private Map<V,K> inverseMap;
	
	public BasicBiMap() {
		super();
		this.mainMap = new HashMap<K,V>();
		this.inverseMap = new HashMap<V,K>();
	}
	
	@Override
	public void clear() {
		mainMap.clear();
		inverseMap.clear();
	}

	@Override
	public boolean containsKey(Object arg0) {
		return mainMap.containsKey(arg0);
	}

	@Override
	public boolean containsValue(Object arg0) {
		return inverseMap.containsKey(arg0);
	}

	@Override
	public Set<java.util.Map.Entry<K, V>> entrySet() {
		return mainMap.entrySet();
	}

	@Override
	public V get(Object arg0) {
		// TODO Auto-generated method stub
		return mainMap.get(arg0);
	}

	@Override
	public boolean isEmpty() {
		return mainMap.isEmpty();
	}

	@Override
	public Set<K> keySet() {
		return mainMap.keySet();
	}

	@Override
	public V put(K arg0, V arg1) {
		V oldVal = mainMap.get(arg0);
		mainMap.put(arg0, arg1);
		inverseMap.put(arg1, arg0);
		return oldVal;
	}

	@Override
	public void putAll(Map<? extends K, ? extends V> arg0) {
		mainMap.putAll(arg0);
		for (java.util.Map.Entry<? extends K, ? extends V> entry : arg0.entrySet()) {
			inverseMap.put(entry.getValue(), entry.getKey());
		}
	}

	@Override
	public V remove(Object arg0) {
		V oldVal = mainMap.get(arg0);
		mainMap.remove(arg0);
		inverseMap.remove(oldVal);
		return oldVal;
	}

	@Override
	public int size() {
		return mainMap.size();
	}

	@Override
	public Collection<V> values() {
		return inverseMap.keySet();
	}
	
	public K inverseGet(V val) {
		return inverseMap.get(val);
	}
	
}
