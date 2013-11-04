/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.com.smartservicescrc.raas_small_test.impl;

import au.com.smartservicescrc.raas_small_test.DerivedUnderClassE1;
import au.com.smartservicescrc.raas_small_test.DerivedUnderClassE2;
import au.com.smartservicescrc.raas_small_test.FourthLevelClassK;
import au.com.smartservicescrc.raas_small_test.MergingE1AndE2;
import au.com.smartservicescrc.raas_small_test.ReposRoot;
import au.com.smartservicescrc.raas_small_test.RstFactory;
import au.com.smartservicescrc.raas_small_test.RstPackage;
import au.com.smartservicescrc.raas_small_test.ThirdLevelClassJ;
import au.com.smartservicescrc.raas_small_test.TopClassA;
import au.com.smartservicescrc.raas_small_test.TopClassB;
import au.com.smartservicescrc.raas_small_test.TopClassC;
import au.com.smartservicescrc.raas_small_test.TopClassD;
import au.com.smartservicescrc.raas_small_test.TopClassM;
import au.com.smartservicescrc.raas_small_test.UnderClassE;
import au.com.smartservicescrc.raas_small_test.UnderClassF;

import java.util.TimeZone;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RstPackageImpl extends EPackageImpl implements RstPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reposRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topClassAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topClassBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topClassCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topClassDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass underClassEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass underClassFEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thirdLevelClassJEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fourthLevelClassKEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedUnderClassE1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedUnderClassE2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topClassMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergingE1AndE2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeZoneEDataType = null;

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
	 * @see au.com.smartservicescrc.raas_small_test.RstPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RstPackageImpl() {
		super(eNS_URI, RstFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RstPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RstPackage init() {
		if (isInited) return (RstPackage)EPackage.Registry.INSTANCE.getEPackage(RstPackage.eNS_URI);

		// Obtain or create and register package
		RstPackageImpl theRstPackage = (RstPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RstPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RstPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theRstPackage.createPackageContents();

		// Initialize created meta-data
		theRstPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRstPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RstPackage.eNS_URI, theRstPackage);
		return theRstPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReposRoot() {
		return reposRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReposRoot_RaasRef() {
		return (EAttribute)reposRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReposRoot_SingleAttrString() {
		return (EAttribute)reposRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReposRoot_MultiContainClassA() {
		return (EReference)reposRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReposRoot_OptionalContainClassB() {
		return (EReference)reposRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReposRoot_SingleContainClassC() {
		return (EReference)reposRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReposRoot_MultiRefClassD() {
		return (EReference)reposRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReposRoot_MultiAttrString() {
		return (EAttribute)reposRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReposRoot_SingleNonContainClassM() {
		return (EReference)reposRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopClassA() {
		return topClassAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopClassA_RaasRef() {
		return (EAttribute)topClassAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopClassA_MultiContainClassE() {
		return (EReference)topClassAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopClassA_SingleContainClassF() {
		return (EReference)topClassAEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopClassB() {
		return topClassBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopClassB_RaasRef() {
		return (EAttribute)topClassBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopClassB_Multi2lowerAttrInt() {
		return (EAttribute)topClassBEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopClassB_SingleAttrInt() {
		return (EAttribute)topClassBEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopClassB_OptionalAttrInt() {
		return (EAttribute)topClassBEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopClassB_MultiRefClassE() {
		return (EReference)topClassBEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopClassC() {
		return topClassCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopClassC_RaasRef() {
		return (EAttribute)topClassCEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopClassC_Multi2lowerAttrInt() {
		return (EAttribute)topClassCEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopClassC_SingleAttrInt() {
		return (EAttribute)topClassCEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopClassC_OptionalAttrInt() {
		return (EAttribute)topClassCEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTopClassC_SingleContainClassF() {
		return (EReference)topClassCEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopClassD() {
		return topClassDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopClassD_RaasRef() {
		return (EAttribute)topClassDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopClassD_Multi2lowerAttrInt() {
		return (EAttribute)topClassDEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopClassD_SingleAttrInt() {
		return (EAttribute)topClassDEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopClassD_OptionalAttrInt() {
		return (EAttribute)topClassDEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopClassD_OptionalTimeZone() {
		return (EAttribute)topClassDEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnderClassE() {
		return underClassEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnderClassE_RaasRef() {
		return (EAttribute)underClassEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnderClassF() {
		return underClassFEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnderClassF_RaasRef() {
		return (EAttribute)underClassFEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnderClassF_SingleAttrInt() {
		return (EAttribute)underClassFEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThirdLevelClassJ() {
		return thirdLevelClassJEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThirdLevelClassJ_RaasRef() {
		return (EAttribute)thirdLevelClassJEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThirdLevelClassJ_Multi2lowerAttrInt() {
		return (EAttribute)thirdLevelClassJEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThirdLevelClassJ_SingleAttrInt() {
		return (EAttribute)thirdLevelClassJEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThirdLevelClassJ_OptionalAttrInt() {
		return (EAttribute)thirdLevelClassJEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThirdLevelClassJ_OptionalContainClassK() {
		return (EReference)thirdLevelClassJEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFourthLevelClassK() {
		return fourthLevelClassKEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFourthLevelClassK_RaasRef() {
		return (EAttribute)fourthLevelClassKEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFourthLevelClassK_Multi2lowerAttrInt() {
		return (EAttribute)fourthLevelClassKEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFourthLevelClassK_SingleAttrInt() {
		return (EAttribute)fourthLevelClassKEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFourthLevelClassK_OptionalAttrInt() {
		return (EAttribute)fourthLevelClassKEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivedUnderClassE1() {
		return derivedUnderClassE1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivedUnderClassE1_SingleRefClassD() {
		return (EReference)derivedUnderClassE1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivedUnderClassE2() {
		return derivedUnderClassE2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivedUnderClassE2_MultiContainClassJ() {
		return (EReference)derivedUnderClassE2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopClassM() {
		return topClassMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopClassM_SingleAttrInt() {
		return (EAttribute)topClassMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergingE1AndE2() {
		return mergingE1AndE2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMergingE1AndE2_OptionalAttrString() {
		return (EAttribute)mergingE1AndE2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimeZone() {
		return timeZoneEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RstFactory getRstFactory() {
		return (RstFactory)getEFactoryInstance();
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
		reposRootEClass = createEClass(REPOS_ROOT);
		createEAttribute(reposRootEClass, REPOS_ROOT__RAAS_REF);
		createEAttribute(reposRootEClass, REPOS_ROOT__SINGLE_ATTR_STRING);
		createEReference(reposRootEClass, REPOS_ROOT__MULTI_CONTAIN_CLASS_A);
		createEReference(reposRootEClass, REPOS_ROOT__OPTIONAL_CONTAIN_CLASS_B);
		createEReference(reposRootEClass, REPOS_ROOT__SINGLE_CONTAIN_CLASS_C);
		createEReference(reposRootEClass, REPOS_ROOT__MULTI_REF_CLASS_D);
		createEAttribute(reposRootEClass, REPOS_ROOT__MULTI_ATTR_STRING);
		createEReference(reposRootEClass, REPOS_ROOT__SINGLE_NON_CONTAIN_CLASS_M);

		topClassAEClass = createEClass(TOP_CLASS_A);
		createEAttribute(topClassAEClass, TOP_CLASS_A__RAAS_REF);
		createEReference(topClassAEClass, TOP_CLASS_A__MULTI_CONTAIN_CLASS_E);
		createEReference(topClassAEClass, TOP_CLASS_A__SINGLE_CONTAIN_CLASS_F);

		topClassBEClass = createEClass(TOP_CLASS_B);
		createEAttribute(topClassBEClass, TOP_CLASS_B__RAAS_REF);
		createEAttribute(topClassBEClass, TOP_CLASS_B__MULTI2LOWER_ATTR_INT);
		createEAttribute(topClassBEClass, TOP_CLASS_B__SINGLE_ATTR_INT);
		createEAttribute(topClassBEClass, TOP_CLASS_B__OPTIONAL_ATTR_INT);
		createEReference(topClassBEClass, TOP_CLASS_B__MULTI_REF_CLASS_E);

		topClassCEClass = createEClass(TOP_CLASS_C);
		createEAttribute(topClassCEClass, TOP_CLASS_C__RAAS_REF);
		createEAttribute(topClassCEClass, TOP_CLASS_C__MULTI2LOWER_ATTR_INT);
		createEAttribute(topClassCEClass, TOP_CLASS_C__SINGLE_ATTR_INT);
		createEAttribute(topClassCEClass, TOP_CLASS_C__OPTIONAL_ATTR_INT);
		createEReference(topClassCEClass, TOP_CLASS_C__SINGLE_CONTAIN_CLASS_F);

		topClassDEClass = createEClass(TOP_CLASS_D);
		createEAttribute(topClassDEClass, TOP_CLASS_D__RAAS_REF);
		createEAttribute(topClassDEClass, TOP_CLASS_D__MULTI2LOWER_ATTR_INT);
		createEAttribute(topClassDEClass, TOP_CLASS_D__SINGLE_ATTR_INT);
		createEAttribute(topClassDEClass, TOP_CLASS_D__OPTIONAL_ATTR_INT);
		createEAttribute(topClassDEClass, TOP_CLASS_D__OPTIONAL_TIME_ZONE);

		underClassEEClass = createEClass(UNDER_CLASS_E);
		createEAttribute(underClassEEClass, UNDER_CLASS_E__RAAS_REF);

		underClassFEClass = createEClass(UNDER_CLASS_F);
		createEAttribute(underClassFEClass, UNDER_CLASS_F__RAAS_REF);
		createEAttribute(underClassFEClass, UNDER_CLASS_F__SINGLE_ATTR_INT);

		thirdLevelClassJEClass = createEClass(THIRD_LEVEL_CLASS_J);
		createEAttribute(thirdLevelClassJEClass, THIRD_LEVEL_CLASS_J__RAAS_REF);
		createEAttribute(thirdLevelClassJEClass, THIRD_LEVEL_CLASS_J__MULTI2LOWER_ATTR_INT);
		createEAttribute(thirdLevelClassJEClass, THIRD_LEVEL_CLASS_J__SINGLE_ATTR_INT);
		createEAttribute(thirdLevelClassJEClass, THIRD_LEVEL_CLASS_J__OPTIONAL_ATTR_INT);
		createEReference(thirdLevelClassJEClass, THIRD_LEVEL_CLASS_J__OPTIONAL_CONTAIN_CLASS_K);

		fourthLevelClassKEClass = createEClass(FOURTH_LEVEL_CLASS_K);
		createEAttribute(fourthLevelClassKEClass, FOURTH_LEVEL_CLASS_K__RAAS_REF);
		createEAttribute(fourthLevelClassKEClass, FOURTH_LEVEL_CLASS_K__MULTI2LOWER_ATTR_INT);
		createEAttribute(fourthLevelClassKEClass, FOURTH_LEVEL_CLASS_K__SINGLE_ATTR_INT);
		createEAttribute(fourthLevelClassKEClass, FOURTH_LEVEL_CLASS_K__OPTIONAL_ATTR_INT);

		derivedUnderClassE1EClass = createEClass(DERIVED_UNDER_CLASS_E1);
		createEReference(derivedUnderClassE1EClass, DERIVED_UNDER_CLASS_E1__SINGLE_REF_CLASS_D);

		derivedUnderClassE2EClass = createEClass(DERIVED_UNDER_CLASS_E2);
		createEReference(derivedUnderClassE2EClass, DERIVED_UNDER_CLASS_E2__MULTI_CONTAIN_CLASS_J);

		topClassMEClass = createEClass(TOP_CLASS_M);
		createEAttribute(topClassMEClass, TOP_CLASS_M__SINGLE_ATTR_INT);

		mergingE1AndE2EClass = createEClass(MERGING_E1_AND_E2);
		createEAttribute(mergingE1AndE2EClass, MERGING_E1_AND_E2__OPTIONAL_ATTR_STRING);

		// Create data types
		timeZoneEDataType = createEDataType(TIME_ZONE);
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
		derivedUnderClassE1EClass.getESuperTypes().add(this.getUnderClassE());
		derivedUnderClassE2EClass.getESuperTypes().add(this.getUnderClassE());
		topClassMEClass.getESuperTypes().add(this.getUnderClassE());
		mergingE1AndE2EClass.getESuperTypes().add(this.getDerivedUnderClassE1());
		mergingE1AndE2EClass.getESuperTypes().add(this.getDerivedUnderClassE2());

		// Initialize classes and features; add operations and parameters
		initEClass(reposRootEClass, ReposRoot.class, "ReposRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReposRoot_RaasRef(), ecorePackage.getEString(), "raasRef", null, 0, 1, ReposRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReposRoot_SingleAttrString(), ecorePackage.getEString(), "singleAttrString", null, 1, 1, ReposRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReposRoot_MultiContainClassA(), this.getTopClassA(), null, "multiContainClassA", null, 0, -1, ReposRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReposRoot_OptionalContainClassB(), this.getTopClassB(), null, "optionalContainClassB", null, 0, 1, ReposRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReposRoot_SingleContainClassC(), this.getTopClassC(), null, "singleContainClassC", null, 1, 1, ReposRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReposRoot_MultiRefClassD(), this.getTopClassD(), null, "multiRefClassD", null, 0, -1, ReposRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReposRoot_MultiAttrString(), ecorePackage.getEString(), "multiAttrString", null, 0, -1, ReposRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReposRoot_SingleNonContainClassM(), this.getTopClassM(), null, "singleNonContainClassM", null, 1, 1, ReposRoot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topClassAEClass, TopClassA.class, "TopClassA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTopClassA_RaasRef(), ecorePackage.getEString(), "raasRef", null, 0, 1, TopClassA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTopClassA_MultiContainClassE(), this.getUnderClassE(), null, "multiContainClassE", null, 0, -1, TopClassA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTopClassA_SingleContainClassF(), this.getUnderClassF(), null, "singleContainClassF", null, 1, 1, TopClassA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topClassBEClass, TopClassB.class, "TopClassB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTopClassB_RaasRef(), ecorePackage.getEString(), "raasRef", null, 0, 1, TopClassB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTopClassB_Multi2lowerAttrInt(), ecorePackage.getEInt(), "multi2lowerAttrInt", null, 2, -1, TopClassB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTopClassB_SingleAttrInt(), ecorePackage.getEInt(), "singleAttrInt", null, 1, 1, TopClassB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTopClassB_OptionalAttrInt(), ecorePackage.getEInt(), "optionalAttrInt", null, 0, 1, TopClassB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTopClassB_MultiRefClassE(), this.getUnderClassE(), null, "multiRefClassE", null, 0, -1, TopClassB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topClassCEClass, TopClassC.class, "TopClassC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTopClassC_RaasRef(), ecorePackage.getEString(), "raasRef", null, 0, 1, TopClassC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTopClassC_Multi2lowerAttrInt(), ecorePackage.getEInt(), "multi2lowerAttrInt", null, 2, -1, TopClassC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTopClassC_SingleAttrInt(), ecorePackage.getEInt(), "singleAttrInt", null, 1, 1, TopClassC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTopClassC_OptionalAttrInt(), ecorePackage.getEInt(), "optionalAttrInt", null, 0, 1, TopClassC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTopClassC_SingleContainClassF(), this.getUnderClassF(), null, "singleContainClassF", null, 1, 1, TopClassC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topClassDEClass, TopClassD.class, "TopClassD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTopClassD_RaasRef(), ecorePackage.getEString(), "raasRef", null, 0, 1, TopClassD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTopClassD_Multi2lowerAttrInt(), ecorePackage.getEInt(), "multi2lowerAttrInt", null, 2, -1, TopClassD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTopClassD_SingleAttrInt(), ecorePackage.getEInt(), "singleAttrInt", null, 1, 1, TopClassD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTopClassD_OptionalAttrInt(), ecorePackage.getEInt(), "optionalAttrInt", null, 0, 1, TopClassD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTopClassD_OptionalTimeZone(), this.getTimeZone(), "optionalTimeZone", null, 0, 1, TopClassD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(underClassEEClass, UnderClassE.class, "UnderClassE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnderClassE_RaasRef(), ecorePackage.getEString(), "raasRef", null, 0, 1, UnderClassE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(underClassFEClass, UnderClassF.class, "UnderClassF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnderClassF_RaasRef(), ecorePackage.getEString(), "raasRef", null, 0, 1, UnderClassF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnderClassF_SingleAttrInt(), ecorePackage.getEInt(), "singleAttrInt", null, 1, 1, UnderClassF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thirdLevelClassJEClass, ThirdLevelClassJ.class, "ThirdLevelClassJ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThirdLevelClassJ_RaasRef(), ecorePackage.getEString(), "raasRef", null, 0, 1, ThirdLevelClassJ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThirdLevelClassJ_Multi2lowerAttrInt(), ecorePackage.getEInt(), "multi2lowerAttrInt", null, 2, -1, ThirdLevelClassJ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThirdLevelClassJ_SingleAttrInt(), ecorePackage.getEInt(), "singleAttrInt", null, 1, 1, ThirdLevelClassJ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThirdLevelClassJ_OptionalAttrInt(), ecorePackage.getEInt(), "optionalAttrInt", null, 0, 1, ThirdLevelClassJ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getThirdLevelClassJ_OptionalContainClassK(), this.getFourthLevelClassK(), null, "optionalContainClassK", null, 0, 1, ThirdLevelClassJ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fourthLevelClassKEClass, FourthLevelClassK.class, "FourthLevelClassK", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFourthLevelClassK_RaasRef(), ecorePackage.getEString(), "raasRef", null, 0, 1, FourthLevelClassK.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFourthLevelClassK_Multi2lowerAttrInt(), ecorePackage.getEInt(), "multi2lowerAttrInt", null, 2, -1, FourthLevelClassK.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFourthLevelClassK_SingleAttrInt(), ecorePackage.getEInt(), "singleAttrInt", null, 1, 1, FourthLevelClassK.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFourthLevelClassK_OptionalAttrInt(), ecorePackage.getEInt(), "optionalAttrInt", null, 0, 1, FourthLevelClassK.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(derivedUnderClassE1EClass, DerivedUnderClassE1.class, "DerivedUnderClassE1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDerivedUnderClassE1_SingleRefClassD(), this.getTopClassD(), null, "singleRefClassD", null, 1, 1, DerivedUnderClassE1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(derivedUnderClassE2EClass, DerivedUnderClassE2.class, "DerivedUnderClassE2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDerivedUnderClassE2_MultiContainClassJ(), this.getThirdLevelClassJ(), null, "multiContainClassJ", null, 0, -1, DerivedUnderClassE2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topClassMEClass, TopClassM.class, "TopClassM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTopClassM_SingleAttrInt(), ecorePackage.getEInt(), "singleAttrInt", null, 1, 1, TopClassM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mergingE1AndE2EClass, MergingE1AndE2.class, "MergingE1AndE2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMergingE1AndE2_OptionalAttrString(), ecorePackage.getEString(), "optionalAttrString", null, 0, 1, MergingE1AndE2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(timeZoneEDataType, TimeZone.class, "TimeZone", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// RaaS
		createRaaSAnnotations();
	}

	/**
	 * Initializes the annotations for <b>RaaS</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createRaaSAnnotations() {
		String source = "RaaS";		
		addAnnotation
		  (reposRootEClass, 
		   source, 
		   new String[] {
			 "RepositoryRoot", "Yes"
		   });		
		addAnnotation
		  (getDerivedUnderClassE2_MultiContainClassJ(), 
		   source, 
		   new String[] {
			 "AssertContainment", "Yes"
		   });
	}

} //RstPackageImpl
