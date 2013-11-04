/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package au.com.smartservicescrc.raas_small_test.util;

import au.com.smartservicescrc.raas_small_test.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see au.com.smartservicescrc.raas_small_test.RstPackage
 * @generated
 */
public class RstSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RstPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RstSwitch() {
		if (modelPackage == null) {
			modelPackage = RstPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case RstPackage.REPOS_ROOT: {
				ReposRoot reposRoot = (ReposRoot)theEObject;
				T result = caseReposRoot(reposRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RstPackage.TOP_CLASS_A: {
				TopClassA topClassA = (TopClassA)theEObject;
				T result = caseTopClassA(topClassA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RstPackage.TOP_CLASS_B: {
				TopClassB topClassB = (TopClassB)theEObject;
				T result = caseTopClassB(topClassB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RstPackage.TOP_CLASS_C: {
				TopClassC topClassC = (TopClassC)theEObject;
				T result = caseTopClassC(topClassC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RstPackage.TOP_CLASS_D: {
				TopClassD topClassD = (TopClassD)theEObject;
				T result = caseTopClassD(topClassD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RstPackage.UNDER_CLASS_E: {
				UnderClassE underClassE = (UnderClassE)theEObject;
				T result = caseUnderClassE(underClassE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RstPackage.UNDER_CLASS_F: {
				UnderClassF underClassF = (UnderClassF)theEObject;
				T result = caseUnderClassF(underClassF);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RstPackage.THIRD_LEVEL_CLASS_J: {
				ThirdLevelClassJ thirdLevelClassJ = (ThirdLevelClassJ)theEObject;
				T result = caseThirdLevelClassJ(thirdLevelClassJ);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RstPackage.FOURTH_LEVEL_CLASS_K: {
				FourthLevelClassK fourthLevelClassK = (FourthLevelClassK)theEObject;
				T result = caseFourthLevelClassK(fourthLevelClassK);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RstPackage.DERIVED_UNDER_CLASS_E1: {
				DerivedUnderClassE1 derivedUnderClassE1 = (DerivedUnderClassE1)theEObject;
				T result = caseDerivedUnderClassE1(derivedUnderClassE1);
				if (result == null) result = caseUnderClassE(derivedUnderClassE1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RstPackage.DERIVED_UNDER_CLASS_E2: {
				DerivedUnderClassE2 derivedUnderClassE2 = (DerivedUnderClassE2)theEObject;
				T result = caseDerivedUnderClassE2(derivedUnderClassE2);
				if (result == null) result = caseUnderClassE(derivedUnderClassE2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RstPackage.TOP_CLASS_M: {
				TopClassM topClassM = (TopClassM)theEObject;
				T result = caseTopClassM(topClassM);
				if (result == null) result = caseUnderClassE(topClassM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RstPackage.MERGING_E1_AND_E2: {
				MergingE1AndE2 mergingE1AndE2 = (MergingE1AndE2)theEObject;
				T result = caseMergingE1AndE2(mergingE1AndE2);
				if (result == null) result = caseDerivedUnderClassE1(mergingE1AndE2);
				if (result == null) result = caseDerivedUnderClassE2(mergingE1AndE2);
				if (result == null) result = caseUnderClassE(mergingE1AndE2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repos Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repos Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReposRoot(ReposRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Top Class A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Top Class A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopClassA(TopClassA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Top Class B</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Top Class B</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopClassB(TopClassB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Top Class C</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Top Class C</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopClassC(TopClassC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Top Class D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Top Class D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopClassD(TopClassD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Under Class E</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Under Class E</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnderClassE(UnderClassE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Under Class F</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Under Class F</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnderClassF(UnderClassF object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Third Level Class J</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Third Level Class J</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThirdLevelClassJ(ThirdLevelClassJ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fourth Level Class K</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fourth Level Class K</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFourthLevelClassK(FourthLevelClassK object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Under Class E1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Under Class E1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedUnderClassE1(DerivedUnderClassE1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Under Class E2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Under Class E2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDerivedUnderClassE2(DerivedUnderClassE2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Top Class M</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Top Class M</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopClassM(TopClassM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merging E1 And E2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merging E1 And E2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergingE1AndE2(MergingE1AndE2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //RstSwitch
