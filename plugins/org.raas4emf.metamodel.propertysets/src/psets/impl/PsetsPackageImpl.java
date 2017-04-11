/**
 */
package psets.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import psets.IArtifact;
import psets.IDefaultValue;
import psets.IMinMaxValue;
import psets.IProperty;
import psets.IPropertySet;
import psets.IPropertyValue;
import psets.PsetsFactory;
import psets.PsetsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PsetsPackageImpl extends EPackageImpl implements PsetsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iPropertySetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iPropertyValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iDefaultValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iMinMaxValueEClass = null;

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
	 * @see psets.PsetsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PsetsPackageImpl() {
		super(eNS_URI, PsetsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PsetsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PsetsPackage init() {
		if (isInited) return (PsetsPackage)EPackage.Registry.INSTANCE.getEPackage(PsetsPackage.eNS_URI);

		// Obtain or create and register package
		PsetsPackageImpl thePsetsPackage = (PsetsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PsetsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PsetsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePsetsPackage.createPackageContents();

		// Initialize created meta-data
		thePsetsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePsetsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PsetsPackage.eNS_URI, thePsetsPackage);
		return thePsetsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIArtifact() {
		return iArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIArtifact_PropertySets() {
		return (EReference)iArtifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIArtifact_TemplateType() {
		return (EAttribute)iArtifactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIArtifact__CreatePropertySet__String() {
		return iArtifactEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPropertySet() {
		return iPropertySetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIPropertySet_Properties() {
		return (EReference)iPropertySetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIPropertySet_Name() {
		return (EAttribute)iPropertySetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPropertySet__CreateProperty__String() {
		return iPropertySetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPropertySet__GetApplicableClasses() {
		return iPropertySetEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPropertySet__GetDefinition() {
		return iPropertySetEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIProperty() {
		return iPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIProperty_PropertyValues() {
		return (EReference)iPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIProperty_LodVisibility() {
		return (EAttribute)iPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIProperty_Name() {
		return (EAttribute)iPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIProperty_LodReadOnly() {
		return (EAttribute)iPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIProperty_LodMustChange() {
		return (EAttribute)iPropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProperty__GetFullName() {
		return iPropertyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProperty__CleanUp() {
		return iPropertyEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProperty__GetSimpleType() {
		return iPropertyEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProperty__GetEnumerationLiterals() {
		return iPropertyEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProperty__SetValue__String() {
		return iPropertyEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProperty__GetTypeInfo() {
		return iPropertyEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProperty__GetDefinition() {
		return iPropertyEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProperty__RemovePropertyValue__int() {
		return iPropertyEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProperty__AddDefaultValue__int() {
		return iPropertyEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIProperty__AddMinMaxValue__int() {
		return iPropertyEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIPropertyValue() {
		return iPropertyValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPropertyValue__GetDisplayValue() {
		return iPropertyValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIPropertyValue__GetUnit() {
		return iPropertyValueEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIDefaultValue() {
		return iDefaultValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIDefaultValue_Value() {
		return (EAttribute)iDefaultValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIDefaultValue__GetNumber() {
		return iDefaultValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIMinMaxValue() {
		return iMinMaxValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIMinMaxValue_MinValue() {
		return (EAttribute)iMinMaxValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIMinMaxValue_MaxValue() {
		return (EAttribute)iMinMaxValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIMinMaxValue__GetMinNumber() {
		return iMinMaxValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIMinMaxValue__GetMaxNumber() {
		return iMinMaxValueEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PsetsFactory getPsetsFactory() {
		return (PsetsFactory)getEFactoryInstance();
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
		iArtifactEClass = createEClass(IARTIFACT);
		createEReference(iArtifactEClass, IARTIFACT__PROPERTY_SETS);
		createEAttribute(iArtifactEClass, IARTIFACT__TEMPLATE_TYPE);
		createEOperation(iArtifactEClass, IARTIFACT___CREATE_PROPERTY_SET__STRING);

		iPropertySetEClass = createEClass(IPROPERTY_SET);
		createEReference(iPropertySetEClass, IPROPERTY_SET__PROPERTIES);
		createEAttribute(iPropertySetEClass, IPROPERTY_SET__NAME);
		createEOperation(iPropertySetEClass, IPROPERTY_SET___CREATE_PROPERTY__STRING);
		createEOperation(iPropertySetEClass, IPROPERTY_SET___GET_APPLICABLE_CLASSES);
		createEOperation(iPropertySetEClass, IPROPERTY_SET___GET_DEFINITION);

		iPropertyEClass = createEClass(IPROPERTY);
		createEReference(iPropertyEClass, IPROPERTY__PROPERTY_VALUES);
		createEAttribute(iPropertyEClass, IPROPERTY__LOD_VISIBILITY);
		createEAttribute(iPropertyEClass, IPROPERTY__NAME);
		createEAttribute(iPropertyEClass, IPROPERTY__LOD_READ_ONLY);
		createEAttribute(iPropertyEClass, IPROPERTY__LOD_MUST_CHANGE);
		createEOperation(iPropertyEClass, IPROPERTY___GET_FULL_NAME);
		createEOperation(iPropertyEClass, IPROPERTY___CLEAN_UP);
		createEOperation(iPropertyEClass, IPROPERTY___GET_SIMPLE_TYPE);
		createEOperation(iPropertyEClass, IPROPERTY___GET_ENUMERATION_LITERALS);
		createEOperation(iPropertyEClass, IPROPERTY___SET_VALUE__STRING);
		createEOperation(iPropertyEClass, IPROPERTY___GET_TYPE_INFO);
		createEOperation(iPropertyEClass, IPROPERTY___GET_DEFINITION);
		createEOperation(iPropertyEClass, IPROPERTY___REMOVE_PROPERTY_VALUE__INT);
		createEOperation(iPropertyEClass, IPROPERTY___ADD_DEFAULT_VALUE__INT);
		createEOperation(iPropertyEClass, IPROPERTY___ADD_MIN_MAX_VALUE__INT);

		iPropertyValueEClass = createEClass(IPROPERTY_VALUE);
		createEOperation(iPropertyValueEClass, IPROPERTY_VALUE___GET_DISPLAY_VALUE);
		createEOperation(iPropertyValueEClass, IPROPERTY_VALUE___GET_UNIT);

		iDefaultValueEClass = createEClass(IDEFAULT_VALUE);
		createEAttribute(iDefaultValueEClass, IDEFAULT_VALUE__VALUE);
		createEOperation(iDefaultValueEClass, IDEFAULT_VALUE___GET_NUMBER);

		iMinMaxValueEClass = createEClass(IMIN_MAX_VALUE);
		createEAttribute(iMinMaxValueEClass, IMIN_MAX_VALUE__MIN_VALUE);
		createEAttribute(iMinMaxValueEClass, IMIN_MAX_VALUE__MAX_VALUE);
		createEOperation(iMinMaxValueEClass, IMIN_MAX_VALUE___GET_MIN_NUMBER);
		createEOperation(iMinMaxValueEClass, IMIN_MAX_VALUE___GET_MAX_NUMBER);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		iDefaultValueEClass.getESuperTypes().add(this.getIPropertyValue());
		iMinMaxValueEClass.getESuperTypes().add(this.getIPropertyValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(iArtifactEClass, IArtifact.class, "IArtifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIArtifact_PropertySets(), this.getIPropertySet(), null, "propertySets", null, 0, -1, IArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIArtifact_TemplateType(), ecorePackage.getEString(), "templateType", null, 0, 1, IArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getIArtifact__CreatePropertySet__String(), this.getIPropertySet(), "createPropertySet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "psetName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iPropertySetEClass, IPropertySet.class, "IPropertySet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIPropertySet_Properties(), this.getIProperty(), null, "properties", null, 0, -1, IPropertySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIPropertySet_Name(), ecorePackage.getEString(), "name", null, 0, 1, IPropertySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getIPropertySet__CreateProperty__String(), this.getIProperty(), "createProperty", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "propName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIPropertySet__GetApplicableClasses(), ecorePackage.getEString(), "getApplicableClasses", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIPropertySet__GetDefinition(), ecorePackage.getEString(), "getDefinition", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iPropertyEClass, IProperty.class, "IProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIProperty_PropertyValues(), this.getIPropertyValue(), null, "propertyValues", null, 0, -1, IProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIProperty_LodVisibility(), ecorePackage.getEInt(), "lodVisibility", null, 0, 1, IProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, IProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIProperty_LodReadOnly(), ecorePackage.getEInt(), "lodReadOnly", null, 0, 1, IProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIProperty_LodMustChange(), ecorePackage.getEInt(), "lodMustChange", null, 0, 1, IProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getIProperty__GetFullName(), ecorePackage.getEString(), "getFullName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIProperty__CleanUp(), null, "cleanUp", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIProperty__GetSimpleType(), ecorePackage.getEString(), "getSimpleType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIProperty__GetEnumerationLiterals(), ecorePackage.getEString(), "getEnumerationLiterals", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIProperty__SetValue__String(), null, "setValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIProperty__GetTypeInfo(), ecorePackage.getEString(), "getTypeInfo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIProperty__GetDefinition(), ecorePackage.getEString(), "getDefinition", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIProperty__RemovePropertyValue__int(), null, "removePropertyValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIProperty__AddDefaultValue__int(), this.getIDefaultValue(), "addDefaultValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIProperty__AddMinMaxValue__int(), this.getIMinMaxValue(), "addMinMaxValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "index", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iPropertyValueEClass, IPropertyValue.class, "IPropertyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIPropertyValue__GetDisplayValue(), ecorePackage.getEString(), "getDisplayValue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIPropertyValue__GetUnit(), ecorePackage.getEString(), "getUnit", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iDefaultValueEClass, IDefaultValue.class, "IDefaultValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIDefaultValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, IDefaultValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getIDefaultValue__GetNumber(), ecorePackage.getEDoubleObject(), "getNumber", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(iMinMaxValueEClass, IMinMaxValue.class, "IMinMaxValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIMinMaxValue_MinValue(), ecorePackage.getEString(), "minValue", null, 0, 1, IMinMaxValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIMinMaxValue_MaxValue(), ecorePackage.getEString(), "maxValue", null, 0, 1, IMinMaxValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getIMinMaxValue__GetMinNumber(), ecorePackage.getEDoubleObject(), "getMinNumber", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getIMinMaxValue__GetMaxNumber(), ecorePackage.getEDoubleObject(), "getMaxNumber", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PsetsPackageImpl
