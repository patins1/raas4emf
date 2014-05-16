/**
 */
package psets;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see psets.PsetsFactory
 * @model kind="package"
 * @generated
 */
public interface PsetsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "psets";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.raas4emf.metamodel.propertysets.ecore/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "psets";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PsetsPackage eINSTANCE = psets.impl.PsetsPackageImpl.init();

	/**
	 * The meta object id for the '{@link psets.impl.IArtifactImpl <em>IArtifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psets.impl.IArtifactImpl
	 * @see psets.impl.PsetsPackageImpl#getIArtifact()
	 * @generated
	 */
	int IARTIFACT = 0;

	/**
	 * The feature id for the '<em><b>Property Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IARTIFACT__PROPERTY_SETS = 0;

	/**
	 * The feature id for the '<em><b>Template Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IARTIFACT__TEMPLATE_TYPE = 1;

	/**
	 * The number of structural features of the '<em>IArtifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IARTIFACT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Create Property Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IARTIFACT___CREATE_PROPERTY_SET__STRING = 0;

	/**
	 * The number of operations of the '<em>IArtifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IARTIFACT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link psets.impl.IPropertySetImpl <em>IProperty Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psets.impl.IPropertySetImpl
	 * @see psets.impl.PsetsPackageImpl#getIPropertySet()
	 * @generated
	 */
	int IPROPERTY_SET = 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROPERTY_SET__PROPERTIES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROPERTY_SET__NAME = 1;

	/**
	 * The number of structural features of the '<em>IProperty Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROPERTY_SET_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Create Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROPERTY_SET___CREATE_PROPERTY__STRING = 0;

	/**
	 * The operation id for the '<em>Get Applicable Classes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROPERTY_SET___GET_APPLICABLE_CLASSES = 1;

	/**
	 * The operation id for the '<em>Get Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROPERTY_SET___GET_DEFINITION = 2;

	/**
	 * The number of operations of the '<em>IProperty Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROPERTY_SET_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link psets.impl.IPropertyImpl <em>IProperty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psets.impl.IPropertyImpl
	 * @see psets.impl.PsetsPackageImpl#getIProperty()
	 * @generated
	 */
	int IPROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Property Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROPERTY__PROPERTY_VALUES = 0;

	/**
	 * The feature id for the '<em><b>Lod Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROPERTY__LOD_VISIBILITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROPERTY__NAME = 2;

	/**
	 * The number of structural features of the '<em>IProperty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROPERTY_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Full Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROPERTY___GET_FULL_NAME = 0;

	/**
	 * The operation id for the '<em>Clean Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROPERTY___CLEAN_UP = 1;

	/**
	 * The operation id for the '<em>Get Simple Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROPERTY___GET_SIMPLE_TYPE = 2;

	/**
	 * The operation id for the '<em>Get Enumeration Literals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROPERTY___GET_ENUMERATION_LITERALS = 3;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROPERTY___SET_VALUE__STRING = 4;

	/**
	 * The operation id for the '<em>Get Type Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROPERTY___GET_TYPE_INFO = 5;

	/**
	 * The operation id for the '<em>Get Definition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROPERTY___GET_DEFINITION = 6;

	/**
	 * The operation id for the '<em>Remove Property Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROPERTY___REMOVE_PROPERTY_VALUE__INT = 7;

	/**
	 * The operation id for the '<em>Add Default Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROPERTY___ADD_DEFAULT_VALUE__INT = 8;

	/**
	 * The operation id for the '<em>Add Min Max Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROPERTY___ADD_MIN_MAX_VALUE__INT = 9;

	/**
	 * The number of operations of the '<em>IProperty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROPERTY_OPERATION_COUNT = 10;

	/**
	 * The meta object id for the '{@link psets.impl.IDefaultValueImpl <em>IDefault Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psets.impl.IDefaultValueImpl
	 * @see psets.impl.PsetsPackageImpl#getIDefaultValue()
	 * @generated
	 */
	int IDEFAULT_VALUE = 4;

	/**
	 * The meta object id for the '{@link psets.impl.IPropertyValueImpl <em>IProperty Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psets.impl.IPropertyValueImpl
	 * @see psets.impl.PsetsPackageImpl#getIPropertyValue()
	 * @generated
	 */
	int IPROPERTY_VALUE = 3;

	/**
	 * The number of structural features of the '<em>IProperty Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROPERTY_VALUE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Display Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROPERTY_VALUE___GET_DISPLAY_VALUE = 0;

	/**
	 * The operation id for the '<em>Get Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROPERTY_VALUE___GET_UNIT = 1;

	/**
	 * The number of operations of the '<em>IProperty Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IPROPERTY_VALUE_OPERATION_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFAULT_VALUE__VALUE = IPROPERTY_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IDefault Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFAULT_VALUE_FEATURE_COUNT = IPROPERTY_VALUE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Display Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFAULT_VALUE___GET_DISPLAY_VALUE = IPROPERTY_VALUE___GET_DISPLAY_VALUE;

	/**
	 * The operation id for the '<em>Get Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFAULT_VALUE___GET_UNIT = IPROPERTY_VALUE___GET_UNIT;

	/**
	 * The operation id for the '<em>Get Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFAULT_VALUE___GET_NUMBER = IPROPERTY_VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>IDefault Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDEFAULT_VALUE_OPERATION_COUNT = IPROPERTY_VALUE_OPERATION_COUNT + 1;


	/**
	 * The meta object id for the '{@link psets.impl.IMinMaxValueImpl <em>IMin Max Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see psets.impl.IMinMaxValueImpl
	 * @see psets.impl.PsetsPackageImpl#getIMinMaxValue()
	 * @generated
	 */
	int IMIN_MAX_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMIN_MAX_VALUE__MIN_VALUE = IPROPERTY_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMIN_MAX_VALUE__MAX_VALUE = IPROPERTY_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IMin Max Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMIN_MAX_VALUE_FEATURE_COUNT = IPROPERTY_VALUE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Display Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMIN_MAX_VALUE___GET_DISPLAY_VALUE = IPROPERTY_VALUE___GET_DISPLAY_VALUE;

	/**
	 * The operation id for the '<em>Get Unit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMIN_MAX_VALUE___GET_UNIT = IPROPERTY_VALUE___GET_UNIT;

	/**
	 * The operation id for the '<em>Get Min Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMIN_MAX_VALUE___GET_MIN_NUMBER = IPROPERTY_VALUE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Max Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMIN_MAX_VALUE___GET_MAX_NUMBER = IPROPERTY_VALUE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>IMin Max Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMIN_MAX_VALUE_OPERATION_COUNT = IPROPERTY_VALUE_OPERATION_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link psets.IArtifact <em>IArtifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IArtifact</em>'.
	 * @see psets.IArtifact
	 * @generated
	 */
	EClass getIArtifact();

	/**
	 * Returns the meta object for the containment reference list '{@link psets.IArtifact#getPropertySets <em>Property Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Sets</em>'.
	 * @see psets.IArtifact#getPropertySets()
	 * @see #getIArtifact()
	 * @generated
	 */
	EReference getIArtifact_PropertySets();

	/**
	 * Returns the meta object for the attribute '{@link psets.IArtifact#getTemplateType <em>Template Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template Type</em>'.
	 * @see psets.IArtifact#getTemplateType()
	 * @see #getIArtifact()
	 * @generated
	 */
	EAttribute getIArtifact_TemplateType();

	/**
	 * Returns the meta object for the '{@link psets.IArtifact#createPropertySet(java.lang.String) <em>Create Property Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Property Set</em>' operation.
	 * @see psets.IArtifact#createPropertySet(java.lang.String)
	 * @generated
	 */
	EOperation getIArtifact__CreatePropertySet__String();

	/**
	 * Returns the meta object for class '{@link psets.IPropertySet <em>IProperty Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IProperty Set</em>'.
	 * @see psets.IPropertySet
	 * @generated
	 */
	EClass getIPropertySet();

	/**
	 * Returns the meta object for the containment reference list '{@link psets.IPropertySet#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see psets.IPropertySet#getProperties()
	 * @see #getIPropertySet()
	 * @generated
	 */
	EReference getIPropertySet_Properties();

	/**
	 * Returns the meta object for the attribute '{@link psets.IPropertySet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see psets.IPropertySet#getName()
	 * @see #getIPropertySet()
	 * @generated
	 */
	EAttribute getIPropertySet_Name();

	/**
	 * Returns the meta object for the '{@link psets.IPropertySet#createProperty(java.lang.String) <em>Create Property</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Property</em>' operation.
	 * @see psets.IPropertySet#createProperty(java.lang.String)
	 * @generated
	 */
	EOperation getIPropertySet__CreateProperty__String();

	/**
	 * Returns the meta object for the '{@link psets.IPropertySet#getApplicableClasses() <em>Get Applicable Classes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Applicable Classes</em>' operation.
	 * @see psets.IPropertySet#getApplicableClasses()
	 * @generated
	 */
	EOperation getIPropertySet__GetApplicableClasses();

	/**
	 * Returns the meta object for the '{@link psets.IPropertySet#getDefinition() <em>Get Definition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Definition</em>' operation.
	 * @see psets.IPropertySet#getDefinition()
	 * @generated
	 */
	EOperation getIPropertySet__GetDefinition();

	/**
	 * Returns the meta object for class '{@link psets.IProperty <em>IProperty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IProperty</em>'.
	 * @see psets.IProperty
	 * @generated
	 */
	EClass getIProperty();

	/**
	 * Returns the meta object for the containment reference list '{@link psets.IProperty#getPropertyValues <em>Property Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property Values</em>'.
	 * @see psets.IProperty#getPropertyValues()
	 * @see #getIProperty()
	 * @generated
	 */
	EReference getIProperty_PropertyValues();

	/**
	 * Returns the meta object for the attribute '{@link psets.IProperty#getLodVisibility <em>Lod Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lod Visibility</em>'.
	 * @see psets.IProperty#getLodVisibility()
	 * @see #getIProperty()
	 * @generated
	 */
	EAttribute getIProperty_LodVisibility();

	/**
	 * Returns the meta object for the attribute '{@link psets.IProperty#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see psets.IProperty#getName()
	 * @see #getIProperty()
	 * @generated
	 */
	EAttribute getIProperty_Name();

	/**
	 * Returns the meta object for the '{@link psets.IProperty#getFullName() <em>Get Full Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Full Name</em>' operation.
	 * @see psets.IProperty#getFullName()
	 * @generated
	 */
	EOperation getIProperty__GetFullName();

	/**
	 * Returns the meta object for the '{@link psets.IProperty#cleanUp() <em>Clean Up</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clean Up</em>' operation.
	 * @see psets.IProperty#cleanUp()
	 * @generated
	 */
	EOperation getIProperty__CleanUp();

	/**
	 * Returns the meta object for the '{@link psets.IProperty#getSimpleType() <em>Get Simple Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Simple Type</em>' operation.
	 * @see psets.IProperty#getSimpleType()
	 * @generated
	 */
	EOperation getIProperty__GetSimpleType();

	/**
	 * Returns the meta object for the '{@link psets.IProperty#getEnumerationLiterals() <em>Get Enumeration Literals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Enumeration Literals</em>' operation.
	 * @see psets.IProperty#getEnumerationLiterals()
	 * @generated
	 */
	EOperation getIProperty__GetEnumerationLiterals();

	/**
	 * Returns the meta object for the '{@link psets.IProperty#setValue(java.lang.String) <em>Set Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Value</em>' operation.
	 * @see psets.IProperty#setValue(java.lang.String)
	 * @generated
	 */
	EOperation getIProperty__SetValue__String();

	/**
	 * Returns the meta object for the '{@link psets.IProperty#getTypeInfo() <em>Get Type Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type Info</em>' operation.
	 * @see psets.IProperty#getTypeInfo()
	 * @generated
	 */
	EOperation getIProperty__GetTypeInfo();

	/**
	 * Returns the meta object for the '{@link psets.IProperty#getDefinition() <em>Get Definition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Definition</em>' operation.
	 * @see psets.IProperty#getDefinition()
	 * @generated
	 */
	EOperation getIProperty__GetDefinition();

	/**
	 * Returns the meta object for the '{@link psets.IProperty#removePropertyValue(int) <em>Remove Property Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Property Value</em>' operation.
	 * @see psets.IProperty#removePropertyValue(int)
	 * @generated
	 */
	EOperation getIProperty__RemovePropertyValue__int();

	/**
	 * Returns the meta object for the '{@link psets.IProperty#addDefaultValue(int) <em>Add Default Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Default Value</em>' operation.
	 * @see psets.IProperty#addDefaultValue(int)
	 * @generated
	 */
	EOperation getIProperty__AddDefaultValue__int();

	/**
	 * Returns the meta object for the '{@link psets.IProperty#addMinMaxValue(int) <em>Add Min Max Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Min Max Value</em>' operation.
	 * @see psets.IProperty#addMinMaxValue(int)
	 * @generated
	 */
	EOperation getIProperty__AddMinMaxValue__int();

	/**
	 * Returns the meta object for class '{@link psets.IPropertyValue <em>IProperty Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IProperty Value</em>'.
	 * @see psets.IPropertyValue
	 * @generated
	 */
	EClass getIPropertyValue();

	/**
	 * Returns the meta object for the '{@link psets.IPropertyValue#getDisplayValue() <em>Get Display Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Display Value</em>' operation.
	 * @see psets.IPropertyValue#getDisplayValue()
	 * @generated
	 */
	EOperation getIPropertyValue__GetDisplayValue();

	/**
	 * Returns the meta object for the '{@link psets.IPropertyValue#getUnit() <em>Get Unit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Unit</em>' operation.
	 * @see psets.IPropertyValue#getUnit()
	 * @generated
	 */
	EOperation getIPropertyValue__GetUnit();

	/**
	 * Returns the meta object for class '{@link psets.IDefaultValue <em>IDefault Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDefault Value</em>'.
	 * @see psets.IDefaultValue
	 * @generated
	 */
	EClass getIDefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link psets.IDefaultValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see psets.IDefaultValue#getValue()
	 * @see #getIDefaultValue()
	 * @generated
	 */
	EAttribute getIDefaultValue_Value();

	/**
	 * Returns the meta object for the '{@link psets.IDefaultValue#getNumber() <em>Get Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Number</em>' operation.
	 * @see psets.IDefaultValue#getNumber()
	 * @generated
	 */
	EOperation getIDefaultValue__GetNumber();

	/**
	 * Returns the meta object for class '{@link psets.IMinMaxValue <em>IMin Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IMin Max Value</em>'.
	 * @see psets.IMinMaxValue
	 * @generated
	 */
	EClass getIMinMaxValue();

	/**
	 * Returns the meta object for the attribute '{@link psets.IMinMaxValue#getMinValue <em>Min Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Value</em>'.
	 * @see psets.IMinMaxValue#getMinValue()
	 * @see #getIMinMaxValue()
	 * @generated
	 */
	EAttribute getIMinMaxValue_MinValue();

	/**
	 * Returns the meta object for the attribute '{@link psets.IMinMaxValue#getMaxValue <em>Max Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Value</em>'.
	 * @see psets.IMinMaxValue#getMaxValue()
	 * @see #getIMinMaxValue()
	 * @generated
	 */
	EAttribute getIMinMaxValue_MaxValue();

	/**
	 * Returns the meta object for the '{@link psets.IMinMaxValue#getMinNumber() <em>Get Min Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Min Number</em>' operation.
	 * @see psets.IMinMaxValue#getMinNumber()
	 * @generated
	 */
	EOperation getIMinMaxValue__GetMinNumber();

	/**
	 * Returns the meta object for the '{@link psets.IMinMaxValue#getMaxNumber() <em>Get Max Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Max Number</em>' operation.
	 * @see psets.IMinMaxValue#getMaxNumber()
	 * @generated
	 */
	EOperation getIMinMaxValue__GetMaxNumber();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PsetsFactory getPsetsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link psets.impl.IArtifactImpl <em>IArtifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psets.impl.IArtifactImpl
		 * @see psets.impl.PsetsPackageImpl#getIArtifact()
		 * @generated
		 */
		EClass IARTIFACT = eINSTANCE.getIArtifact();

		/**
		 * The meta object literal for the '<em><b>Property Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IARTIFACT__PROPERTY_SETS = eINSTANCE.getIArtifact_PropertySets();

		/**
		 * The meta object literal for the '<em><b>Template Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IARTIFACT__TEMPLATE_TYPE = eINSTANCE.getIArtifact_TemplateType();

		/**
		 * The meta object literal for the '<em><b>Create Property Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IARTIFACT___CREATE_PROPERTY_SET__STRING = eINSTANCE.getIArtifact__CreatePropertySet__String();

		/**
		 * The meta object literal for the '{@link psets.impl.IPropertySetImpl <em>IProperty Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psets.impl.IPropertySetImpl
		 * @see psets.impl.PsetsPackageImpl#getIPropertySet()
		 * @generated
		 */
		EClass IPROPERTY_SET = eINSTANCE.getIPropertySet();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IPROPERTY_SET__PROPERTIES = eINSTANCE.getIPropertySet_Properties();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IPROPERTY_SET__NAME = eINSTANCE.getIPropertySet_Name();

		/**
		 * The meta object literal for the '<em><b>Create Property</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROPERTY_SET___CREATE_PROPERTY__STRING = eINSTANCE.getIPropertySet__CreateProperty__String();

		/**
		 * The meta object literal for the '<em><b>Get Applicable Classes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROPERTY_SET___GET_APPLICABLE_CLASSES = eINSTANCE.getIPropertySet__GetApplicableClasses();

		/**
		 * The meta object literal for the '<em><b>Get Definition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROPERTY_SET___GET_DEFINITION = eINSTANCE.getIPropertySet__GetDefinition();

		/**
		 * The meta object literal for the '{@link psets.impl.IPropertyImpl <em>IProperty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psets.impl.IPropertyImpl
		 * @see psets.impl.PsetsPackageImpl#getIProperty()
		 * @generated
		 */
		EClass IPROPERTY = eINSTANCE.getIProperty();

		/**
		 * The meta object literal for the '<em><b>Property Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IPROPERTY__PROPERTY_VALUES = eINSTANCE.getIProperty_PropertyValues();

		/**
		 * The meta object literal for the '<em><b>Lod Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IPROPERTY__LOD_VISIBILITY = eINSTANCE.getIProperty_LodVisibility();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IPROPERTY__NAME = eINSTANCE.getIProperty_Name();

		/**
		 * The meta object literal for the '<em><b>Get Full Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROPERTY___GET_FULL_NAME = eINSTANCE.getIProperty__GetFullName();

		/**
		 * The meta object literal for the '<em><b>Clean Up</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROPERTY___CLEAN_UP = eINSTANCE.getIProperty__CleanUp();

		/**
		 * The meta object literal for the '<em><b>Get Simple Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROPERTY___GET_SIMPLE_TYPE = eINSTANCE.getIProperty__GetSimpleType();

		/**
		 * The meta object literal for the '<em><b>Get Enumeration Literals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROPERTY___GET_ENUMERATION_LITERALS = eINSTANCE.getIProperty__GetEnumerationLiterals();

		/**
		 * The meta object literal for the '<em><b>Set Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROPERTY___SET_VALUE__STRING = eINSTANCE.getIProperty__SetValue__String();

		/**
		 * The meta object literal for the '<em><b>Get Type Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROPERTY___GET_TYPE_INFO = eINSTANCE.getIProperty__GetTypeInfo();

		/**
		 * The meta object literal for the '<em><b>Get Definition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROPERTY___GET_DEFINITION = eINSTANCE.getIProperty__GetDefinition();

		/**
		 * The meta object literal for the '<em><b>Remove Property Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROPERTY___REMOVE_PROPERTY_VALUE__INT = eINSTANCE.getIProperty__RemovePropertyValue__int();

		/**
		 * The meta object literal for the '<em><b>Add Default Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROPERTY___ADD_DEFAULT_VALUE__INT = eINSTANCE.getIProperty__AddDefaultValue__int();

		/**
		 * The meta object literal for the '<em><b>Add Min Max Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROPERTY___ADD_MIN_MAX_VALUE__INT = eINSTANCE.getIProperty__AddMinMaxValue__int();

		/**
		 * The meta object literal for the '{@link psets.impl.IPropertyValueImpl <em>IProperty Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psets.impl.IPropertyValueImpl
		 * @see psets.impl.PsetsPackageImpl#getIPropertyValue()
		 * @generated
		 */
		EClass IPROPERTY_VALUE = eINSTANCE.getIPropertyValue();

		/**
		 * The meta object literal for the '<em><b>Get Display Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROPERTY_VALUE___GET_DISPLAY_VALUE = eINSTANCE.getIPropertyValue__GetDisplayValue();

		/**
		 * The meta object literal for the '<em><b>Get Unit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IPROPERTY_VALUE___GET_UNIT = eINSTANCE.getIPropertyValue__GetUnit();

		/**
		 * The meta object literal for the '{@link psets.impl.IDefaultValueImpl <em>IDefault Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psets.impl.IDefaultValueImpl
		 * @see psets.impl.PsetsPackageImpl#getIDefaultValue()
		 * @generated
		 */
		EClass IDEFAULT_VALUE = eINSTANCE.getIDefaultValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDEFAULT_VALUE__VALUE = eINSTANCE.getIDefaultValue_Value();

		/**
		 * The meta object literal for the '<em><b>Get Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDEFAULT_VALUE___GET_NUMBER = eINSTANCE.getIDefaultValue__GetNumber();

		/**
		 * The meta object literal for the '{@link psets.impl.IMinMaxValueImpl <em>IMin Max Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see psets.impl.IMinMaxValueImpl
		 * @see psets.impl.PsetsPackageImpl#getIMinMaxValue()
		 * @generated
		 */
		EClass IMIN_MAX_VALUE = eINSTANCE.getIMinMaxValue();

		/**
		 * The meta object literal for the '<em><b>Min Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMIN_MAX_VALUE__MIN_VALUE = eINSTANCE.getIMinMaxValue_MinValue();

		/**
		 * The meta object literal for the '<em><b>Max Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMIN_MAX_VALUE__MAX_VALUE = eINSTANCE.getIMinMaxValue_MaxValue();

		/**
		 * The meta object literal for the '<em><b>Get Min Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMIN_MAX_VALUE___GET_MIN_NUMBER = eINSTANCE.getIMinMaxValue__GetMinNumber();

		/**
		 * The meta object literal for the '<em><b>Get Max Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMIN_MAX_VALUE___GET_MAX_NUMBER = eINSTANCE.getIMinMaxValue__GetMaxNumber();

	}

} //PsetsPackage
