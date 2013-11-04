package raas.testutils;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * A proxy class to be used instead of using a web service port directly, in
 * order to simulate a web method call by directly calling it.
 * 
 */
public class SimulatedWSClientProxy implements java.lang.reflect.InvocationHandler {

	private static URI RESOURCEURI = URI.createURI("");

	private Object obj;

	public static Object newInstance(Object obj) {
		return java.lang.reflect.Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new SimulatedWSClientProxy(obj));
	}

	private SimulatedWSClientProxy(Object obj) {
		this.obj = obj;
	}

	public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
		try {
			int i = 0;
			if (args != null)
				for (Object arg : args) {
					Annotation[] annos = m.getParameterAnnotations()[i];
					args[i] = simulateNetwork(arg, annos);
				}
			Object result = m.invoke(obj, args);
			result = simulateNetwork(result, m.getAnnotations());
			return result;
		} catch (InvocationTargetException e) {
			throw e.getTargetException();
		} catch (Exception e) {
			throw new RuntimeException("unexpected invocation exception: " + e.getMessage());
		}
	}

	public Object simulateNetwork(Object arg, Annotation[] annos) {
		if (hasRefAdapter(annos)) {
			if (arg instanceof EObject) {
				EObject eObject = (EObject) arg;
				return asProxy(eObject);
			} else if (arg instanceof List) {
				List list = (List) arg;
				List result = new ArrayList();
				for (Object argItem : list) {
					if (argItem instanceof EObject) {
						EObject eObject = (EObject) argItem;
						result.add(asProxy(eObject));
					} else {
						result.add(argItem);
					}
				}
				return result;
			}
		} else {
			if (arg instanceof EObject) {
				EObject eObject = (EObject) arg;
				arg = EcoreUtil.copy(eObject);
			} else if (arg instanceof List) {
				List list = (List) arg;
				List result = new ArrayList();
				for (Object resultItem : list) {
					if (resultItem instanceof EObject) {
						EObject eObject = (EObject) resultItem;
						result.add(EcoreUtil.copy(eObject));
					} else {
						result.add(resultItem);
					}
				}
				return result;
			}
		}
		return arg;
	}

	private Object asProxy(EObject eObject) {
		EObject proxy = EcoreUtil.create(eObject.eClass());
		EcoreUtil.setID(proxy, EcoreUtil.getID(eObject));
		((EObjectImpl) proxy).eSetProxyURI(RESOURCEURI.appendFragment(EcoreUtil.getID(eObject)));
		return proxy;
	}

	private boolean hasRefAdapter(Annotation[] annos) {
		if (annos != null) {
			for (Annotation anno : annos)
				if ("XmlJavaTypeAdapter".equals(anno.annotationType().getSimpleName())) {
					return true;
				}
		}
		return false;
	}
}
