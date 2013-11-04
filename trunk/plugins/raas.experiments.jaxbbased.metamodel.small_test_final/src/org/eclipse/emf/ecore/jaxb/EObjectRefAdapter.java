package org.eclipse.emf.ecore.jaxb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * Maps an extension to an {@link EObject} interface to its corresponding
 * reference class. Rationale: To reference content in a SOAP message which is
 * actually not contained in the message itself but hold on server side (e.g. in
 * a database), an {@link EObjectRef} is used which holds a "pointer" to the
 * referenced data object by holding an unique identifier of the data object.
 * Every EMF metamodel class should have its own extension of this class
 * specifying an own extension of {@link EObjectRef} to implement the concept of
 * "typed pointers".
 * 
 * @param <BoundType>
 * @param <BoundRefType>
 */
abstract public class EObjectRefAdapter<BoundRefType extends EObjectRef, BoundType extends EObject> extends XmlAdapter<BoundRefType, BoundType> {
	/**
	 * EMF Proxies are created refering to this URI. The repository logic can
	 * set this URI so that EMF's proxy resolving algorithm can load the proxy
	 * from a resource corresponding to this URI.
	 */
	private static URI RESOURCEURI = URI.createURI("");

	/**
	 * Maps an Impl class to a Ref class
	 */
	private static Map<Class<? extends EObject>, Class<? extends EObjectRef>> refClassOfClass = new HashMap<Class<? extends EObject>, Class<? extends EObjectRef>>();

	/**
	 * @return a new instance of the EMF type
	 */
	final public BoundType createInstance(BoundRefType v) {
		return (BoundType) v.createInstance();
	}

	/**
	 * @return a new instance of the reference type
	 * @throws ClassNotFoundException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 */
	final public BoundRefType createInstanceRef(BoundType eObject) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class<? extends EObject> clazz = eObject.getClass();
		Class<? extends EObjectRef> refClass = refClassOfClass.get(clazz);
		if (refClass == null) {
			String packageName = clazz.getPackage().getName();
			if (!packageName.endsWith(".impl"))
				return null;
			packageName = packageName.substring(0, packageName.length() - "impl".length()) + "jaxb";
			String className = clazz.getSimpleName();
			if (!className.endsWith("Impl"))
				return null;
			className = className.substring(0, className.length() - "Impl".length()) + "Ref";
			refClass = (Class<? extends EObjectRef>) Class.forName(packageName + "." + className);
			refClassOfClass.put(clazz, refClass);
		}
		return (BoundRefType) refClass.newInstance();
	}

	@Override
	public BoundType unmarshal(BoundRefType v) throws Exception {
		BoundType eObject = createInstance(v);
		EcoreUtil.setID(eObject, v.getID());
		((EObjectImpl) eObject).eSetProxyURI(RESOURCEURI.appendFragment(v.getID()));
		return eObject;
	}

	@Override
	public BoundRefType marshal(BoundType eObject) throws Exception {
		BoundRefType result = createInstanceRef(eObject);
		result.setID(EcoreUtil.getID(eObject));
		return result;
	}

	public List<BoundRefType> marshal(List<BoundType> list) throws Exception {
		List<BoundRefType> result = new ArrayList<BoundRefType>(list.size());
		for (BoundType boundType : list) {
			result.add(marshal(boundType));
		}
		return result;
	}

	public List<BoundRefType> marshalList(List<BoundType> list) throws Exception {
		List<BoundRefType> result = new ArrayList<BoundRefType>(list.size());
		for (BoundType boundType : list) {
			result.add(marshal(boundType));
		}
		return result;
	}

	public List<BoundType> unmarshal(List<BoundRefType> list) throws Exception {
		List<BoundType> result = new ArrayList<BoundType>(list.size());
		for (BoundRefType boundRefType : list) {
			result.add(unmarshal(boundRefType));
		}
		return result;
	}
}
