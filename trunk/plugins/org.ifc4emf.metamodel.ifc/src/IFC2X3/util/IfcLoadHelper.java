/**
 * Copyright (c) 2010- 2011 QUT (Brisbane, Australia) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Jim Steel - initial API and implementation
 *    Joerg Kiegeland - extension for database storage 
 */
package IFC2X3.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.ifc4emf.metamodel.express.core.Attribute;
import org.ifc4emf.metamodel.express.core.AttributeType;
import org.ifc4emf.metamodel.express.core.EntityType;
import org.ifc4emf.metamodel.express.core.ExplicitAttribute;
import org.ifc4emf.metamodel.express.core.NamedElement;
import org.ifc4emf.metamodel.express.core.NamedType;
import org.ifc4emf.metamodel.express.core.ParameterType;
import org.ifc4emf.metamodel.express.core.SelectType;
import org.ifc4emf.metamodel.express.core.SimpleType;
import org.ifc4emf.metamodel.express.core.SpecializedType;
import org.ifc4emf.metamodel.express.util.ExpressResourceFactoryImpl;
import org.ifc4emf.metamodel.ifcheader.Model;
import org.ifc4emf.metamodel.ifcheader.Part21Factory;
import org.ifc4emf.part21.loader.BasicBiMap;
import org.ifc4emf.part21.loader.NoSuchAttributeException;
import org.ifc4emf.part21.loader.NoSuchClassException;
import org.ifc4emf.part21.loader.Part21LoadHelper;

import IFC2X3.IFC2X3Factory;
import IFC2X3.IFC2X3Package;
import IFC2X3.IfcBuilding;
import IFC2X3.IfcBuildingElement;
import IFC2X3.IfcBuildingStorey;
import IFC2X3.IfcDimensionalExponents;
import IFC2X3.IfcObject;
import IFC2X3.IfcProduct;
import IFC2X3.IfcProject;
import IFC2X3.IfcRoot;
import IFC2X3.IfcSIUnit;
import IFC2X3.IfcSite;
import IFC2X3.IfcSpace;
import express2ecore.Attribute2Feature;
import express2ecore.EntitySelect;
import express2ecore.NonEntitySelect;
import express2ecore.SelectMember2Feature;
import express2ecore.TypeMap;

public class IfcLoadHelper implements Part21LoadHelper {

	private ResourceSet resourceSet;
	private HashMap<String, NamedType> typeNameMap;
	private HashMap<ParameterType, EClassifier> typeMap;
	private HashMap<Attribute, EStructuralFeature> featureMap;
	private HashMap<EntityType, List<ExplicitAttribute>> indexedFeatures;
	private List<EObject> derivedOverrideObjects;
	private HashMap<String, IfcDimensionalExponents> siUnitExponents;
	private HashMap<String, ParameterType> eTypeNameMap;
	private Set<String> entitySelectNames;
	private Map<String, BasicBiMap<String, String>> nonEntitySelectListTypeFeatures;

	static public File getResourceFile(Class clazz, String relPath) throws IOException, URISyntaxException {
		String uri = clazz.getResource(clazz.getSimpleName() + ".class").toString();
		String result = clazz.getResource(clazz.getSimpleName() + ".class").toURI().getPath();
		File file;
		if (result != null && result.indexOf("/bin/") != -1) {
			// standalone executed within Eclipse
			file = new File(result.substring(0, result.indexOf("/bin/")) + relPath);
		} else if (uri.indexOf("!/") != 0 && uri.startsWith("jar:file:")) {
			relPath = relPath.replace("/bin/", "/");
			// standalone executed as jar
			uri = uri.substring("jar:file:".length());
			uri = uri.substring(0, uri.indexOf("!/"));
			uri = uri.substring(0, uri.lastIndexOf("/"));
			uri = uri + "/resources" + relPath;
			file = new File(uri);
			InputStream s = clazz.getResourceAsStream(relPath);
			if (s != null) {
				// create parent folders
				file.getParentFile().mkdirs();
				// extract from jar file to local file
				System.out.println("Extracting: " + relPath);
				streamToFile(file, s);
			} else
				System.out.println("Handle as new file: " + relPath);

		} else
			throw new RuntimeException("Cannot process relative path " + relPath);
		System.out.println("getResourceFile(" + clazz.getSimpleName() + "," + relPath + ") = " + file.toString());
		return file;
	}

	private static void streamToFile(File file, InputStream in) throws IOException {
		OutputStream out = new FileOutputStream(file);

		// Copy the bits from instream to outstream
		byte[] buf = new byte[1024];
		int len;
		while ((len = in.read(buf)) > 0) {
			out.write(buf, 0, len);
		}
		in.close();
		out.close();
	}

	private EClassifier getMappedClass(EObject eType) {
		String name;
		if (eType instanceof SpecializedType) {
			return getMappedClass(((SpecializedType) eType).getUnderlyingType());
		} else if (eType instanceof NamedElement) {
			name = ((NamedElement) eType).getId().getLocalName();
		} else if (eType instanceof SimpleType) {
			name = ((SimpleType) eType).getId();
		} else
			throw new RuntimeException("Has no name");
		EClassifier eCls2 = IFC2X3Package.eINSTANCE.getEClassifier(name);
		if (eCls2 == null)
			throw new RuntimeException("failed to resolve proxy while navigating to ecore model from trace file " + eType);
		return eCls2;
	}

	public IfcLoadHelper(ResourceSet resourceSet) throws IOException {
		super();
		this.resourceSet = resourceSet;
		this.derivedOverrideObjects = new ArrayList<EObject>();
		this.typeNameMap = new HashMap<String, NamedType>();
		this.typeMap = new HashMap<ParameterType, EClassifier>();
		this.eTypeNameMap = new HashMap<String, ParameterType>();
		this.featureMap = new HashMap<Attribute, EStructuralFeature>();
		this.indexedFeatures = new HashMap<EntityType, List<ExplicitAttribute>>();
		this.nonEntitySelectListTypeFeatures = new HashMap<String, BasicBiMap<String, String>>();
		this.entitySelectNames = new HashSet<String>();

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("exp", new ExpressResourceFactoryImpl());
		LoadExpressAsXmi.fastLoadIFC(resourceSet);
		Resource traceResource;
		if (Platform.isRunning()) {
			traceResource = resourceSet.getResource(URI.createPlatformPluginURI("/org.ifc4emf.metamodel.ifc/model/trace.xmi", true), true);
		} else {
			URI uri = URI.createURI(String.valueOf(LoadExpressAsXmi.class.getResource("trace.xmi")));
			traceResource = resourceSet.getResource(uri, true);
		}
		// Turn the trace resource into lookup tables
		long started = new Date().getTime();
		int badTraces = 0;
		for (EObject traceObj : traceResource.getContents()) {
			if (traceObj instanceof TypeMap) {
				TypeMap e2c = (TypeMap) traceObj;
				// I hate having to do this.
				EObject eType = e2c.getSourceType();
				EClassifier eCls = e2c.getTargetType();
				if (eCls.eIsProxy()) {
					eCls = getMappedClass(eType);
				}
				if (eType.eIsProxy()) {
					eType = EcoreUtil.resolve(eType, e2c.eResource().getResourceSet());
				}
				typeMap.put((ParameterType) eType, eCls);
				eTypeNameMap.put(eCls.getName(), (ParameterType) eType);
				if (eType instanceof NamedType) {
					typeNameMap.put(((NamedType) eType).getId().getLocalName().toUpperCase(), (NamedType) eType);
					// if (!eCls.getName().equals(((NamedType)
					// eType).getId().getLocalName()))
					// System.out.println(eCls.getName()+" not equal to "+((NamedType)
					// eType).getId().getLocalName());

				}
			}
			if (traceObj instanceof Attribute2Feature) {
				Attribute2Feature a2f = (Attribute2Feature) traceObj;
				EStructuralFeature fea = a2f.getFeature();
				if (fea.eIsProxy()) {
					EntityType entity = a2f.getAttribute().getOfEntity().getDeclaredIn();
					EClassifier eCls = getMappedClass(entity);
					EStructuralFeature fea2 = ((EClass) eCls).getEStructuralFeature(a2f.getAttribute().getId().getLocalName());
					if (fea2 == null)
						throw new RuntimeException("failed to resolve proxy while navigating to ecore model from trace file " + a2f);
					fea = fea2;
				}
				if (!a2f.getAttribute().getId().getLocalName().equals(fea.getName())) {
					badTraces++;
					System.err.println("Feature mapping trace seems to have gotten mixed up: " + a2f.getAttribute().getId().getLocalName() + " --> " + fea.getName());
				}
				featureMap.put(a2f.getAttribute(), fea);
			}
			if (traceObj instanceof EntitySelect) {
				EntitySelect esTrace = (EntitySelect) traceObj;
				SelectType select = (SelectType) esTrace.getSourceType();
				this.entitySelectNames.add(select.getId().getLocalName().toUpperCase());
			}
			if (traceObj instanceof NonEntitySelect) {
				// Probably won't ever happen now
				NonEntitySelect nesTrace = (NonEntitySelect) traceObj;
				SelectType select = (SelectType) nesTrace.getSourceType();
				if (!nonEntitySelectListTypeFeatures.containsKey(select.getId().getLocalName().toUpperCase())) {
					nonEntitySelectListTypeFeatures.put(select.getId().getLocalName().toUpperCase(), new BasicBiMap<String, String>());
				}
			}
			if (traceObj instanceof SelectMember2Feature) {
				SelectMember2Feature sm2f = (SelectMember2Feature) traceObj;
				String selectName = sm2f.getSelectType().getId().getLocalName().toUpperCase();
				String memberTypeName = sm2f.getMemberType().getId().getLocalName().toUpperCase();
				EStructuralFeature fea = sm2f.getFeature();
				if (fea.eIsProxy()) {
					EClassifier cls = getMappedClass(sm2f.getSelectType());
					EStructuralFeature fea2 = ((EClass) cls).getEStructuralFeature(sm2f.getMemberType().getId().getLocalName() + "value");
					if (fea2 == null)
						throw new RuntimeException("failed to resolve proxy while navigating to ecore model from trace file " + sm2f.getMemberType().getId().getLocalName() + "value");
					fea = fea2;
				}
				String featureName = fea.getName();

				if (!nonEntitySelectListTypeFeatures.containsKey(selectName)) {
					nonEntitySelectListTypeFeatures.put(selectName, new BasicBiMap<String, String>());
				}
				nonEntitySelectListTypeFeatures.get(selectName).put(memberTypeName, featureName);
			}
		}
		traceResource.unload();
		resourceSet.getResources().remove(traceResource);
		long finished = new Date().getTime();
		System.err.println("Loading traces took " + (finished - started) + "ms");
		if (badTraces > 0)
			System.err.println("Bad traces: " + badTraces);

	}

	/**
	 * Assures that the given package is registered in the registry of the given resourceset - which differs from the global registry for CDO
	 * 
	 * @param resourceSet2
	 * @param einstance
	 */
	private void assureRegistered(ResourceSet resourceSet2, EPackage einstance) {
		EPackage pack = resourceSet.getPackageRegistry().getEPackage(einstance.getNsURI());
		if (pack == null) {
			resourceSet.getPackageRegistry().put(einstance.getNsURI(), einstance);
		}
	}

	@Override
	public boolean isEntitySelect(String typeName) {
		// return entitySelectNames.contains(typeName.toUpperCase());
		return (entitySelectNames.contains(typeName.toUpperCase()) && !nonEntitySelectListTypeFeatures.containsKey(typeName.toUpperCase()));
	}

	@Override
	public boolean isNonEntitySelect(String typeName) {
		return nonEntitySelectListTypeFeatures.containsKey(typeName.toUpperCase());
	}

	@Override
	public String getFeatureNameForNonEntitySelectMemberTypeName(String selectTypeName, String memberTypeName) {
		BasicBiMap<String, String> bimap = nonEntitySelectListTypeFeatures.get(selectTypeName);
		if (bimap == null)
			return null;
		else
			return bimap.get(memberTypeName);
	}

	@Override
	public String getMemberTypeNameForNonEntitySelectFeatureName(String selectTypeName, String featureName) {
		BasicBiMap<String, String> bimap = nonEntitySelectListTypeFeatures.get(selectTypeName);
		if (bimap == null)
			return null;
		else
			return bimap.inverseGet(featureName);
	}

	@Override
	public EClassifier getEClassifierByName(String entityName) throws NoSuchClassException {
		// A bit of a hack, should probably check the trace file
		// Collection<EClassifier> classifiers =
		// IFC2X3Package.eINSTANCE.getEClassifiers();
		// for (EClassifier classifier : classifiers) {
		// if ((classifier instanceof EClass) &&
		// classifier.getName().equalsIgnoreCase(entityName)) {
		// return (EClass) classifier;
		// }
		// }
		// throw new NoSuchClassException();

		NamedType entType = getExpressTypeByName(entityName);

		EClassifier cls = typeMap.get(entType);
		if (null == cls) {
			throw new NoSuchClassException();
		}
		return cls;
	}

	@Override
	public String getSchemaName() {
		return "IFC2X3";
	}

	@Override
	public EFactory getFactory() {
		return IFC2X3Factory.eINSTANCE;
	}

	@Override
	public EStructuralFeature getEStructuralFeatureForExpressAttribute(Attribute expressAttribute) throws NoSuchClassException, NoSuchAttributeException {

		// What we're interested in here is the order of those
		// EAttributes/EReferences which have resulted from
		// the (EXPRESS) ExplicitAttribute (Invertible or otherwise) which had
		// index i within its containing
		// EntityType.

		// 1. first find the class (we might cache the name->EObject mapping for
		// class names, they're likely to be reused)
		// 2. find the list of features that were created from
		// ExplicitAttributes in the EXPRESS schema (i.e. not inverses)
		// 3. find the i'th feature in this list
		// 4. Use EClass.getStructuralFeature(String) to find the actual
		// in-memory feature. We can't use the one pointed to by
		// the trace model itself, because the "http://" resource used by the
		// ifc2x3factory != the "platform:/" resource pointed to by the trace
		// file

		// This all has to change in a runtime workbench.

		// EntityType eType = (EntityType) getExpressTypeByName(className);
		// Attribute attr = getExpressAttributeByIndex(className,i);

		EStructuralFeature trace_feature = featureMap.get(expressAttribute);
		// But wait, this feature is no good. Need to go to the EClass and get
		// feature by name
		EClassifier eClassifier = getEClassifierByName(trace_feature.getEContainingClass().getName());
		EStructuralFeature real_feature = null;
		if (eClassifier instanceof EClass) {
			real_feature = ((EClass) eClassifier).getEStructuralFeature(trace_feature.getName());
		}

		if (null == real_feature) {
			throw new NoSuchAttributeException("Type " + eClassifier.getName() + " does not have an attribute named " + trace_feature.getName() + " ... which is very odd indeed.");
		}
		return real_feature;
	}

	private void populateFeatureList(EntityType eType, ArrayList<ExplicitAttribute> list) {
		// ArrayList<Attribute> localList = new
		// ArrayList<Attribute>(eType.getDeclares().getDeclaresAttribute().size());
		ExplicitAttribute[] localList = new ExplicitAttribute[eType.getDeclares().getDeclaresAttribute().size()];
		for (EntityType superType : eType.getSubtypeOf()) {
			populateFeatureList(superType, list);
		}
		for (Attribute a : eType.getDeclares().getDeclaresAttribute()) {
			// should probably use position attribute in here. not for now
			// though.
			if (a instanceof ExplicitAttribute) {
				if (!list.contains(a)) {
					// list.add(a);
					localList[a.getPosition()] = (ExplicitAttribute) a;
				}
			}
		}
		List<ExplicitAttribute> localArray = new ArrayList<ExplicitAttribute>();
		for (int i = 0; i < localList.length; i++) {
			if (localList[i] != null) {
				localArray.add(localList[i]);
			}
		}
		list.addAll(localArray);
	}

	@Override
	public boolean isDerivedOverride(String className, String attributeName) {
		if (className.equals("IfcSIUnit")) {
			return attributeName.equalsIgnoreCase("Dimensions");
		} else if (className.equalsIgnoreCase("IfcGeometricRepresentationSubContext")) {
			if (attributeName.equals("WorldCoordinateSystem")) {
				return true;
			} else if (attributeName.equals("CoordinateSpaceDimension")) {
				return true;
			} else if (attributeName.equals("TrueNorth")) {
				return true;
			} else if (attributeName.equals("Precision")) {
				return true;
			} else {
				return false;
			}
		} else if (className.equalsIgnoreCase("IfcOrientedEdge")) {
			if (attributeName.equals("EdgeStart")) {
				return true;
			} else if (attributeName.equals("EdgeEnd")) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	@Override
	public void addDerivedOverrideObject(EObject obj) {
		derivedOverrideObjects.add(obj);
	}

	@Override
	public void fillDerivedOverriddens() {
		for (EObject eObj : derivedOverrideObjects) {
			if (eObj instanceof IfcSIUnit) {
				IfcSIUnit unit = (IfcSIUnit) eObj;
				IfcDimensionalExponents exp = getSIUnitExponent(unit.getName().getName());
				unit.setDimensions(exp);
			} else {
				System.err.println("Unhandled derived/overridden object: " + eObj);
			}
		}
	}

	private IfcDimensionalExponents createExponents(int i0, int i1, int i2, int i3, int i4, int i5, int i6) {
		IfcDimensionalExponents e = IFC2X3Factory.eINSTANCE.createIfcDimensionalExponents();
		e.setLengthExponent(i0);
		e.setMassExponent(i1);
		e.setTimeExponent(i2);
		e.setElectricCurrentExponent(i3);
		e.setThermodynamicTemperatureExponent(i4);
		e.setAmountOfSubstanceExponent(i5);
		e.setLuminousIntensityExponent(i6);
		return e;
	}

	private IfcDimensionalExponents getSIUnitExponent(String name) {
		// if (siUnitExponents == null) {
		// siUnitExponents = new HashMap<String,IfcDimensionalExponents>();
		if (name.equalsIgnoreCase("METRE"))
			return createExponents(1, 0, 0, 0, 0, 0, 0);
		else if (name.equalsIgnoreCase("METRE"))
			return createExponents(1, 0, 0, 0, 0, 0, 0);
		else if (name.equalsIgnoreCase("SQUARE_METRE"))
			return createExponents(2, 0, 0, 0, 0, 0, 0);
		else if (name.equalsIgnoreCase("CUBIC_METRE"))
			return createExponents(3, 0, 0, 0, 0, 0, 0);
		else if (name.equalsIgnoreCase("GRAM"))
			return createExponents(0, 1, 0, 0, 0, 0, 0);
		else if (name.equalsIgnoreCase("SECOND"))
			return createExponents(0, 0, 1, 0, 0, 0, 0);
		else if (name.equalsIgnoreCase("AMPERE"))
			return createExponents(0, 0, 0, 1, 0, 0, 0);
		else if (name.equalsIgnoreCase("KELVIN"))
			return createExponents(0, 0, 0, 0, 1, 0, 0);
		else if (name.equalsIgnoreCase("MOLE"))
			return createExponents(0, 0, 0, 0, 0, 1, 0);
		else if (name.equalsIgnoreCase("CANDELA"))
			return createExponents(0, 0, 0, 0, 0, 0, 1);
		else if (name.equalsIgnoreCase("RADIAN"))
			return createExponents(0, 0, 0, 0, 0, 0, 0);
		else if (name.equalsIgnoreCase("STERADIAN"))
			return createExponents(0, 0, 0, 0, 0, 0, 0);
		else if (name.equalsIgnoreCase("HERTZ"))
			return createExponents(0, 0, -1, 0, 0, 0, 0);
		else if (name.equalsIgnoreCase("NEWTON"))
			return createExponents(1, 1, -2, 0, 0, 0, 0);
		else if (name.equalsIgnoreCase("PASCAL"))
			return createExponents(-1, 1, -2, 0, 0, 0, 0);
		else if (name.equalsIgnoreCase("JOULE"))
			return createExponents(2, 1, -2, 0, 0, 0, 0);
		else if (name.equalsIgnoreCase("WATT"))
			return createExponents(2, 1, -3, 0, 0, 0, 0);
		else if (name.equalsIgnoreCase("COULOMB"))
			return createExponents(0, 0, 1, 1, 0, 0, 0);
		else if (name.equalsIgnoreCase("VOLT"))
			return createExponents(2, 1, -3, -1, 0, 0, 0);
		else if (name.equalsIgnoreCase("FARAD"))
			return createExponents(-2, -1, 4, 1, 0, 0, 0);
		else if (name.equalsIgnoreCase("OHM"))
			return createExponents(2, 1, -3, -2, 0, 0, 0);
		else if (name.equalsIgnoreCase("SIEMENS"))
			return createExponents(-2, -1, 3, 2, 0, 0, 0);
		else if (name.equalsIgnoreCase("WEBER"))
			return createExponents(2, 1, -2, -1, 0, 0, 0);
		else if (name.equalsIgnoreCase("TESLA"))
			return createExponents(0, 1, -2, -1, 0, 0, 0);
		else if (name.equalsIgnoreCase("HENRY"))
			return createExponents(2, 1, -2, -2, 0, 0, 0);
		else if (name.equalsIgnoreCase("DEGREE_CELSIUS"))
			return createExponents(0, 0, 0, 0, 1, 0, 0);
		else if (name.equalsIgnoreCase("LUMEN"))
			return createExponents(0, 0, 0, 0, 0, 0, 1);
		else if (name.equalsIgnoreCase("LUX"))
			return createExponents(-2, 0, 0, 0, 0, 0, 1);
		else if (name.equalsIgnoreCase("BECQUEREL "))
			return createExponents(0, 0, -1, 0, 0, 0, 0);
		else if (name.equalsIgnoreCase("GRAY"))
			return createExponents(2, 0, -2, 0, 0, 0, 0);
		else if (name.equalsIgnoreCase("SIEVERT"))
			return createExponents(2, 0, -2, 0, 0, 0, 0);
		else if (name.equalsIgnoreCase("OTHERWISE"))
			return createExponents(0, 0, 0, 0, 0, 0, 0);
		else
			return null;
	}

	@Override
	public Attribute getExpressAttributeByIndex(String entityName, int i) throws NoSuchClassException, NoSuchAttributeException {
		// EntityType eType = classNameMap.get(entityName.toUpperCase());
		EntityType eType = (EntityType) getExpressTypeByName(entityName);

		if (!indexedFeatures.containsKey(eType)) {
			ArrayList<ExplicitAttribute> list = new ArrayList<ExplicitAttribute>();
			populateFeatureList(eType, list);
			indexedFeatures.put(eType, list);
		}
		if (indexedFeatures.get(eType).size() < i) {
			throw new NoSuchAttributeException("Entity Type " + eType.getId().getLocalName() + " does not have an attribute at index " + i);
		}
		Attribute attr = indexedFeatures.get(eType).get(i);

		return attr;
	}

	@Override
	public NamedType getExpressTypeByName(String typeName) throws NoSuchClassException {
		NamedType namedType = typeNameMap.get(typeName.toUpperCase());
		if (null == namedType) {
			throw new NoSuchClassException();
		}
		return namedType;
	}

	@Override
	public EClassifier getEClassifierFromExpressType(AttributeType expressType) throws NoSuchClassException {
		EClassifier trace_classifier = typeMap.get(expressType);
		if (null == trace_classifier) {
			throw new NoSuchClassException();
		}
		return trace_classifier;
	}

	@Override
	public List<ExplicitAttribute> getExpressAttributesForEntity(EntityType entityType) throws NoSuchClassException {
		EntityType eType = (EntityType) getExpressTypeByName(entityType.getId().getLocalName());

		if (!indexedFeatures.containsKey(eType)) {
			ArrayList<ExplicitAttribute> list = new ArrayList<ExplicitAttribute>();
			populateFeatureList(eType, list);
			indexedFeatures.put(eType, list);
		}
		return indexedFeatures.get(eType);
	}

	@Override
	public EObject getExpressTypeForEClassifier(EClass eCls) throws NoSuchClassException {
		// TODO Auto-generated method stub
		return eTypeNameMap.get(eCls.getName());
	}

	@Override
	public void addedObject(Model model, EObject ifcObject, int index) {
		if (ifcObject instanceof IfcProject || model.getRoot() == null && ifcObject instanceof IfcBuildingStorey) {
			model.setRoot(ifcObject);
		}
		if (ifcObject instanceof IfcObject) {
			model.setNumIfcObjects(model.getNumIfcObjects() + 1);
		}
		if (ifcObject instanceof IfcSpace) {
			model.setNumSpaces(model.getNumSpaces() + 1);
		}
		if (ifcObject instanceof IfcSite) {
			model.setNumSites(model.getNumSites() + 1);
		}
		if (ifcObject instanceof IfcBuildingStorey) {
			model.setNumBuildingStories(model.getNumBuildingStories() + 1);
		}
		if (ifcObject instanceof IfcBuilding) {
			model.setNumBuildings(model.getNumBuildings() + 1);
		}
		if (ifcObject instanceof IfcBuildingElement) {
			model.setNumBuildingElements(model.getNumBuildingElements() + 1);
		}
		if (ifcObject instanceof IfcProduct) {
			model.setNumProducts(model.getNumProducts() + 1);
		}
		if (ifcObject instanceof IfcRoot) {
			IfcRoot ifcRoot = (IfcRoot) ifcObject;
			String guid = ifcRoot.getGlobalId();
			if (guid != null && !"".equalsIgnoreCase(guid)) {
				if (model.getGuidToPart21() == null)
					model.setGuidToPart21(Part21Factory.eINSTANCE.createGuidToPart21Container());
				model.getGuidToPart21().getGuidToPart21().put(guid, index);
			}
		}
	}

}
