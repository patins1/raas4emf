/**
 */
package psets.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import psets.*;

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
 * @see psets.PsetsPackage
 * @generated
 */
public class PsetsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PsetsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PsetsSwitch() {
		if (modelPackage == null) {
			modelPackage = PsetsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PsetsPackage.IARTIFACT: {
				IArtifact iArtifact = (IArtifact)theEObject;
				T result = caseIArtifact(iArtifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PsetsPackage.IPROPERTY_SET: {
				IPropertySet iPropertySet = (IPropertySet)theEObject;
				T result = caseIPropertySet(iPropertySet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PsetsPackage.IPROPERTY: {
				IProperty iProperty = (IProperty)theEObject;
				T result = caseIProperty(iProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PsetsPackage.IPROPERTY_VALUE: {
				IPropertyValue iPropertyValue = (IPropertyValue)theEObject;
				T result = caseIPropertyValue(iPropertyValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PsetsPackage.IDEFAULT_VALUE: {
				IDefaultValue iDefaultValue = (IDefaultValue)theEObject;
				T result = caseIDefaultValue(iDefaultValue);
				if (result == null) result = caseIPropertyValue(iDefaultValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PsetsPackage.IMIN_MAX_VALUE: {
				IMinMaxValue iMinMaxValue = (IMinMaxValue)theEObject;
				T result = caseIMinMaxValue(iMinMaxValue);
				if (result == null) result = caseIPropertyValue(iMinMaxValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IArtifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IArtifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIArtifact(IArtifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IProperty Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IProperty Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPropertySet(IPropertySet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IProperty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IProperty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIProperty(IProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IProperty Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IProperty Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIPropertyValue(IPropertyValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDefault Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDefault Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDefaultValue(IDefaultValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IMin Max Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IMin Max Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIMinMaxValue(IMinMaxValue object) {
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
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PsetsSwitch
