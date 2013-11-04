package au.com.smartservicescrc.raas_small_test.jaxb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import au.com.smartservicescrc.raas_small_test.TopClassD;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.jaxb.EObjectRef;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class TopClassDRefAdapter extends XmlAdapter<TopClassDRef, TopClassD> {
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
	final public TopClassD createInstance(TopClassDRef v) {
		return (TopClassD) v.createInstance();
	}

	/**
	 * @return a new instance of the reference type
	 * @throws ClassNotFoundException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 */
	final public TopClassDRef createInstanceRef(TopClassD eObject) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
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
		return (TopClassDRef) refClass.newInstance();
	}

	@Override
	public TopClassD unmarshal(TopClassDRef v) throws Exception {
		TopClassD eObject = createInstance(v);
		EcoreUtil.setID(eObject, v.getID());
		((EObjectImpl) eObject).eSetProxyURI(RESOURCEURI.appendFragment(v.getID()));
		return eObject;
	}

	@Override
	public TopClassDRef marshal(TopClassD eObject) throws Exception {
		TopClassDRef result = createInstanceRef(eObject);
		result.setID(EcoreUtil.getID(eObject));
		return result;
	}

	public List<TopClassDRef> marshal(List<TopClassD> list) throws Exception {
		List<TopClassDRef> result = new ArrayList<TopClassDRef>(list.size());
		for (TopClassD TopClassD : list) {
			result.add(marshal(TopClassD));
		}
		return result;
	}

	public List<TopClassDRef> marshalList(List<TopClassD> list) throws Exception {
		List<TopClassDRef> result = new ArrayList<TopClassDRef>(list.size());
		for (TopClassD TopClassD : list) {
			result.add(marshal(TopClassD));
		}
		return result;
	}

	public List<TopClassD> unmarshal(List<TopClassDRef> list) throws Exception {
		List<TopClassD> result = new ArrayList<TopClassD>(list.size());
		for (TopClassDRef TopClassDRef : list) {
			result.add(unmarshal(TopClassDRef));
		}
		return result;
	}
}
