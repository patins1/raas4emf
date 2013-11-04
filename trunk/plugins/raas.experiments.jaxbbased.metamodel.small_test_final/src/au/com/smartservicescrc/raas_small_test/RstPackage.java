/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.com.smartservicescrc.raas_small_test;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see au.com.smartservicescrc.raas_small_test.RstFactory
 * @model kind="package"
 * @generated
 */
public interface RstPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "raas_small_test";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://smartservicescrc.com.au/raas/small_test";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rst";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RstPackage eINSTANCE = au.com.smartservicescrc.raas_small_test.impl.RstPackageImpl.init();

	/**
	 * The meta object id for the '{@link au.com.smartservicescrc.raas_small_test.impl.ReposRootImpl <em>Repos Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.com.smartservicescrc.raas_small_test.impl.ReposRootImpl
	 * @see au.com.smartservicescrc.raas_small_test.impl.RstPackageImpl#getReposRoot()
	 * @generated
	 */
	int REPOS_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Raas Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOS_ROOT__RAAS_REF = 0;

	/**
	 * The feature id for the '<em><b>Single Attr String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOS_ROOT__SINGLE_ATTR_STRING = 1;

	/**
	 * The feature id for the '<em><b>Multi Contain Class A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOS_ROOT__MULTI_CONTAIN_CLASS_A = 2;

	/**
	 * The feature id for the '<em><b>Optional Contain Class B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOS_ROOT__OPTIONAL_CONTAIN_CLASS_B = 3;

	/**
	 * The feature id for the '<em><b>Single Contain Class C</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOS_ROOT__SINGLE_CONTAIN_CLASS_C = 4;

	/**
	 * The feature id for the '<em><b>Multi Ref Class D</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOS_ROOT__MULTI_REF_CLASS_D = 5;

	/**
	 * The feature id for the '<em><b>Multi Attr String</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOS_ROOT__MULTI_ATTR_STRING = 6;

	/**
	 * The feature id for the '<em><b>Single Non Contain Class M</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOS_ROOT__SINGLE_NON_CONTAIN_CLASS_M = 7;

	/**
	 * The number of structural features of the '<em>Repos Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPOS_ROOT_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link au.com.smartservicescrc.raas_small_test.impl.TopClassAImpl <em>Top Class A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.com.smartservicescrc.raas_small_test.impl.TopClassAImpl
	 * @see au.com.smartservicescrc.raas_small_test.impl.RstPackageImpl#getTopClassA()
	 * @generated
	 */
	int TOP_CLASS_A = 1;

	/**
	 * The feature id for the '<em><b>Raas Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CLASS_A__RAAS_REF = 0;

	/**
	 * The feature id for the '<em><b>Multi Contain Class E</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CLASS_A__MULTI_CONTAIN_CLASS_E = 1;

	/**
	 * The feature id for the '<em><b>Single Contain Class F</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CLASS_A__SINGLE_CONTAIN_CLASS_F = 2;

	/**
	 * The number of structural features of the '<em>Top Class A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CLASS_A_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link au.com.smartservicescrc.raas_small_test.impl.TopClassBImpl <em>Top Class B</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.com.smartservicescrc.raas_small_test.impl.TopClassBImpl
	 * @see au.com.smartservicescrc.raas_small_test.impl.RstPackageImpl#getTopClassB()
	 * @generated
	 */
	int TOP_CLASS_B = 2;

	/**
	 * The feature id for the '<em><b>Raas Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CLASS_B__RAAS_REF = 0;

	/**
	 * The feature id for the '<em><b>Multi2lower Attr Int</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CLASS_B__MULTI2LOWER_ATTR_INT = 1;

	/**
	 * The feature id for the '<em><b>Single Attr Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CLASS_B__SINGLE_ATTR_INT = 2;

	/**
	 * The feature id for the '<em><b>Optional Attr Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CLASS_B__OPTIONAL_ATTR_INT = 3;

	/**
	 * The feature id for the '<em><b>Multi Ref Class E</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CLASS_B__MULTI_REF_CLASS_E = 4;

	/**
	 * The number of structural features of the '<em>Top Class B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CLASS_B_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link au.com.smartservicescrc.raas_small_test.impl.TopClassCImpl <em>Top Class C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.com.smartservicescrc.raas_small_test.impl.TopClassCImpl
	 * @see au.com.smartservicescrc.raas_small_test.impl.RstPackageImpl#getTopClassC()
	 * @generated
	 */
	int TOP_CLASS_C = 3;

	/**
	 * The feature id for the '<em><b>Raas Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CLASS_C__RAAS_REF = 0;

	/**
	 * The feature id for the '<em><b>Multi2lower Attr Int</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CLASS_C__MULTI2LOWER_ATTR_INT = 1;

	/**
	 * The feature id for the '<em><b>Single Attr Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CLASS_C__SINGLE_ATTR_INT = 2;

	/**
	 * The feature id for the '<em><b>Optional Attr Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CLASS_C__OPTIONAL_ATTR_INT = 3;

	/**
	 * The feature id for the '<em><b>Single Contain Class F</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CLASS_C__SINGLE_CONTAIN_CLASS_F = 4;

	/**
	 * The number of structural features of the '<em>Top Class C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CLASS_C_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link au.com.smartservicescrc.raas_small_test.impl.TopClassDImpl <em>Top Class D</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.com.smartservicescrc.raas_small_test.impl.TopClassDImpl
	 * @see au.com.smartservicescrc.raas_small_test.impl.RstPackageImpl#getTopClassD()
	 * @generated
	 */
	int TOP_CLASS_D = 4;

	/**
	 * The feature id for the '<em><b>Raas Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CLASS_D__RAAS_REF = 0;

	/**
	 * The feature id for the '<em><b>Multi2lower Attr Int</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CLASS_D__MULTI2LOWER_ATTR_INT = 1;

	/**
	 * The feature id for the '<em><b>Single Attr Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CLASS_D__SINGLE_ATTR_INT = 2;

	/**
	 * The feature id for the '<em><b>Optional Attr Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CLASS_D__OPTIONAL_ATTR_INT = 3;

	/**
	 * The feature id for the '<em><b>Optional Time Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CLASS_D__OPTIONAL_TIME_ZONE = 4;

	/**
	 * The number of structural features of the '<em>Top Class D</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CLASS_D_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link au.com.smartservicescrc.raas_small_test.impl.UnderClassEImpl <em>Under Class E</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.com.smartservicescrc.raas_small_test.impl.UnderClassEImpl
	 * @see au.com.smartservicescrc.raas_small_test.impl.RstPackageImpl#getUnderClassE()
	 * @generated
	 */
	int UNDER_CLASS_E = 5;

	/**
	 * The feature id for the '<em><b>Raas Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDER_CLASS_E__RAAS_REF = 0;

	/**
	 * The number of structural features of the '<em>Under Class E</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDER_CLASS_E_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link au.com.smartservicescrc.raas_small_test.impl.UnderClassFImpl <em>Under Class F</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.com.smartservicescrc.raas_small_test.impl.UnderClassFImpl
	 * @see au.com.smartservicescrc.raas_small_test.impl.RstPackageImpl#getUnderClassF()
	 * @generated
	 */
	int UNDER_CLASS_F = 6;

	/**
	 * The feature id for the '<em><b>Raas Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDER_CLASS_F__RAAS_REF = 0;

	/**
	 * The feature id for the '<em><b>Single Attr Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDER_CLASS_F__SINGLE_ATTR_INT = 1;

	/**
	 * The number of structural features of the '<em>Under Class F</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDER_CLASS_F_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link au.com.smartservicescrc.raas_small_test.impl.ThirdLevelClassJImpl <em>Third Level Class J</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.com.smartservicescrc.raas_small_test.impl.ThirdLevelClassJImpl
	 * @see au.com.smartservicescrc.raas_small_test.impl.RstPackageImpl#getThirdLevelClassJ()
	 * @generated
	 */
	int THIRD_LEVEL_CLASS_J = 7;

	/**
	 * The feature id for the '<em><b>Raas Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_LEVEL_CLASS_J__RAAS_REF = 0;

	/**
	 * The feature id for the '<em><b>Multi2lower Attr Int</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_LEVEL_CLASS_J__MULTI2LOWER_ATTR_INT = 1;

	/**
	 * The feature id for the '<em><b>Single Attr Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_LEVEL_CLASS_J__SINGLE_ATTR_INT = 2;

	/**
	 * The feature id for the '<em><b>Optional Attr Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_LEVEL_CLASS_J__OPTIONAL_ATTR_INT = 3;

	/**
	 * The feature id for the '<em><b>Optional Contain Class K</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_LEVEL_CLASS_J__OPTIONAL_CONTAIN_CLASS_K = 4;

	/**
	 * The number of structural features of the '<em>Third Level Class J</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THIRD_LEVEL_CLASS_J_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link au.com.smartservicescrc.raas_small_test.impl.FourthLevelClassKImpl <em>Fourth Level Class K</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.com.smartservicescrc.raas_small_test.impl.FourthLevelClassKImpl
	 * @see au.com.smartservicescrc.raas_small_test.impl.RstPackageImpl#getFourthLevelClassK()
	 * @generated
	 */
	int FOURTH_LEVEL_CLASS_K = 8;

	/**
	 * The feature id for the '<em><b>Raas Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOURTH_LEVEL_CLASS_K__RAAS_REF = 0;

	/**
	 * The feature id for the '<em><b>Multi2lower Attr Int</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOURTH_LEVEL_CLASS_K__MULTI2LOWER_ATTR_INT = 1;

	/**
	 * The feature id for the '<em><b>Single Attr Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOURTH_LEVEL_CLASS_K__SINGLE_ATTR_INT = 2;

	/**
	 * The feature id for the '<em><b>Optional Attr Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOURTH_LEVEL_CLASS_K__OPTIONAL_ATTR_INT = 3;

	/**
	 * The number of structural features of the '<em>Fourth Level Class K</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOURTH_LEVEL_CLASS_K_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link au.com.smartservicescrc.raas_small_test.impl.DerivedUnderClassE1Impl <em>Derived Under Class E1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.com.smartservicescrc.raas_small_test.impl.DerivedUnderClassE1Impl
	 * @see au.com.smartservicescrc.raas_small_test.impl.RstPackageImpl#getDerivedUnderClassE1()
	 * @generated
	 */
	int DERIVED_UNDER_CLASS_E1 = 9;

	/**
	 * The feature id for the '<em><b>Raas Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_UNDER_CLASS_E1__RAAS_REF = UNDER_CLASS_E__RAAS_REF;

	/**
	 * The feature id for the '<em><b>Single Ref Class D</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_UNDER_CLASS_E1__SINGLE_REF_CLASS_D = UNDER_CLASS_E_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Derived Under Class E1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_UNDER_CLASS_E1_FEATURE_COUNT = UNDER_CLASS_E_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link au.com.smartservicescrc.raas_small_test.impl.DerivedUnderClassE2Impl <em>Derived Under Class E2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.com.smartservicescrc.raas_small_test.impl.DerivedUnderClassE2Impl
	 * @see au.com.smartservicescrc.raas_small_test.impl.RstPackageImpl#getDerivedUnderClassE2()
	 * @generated
	 */
	int DERIVED_UNDER_CLASS_E2 = 10;

	/**
	 * The feature id for the '<em><b>Raas Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_UNDER_CLASS_E2__RAAS_REF = UNDER_CLASS_E__RAAS_REF;

	/**
	 * The feature id for the '<em><b>Multi Contain Class J</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_UNDER_CLASS_E2__MULTI_CONTAIN_CLASS_J = UNDER_CLASS_E_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Derived Under Class E2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_UNDER_CLASS_E2_FEATURE_COUNT = UNDER_CLASS_E_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link au.com.smartservicescrc.raas_small_test.impl.TopClassMImpl <em>Top Class M</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.com.smartservicescrc.raas_small_test.impl.TopClassMImpl
	 * @see au.com.smartservicescrc.raas_small_test.impl.RstPackageImpl#getTopClassM()
	 * @generated
	 */
	int TOP_CLASS_M = 11;

	/**
	 * The feature id for the '<em><b>Raas Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CLASS_M__RAAS_REF = UNDER_CLASS_E__RAAS_REF;

	/**
	 * The feature id for the '<em><b>Single Attr Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CLASS_M__SINGLE_ATTR_INT = UNDER_CLASS_E_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Top Class M</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_CLASS_M_FEATURE_COUNT = UNDER_CLASS_E_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link au.com.smartservicescrc.raas_small_test.impl.MergingE1AndE2Impl <em>Merging E1 And E2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see au.com.smartservicescrc.raas_small_test.impl.MergingE1AndE2Impl
	 * @see au.com.smartservicescrc.raas_small_test.impl.RstPackageImpl#getMergingE1AndE2()
	 * @generated
	 */
	int MERGING_E1_AND_E2 = 12;

	/**
	 * The feature id for the '<em><b>Raas Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_E1_AND_E2__RAAS_REF = DERIVED_UNDER_CLASS_E1__RAAS_REF;

	/**
	 * The feature id for the '<em><b>Single Ref Class D</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_E1_AND_E2__SINGLE_REF_CLASS_D = DERIVED_UNDER_CLASS_E1__SINGLE_REF_CLASS_D;

	/**
	 * The feature id for the '<em><b>Multi Contain Class J</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_E1_AND_E2__MULTI_CONTAIN_CLASS_J = DERIVED_UNDER_CLASS_E1_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Optional Attr String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_E1_AND_E2__OPTIONAL_ATTR_STRING = DERIVED_UNDER_CLASS_E1_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Merging E1 And E2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGING_E1_AND_E2_FEATURE_COUNT = DERIVED_UNDER_CLASS_E1_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '<em>Time Zone</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.TimeZone
	 * @see au.com.smartservicescrc.raas_small_test.impl.RstPackageImpl#getTimeZone()
	 * @generated
	 */
	int TIME_ZONE = 13;


	/**
	 * Returns the meta object for class '{@link au.com.smartservicescrc.raas_small_test.ReposRoot <em>Repos Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Repos Root</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.ReposRoot
	 * @generated
	 */
	EClass getReposRoot();

	/**
	 * Returns the meta object for the attribute '{@link au.com.smartservicescrc.raas_small_test.ReposRoot#getRaasRef <em>Raas Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raas Ref</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.ReposRoot#getRaasRef()
	 * @see #getReposRoot()
	 * @generated
	 */
	EAttribute getReposRoot_RaasRef();

	/**
	 * Returns the meta object for the attribute '{@link au.com.smartservicescrc.raas_small_test.ReposRoot#getSingleAttrString <em>Single Attr String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Single Attr String</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.ReposRoot#getSingleAttrString()
	 * @see #getReposRoot()
	 * @generated
	 */
	EAttribute getReposRoot_SingleAttrString();

	/**
	 * Returns the meta object for the containment reference list '{@link au.com.smartservicescrc.raas_small_test.ReposRoot#getMultiContainClassA <em>Multi Contain Class A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Multi Contain Class A</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.ReposRoot#getMultiContainClassA()
	 * @see #getReposRoot()
	 * @generated
	 */
	EReference getReposRoot_MultiContainClassA();

	/**
	 * Returns the meta object for the containment reference '{@link au.com.smartservicescrc.raas_small_test.ReposRoot#getOptionalContainClassB <em>Optional Contain Class B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Optional Contain Class B</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.ReposRoot#getOptionalContainClassB()
	 * @see #getReposRoot()
	 * @generated
	 */
	EReference getReposRoot_OptionalContainClassB();

	/**
	 * Returns the meta object for the containment reference '{@link au.com.smartservicescrc.raas_small_test.ReposRoot#getSingleContainClassC <em>Single Contain Class C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Single Contain Class C</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.ReposRoot#getSingleContainClassC()
	 * @see #getReposRoot()
	 * @generated
	 */
	EReference getReposRoot_SingleContainClassC();

	/**
	 * Returns the meta object for the reference list '{@link au.com.smartservicescrc.raas_small_test.ReposRoot#getMultiRefClassD <em>Multi Ref Class D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Multi Ref Class D</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.ReposRoot#getMultiRefClassD()
	 * @see #getReposRoot()
	 * @generated
	 */
	EReference getReposRoot_MultiRefClassD();

	/**
	 * Returns the meta object for the attribute list '{@link au.com.smartservicescrc.raas_small_test.ReposRoot#getMultiAttrString <em>Multi Attr String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Multi Attr String</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.ReposRoot#getMultiAttrString()
	 * @see #getReposRoot()
	 * @generated
	 */
	EAttribute getReposRoot_MultiAttrString();

	/**
	 * Returns the meta object for the reference '{@link au.com.smartservicescrc.raas_small_test.ReposRoot#getSingleNonContainClassM <em>Single Non Contain Class M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Single Non Contain Class M</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.ReposRoot#getSingleNonContainClassM()
	 * @see #getReposRoot()
	 * @generated
	 */
	EReference getReposRoot_SingleNonContainClassM();

	/**
	 * Returns the meta object for class '{@link au.com.smartservicescrc.raas_small_test.TopClassA <em>Top Class A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Top Class A</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.TopClassA
	 * @generated
	 */
	EClass getTopClassA();

	/**
	 * Returns the meta object for the attribute '{@link au.com.smartservicescrc.raas_small_test.TopClassA#getRaasRef <em>Raas Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raas Ref</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.TopClassA#getRaasRef()
	 * @see #getTopClassA()
	 * @generated
	 */
	EAttribute getTopClassA_RaasRef();

	/**
	 * Returns the meta object for the containment reference list '{@link au.com.smartservicescrc.raas_small_test.TopClassA#getMultiContainClassE <em>Multi Contain Class E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Multi Contain Class E</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.TopClassA#getMultiContainClassE()
	 * @see #getTopClassA()
	 * @generated
	 */
	EReference getTopClassA_MultiContainClassE();

	/**
	 * Returns the meta object for the containment reference '{@link au.com.smartservicescrc.raas_small_test.TopClassA#getSingleContainClassF <em>Single Contain Class F</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Single Contain Class F</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.TopClassA#getSingleContainClassF()
	 * @see #getTopClassA()
	 * @generated
	 */
	EReference getTopClassA_SingleContainClassF();

	/**
	 * Returns the meta object for class '{@link au.com.smartservicescrc.raas_small_test.TopClassB <em>Top Class B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Top Class B</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.TopClassB
	 * @generated
	 */
	EClass getTopClassB();

	/**
	 * Returns the meta object for the attribute '{@link au.com.smartservicescrc.raas_small_test.TopClassB#getRaasRef <em>Raas Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raas Ref</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.TopClassB#getRaasRef()
	 * @see #getTopClassB()
	 * @generated
	 */
	EAttribute getTopClassB_RaasRef();

	/**
	 * Returns the meta object for the attribute list '{@link au.com.smartservicescrc.raas_small_test.TopClassB#getMulti2lowerAttrInt <em>Multi2lower Attr Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Multi2lower Attr Int</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.TopClassB#getMulti2lowerAttrInt()
	 * @see #getTopClassB()
	 * @generated
	 */
	EAttribute getTopClassB_Multi2lowerAttrInt();

	/**
	 * Returns the meta object for the attribute '{@link au.com.smartservicescrc.raas_small_test.TopClassB#getSingleAttrInt <em>Single Attr Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Single Attr Int</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.TopClassB#getSingleAttrInt()
	 * @see #getTopClassB()
	 * @generated
	 */
	EAttribute getTopClassB_SingleAttrInt();

	/**
	 * Returns the meta object for the attribute '{@link au.com.smartservicescrc.raas_small_test.TopClassB#getOptionalAttrInt <em>Optional Attr Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional Attr Int</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.TopClassB#getOptionalAttrInt()
	 * @see #getTopClassB()
	 * @generated
	 */
	EAttribute getTopClassB_OptionalAttrInt();

	/**
	 * Returns the meta object for the reference list '{@link au.com.smartservicescrc.raas_small_test.TopClassB#getMultiRefClassE <em>Multi Ref Class E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Multi Ref Class E</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.TopClassB#getMultiRefClassE()
	 * @see #getTopClassB()
	 * @generated
	 */
	EReference getTopClassB_MultiRefClassE();

	/**
	 * Returns the meta object for class '{@link au.com.smartservicescrc.raas_small_test.TopClassC <em>Top Class C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Top Class C</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.TopClassC
	 * @generated
	 */
	EClass getTopClassC();

	/**
	 * Returns the meta object for the attribute '{@link au.com.smartservicescrc.raas_small_test.TopClassC#getRaasRef <em>Raas Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raas Ref</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.TopClassC#getRaasRef()
	 * @see #getTopClassC()
	 * @generated
	 */
	EAttribute getTopClassC_RaasRef();

	/**
	 * Returns the meta object for the attribute list '{@link au.com.smartservicescrc.raas_small_test.TopClassC#getMulti2lowerAttrInt <em>Multi2lower Attr Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Multi2lower Attr Int</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.TopClassC#getMulti2lowerAttrInt()
	 * @see #getTopClassC()
	 * @generated
	 */
	EAttribute getTopClassC_Multi2lowerAttrInt();

	/**
	 * Returns the meta object for the attribute '{@link au.com.smartservicescrc.raas_small_test.TopClassC#getSingleAttrInt <em>Single Attr Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Single Attr Int</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.TopClassC#getSingleAttrInt()
	 * @see #getTopClassC()
	 * @generated
	 */
	EAttribute getTopClassC_SingleAttrInt();

	/**
	 * Returns the meta object for the attribute '{@link au.com.smartservicescrc.raas_small_test.TopClassC#getOptionalAttrInt <em>Optional Attr Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional Attr Int</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.TopClassC#getOptionalAttrInt()
	 * @see #getTopClassC()
	 * @generated
	 */
	EAttribute getTopClassC_OptionalAttrInt();

	/**
	 * Returns the meta object for the containment reference '{@link au.com.smartservicescrc.raas_small_test.TopClassC#getSingleContainClassF <em>Single Contain Class F</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Single Contain Class F</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.TopClassC#getSingleContainClassF()
	 * @see #getTopClassC()
	 * @generated
	 */
	EReference getTopClassC_SingleContainClassF();

	/**
	 * Returns the meta object for class '{@link au.com.smartservicescrc.raas_small_test.TopClassD <em>Top Class D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Top Class D</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.TopClassD
	 * @generated
	 */
	EClass getTopClassD();

	/**
	 * Returns the meta object for the attribute '{@link au.com.smartservicescrc.raas_small_test.TopClassD#getRaasRef <em>Raas Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raas Ref</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.TopClassD#getRaasRef()
	 * @see #getTopClassD()
	 * @generated
	 */
	EAttribute getTopClassD_RaasRef();

	/**
	 * Returns the meta object for the attribute list '{@link au.com.smartservicescrc.raas_small_test.TopClassD#getMulti2lowerAttrInt <em>Multi2lower Attr Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Multi2lower Attr Int</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.TopClassD#getMulti2lowerAttrInt()
	 * @see #getTopClassD()
	 * @generated
	 */
	EAttribute getTopClassD_Multi2lowerAttrInt();

	/**
	 * Returns the meta object for the attribute '{@link au.com.smartservicescrc.raas_small_test.TopClassD#getSingleAttrInt <em>Single Attr Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Single Attr Int</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.TopClassD#getSingleAttrInt()
	 * @see #getTopClassD()
	 * @generated
	 */
	EAttribute getTopClassD_SingleAttrInt();

	/**
	 * Returns the meta object for the attribute '{@link au.com.smartservicescrc.raas_small_test.TopClassD#getOptionalAttrInt <em>Optional Attr Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional Attr Int</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.TopClassD#getOptionalAttrInt()
	 * @see #getTopClassD()
	 * @generated
	 */
	EAttribute getTopClassD_OptionalAttrInt();

	/**
	 * Returns the meta object for the attribute '{@link au.com.smartservicescrc.raas_small_test.TopClassD#getOptionalTimeZone <em>Optional Time Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional Time Zone</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.TopClassD#getOptionalTimeZone()
	 * @see #getTopClassD()
	 * @generated
	 */
	EAttribute getTopClassD_OptionalTimeZone();

	/**
	 * Returns the meta object for class '{@link au.com.smartservicescrc.raas_small_test.UnderClassE <em>Under Class E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Under Class E</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.UnderClassE
	 * @generated
	 */
	EClass getUnderClassE();

	/**
	 * Returns the meta object for the attribute '{@link au.com.smartservicescrc.raas_small_test.UnderClassE#getRaasRef <em>Raas Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raas Ref</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.UnderClassE#getRaasRef()
	 * @see #getUnderClassE()
	 * @generated
	 */
	EAttribute getUnderClassE_RaasRef();

	/**
	 * Returns the meta object for class '{@link au.com.smartservicescrc.raas_small_test.UnderClassF <em>Under Class F</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Under Class F</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.UnderClassF
	 * @generated
	 */
	EClass getUnderClassF();

	/**
	 * Returns the meta object for the attribute '{@link au.com.smartservicescrc.raas_small_test.UnderClassF#getRaasRef <em>Raas Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raas Ref</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.UnderClassF#getRaasRef()
	 * @see #getUnderClassF()
	 * @generated
	 */
	EAttribute getUnderClassF_RaasRef();

	/**
	 * Returns the meta object for the attribute '{@link au.com.smartservicescrc.raas_small_test.UnderClassF#getSingleAttrInt <em>Single Attr Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Single Attr Int</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.UnderClassF#getSingleAttrInt()
	 * @see #getUnderClassF()
	 * @generated
	 */
	EAttribute getUnderClassF_SingleAttrInt();

	/**
	 * Returns the meta object for class '{@link au.com.smartservicescrc.raas_small_test.ThirdLevelClassJ <em>Third Level Class J</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Third Level Class J</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.ThirdLevelClassJ
	 * @generated
	 */
	EClass getThirdLevelClassJ();

	/**
	 * Returns the meta object for the attribute '{@link au.com.smartservicescrc.raas_small_test.ThirdLevelClassJ#getRaasRef <em>Raas Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raas Ref</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.ThirdLevelClassJ#getRaasRef()
	 * @see #getThirdLevelClassJ()
	 * @generated
	 */
	EAttribute getThirdLevelClassJ_RaasRef();

	/**
	 * Returns the meta object for the attribute list '{@link au.com.smartservicescrc.raas_small_test.ThirdLevelClassJ#getMulti2lowerAttrInt <em>Multi2lower Attr Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Multi2lower Attr Int</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.ThirdLevelClassJ#getMulti2lowerAttrInt()
	 * @see #getThirdLevelClassJ()
	 * @generated
	 */
	EAttribute getThirdLevelClassJ_Multi2lowerAttrInt();

	/**
	 * Returns the meta object for the attribute '{@link au.com.smartservicescrc.raas_small_test.ThirdLevelClassJ#getSingleAttrInt <em>Single Attr Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Single Attr Int</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.ThirdLevelClassJ#getSingleAttrInt()
	 * @see #getThirdLevelClassJ()
	 * @generated
	 */
	EAttribute getThirdLevelClassJ_SingleAttrInt();

	/**
	 * Returns the meta object for the attribute '{@link au.com.smartservicescrc.raas_small_test.ThirdLevelClassJ#getOptionalAttrInt <em>Optional Attr Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional Attr Int</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.ThirdLevelClassJ#getOptionalAttrInt()
	 * @see #getThirdLevelClassJ()
	 * @generated
	 */
	EAttribute getThirdLevelClassJ_OptionalAttrInt();

	/**
	 * Returns the meta object for the containment reference '{@link au.com.smartservicescrc.raas_small_test.ThirdLevelClassJ#getOptionalContainClassK <em>Optional Contain Class K</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Optional Contain Class K</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.ThirdLevelClassJ#getOptionalContainClassK()
	 * @see #getThirdLevelClassJ()
	 * @generated
	 */
	EReference getThirdLevelClassJ_OptionalContainClassK();

	/**
	 * Returns the meta object for class '{@link au.com.smartservicescrc.raas_small_test.FourthLevelClassK <em>Fourth Level Class K</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fourth Level Class K</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.FourthLevelClassK
	 * @generated
	 */
	EClass getFourthLevelClassK();

	/**
	 * Returns the meta object for the attribute '{@link au.com.smartservicescrc.raas_small_test.FourthLevelClassK#getRaasRef <em>Raas Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Raas Ref</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.FourthLevelClassK#getRaasRef()
	 * @see #getFourthLevelClassK()
	 * @generated
	 */
	EAttribute getFourthLevelClassK_RaasRef();

	/**
	 * Returns the meta object for the attribute list '{@link au.com.smartservicescrc.raas_small_test.FourthLevelClassK#getMulti2lowerAttrInt <em>Multi2lower Attr Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Multi2lower Attr Int</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.FourthLevelClassK#getMulti2lowerAttrInt()
	 * @see #getFourthLevelClassK()
	 * @generated
	 */
	EAttribute getFourthLevelClassK_Multi2lowerAttrInt();

	/**
	 * Returns the meta object for the attribute '{@link au.com.smartservicescrc.raas_small_test.FourthLevelClassK#getSingleAttrInt <em>Single Attr Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Single Attr Int</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.FourthLevelClassK#getSingleAttrInt()
	 * @see #getFourthLevelClassK()
	 * @generated
	 */
	EAttribute getFourthLevelClassK_SingleAttrInt();

	/**
	 * Returns the meta object for the attribute '{@link au.com.smartservicescrc.raas_small_test.FourthLevelClassK#getOptionalAttrInt <em>Optional Attr Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional Attr Int</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.FourthLevelClassK#getOptionalAttrInt()
	 * @see #getFourthLevelClassK()
	 * @generated
	 */
	EAttribute getFourthLevelClassK_OptionalAttrInt();

	/**
	 * Returns the meta object for class '{@link au.com.smartservicescrc.raas_small_test.DerivedUnderClassE1 <em>Derived Under Class E1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Under Class E1</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.DerivedUnderClassE1
	 * @generated
	 */
	EClass getDerivedUnderClassE1();

	/**
	 * Returns the meta object for the reference '{@link au.com.smartservicescrc.raas_small_test.DerivedUnderClassE1#getSingleRefClassD <em>Single Ref Class D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Single Ref Class D</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.DerivedUnderClassE1#getSingleRefClassD()
	 * @see #getDerivedUnderClassE1()
	 * @generated
	 */
	EReference getDerivedUnderClassE1_SingleRefClassD();

	/**
	 * Returns the meta object for class '{@link au.com.smartservicescrc.raas_small_test.DerivedUnderClassE2 <em>Derived Under Class E2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Under Class E2</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.DerivedUnderClassE2
	 * @generated
	 */
	EClass getDerivedUnderClassE2();

	/**
	 * Returns the meta object for the containment reference list '{@link au.com.smartservicescrc.raas_small_test.DerivedUnderClassE2#getMultiContainClassJ <em>Multi Contain Class J</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Multi Contain Class J</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.DerivedUnderClassE2#getMultiContainClassJ()
	 * @see #getDerivedUnderClassE2()
	 * @generated
	 */
	EReference getDerivedUnderClassE2_MultiContainClassJ();

	/**
	 * Returns the meta object for class '{@link au.com.smartservicescrc.raas_small_test.TopClassM <em>Top Class M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Top Class M</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.TopClassM
	 * @generated
	 */
	EClass getTopClassM();

	/**
	 * Returns the meta object for the attribute '{@link au.com.smartservicescrc.raas_small_test.TopClassM#getSingleAttrInt <em>Single Attr Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Single Attr Int</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.TopClassM#getSingleAttrInt()
	 * @see #getTopClassM()
	 * @generated
	 */
	EAttribute getTopClassM_SingleAttrInt();

	/**
	 * Returns the meta object for class '{@link au.com.smartservicescrc.raas_small_test.MergingE1AndE2 <em>Merging E1 And E2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merging E1 And E2</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.MergingE1AndE2
	 * @generated
	 */
	EClass getMergingE1AndE2();

	/**
	 * Returns the meta object for the attribute '{@link au.com.smartservicescrc.raas_small_test.MergingE1AndE2#getOptionalAttrString <em>Optional Attr String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional Attr String</em>'.
	 * @see au.com.smartservicescrc.raas_small_test.MergingE1AndE2#getOptionalAttrString()
	 * @see #getMergingE1AndE2()
	 * @generated
	 */
	EAttribute getMergingE1AndE2_OptionalAttrString();

	/**
	 * Returns the meta object for data type '{@link java.util.TimeZone <em>Time Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Zone</em>'.
	 * @see java.util.TimeZone
	 * @model instanceClass="java.util.TimeZone"
	 * @generated
	 */
	EDataType getTimeZone();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RstFactory getRstFactory();

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
		 * The meta object literal for the '{@link au.com.smartservicescrc.raas_small_test.impl.ReposRootImpl <em>Repos Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.com.smartservicescrc.raas_small_test.impl.ReposRootImpl
		 * @see au.com.smartservicescrc.raas_small_test.impl.RstPackageImpl#getReposRoot()
		 * @generated
		 */
		EClass REPOS_ROOT = eINSTANCE.getReposRoot();

		/**
		 * The meta object literal for the '<em><b>Raas Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOS_ROOT__RAAS_REF = eINSTANCE.getReposRoot_RaasRef();

		/**
		 * The meta object literal for the '<em><b>Single Attr String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOS_ROOT__SINGLE_ATTR_STRING = eINSTANCE.getReposRoot_SingleAttrString();

		/**
		 * The meta object literal for the '<em><b>Multi Contain Class A</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOS_ROOT__MULTI_CONTAIN_CLASS_A = eINSTANCE.getReposRoot_MultiContainClassA();

		/**
		 * The meta object literal for the '<em><b>Optional Contain Class B</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOS_ROOT__OPTIONAL_CONTAIN_CLASS_B = eINSTANCE.getReposRoot_OptionalContainClassB();

		/**
		 * The meta object literal for the '<em><b>Single Contain Class C</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOS_ROOT__SINGLE_CONTAIN_CLASS_C = eINSTANCE.getReposRoot_SingleContainClassC();

		/**
		 * The meta object literal for the '<em><b>Multi Ref Class D</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOS_ROOT__MULTI_REF_CLASS_D = eINSTANCE.getReposRoot_MultiRefClassD();

		/**
		 * The meta object literal for the '<em><b>Multi Attr String</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPOS_ROOT__MULTI_ATTR_STRING = eINSTANCE.getReposRoot_MultiAttrString();

		/**
		 * The meta object literal for the '<em><b>Single Non Contain Class M</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPOS_ROOT__SINGLE_NON_CONTAIN_CLASS_M = eINSTANCE.getReposRoot_SingleNonContainClassM();

		/**
		 * The meta object literal for the '{@link au.com.smartservicescrc.raas_small_test.impl.TopClassAImpl <em>Top Class A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.com.smartservicescrc.raas_small_test.impl.TopClassAImpl
		 * @see au.com.smartservicescrc.raas_small_test.impl.RstPackageImpl#getTopClassA()
		 * @generated
		 */
		EClass TOP_CLASS_A = eINSTANCE.getTopClassA();

		/**
		 * The meta object literal for the '<em><b>Raas Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOP_CLASS_A__RAAS_REF = eINSTANCE.getTopClassA_RaasRef();

		/**
		 * The meta object literal for the '<em><b>Multi Contain Class E</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOP_CLASS_A__MULTI_CONTAIN_CLASS_E = eINSTANCE.getTopClassA_MultiContainClassE();

		/**
		 * The meta object literal for the '<em><b>Single Contain Class F</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOP_CLASS_A__SINGLE_CONTAIN_CLASS_F = eINSTANCE.getTopClassA_SingleContainClassF();

		/**
		 * The meta object literal for the '{@link au.com.smartservicescrc.raas_small_test.impl.TopClassBImpl <em>Top Class B</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.com.smartservicescrc.raas_small_test.impl.TopClassBImpl
		 * @see au.com.smartservicescrc.raas_small_test.impl.RstPackageImpl#getTopClassB()
		 * @generated
		 */
		EClass TOP_CLASS_B = eINSTANCE.getTopClassB();

		/**
		 * The meta object literal for the '<em><b>Raas Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOP_CLASS_B__RAAS_REF = eINSTANCE.getTopClassB_RaasRef();

		/**
		 * The meta object literal for the '<em><b>Multi2lower Attr Int</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOP_CLASS_B__MULTI2LOWER_ATTR_INT = eINSTANCE.getTopClassB_Multi2lowerAttrInt();

		/**
		 * The meta object literal for the '<em><b>Single Attr Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOP_CLASS_B__SINGLE_ATTR_INT = eINSTANCE.getTopClassB_SingleAttrInt();

		/**
		 * The meta object literal for the '<em><b>Optional Attr Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOP_CLASS_B__OPTIONAL_ATTR_INT = eINSTANCE.getTopClassB_OptionalAttrInt();

		/**
		 * The meta object literal for the '<em><b>Multi Ref Class E</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOP_CLASS_B__MULTI_REF_CLASS_E = eINSTANCE.getTopClassB_MultiRefClassE();

		/**
		 * The meta object literal for the '{@link au.com.smartservicescrc.raas_small_test.impl.TopClassCImpl <em>Top Class C</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.com.smartservicescrc.raas_small_test.impl.TopClassCImpl
		 * @see au.com.smartservicescrc.raas_small_test.impl.RstPackageImpl#getTopClassC()
		 * @generated
		 */
		EClass TOP_CLASS_C = eINSTANCE.getTopClassC();

		/**
		 * The meta object literal for the '<em><b>Raas Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOP_CLASS_C__RAAS_REF = eINSTANCE.getTopClassC_RaasRef();

		/**
		 * The meta object literal for the '<em><b>Multi2lower Attr Int</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOP_CLASS_C__MULTI2LOWER_ATTR_INT = eINSTANCE.getTopClassC_Multi2lowerAttrInt();

		/**
		 * The meta object literal for the '<em><b>Single Attr Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOP_CLASS_C__SINGLE_ATTR_INT = eINSTANCE.getTopClassC_SingleAttrInt();

		/**
		 * The meta object literal for the '<em><b>Optional Attr Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOP_CLASS_C__OPTIONAL_ATTR_INT = eINSTANCE.getTopClassC_OptionalAttrInt();

		/**
		 * The meta object literal for the '<em><b>Single Contain Class F</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOP_CLASS_C__SINGLE_CONTAIN_CLASS_F = eINSTANCE.getTopClassC_SingleContainClassF();

		/**
		 * The meta object literal for the '{@link au.com.smartservicescrc.raas_small_test.impl.TopClassDImpl <em>Top Class D</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.com.smartservicescrc.raas_small_test.impl.TopClassDImpl
		 * @see au.com.smartservicescrc.raas_small_test.impl.RstPackageImpl#getTopClassD()
		 * @generated
		 */
		EClass TOP_CLASS_D = eINSTANCE.getTopClassD();

		/**
		 * The meta object literal for the '<em><b>Raas Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOP_CLASS_D__RAAS_REF = eINSTANCE.getTopClassD_RaasRef();

		/**
		 * The meta object literal for the '<em><b>Multi2lower Attr Int</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOP_CLASS_D__MULTI2LOWER_ATTR_INT = eINSTANCE.getTopClassD_Multi2lowerAttrInt();

		/**
		 * The meta object literal for the '<em><b>Single Attr Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOP_CLASS_D__SINGLE_ATTR_INT = eINSTANCE.getTopClassD_SingleAttrInt();

		/**
		 * The meta object literal for the '<em><b>Optional Attr Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOP_CLASS_D__OPTIONAL_ATTR_INT = eINSTANCE.getTopClassD_OptionalAttrInt();

		/**
		 * The meta object literal for the '<em><b>Optional Time Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOP_CLASS_D__OPTIONAL_TIME_ZONE = eINSTANCE.getTopClassD_OptionalTimeZone();

		/**
		 * The meta object literal for the '{@link au.com.smartservicescrc.raas_small_test.impl.UnderClassEImpl <em>Under Class E</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.com.smartservicescrc.raas_small_test.impl.UnderClassEImpl
		 * @see au.com.smartservicescrc.raas_small_test.impl.RstPackageImpl#getUnderClassE()
		 * @generated
		 */
		EClass UNDER_CLASS_E = eINSTANCE.getUnderClassE();

		/**
		 * The meta object literal for the '<em><b>Raas Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNDER_CLASS_E__RAAS_REF = eINSTANCE.getUnderClassE_RaasRef();

		/**
		 * The meta object literal for the '{@link au.com.smartservicescrc.raas_small_test.impl.UnderClassFImpl <em>Under Class F</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.com.smartservicescrc.raas_small_test.impl.UnderClassFImpl
		 * @see au.com.smartservicescrc.raas_small_test.impl.RstPackageImpl#getUnderClassF()
		 * @generated
		 */
		EClass UNDER_CLASS_F = eINSTANCE.getUnderClassF();

		/**
		 * The meta object literal for the '<em><b>Raas Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNDER_CLASS_F__RAAS_REF = eINSTANCE.getUnderClassF_RaasRef();

		/**
		 * The meta object literal for the '<em><b>Single Attr Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNDER_CLASS_F__SINGLE_ATTR_INT = eINSTANCE.getUnderClassF_SingleAttrInt();

		/**
		 * The meta object literal for the '{@link au.com.smartservicescrc.raas_small_test.impl.ThirdLevelClassJImpl <em>Third Level Class J</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.com.smartservicescrc.raas_small_test.impl.ThirdLevelClassJImpl
		 * @see au.com.smartservicescrc.raas_small_test.impl.RstPackageImpl#getThirdLevelClassJ()
		 * @generated
		 */
		EClass THIRD_LEVEL_CLASS_J = eINSTANCE.getThirdLevelClassJ();

		/**
		 * The meta object literal for the '<em><b>Raas Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THIRD_LEVEL_CLASS_J__RAAS_REF = eINSTANCE.getThirdLevelClassJ_RaasRef();

		/**
		 * The meta object literal for the '<em><b>Multi2lower Attr Int</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THIRD_LEVEL_CLASS_J__MULTI2LOWER_ATTR_INT = eINSTANCE.getThirdLevelClassJ_Multi2lowerAttrInt();

		/**
		 * The meta object literal for the '<em><b>Single Attr Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THIRD_LEVEL_CLASS_J__SINGLE_ATTR_INT = eINSTANCE.getThirdLevelClassJ_SingleAttrInt();

		/**
		 * The meta object literal for the '<em><b>Optional Attr Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THIRD_LEVEL_CLASS_J__OPTIONAL_ATTR_INT = eINSTANCE.getThirdLevelClassJ_OptionalAttrInt();

		/**
		 * The meta object literal for the '<em><b>Optional Contain Class K</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THIRD_LEVEL_CLASS_J__OPTIONAL_CONTAIN_CLASS_K = eINSTANCE.getThirdLevelClassJ_OptionalContainClassK();

		/**
		 * The meta object literal for the '{@link au.com.smartservicescrc.raas_small_test.impl.FourthLevelClassKImpl <em>Fourth Level Class K</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.com.smartservicescrc.raas_small_test.impl.FourthLevelClassKImpl
		 * @see au.com.smartservicescrc.raas_small_test.impl.RstPackageImpl#getFourthLevelClassK()
		 * @generated
		 */
		EClass FOURTH_LEVEL_CLASS_K = eINSTANCE.getFourthLevelClassK();

		/**
		 * The meta object literal for the '<em><b>Raas Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOURTH_LEVEL_CLASS_K__RAAS_REF = eINSTANCE.getFourthLevelClassK_RaasRef();

		/**
		 * The meta object literal for the '<em><b>Multi2lower Attr Int</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOURTH_LEVEL_CLASS_K__MULTI2LOWER_ATTR_INT = eINSTANCE.getFourthLevelClassK_Multi2lowerAttrInt();

		/**
		 * The meta object literal for the '<em><b>Single Attr Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOURTH_LEVEL_CLASS_K__SINGLE_ATTR_INT = eINSTANCE.getFourthLevelClassK_SingleAttrInt();

		/**
		 * The meta object literal for the '<em><b>Optional Attr Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOURTH_LEVEL_CLASS_K__OPTIONAL_ATTR_INT = eINSTANCE.getFourthLevelClassK_OptionalAttrInt();

		/**
		 * The meta object literal for the '{@link au.com.smartservicescrc.raas_small_test.impl.DerivedUnderClassE1Impl <em>Derived Under Class E1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.com.smartservicescrc.raas_small_test.impl.DerivedUnderClassE1Impl
		 * @see au.com.smartservicescrc.raas_small_test.impl.RstPackageImpl#getDerivedUnderClassE1()
		 * @generated
		 */
		EClass DERIVED_UNDER_CLASS_E1 = eINSTANCE.getDerivedUnderClassE1();

		/**
		 * The meta object literal for the '<em><b>Single Ref Class D</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVED_UNDER_CLASS_E1__SINGLE_REF_CLASS_D = eINSTANCE.getDerivedUnderClassE1_SingleRefClassD();

		/**
		 * The meta object literal for the '{@link au.com.smartservicescrc.raas_small_test.impl.DerivedUnderClassE2Impl <em>Derived Under Class E2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.com.smartservicescrc.raas_small_test.impl.DerivedUnderClassE2Impl
		 * @see au.com.smartservicescrc.raas_small_test.impl.RstPackageImpl#getDerivedUnderClassE2()
		 * @generated
		 */
		EClass DERIVED_UNDER_CLASS_E2 = eINSTANCE.getDerivedUnderClassE2();

		/**
		 * The meta object literal for the '<em><b>Multi Contain Class J</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVED_UNDER_CLASS_E2__MULTI_CONTAIN_CLASS_J = eINSTANCE.getDerivedUnderClassE2_MultiContainClassJ();

		/**
		 * The meta object literal for the '{@link au.com.smartservicescrc.raas_small_test.impl.TopClassMImpl <em>Top Class M</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.com.smartservicescrc.raas_small_test.impl.TopClassMImpl
		 * @see au.com.smartservicescrc.raas_small_test.impl.RstPackageImpl#getTopClassM()
		 * @generated
		 */
		EClass TOP_CLASS_M = eINSTANCE.getTopClassM();

		/**
		 * The meta object literal for the '<em><b>Single Attr Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOP_CLASS_M__SINGLE_ATTR_INT = eINSTANCE.getTopClassM_SingleAttrInt();

		/**
		 * The meta object literal for the '{@link au.com.smartservicescrc.raas_small_test.impl.MergingE1AndE2Impl <em>Merging E1 And E2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see au.com.smartservicescrc.raas_small_test.impl.MergingE1AndE2Impl
		 * @see au.com.smartservicescrc.raas_small_test.impl.RstPackageImpl#getMergingE1AndE2()
		 * @generated
		 */
		EClass MERGING_E1_AND_E2 = eINSTANCE.getMergingE1AndE2();

		/**
		 * The meta object literal for the '<em><b>Optional Attr String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGING_E1_AND_E2__OPTIONAL_ATTR_STRING = eINSTANCE.getMergingE1AndE2_OptionalAttrString();

		/**
		 * The meta object literal for the '<em>Time Zone</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.TimeZone
		 * @see au.com.smartservicescrc.raas_small_test.impl.RstPackageImpl#getTimeZone()
		 * @generated
		 */
		EDataType TIME_ZONE = eINSTANCE.getTimeZone();

	}

} //RstPackage
