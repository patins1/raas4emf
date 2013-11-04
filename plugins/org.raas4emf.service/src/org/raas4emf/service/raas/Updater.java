/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package org.raas4emf.service.raas;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;

/**
 * Class to update a (normaly persistent) object by the contents of a given (normally transient) object. This class basically just clears all content of the old object and copies the content of the new object into the old object by deriving from {@link Copier}.
 */
public class Updater extends Copier {
	private final EObject persistentObject;
	private final EObject newObject;
	/**
	 * Map ids of persistent objects
	 */
	final Map<String, EObject> oldObjsById = new HashMap<String, EObject>();

	public Updater(EObject persistentObject, EObject newObject) {
		this.persistentObject = persistentObject;
		this.newObject = newObject;
		TreeIterator<Object> it = EcoreUtil.getAllContents(persistentObject, true);
		while (it.hasNext()) {
			EObject obj = (EObject) it.next();
			oldObjsById.put(EcoreUtil.getID(obj), obj);
		}
	}

	/**
	 * Reuse old objects if possible before creating a copy in the super method. Reuse is only required for {@link #persistentObject} in order to actually update it. For contained persistent objects, it may be a speed-up to reuse them, otherwise they should get deleted and created from the scratch.
	 */
	@Override
	protected EObject createCopy(EObject eObject) {
		// required
		if (eObject == newObject)
			return persistentObject;
		// speed-up
		EObject result = oldObjsById.get(EcoreUtil.getID(eObject));
		if (result != null)
			return result;
		// copy only new object (or an old object, where the id changed!)
		return super.createCopy(eObject);
	}

	/**
	 * Clear references in old object, since any reference not defined by the new object shall be deleted.
	 */
	@Override
	protected void copyReference(EReference eReference, EObject eObject, EObject copyEObject) {
		copyEObject.eUnset(eReference);
		super.copyReference(eReference, eObject, copyEObject);
	}

	@Override
	protected void copyAttribute(EAttribute eAttribute, EObject eObject, EObject copyEObject) {
		copyEObject.eUnset(eAttribute);
		super.copyAttribute(eAttribute, eObject, copyEObject);
	}

	@Override
	protected void copyContainment(EReference eReference, EObject eObject, EObject copyEObject) {
		copyEObject.eUnset(eReference);
		super.copyContainment(eReference, eObject, copyEObject);
	}

	/**
	 * Performs the update operation
	 */
	public void doUpdate() {
		EObject result = copy(newObject);
		assert result == persistentObject;
		copyReferences();
	}

	@Override
	public EObject get(Object key) {
		if (key instanceof EObject) {
			EObject eObject = (EObject) key;
			if (eObject.eIsProxy()) {
				// resolve proxies in order for Teneo to work
				return EcoreUtil.resolve(eObject, persistentObject);
			}
		}
		return super.get(key);
	}
}
