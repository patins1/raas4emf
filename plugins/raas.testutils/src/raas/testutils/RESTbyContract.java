package raas.testutils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethodBase;
import org.apache.commons.httpclient.methods.ByteArrayRequestEntity;
import org.apache.commons.httpclient.methods.DeleteMethod;
import org.apache.commons.httpclient.methods.EntityEnclosingMethod;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.PutMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.cxf.helpers.IOUtils;
import org.apache.cxf.jaxrs.impl.MetadataMap;
import org.apache.cxf.jaxrs.impl.UriBuilderImpl;
import org.apache.cxf.jaxrs.provider.JAXBElementProvider;
import org.apache.cxf.jaxrs.provider.JSONProvider;
import org.apache.cxf.jaxrs.utils.AnnotationUtils;
import org.apache.cxf.jaxrs.utils.JAXBUtils;

/**
 * Invokes REST operations for a given SEI interface. This assumes that the SEI
 * interface is exposed as REST service (ideally, the REST service bean
 * implements the SEI interface). The SEI interface may be additionally exposed
 * as non-REST webservice, in which case a webservice port can be passed as
 * first parameter to newInstance(), so that the webservice methods are called
 * in cases where the called SEI method is not annotated with @GET/@PUT/... .
 */
public class RESTbyContract implements java.lang.reflect.InvocationHandler {
	
	public static boolean LOG_MESSAGES = false;

	HttpClient httpclient = new HttpClient();

	private MessageBodyReader reader;

	private MessageBodyWriter writer;

	private final Object obj;

	private final MediaType mtWrite;

	private final MediaType mtRead;

	private final URI baseURI;

	/**
	 * @param <T>
	 * @param obj
	 *            SEI interface instance, may be <code>null</code>
	 * @param c
	 *            SEI interface
	 * @param mtWrite
	 *            media type to write a message body request
	 * @param mtRead
	 *            desired media type to read a message body response
	 * @param baseURI
	 *            the base URI of the REST service
	 * @return
	 */
	public static <T> T newInstance(T obj, Class<T> c, MediaType mtWrite, MediaType mtRead, URI baseURI) {
		return (T) java.lang.reflect.Proxy.newProxyInstance(c.getClassLoader(), new Class[] { c }, new RESTbyContract(obj, mtWrite, mtRead, baseURI));
	}

	private RESTbyContract(Object obj, MediaType mtWrite, MediaType mtRead, URI baseURI) {
		this.obj = obj;
		this.mtWrite = mtWrite;
		this.mtRead = mtRead;
		this.baseURI = baseURI;
	}

	public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
		try {
			Annotation[] annotations = m.getAnnotations();
			HttpMethodBase method;
			if (AnnotationUtils.getAnnotation(annotations, POST.class) != null) {
				method = new PostMethod();
			} else if (AnnotationUtils.getAnnotation(annotations, GET.class) != null) {
				method = new GetMethod();
			} else if (AnnotationUtils.getAnnotation(annotations, PUT.class) != null) {
				method = new PutMethod("");
			} else if (AnnotationUtils.getAnnotation(annotations, DELETE.class) != null) {
				method = new DeleteMethod();
			} else {
				Object result = m.invoke(obj, args);
				// return an empty list instead of null if a list is expected
				if (result == null && m.getReturnType() == List.class)
					result = new ArrayList();
				return result;
			}
			ByteArrayOutputStream requestBody = null;
			UriBuilderImpl b = new UriBuilderImpl(baseURI);
			b.path(m.getDeclaringClass());
			b.path(m);
			Map<String, Object> values = new HashMap<String, Object>();
			int i = 0;
			if (args != null)
				for (Object arg : args) {
					Annotation[] annos = m.getParameterAnnotations()[i];
					PathParam path = AnnotationUtils.getAnnotation(annos, PathParam.class);
					if (path != null) {
						arg = JAXBUtils.useAdapter(arg, AnnotationUtils.getAnnotation(annos, XmlJavaTypeAdapter.class), true);
						values.put(path.value(), arg);
					} else if (requestBody != null) {
						throw new RuntimeException("body already defined!");
					} else {
						if (writer == null) {
							if ("application/xml".equals(mtWrite.toString())) {
								writer = new JAXBElementProvider();
							} else {
								writer = new JSONProvider();
							}
						}
						// fixing new bug
						if (arg instanceof List && writer instanceof JSONProvider)
							((JSONProvider) writer).setCollectionWrapperName(((Class) ((ParameterizedType) m.getGenericParameterTypes()[i]).getActualTypeArguments()[0]).getSimpleName());

						requestBody = new ByteArrayOutputStream();
						writer.writeTo(arg, arg.getClass(), arg.getClass(), annos, mtWrite, new MetadataMap<String, Object>(), requestBody);
						
						if (LOG_MESSAGES)
							System.out.println("--> "+requestBody.toString());
						// if (requestBody.toString().contains("\"$\":")) {
						// String s = requestBody.toString().replace("\"$\":",
						// "");
						// s = s.replace("{", "");
						// s = s.replace("}", "");
						// // s = s.replace("TopClassDRefElements",
						// // "TopClassDRefElement");
						// s = "{" + s + "}";
						// requestBody = new ByteArrayOutputStream();
						// requestBody.write(s.getBytes());
						// }
						// System.out.println(requestBody.toString());
					}
					i++;
				}

			URI restUri = b.buildFromMap(values);
			if (LOG_MESSAGES) 
				System.out.println(restUri.toString());
			method.setURI(new org.apache.commons.httpclient.URI(restUri.toString(), true));
			method.addRequestHeader("Accept", mtRead.toString());
			if (requestBody != null) {
				RequestEntity entity = new ByteArrayRequestEntity(requestBody.toByteArray());
				((EntityEnclosingMethod) method).setRequestEntity(entity);
				method.addRequestHeader("Content-Type", mtWrite.toString());
			}
			int responseCode = httpclient.executeMethod(method);
			if (responseCode != 200 && responseCode != 204) {
				throw new RuntimeException(method.getStatusText() + "\n" + method.getResponseBodyAsString());
			}
			Class targetType = m.getReturnType();
			if (targetType == Void.TYPE) {
				return null;
			}
			InputStream responseBody = method.getResponseBodyAsStream();
			
			if (LOG_MESSAGES) {
				String s=IOUtils.toString(responseBody);
				System.out.println("<-- "+s);
				responseBody = new ByteArrayInputStream(s.getBytes());
			}

			if (reader == null) {
				if ("application/xml".equals(mtRead.toString())) {
					reader = new JAXBElementProvider();
				} else {
					reader = new JSONProvider();
				}
			}
			if (targetType.isPrimitive())
				return targetType.getConstructor(String.class).newInstance(IOUtils.toString(responseBody));
			if (targetType == String.class)
				return IOUtils.toString(responseBody);

			Type genericType = m.getGenericReturnType();
			Object result = reader.readFrom(targetType, genericType, annotations, mtRead, new MetadataMap<String, String>(), responseBody);
			return result;

		} catch (InvocationTargetException e) {
			throw e.getTargetException();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("unexpected invocation exception: " + e.getMessage());
		}
	}

}
