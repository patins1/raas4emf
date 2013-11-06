/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package express2ecore.impl;

import express2ecore.Attribute2Attribute;
import express2ecore.Attribute2Feature;
import express2ecore.Attribute2Reference;
import express2ecore.Entity2Class;
import express2ecore.EntitySelect;
import express2ecore.Express2ecoreFactory;
import express2ecore.Express2ecorePackage;
import express2ecore.NonEntitySelect;
import express2ecore.Schema2Package;
import express2ecore.SelectMember2Feature;
import express2ecore.TypeMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.ifc4emf.metamodel.express.ExpressPackage;
import org.ifc4emf.metamodel.express.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Express2ecorePackageImpl extends EPackageImpl implements Express2ecorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entity2ClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schema2PackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attribute2FeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attribute2ReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attribute2AttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entitySelectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonEntitySelectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectMember2FeatureEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see express2ecore.Express2ecorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Express2ecorePackageImpl() {
		super(eNS_URI, Express2ecoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Express2ecorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Express2ecorePackage init() {
		if (isInited) return (Express2ecorePackage)EPackage.Registry.INSTANCE.getEPackage(Express2ecorePackage.eNS_URI);

		// Obtain or create and register package
		Express2ecorePackageImpl theExpress2ecorePackage = (Express2ecorePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Express2ecorePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Express2ecorePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		ExpressPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theExpress2ecorePackage.createPackageContents();

		// Initialize created meta-data
		theExpress2ecorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExpress2ecorePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Express2ecorePackage.eNS_URI, theExpress2ecorePackage);
		return theExpress2ecorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeMap() {
		return typeMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeMap_SourceType() {
		return (EReference)typeMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeMap_TargetType() {
		return (EReference)typeMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity2Class() {
		return entity2ClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchema2Package() {
		return schema2PackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema2Package_Schema() {
		return (EReference)schema2PackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSchema2Package_Package() {
		return (EReference)schema2PackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute2Feature() {
		return attribute2FeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute2Feature_Attribute() {
		return (EReference)attribute2FeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttribute2Feature_Feature() {
		return (EReference)attribute2FeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute2Reference() {
		return attribute2ReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute2Attribute() {
		return attribute2AttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntitySelect() {
		return entitySelectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonEntitySelect() {
		return nonEntitySelectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectMember2Feature() {
		return selectMember2FeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectMember2Feature_SelectType() {
		return (EReference)selectMember2FeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectMember2Feature_MemberType() {
		return (EReference)selectMember2FeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectMember2Feature_Feature() {
		return (EReference)selectMember2FeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Express2ecoreFactory getExpress2ecoreFactory() {
		return (Express2ecoreFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		typeMapEClass = createEClass(TYPE_MAP);
		createEReference(typeMapEClass, TYPE_MAP__SOURCE_TYPE);
		createEReference(typeMapEClass, TYPE_MAP__TARGET_TYPE);

		entity2ClassEClass = createEClass(ENTITY2_CLASS);

		schema2PackageEClass = createEClass(SCHEMA2_PACKAGE);
		createEReference(schema2PackageEClass, SCHEMA2_PACKAGE__SCHEMA);
		createEReference(schema2PackageEClass, SCHEMA2_PACKAGE__PACKAGE);

		attribute2FeatureEClass = createEClass(ATTRIBUTE2_FEATURE);
		createEReference(attribute2FeatureEClass, ATTRIBUTE2_FEATURE__ATTRIBUTE);
		createEReference(attribute2FeatureEClass, ATTRIBUTE2_FEATURE__FEATURE);

		attribute2ReferenceEClass = createEClass(ATTRIBUTE2_REFERENCE);

		attribute2AttributeEClass = createEClass(ATTRIBUTE2_ATTRIBUTE);

		entitySelectEClass = createEClass(ENTITY_SELECT);

		nonEntitySelectEClass = createEClass(NON_ENTITY_SELECT);

		selectMember2FeatureEClass = createEClass(SELECT_MEMBER2_FEATURE);
		createEReference(selectMember2FeatureEClass, SELECT_MEMBER2_FEATURE__SELECT_TYPE);
		createEReference(selectMember2FeatureEClass, SELECT_MEMBER2_FEATURE__MEMBER_TYPE);
		createEReference(selectMember2FeatureEClass, SELECT_MEMBER2_FEATURE__FEATURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		entity2ClassEClass.getESuperTypes().add(this.getTypeMap());
		attribute2ReferenceEClass.getESuperTypes().add(this.getAttribute2Feature());
		attribute2AttributeEClass.getESuperTypes().add(this.getAttribute2Feature());
		entitySelectEClass.getESuperTypes().add(this.getTypeMap());
		nonEntitySelectEClass.getESuperTypes().add(this.getTypeMap());

		// Initialize classes and features; add operations and parameters
		initEClass(typeMapEClass, TypeMap.class, "TypeMap", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeMap_SourceType(), ecorePackage.getEObject(), null, "sourceType", null, 0, 1, TypeMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeMap_TargetType(), theEcorePackage.getEClassifier(), null, "targetType", null, 0, 1, TypeMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entity2ClassEClass, Entity2Class.class, "Entity2Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(schema2PackageEClass, Schema2Package.class, "Schema2Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchema2Package_Schema(), theCorePackage.getSchema(), null, "schema", null, 0, 1, Schema2Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchema2Package_Package(), theEcorePackage.getEPackage(), null, "package", null, 0, 1, Schema2Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attribute2FeatureEClass, Attribute2Feature.class, "Attribute2Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttribute2Feature_Attribute(), theCorePackage.getAttribute(), null, "attribute", null, 0, 1, Attribute2Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute2Feature_Feature(), theEcorePackage.getEStructuralFeature(), null, "feature", null, 0, 1, Attribute2Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attribute2ReferenceEClass, Attribute2Reference.class, "Attribute2Reference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attribute2AttributeEClass, Attribute2Attribute.class, "Attribute2Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entitySelectEClass, EntitySelect.class, "EntitySelect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nonEntitySelectEClass, NonEntitySelect.class, "NonEntitySelect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(selectMember2FeatureEClass, SelectMember2Feature.class, "SelectMember2Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelectMember2Feature_SelectType(), theCorePackage.getSelectType(), null, "selectType", null, 0, 1, SelectMember2Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelectMember2Feature_MemberType(), theCorePackage.getNamedType(), null, "memberType", null, 0, 1, SelectMember2Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelectMember2Feature_Feature(), theEcorePackage.getEStructuralFeature(), null, "feature", null, 0, 1, SelectMember2Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Express2ecorePackageImpl
