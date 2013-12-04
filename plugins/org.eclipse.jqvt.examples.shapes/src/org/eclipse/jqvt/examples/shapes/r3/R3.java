package org.eclipse.jqvt.examples.shapes.r3;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jqvt.runtime.EMFJQVTEngine;

import Shapes.ShapesPackage;

public class R3 {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException {

		EPackage.Registry.INSTANCE.put(ShapesPackage.eNS_URI, ShapesPackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("shapes", new XMIResourceFactoryImpl());

		final EMFJQVTEngine engine = new EMFJQVTEngine();
		Transformation transformation = new Transformation() {
			@Override
			public <T> T create(Class<T> c) {
				return engine.createInstanceRef(c);
			}
		};

		engine.execute(transformation, "src/org/eclipse/jqvt/examples/shapes/r3/source.shapes", "src/org/eclipse/jqvt/examples/shapes/r3/target2.shapes");
	}

}
