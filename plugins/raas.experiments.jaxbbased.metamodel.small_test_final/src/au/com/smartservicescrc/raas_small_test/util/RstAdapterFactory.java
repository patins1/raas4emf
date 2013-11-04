/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.com.smartservicescrc.raas_small_test.util;

import au.com.smartservicescrc.raas_small_test.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see au.com.smartservicescrc.raas_small_test.RstPackage
 * @generated
 */
public class RstAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RstPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RstAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RstPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RstSwitch<Adapter> modelSwitch =
		new RstSwitch<Adapter>() {
			@Override
			public Adapter caseReposRoot(ReposRoot object) {
				return createReposRootAdapter();
			}
			@Override
			public Adapter caseTopClassA(TopClassA object) {
				return createTopClassAAdapter();
			}
			@Override
			public Adapter caseTopClassB(TopClassB object) {
				return createTopClassBAdapter();
			}
			@Override
			public Adapter caseTopClassC(TopClassC object) {
				return createTopClassCAdapter();
			}
			@Override
			public Adapter caseTopClassD(TopClassD object) {
				return createTopClassDAdapter();
			}
			@Override
			public Adapter caseUnderClassE(UnderClassE object) {
				return createUnderClassEAdapter();
			}
			@Override
			public Adapter caseUnderClassF(UnderClassF object) {
				return createUnderClassFAdapter();
			}
			@Override
			public Adapter caseThirdLevelClassJ(ThirdLevelClassJ object) {
				return createThirdLevelClassJAdapter();
			}
			@Override
			public Adapter caseFourthLevelClassK(FourthLevelClassK object) {
				return createFourthLevelClassKAdapter();
			}
			@Override
			public Adapter caseDerivedUnderClassE1(DerivedUnderClassE1 object) {
				return createDerivedUnderClassE1Adapter();
			}
			@Override
			public Adapter caseDerivedUnderClassE2(DerivedUnderClassE2 object) {
				return createDerivedUnderClassE2Adapter();
			}
			@Override
			public Adapter caseTopClassM(TopClassM object) {
				return createTopClassMAdapter();
			}
			@Override
			public Adapter caseMergingE1AndE2(MergingE1AndE2 object) {
				return createMergingE1AndE2Adapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link au.com.smartservicescrc.raas_small_test.ReposRoot <em>Repos Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.com.smartservicescrc.raas_small_test.ReposRoot
	 * @generated
	 */
	public Adapter createReposRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link au.com.smartservicescrc.raas_small_test.TopClassA <em>Top Class A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.com.smartservicescrc.raas_small_test.TopClassA
	 * @generated
	 */
	public Adapter createTopClassAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link au.com.smartservicescrc.raas_small_test.TopClassB <em>Top Class B</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.com.smartservicescrc.raas_small_test.TopClassB
	 * @generated
	 */
	public Adapter createTopClassBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link au.com.smartservicescrc.raas_small_test.TopClassC <em>Top Class C</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.com.smartservicescrc.raas_small_test.TopClassC
	 * @generated
	 */
	public Adapter createTopClassCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link au.com.smartservicescrc.raas_small_test.TopClassD <em>Top Class D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.com.smartservicescrc.raas_small_test.TopClassD
	 * @generated
	 */
	public Adapter createTopClassDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link au.com.smartservicescrc.raas_small_test.UnderClassE <em>Under Class E</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.com.smartservicescrc.raas_small_test.UnderClassE
	 * @generated
	 */
	public Adapter createUnderClassEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link au.com.smartservicescrc.raas_small_test.UnderClassF <em>Under Class F</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.com.smartservicescrc.raas_small_test.UnderClassF
	 * @generated
	 */
	public Adapter createUnderClassFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link au.com.smartservicescrc.raas_small_test.ThirdLevelClassJ <em>Third Level Class J</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.com.smartservicescrc.raas_small_test.ThirdLevelClassJ
	 * @generated
	 */
	public Adapter createThirdLevelClassJAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link au.com.smartservicescrc.raas_small_test.FourthLevelClassK <em>Fourth Level Class K</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.com.smartservicescrc.raas_small_test.FourthLevelClassK
	 * @generated
	 */
	public Adapter createFourthLevelClassKAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link au.com.smartservicescrc.raas_small_test.DerivedUnderClassE1 <em>Derived Under Class E1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.com.smartservicescrc.raas_small_test.DerivedUnderClassE1
	 * @generated
	 */
	public Adapter createDerivedUnderClassE1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link au.com.smartservicescrc.raas_small_test.DerivedUnderClassE2 <em>Derived Under Class E2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.com.smartservicescrc.raas_small_test.DerivedUnderClassE2
	 * @generated
	 */
	public Adapter createDerivedUnderClassE2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link au.com.smartservicescrc.raas_small_test.TopClassM <em>Top Class M</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.com.smartservicescrc.raas_small_test.TopClassM
	 * @generated
	 */
	public Adapter createTopClassMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link au.com.smartservicescrc.raas_small_test.MergingE1AndE2 <em>Merging E1 And E2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see au.com.smartservicescrc.raas_small_test.MergingE1AndE2
	 * @generated
	 */
	public Adapter createMergingE1AndE2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RstAdapterFactory
