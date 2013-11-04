package raas.testutils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.spi.Provider;
import javax.xml.ws.spi.ServiceDelegate;

/**
 * A proxy class to be used instead of using a web service port directly. Thus,
 * a {@link List}-typed web method returning <code>null</code> will return an
 * empty list.
 * 
 */
public class WSClientProxy implements java.lang.reflect.InvocationHandler {

	private Object obj;

	@SuppressWarnings("unchecked")
	public static <T> T newInstance(T obj) {
		return (T) java.lang.reflect.Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new WSClientProxy(obj));
	}

	private WSClientProxy(Object obj) {
		this.obj = obj;
	}

	public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
		try {
			Object result = m.invoke(obj, args);
			if (result == null && m.getReturnType() == List.class)
				result = new ArrayList();
			return result;
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			throw e.getTargetException();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("unexpected invocation exception: " + e.getMessage());
		}
	}

	static public <T> T getService(URI baseURI, Class<T> seiClass, String namespace, Map<? extends String, ? extends Object> featureMap) throws MalformedURLException {
		ServiceDelegate delegateA = Provider.provider().createServiceDelegate(new URL(baseURI.toString() + seiClass.getSimpleName().toLowerCase() + "?wsdl"), new QName(namespace, seiClass.getSimpleName()), null);
		T obj = delegateA.getPort(seiClass);
		((BindingProvider) obj).getRequestContext().putAll(featureMap);
		T result = WSClientProxy.newInstance(obj);
		return result;
	}
}
