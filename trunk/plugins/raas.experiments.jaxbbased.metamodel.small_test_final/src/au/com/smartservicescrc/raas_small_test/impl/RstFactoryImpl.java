/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.com.smartservicescrc.raas_small_test.impl;

import au.com.smartservicescrc.raas_small_test.*;

import java.util.TimeZone;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RstFactoryImpl extends EFactoryImpl implements RstFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RstFactory init() {
		try {
			RstFactory theRstFactory = (RstFactory)EPackage.Registry.INSTANCE.getEFactory("http://smartservicescrc.com.au/raas/small_test"); 
			if (theRstFactory != null) {
				return theRstFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RstFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RstFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RstPackage.REPOS_ROOT: return createReposRoot();
			case RstPackage.TOP_CLASS_A: return createTopClassA();
			case RstPackage.TOP_CLASS_B: return createTopClassB();
			case RstPackage.TOP_CLASS_C: return createTopClassC();
			case RstPackage.TOP_CLASS_D: return createTopClassD();
			case RstPackage.UNDER_CLASS_E: return createUnderClassE();
			case RstPackage.UNDER_CLASS_F: return createUnderClassF();
			case RstPackage.THIRD_LEVEL_CLASS_J: return createThirdLevelClassJ();
			case RstPackage.FOURTH_LEVEL_CLASS_K: return createFourthLevelClassK();
			case RstPackage.DERIVED_UNDER_CLASS_E1: return createDerivedUnderClassE1();
			case RstPackage.DERIVED_UNDER_CLASS_E2: return createDerivedUnderClassE2();
			case RstPackage.TOP_CLASS_M: return createTopClassM();
			case RstPackage.MERGING_E1_AND_E2: return createMergingE1AndE2();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RstPackage.TIME_ZONE:
				return createTimeZoneFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RstPackage.TIME_ZONE:
				return convertTimeZoneToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReposRoot createReposRoot() {
		ReposRootImpl reposRoot = new ReposRootImpl();
		return reposRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopClassA createTopClassA() {
		TopClassAImpl topClassA = new TopClassAImpl();
		return topClassA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopClassB createTopClassB() {
		TopClassBImpl topClassB = new TopClassBImpl();
		return topClassB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopClassC createTopClassC() {
		TopClassCImpl topClassC = new TopClassCImpl();
		return topClassC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopClassD createTopClassD() {
		TopClassDImpl topClassD = new TopClassDImpl();
		return topClassD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnderClassE createUnderClassE() {
		UnderClassEImpl underClassE = new UnderClassEImpl();
		return underClassE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnderClassF createUnderClassF() {
		UnderClassFImpl underClassF = new UnderClassFImpl();
		return underClassF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThirdLevelClassJ createThirdLevelClassJ() {
		ThirdLevelClassJImpl thirdLevelClassJ = new ThirdLevelClassJImpl();
		return thirdLevelClassJ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FourthLevelClassK createFourthLevelClassK() {
		FourthLevelClassKImpl fourthLevelClassK = new FourthLevelClassKImpl();
		return fourthLevelClassK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedUnderClassE1 createDerivedUnderClassE1() {
		DerivedUnderClassE1Impl derivedUnderClassE1 = new DerivedUnderClassE1Impl();
		return derivedUnderClassE1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedUnderClassE2 createDerivedUnderClassE2() {
		DerivedUnderClassE2Impl derivedUnderClassE2 = new DerivedUnderClassE2Impl();
		return derivedUnderClassE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopClassM createTopClassM() {
		TopClassMImpl topClassM = new TopClassMImpl();
		return topClassM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergingE1AndE2 createMergingE1AndE2() {
		MergingE1AndE2Impl mergingE1AndE2 = new MergingE1AndE2Impl();
		return mergingE1AndE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeZone createTimeZoneFromString(EDataType eDataType, String initialValue) {
		return (TimeZone)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeZoneToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RstPackage getRstPackage() {
		return (RstPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RstPackage getPackage() {
		return RstPackage.eINSTANCE;
	}

} //RstFactoryImpl
