/**
 * Copyright 2013 Smart Services CRC Pty Ltd
 */
package au.com.smartservicescrc.raas.codegen.jaxws.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

public class MetamodelUtil {
	/**
	 * @param eClass
	 * @return all classes directly referenced by the given class
	 */
	private static Set<EClass> getReferencedEClasses(EClass eClass) {
		Set<EClass> result = new HashSet<EClass>();
		for (EStructuralFeature feature : eClass.getEAllStructuralFeatures()) {
			if (feature.getEType() instanceof EClass) {
				EClass referencedClass = (EClass) feature.getEType();
				result.add(referencedClass);
			}
		}
		return result;
	}

	/**
	 * @param eClass
	 * @return all references of the given class (including EObject-typed attributes!)
	 */
	private static Set<EStructuralFeature> getReferences(EClass eClass) {
		Set<EStructuralFeature> result = new HashSet<EStructuralFeature>();
		for (EStructuralFeature feature : eClass.getEAllStructuralFeatures()) {
			if (feature.getEType() instanceof EClass) {
				result.add(feature);
			}
		}
		return result;
	}

	public static List<GenClass> getGenClasses(GenModel genModel) {
		List<GenClass> result = new ArrayList<GenClass>();
		for (GenPackage genPackage : genModel.getGenPackages()) {
			for (GenClass genClass : genPackage.getGenClasses()) {
				result.add(genClass);
			}
		}
		return result;
	}

	public static List<EClass> getEClasses(GenModel genModel) {
		List<EClass> result = new ArrayList<EClass>();
		for (GenPackage genPackage : genModel.getGenPackages()) {
			for (GenClass genClass : genPackage.getGenClasses()) {
				result.add(genClass.getEcoreClass());
			}
		}
		return result;
	}

	/**
	 * @param genModel
	 * @return all root classes, i.e. classes which are not referenced by other classes
	 */
	static public Collection<EClass> getRootClasses(GenModel genModel) {
		Set<EClass> referencedClasses = new HashSet<EClass>();
		List<EClass> allClasses = MetamodelUtil.getEClasses(genModel);
		for (EClass eClass : allClasses) {
			referencedClasses.addAll(MetamodelUtil.getReferencedEClasses(eClass));
		}
		extendBySubclasses(referencedClasses, allClasses);
		allClasses.removeAll(referencedClasses);
		return allClasses;
	}

	/**
	 * @param genModel
	 * @return all references of the metamodel (including EObject-typed attributes!)
	 */
	static public Collection<EStructuralFeature> getAllReferences(GenModel genModel) {
		Set<EStructuralFeature> references = new HashSet<EStructuralFeature>();
		List<EClass> allClasses = MetamodelUtil.getEClasses(genModel);
		for (EClass eClass : allClasses) {
			references.addAll(MetamodelUtil.getReferences(eClass));
		}
		return references;
	}

	/**
	 * @param eRootClass
	 * @return all classes (including sub classes) directly referenced by the given class, i.e. the top classes of the given root class; BUT NOTE: also the root classes are not returned with the top classes, so to create CRUD operations for the top class
	 */
	public static Collection<EClass> getTopClasses(EClass eRootClass, GenModel genModel) {
		List<EClass> allClasses = MetamodelUtil.getEClasses(genModel);
		Set<EClass> referencedClasses = MetamodelUtil.getReferencedEClasses(eRootClass);
		extendBySubclasses(referencedClasses, allClasses);
		referencedClasses.add(eRootClass);
		allClasses.retainAll(referencedClasses);
		// note: "allClasses" has the original order in contrast to
		// "referencedClasses"
		return allClasses;
	}

	/**
	 * Extends referencedClasses by adding all classes of allClasses which have a super type in referencedClasses
	 * 
	 * @param referencedClasses
	 * @param allClasses
	 */
	private static void extendBySubclasses(Set<EClass> referencedClasses, List<EClass> allClasses) {
		for (EClass eClass : allClasses) {
			for (EClass superClass : eClass.getEAllSuperTypes()) {
				if (referencedClasses.contains(superClass)) {
					referencedClasses.add(eClass);
					break;
				}
			}
		}
	}

	/**
	 * @param referencedClass
	 * @param allClasses
	 * @return all subclasses of referencedClass in allClasses
	 */
	public static Set<EClass> getSubclasses(EClass referencedClass, List<EClass> allClasses) {
		Set<EClass> referencedClasses = new HashSet<EClass>();
		referencedClasses.add(referencedClass);
		extendBySubclasses(referencedClasses, allClasses);
		referencedClasses.remove(referencedClass);
		return referencedClasses;
	}

	static public Map<EClass, GenClass> getGenClassOfClassMap(GenModel genModel) {
		Map<EClass, GenClass> genClassOfClass = new HashMap<EClass, GenClass>();
		for (GenClass genClass : MetamodelUtil.getGenClasses(genModel)) {
			genClassOfClass.put(genClass.getEcoreClass(), genClass);
		}
		return genClassOfClass;
	}

	public static List<GenClass> getGenClassesOfClasses(Collection<EClass> eClasses, Map<EClass, GenClass> genClassOfClass) {
		List<GenClass> result = new ArrayList<GenClass>();
		for (EClass eClass : eClasses) {
			result.add(genClassOfClass.get(eClass));
		}
		return result;
	}
}
