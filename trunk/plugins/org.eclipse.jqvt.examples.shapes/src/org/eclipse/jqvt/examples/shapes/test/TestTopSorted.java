package org.eclipse.jqvt.examples.shapes.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Method;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jqvt.examples.shapes.copy.Transformation;
import org.eclipse.jqvt.runtime.EMFJQVTEngine;
import org.junit.Before;
import org.junit.Test;

import Shapes.ShapesPackage;

public class TestTopSorted {
	public static int numberOfTopRelations = 11;

	public Transformation transformation = null;

	@Before
	public void initTransformation() {
		EPackage.Registry.INSTANCE.put(ShapesPackage.eNS_URI, ShapesPackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("shapes", new XMIResourceFactoryImpl());

		final EMFJQVTEngine engine = new EMFJQVTEngine();
		transformation = new Transformation() {
			@Override
			public <T> T create(Class<T> c) {
				return engine.createInstanceRef(c);
			}
		};
	}

	@Test
	public void testTopMethodSize() {

		List<Method> methodList = transformation.getTopSortedMethods();
		assertEquals(numberOfTopRelations, methodList.size());
	}

	@Test
	public void testUnique() {
		List<Method> methodList = transformation.getTopSortedMethods();
		for (int i = 0; i < methodList.size() - 1; i++) {
			for (int j = i + 1; j < methodList.size(); j++)
				assertTrue(!methodList.get(i).equals(methodList.get(j)));
		}
	}

	@Test
	public void testInside() {
		List<Method> methodList = transformation.getTopSortedMethods();
		Class<Transformation> clazz = Transformation.class;
		for (Method m : methodList) {
			boolean found = false;
			for (Method m1 : clazz.getMethods()) {
				if (m1.equals(m)) {
					found = true;
					break;
				}
			}
			assertTrue(found);
		}
	}

}
