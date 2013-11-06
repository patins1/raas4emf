/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package express2ecore;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see express2ecore.Express2ecoreFactory
 * @model kind="package"
 * @generated
 */
public interface Express2ecorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "express2ecore";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://express2ecore.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "express2ecore";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Express2ecorePackage eINSTANCE = express2ecore.impl.Express2ecorePackageImpl.init();

	/**
	 * The meta object id for the '{@link express2ecore.impl.TypeMapImpl <em>Type Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see express2ecore.impl.TypeMapImpl
	 * @see express2ecore.impl.Express2ecorePackageImpl#getTypeMap()
	 * @generated
	 */
	int TYPE_MAP = 0;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAP__SOURCE_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAP__TARGET_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Type Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link express2ecore.impl.Entity2ClassImpl <em>Entity2 Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see express2ecore.impl.Entity2ClassImpl
	 * @see express2ecore.impl.Express2ecorePackageImpl#getEntity2Class()
	 * @generated
	 */
	int ENTITY2_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY2_CLASS__SOURCE_TYPE = TYPE_MAP__SOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY2_CLASS__TARGET_TYPE = TYPE_MAP__TARGET_TYPE;

	/**
	 * The number of structural features of the '<em>Entity2 Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY2_CLASS_FEATURE_COUNT = TYPE_MAP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link express2ecore.impl.Schema2PackageImpl <em>Schema2 Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see express2ecore.impl.Schema2PackageImpl
	 * @see express2ecore.impl.Express2ecorePackageImpl#getSchema2Package()
	 * @generated
	 */
	int SCHEMA2_PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA2_PACKAGE__SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA2_PACKAGE__PACKAGE = 1;

	/**
	 * The number of structural features of the '<em>Schema2 Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA2_PACKAGE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link express2ecore.impl.Attribute2FeatureImpl <em>Attribute2 Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see express2ecore.impl.Attribute2FeatureImpl
	 * @see express2ecore.impl.Express2ecorePackageImpl#getAttribute2Feature()
	 * @generated
	 */
	int ATTRIBUTE2_FEATURE = 3;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2_FEATURE__ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2_FEATURE__FEATURE = 1;

	/**
	 * The number of structural features of the '<em>Attribute2 Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2_FEATURE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link express2ecore.impl.Attribute2ReferenceImpl <em>Attribute2 Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see express2ecore.impl.Attribute2ReferenceImpl
	 * @see express2ecore.impl.Express2ecorePackageImpl#getAttribute2Reference()
	 * @generated
	 */
	int ATTRIBUTE2_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2_REFERENCE__ATTRIBUTE = ATTRIBUTE2_FEATURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2_REFERENCE__FEATURE = ATTRIBUTE2_FEATURE__FEATURE;

	/**
	 * The number of structural features of the '<em>Attribute2 Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2_REFERENCE_FEATURE_COUNT = ATTRIBUTE2_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link express2ecore.impl.Attribute2AttributeImpl <em>Attribute2 Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see express2ecore.impl.Attribute2AttributeImpl
	 * @see express2ecore.impl.Express2ecorePackageImpl#getAttribute2Attribute()
	 * @generated
	 */
	int ATTRIBUTE2_ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2_ATTRIBUTE__ATTRIBUTE = ATTRIBUTE2_FEATURE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2_ATTRIBUTE__FEATURE = ATTRIBUTE2_FEATURE__FEATURE;

	/**
	 * The number of structural features of the '<em>Attribute2 Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE2_ATTRIBUTE_FEATURE_COUNT = ATTRIBUTE2_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link express2ecore.impl.EntitySelectImpl <em>Entity Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see express2ecore.impl.EntitySelectImpl
	 * @see express2ecore.impl.Express2ecorePackageImpl#getEntitySelect()
	 * @generated
	 */
	int ENTITY_SELECT = 6;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SELECT__SOURCE_TYPE = TYPE_MAP__SOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SELECT__TARGET_TYPE = TYPE_MAP__TARGET_TYPE;

	/**
	 * The number of structural features of the '<em>Entity Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SELECT_FEATURE_COUNT = TYPE_MAP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link express2ecore.impl.NonEntitySelectImpl <em>Non Entity Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see express2ecore.impl.NonEntitySelectImpl
	 * @see express2ecore.impl.Express2ecorePackageImpl#getNonEntitySelect()
	 * @generated
	 */
	int NON_ENTITY_SELECT = 7;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_ENTITY_SELECT__SOURCE_TYPE = TYPE_MAP__SOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_ENTITY_SELECT__TARGET_TYPE = TYPE_MAP__TARGET_TYPE;

	/**
	 * The number of structural features of the '<em>Non Entity Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_ENTITY_SELECT_FEATURE_COUNT = TYPE_MAP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link express2ecore.impl.SelectMember2FeatureImpl <em>Select Member2 Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see express2ecore.impl.SelectMember2FeatureImpl
	 * @see express2ecore.impl.Express2ecorePackageImpl#getSelectMember2Feature()
	 * @generated
	 */
	int SELECT_MEMBER2_FEATURE = 8;

	/**
	 * The feature id for the '<em><b>Select Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_MEMBER2_FEATURE__SELECT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_MEMBER2_FEATURE__MEMBER_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_MEMBER2_FEATURE__FEATURE = 2;

	/**
	 * The number of structural features of the '<em>Select Member2 Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_MEMBER2_FEATURE_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link express2ecore.TypeMap <em>Type Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Map</em>'.
	 * @see express2ecore.TypeMap
	 * @generated
	 */
	EClass getTypeMap();

	/**
	 * Returns the meta object for the reference '{@link express2ecore.TypeMap#getSourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Type</em>'.
	 * @see express2ecore.TypeMap#getSourceType()
	 * @see #getTypeMap()
	 * @generated
	 */
	EReference getTypeMap_SourceType();

	/**
	 * Returns the meta object for the reference '{@link express2ecore.TypeMap#getTargetType <em>Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Type</em>'.
	 * @see express2ecore.TypeMap#getTargetType()
	 * @see #getTypeMap()
	 * @generated
	 */
	EReference getTypeMap_TargetType();

	/**
	 * Returns the meta object for class '{@link express2ecore.Entity2Class <em>Entity2 Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity2 Class</em>'.
	 * @see express2ecore.Entity2Class
	 * @generated
	 */
	EClass getEntity2Class();

	/**
	 * Returns the meta object for class '{@link express2ecore.Schema2Package <em>Schema2 Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema2 Package</em>'.
	 * @see express2ecore.Schema2Package
	 * @generated
	 */
	EClass getSchema2Package();

	/**
	 * Returns the meta object for the reference '{@link express2ecore.Schema2Package#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Schema</em>'.
	 * @see express2ecore.Schema2Package#getSchema()
	 * @see #getSchema2Package()
	 * @generated
	 */
	EReference getSchema2Package_Schema();

	/**
	 * Returns the meta object for the reference '{@link express2ecore.Schema2Package#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Package</em>'.
	 * @see express2ecore.Schema2Package#getPackage()
	 * @see #getSchema2Package()
	 * @generated
	 */
	EReference getSchema2Package_Package();

	/**
	 * Returns the meta object for class '{@link express2ecore.Attribute2Feature <em>Attribute2 Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute2 Feature</em>'.
	 * @see express2ecore.Attribute2Feature
	 * @generated
	 */
	EClass getAttribute2Feature();

	/**
	 * Returns the meta object for the reference '{@link express2ecore.Attribute2Feature#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see express2ecore.Attribute2Feature#getAttribute()
	 * @see #getAttribute2Feature()
	 * @generated
	 */
	EReference getAttribute2Feature_Attribute();

	/**
	 * Returns the meta object for the reference '{@link express2ecore.Attribute2Feature#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see express2ecore.Attribute2Feature#getFeature()
	 * @see #getAttribute2Feature()
	 * @generated
	 */
	EReference getAttribute2Feature_Feature();

	/**
	 * Returns the meta object for class '{@link express2ecore.Attribute2Reference <em>Attribute2 Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute2 Reference</em>'.
	 * @see express2ecore.Attribute2Reference
	 * @generated
	 */
	EClass getAttribute2Reference();

	/**
	 * Returns the meta object for class '{@link express2ecore.Attribute2Attribute <em>Attribute2 Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute2 Attribute</em>'.
	 * @see express2ecore.Attribute2Attribute
	 * @generated
	 */
	EClass getAttribute2Attribute();

	/**
	 * Returns the meta object for class '{@link express2ecore.EntitySelect <em>Entity Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Select</em>'.
	 * @see express2ecore.EntitySelect
	 * @generated
	 */
	EClass getEntitySelect();

	/**
	 * Returns the meta object for class '{@link express2ecore.NonEntitySelect <em>Non Entity Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Entity Select</em>'.
	 * @see express2ecore.NonEntitySelect
	 * @generated
	 */
	EClass getNonEntitySelect();

	/**
	 * Returns the meta object for class '{@link express2ecore.SelectMember2Feature <em>Select Member2 Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select Member2 Feature</em>'.
	 * @see express2ecore.SelectMember2Feature
	 * @generated
	 */
	EClass getSelectMember2Feature();

	/**
	 * Returns the meta object for the reference '{@link express2ecore.SelectMember2Feature#getSelectType <em>Select Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Select Type</em>'.
	 * @see express2ecore.SelectMember2Feature#getSelectType()
	 * @see #getSelectMember2Feature()
	 * @generated
	 */
	EReference getSelectMember2Feature_SelectType();

	/**
	 * Returns the meta object for the reference '{@link express2ecore.SelectMember2Feature#getMemberType <em>Member Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Member Type</em>'.
	 * @see express2ecore.SelectMember2Feature#getMemberType()
	 * @see #getSelectMember2Feature()
	 * @generated
	 */
	EReference getSelectMember2Feature_MemberType();

	/**
	 * Returns the meta object for the reference '{@link express2ecore.SelectMember2Feature#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see express2ecore.SelectMember2Feature#getFeature()
	 * @see #getSelectMember2Feature()
	 * @generated
	 */
	EReference getSelectMember2Feature_Feature();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Express2ecoreFactory getExpress2ecoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link express2ecore.impl.TypeMapImpl <em>Type Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see express2ecore.impl.TypeMapImpl
		 * @see express2ecore.impl.Express2ecorePackageImpl#getTypeMap()
		 * @generated
		 */
		EClass TYPE_MAP = eINSTANCE.getTypeMap();

		/**
		 * The meta object literal for the '<em><b>Source Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MAP__SOURCE_TYPE = eINSTANCE.getTypeMap_SourceType();

		/**
		 * The meta object literal for the '<em><b>Target Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_MAP__TARGET_TYPE = eINSTANCE.getTypeMap_TargetType();

		/**
		 * The meta object literal for the '{@link express2ecore.impl.Entity2ClassImpl <em>Entity2 Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see express2ecore.impl.Entity2ClassImpl
		 * @see express2ecore.impl.Express2ecorePackageImpl#getEntity2Class()
		 * @generated
		 */
		EClass ENTITY2_CLASS = eINSTANCE.getEntity2Class();

		/**
		 * The meta object literal for the '{@link express2ecore.impl.Schema2PackageImpl <em>Schema2 Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see express2ecore.impl.Schema2PackageImpl
		 * @see express2ecore.impl.Express2ecorePackageImpl#getSchema2Package()
		 * @generated
		 */
		EClass SCHEMA2_PACKAGE = eINSTANCE.getSchema2Package();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA2_PACKAGE__SCHEMA = eINSTANCE.getSchema2Package_Schema();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA2_PACKAGE__PACKAGE = eINSTANCE.getSchema2Package_Package();

		/**
		 * The meta object literal for the '{@link express2ecore.impl.Attribute2FeatureImpl <em>Attribute2 Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see express2ecore.impl.Attribute2FeatureImpl
		 * @see express2ecore.impl.Express2ecorePackageImpl#getAttribute2Feature()
		 * @generated
		 */
		EClass ATTRIBUTE2_FEATURE = eINSTANCE.getAttribute2Feature();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE2_FEATURE__ATTRIBUTE = eINSTANCE.getAttribute2Feature_Attribute();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE2_FEATURE__FEATURE = eINSTANCE.getAttribute2Feature_Feature();

		/**
		 * The meta object literal for the '{@link express2ecore.impl.Attribute2ReferenceImpl <em>Attribute2 Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see express2ecore.impl.Attribute2ReferenceImpl
		 * @see express2ecore.impl.Express2ecorePackageImpl#getAttribute2Reference()
		 * @generated
		 */
		EClass ATTRIBUTE2_REFERENCE = eINSTANCE.getAttribute2Reference();

		/**
		 * The meta object literal for the '{@link express2ecore.impl.Attribute2AttributeImpl <em>Attribute2 Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see express2ecore.impl.Attribute2AttributeImpl
		 * @see express2ecore.impl.Express2ecorePackageImpl#getAttribute2Attribute()
		 * @generated
		 */
		EClass ATTRIBUTE2_ATTRIBUTE = eINSTANCE.getAttribute2Attribute();

		/**
		 * The meta object literal for the '{@link express2ecore.impl.EntitySelectImpl <em>Entity Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see express2ecore.impl.EntitySelectImpl
		 * @see express2ecore.impl.Express2ecorePackageImpl#getEntitySelect()
		 * @generated
		 */
		EClass ENTITY_SELECT = eINSTANCE.getEntitySelect();

		/**
		 * The meta object literal for the '{@link express2ecore.impl.NonEntitySelectImpl <em>Non Entity Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see express2ecore.impl.NonEntitySelectImpl
		 * @see express2ecore.impl.Express2ecorePackageImpl#getNonEntitySelect()
		 * @generated
		 */
		EClass NON_ENTITY_SELECT = eINSTANCE.getNonEntitySelect();

		/**
		 * The meta object literal for the '{@link express2ecore.impl.SelectMember2FeatureImpl <em>Select Member2 Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see express2ecore.impl.SelectMember2FeatureImpl
		 * @see express2ecore.impl.Express2ecorePackageImpl#getSelectMember2Feature()
		 * @generated
		 */
		EClass SELECT_MEMBER2_FEATURE = eINSTANCE.getSelectMember2Feature();

		/**
		 * The meta object literal for the '<em><b>Select Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_MEMBER2_FEATURE__SELECT_TYPE = eINSTANCE.getSelectMember2Feature_SelectType();

		/**
		 * The meta object literal for the '<em><b>Member Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_MEMBER2_FEATURE__MEMBER_TYPE = eINSTANCE.getSelectMember2Feature_MemberType();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT_MEMBER2_FEATURE__FEATURE = eINSTANCE.getSelectMember2Feature_Feature();

	}

} //Express2ecorePackage
