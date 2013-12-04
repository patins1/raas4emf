package org.eclipse.jqvt.examples.shapes.test;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil.EqualityHelper;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jqvt.runtime.EMFJQVTEngine;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Shapes.ShapesPackage;

public class TestTargetModels {
	public static int numberOfArrows = 7;
	public static int numberOfElements = 16;
	public static int numberOfShapes = 9;

	public EMFJQVTEngine engine = null;

	@Before
	public void initTransformation() {
		EPackage.Registry.INSTANCE.put(ShapesPackage.eNS_URI, ShapesPackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("shapes", new XMIResourceFactoryImpl());

		final EMFJQVTEngine engine = new EMFJQVTEngine();
		this.engine = engine;
	}

	@Test
	public void testCopy() throws IllegalAccessException, InvocationTargetException, IOException {
		Object transformation = new org.eclipse.jqvt.examples.shapes.copy.Transformation() {
			@Override
			public <T> T create(Class<T> c) {
				return engine.createInstanceRef(c);
			}
		};
		executeAndCompare(transformation, "copy");
	}

	@Test
	public void testR2() throws IllegalAccessException, InvocationTargetException, IOException {
		Object transformation = new org.eclipse.jqvt.examples.shapes.r2.Transformation() {
			@Override
			public <T> T create(Class<T> c) {
				return engine.createInstanceRef(c);
			}
		};
		executeAndCompare(transformation, "r2");
	}

	@Test
	public void testR3() throws IllegalAccessException, InvocationTargetException, IOException {
		Object transformation = new org.eclipse.jqvt.examples.shapes.r3.Transformation() {
			@Override
			public <T> T create(Class<T> c) {
				return engine.createInstanceRef(c);
			}
		};
		executeAndCompare(transformation, "r3");
	}

	@Test
	public void testR4() throws IllegalAccessException, InvocationTargetException, IOException {
		Object transformation = new org.eclipse.jqvt.examples.shapes.r4.Transformation() {
			@Override
			public <T> T create(Class<T> c) {
				return engine.createInstanceRef(c);
			}
		};
		executeAndCompare(transformation, "r4");
	}

	public void testR5() throws IllegalAccessException, InvocationTargetException, IOException {
		Object transformation = new org.eclipse.jqvt.examples.shapes.r5.Transformation() {
			@Override
			public <T> T create(Class<T> c) {
				return engine.createInstanceRef(c);
			}
		};
		executeAndCompare(transformation, "r5");
	}

	@Test
	public void testR6() throws IllegalAccessException, InvocationTargetException, IOException {
		Object transformation = new org.eclipse.jqvt.examples.shapes.r6.Transformation() {
			@Override
			public <T> T create(Class<T> c) {
				return engine.createInstanceRef(c);
			}
		};
		executeAndCompare(transformation, "r6");
	}

	@Test
	public void testR7() throws IllegalAccessException, InvocationTargetException, IOException {
		Object transformation = new org.eclipse.jqvt.examples.shapes.r7.Transformation() {
			@Override
			public <T> T create(Class<T> c) {
				return engine.createInstanceRef(c);
			}
		};
		executeAndCompare(transformation, "r7");
	}

	public void testR8() throws IllegalAccessException, InvocationTargetException, IOException {
		Object transformation = new org.eclipse.jqvt.examples.shapes.r8.Transformation() {
			@Override
			public <T> T create(Class<T> c) {
				return engine.createInstanceRef(c);
			}
		};
		executeAndCompare(transformation, "r8");
	}

	public void testR9() throws IllegalAccessException, InvocationTargetException, IOException {
		Object transformation = new org.eclipse.jqvt.examples.shapes.r9.Transformation() {
			@Override
			public <T> T create(Class<T> c) {
				return engine.createInstanceRef(c);
			}
		};
		executeAndCompare(transformation, "r9");
	}

	@Test
	public void testR10() throws IllegalAccessException, InvocationTargetException, IOException {
		Object transformation = new org.eclipse.jqvt.examples.shapes.r10.Transformation() {
			@Override
			public <T> T create(Class<T> c) {
				return engine.createInstanceRef(c);
			}
		};
		executeAndCompare(transformation, "r10");
	}

	@Test
	public void testR11() throws IllegalAccessException, InvocationTargetException, IOException {
		Object transformation = new org.eclipse.jqvt.examples.shapes.r11.Transformation() {
			@Override
			public <T> T create(Class<T> c) {
				return engine.createInstanceRef(c);
			}
		};
		engine.execute(transformation, "src/org/eclipse/jqvt/examples/shapes/r11/source.shapes", "src/org/eclipse/jqvt/examples/shapes/r11/source2.shapes", "src/org/eclipse/jqvt/examples/shapes/r11/target2.shapes");
		compareModels("src/org/eclipse/jqvt/examples/shapes/r11/target.shapes", "src/org/eclipse/jqvt/examples/shapes/r11/target2.shapes");
	}

	@Test
	public void testR12() throws IllegalAccessException, InvocationTargetException, IOException {
		Object transformation = new org.eclipse.jqvt.examples.shapes.r12.Transformation() {
			@Override
			public <T> T create(Class<T> c) {
				return engine.createInstanceRef(c);
			}
		};
		executeAndCompare(transformation, "r12");
	}

	public void test_a_implies_b_problem() throws IllegalAccessException, InvocationTargetException, IOException {
		Object transformation = new org.eclipse.jqvt.examples.shapes.a_implies_b_problem.Transformation() {
			@Override
			public <T> T create(Class<T> c) {
				return engine.createInstanceRef(c);
			}
		};
		executeAndCompare(transformation, "a_implies_b_problem");
	}

	private void executeAndCompare(Object transformation, String folder) throws IllegalAccessException, InvocationTargetException, IOException {
		engine.execute(transformation, "src/org/eclipse/jqvt/examples/shapes/" + folder + "/source.shapes", "src/org/eclipse/jqvt/examples/shapes/" + folder + "/target2.shapes");
		compareModels("src/org/eclipse/jqvt/examples/shapes/" + folder + "/target.shapes", "src/org/eclipse/jqvt/examples/shapes/" + folder + "/target2.shapes");
	}

	private void compareModels(String string, String string2) {
		ResourceSet rset = new ResourceSetImpl();
		Resource target = rset.getResource(URI.createURI(string), true);
		Resource target2 = rset.getResource(URI.createURI(string2), true);
		final EqualityHelper equalityHelper = new EqualityHelper();
		Assert.assertTrue("Models not equal!", equalityHelper.equals(target.getContents(), target2.getContents()));
	}
}
