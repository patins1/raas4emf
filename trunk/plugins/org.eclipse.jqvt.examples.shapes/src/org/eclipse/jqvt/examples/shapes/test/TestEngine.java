package org.eclipse.jqvt.examples.shapes.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jqvt.examples.shapes.copy.Transformation;
import org.eclipse.jqvt.runtime.EMFJQVTEngine;
import org.junit.Before;
import org.junit.Test;

import Shapes.Arrow;
import Shapes.ModelElement;
import Shapes.Shape;
import Shapes.ShapesPackage;

public class TestEngine {
	public static int numberOfArrows = 7;
	public static int numberOfElements = 16;
	public static int numberOfShapes = 9;

	public Transformation transformation = null;

	public EMFJQVTEngine engine = null;

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
		this.engine = engine;
	}

	@Test
	public void testGetInstanceFor() throws IllegalAccessException, InvocationTargetException, IOException {
		engine.execute(transformation, "src/org/eclipse/jqvt/examples/shapes/copy/source.shapes", "src/org/eclipse/jqvt/examples/shapes/copy/target2.shapes");
		assertEquals(numberOfShapes, engine.getInstancesFor(Shape.class, "source").size());
		assertEquals(numberOfElements, engine.getInstancesFor(ModelElement.class, "source").size());
		assertEquals(numberOfArrows, engine.getInstancesFor(Arrow.class, "source").size());
	}

}
