package raas.testutils;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import junit.framework.Assert;

/**
 * Tests that two given objects are equal either by
 * {@link Object#equals(Object)} or by equality on their Java fields (applying
 * this equality definition recursively),
 */
@SuppressWarnings("serial")
public class ObjectGraphComparer extends HashMap<Object, Set<Object>> {
	void assertSameObjectGraph(Object d, Object dMirror) throws IllegalArgumentException, IllegalAccessException {
		if (d == null || dMirror == null) {
			Assert.assertSame("Expected both objects to be null", d, dMirror);
			return;
		}
		Class<? extends Object> cl = d.getClass();
		Assert.assertEquals("Expected both object to have same classes", cl, dMirror.getClass());
		if (!cl.isPrimitive()) {
			Set<Object> alreadyCompared = get(d);
			if (alreadyCompared == null) {
				alreadyCompared = new HashSet<Object>();
				put(d, alreadyCompared);
			}
			if (!alreadyCompared.add(dMirror))
				return;
		}
		if (d.equals(dMirror)) {
			// System.out.println("Compared equal: "+cl.getName() + d);
			return;
		}
		if (!cl.isPrimitive())
			compareFields(d, dMirror, cl);
		else
			Assert.fail("primitive objects must be equal");
	}

	private void compareFields(Object d, Object dMirror, Class<? extends Object> cl) throws IllegalAccessException {
		if (cl == null || cl.getSimpleName().equals("EObjectImpl"))
			return;
		for (Field field : cl.getDeclaredFields()) {
			field.setAccessible(true);
			Object value1 = field.get(d);
			Object value2 = field.get(dMirror);
			System.out.println("Comparing: " + cl.getSimpleName() + "." + field.getName() + ":   " + value1 + " == " + value2);
			assertSameObjectGraph(value1, value2);
		}
		compareFields(d, dMirror, cl.getSuperclass());
	}

	public static void assertEqual(Object d, Object dMirror) throws IllegalArgumentException, IllegalAccessException {
		// if (d instanceof EObject && dMirror instanceof EObject) {
		// return EcoreUtil.equals((EObject)d,(EObject)dMirror);
		// }
		new ObjectGraphComparer().assertSameObjectGraph(d, dMirror);
		System.out.println("Objects are equal!");
	}
}
