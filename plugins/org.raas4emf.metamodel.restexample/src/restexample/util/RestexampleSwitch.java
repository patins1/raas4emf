/**
 */
package restexample.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import restexample.*;

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
 * @see restexample.RestexamplePackage
 * @generated
 */
public class RestexampleSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RestexamplePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestexampleSwitch() {
		if (modelPackage == null) {
			modelPackage = RestexamplePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
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
			case RestexamplePackage.GET_ALL_PACKAGES_REQUEST: {
				GetAllPackagesRequest getAllPackagesRequest = (GetAllPackagesRequest)theEObject;
				T result = caseGetAllPackagesRequest(getAllPackagesRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestexamplePackage.GET_ALL_PACKAGES_RESPONSE: {
				GetAllPackagesResponse getAllPackagesResponse = (GetAllPackagesResponse)theEObject;
				T result = caseGetAllPackagesResponse(getAllPackagesResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestexamplePackage.GET_ALL_CLASSES_REQUEST: {
				GetAllClassesRequest getAllClassesRequest = (GetAllClassesRequest)theEObject;
				T result = caseGetAllClassesRequest(getAllClassesRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestexamplePackage.GET_ALL_CLASSES_RESPONSE: {
				GetAllClassesResponse getAllClassesResponse = (GetAllClassesResponse)theEObject;
				T result = caseGetAllClassesResponse(getAllClassesResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestexamplePackage.TRANSFORM_OCL_REQUEST: {
				TransformOCLRequest transformOCLRequest = (TransformOCLRequest)theEObject;
				T result = caseTransformOCLRequest(transformOCLRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestexamplePackage.TRANSFORM_OCL_RESPONSE: {
				TransformOCLResponse transformOCLResponse = (TransformOCLResponse)theEObject;
				T result = caseTransformOCLResponse(transformOCLResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RestexamplePackage.ERROR_RESPONSE: {
				ErrorResponse errorResponse = (ErrorResponse)theEObject;
				T result = caseErrorResponse(errorResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get All Packages Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get All Packages Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetAllPackagesRequest(GetAllPackagesRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get All Packages Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get All Packages Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetAllPackagesResponse(GetAllPackagesResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get All Classes Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get All Classes Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetAllClassesRequest(GetAllClassesRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get All Classes Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get All Classes Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetAllClassesResponse(GetAllClassesResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transform OCL Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transform OCL Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformOCLRequest(TransformOCLRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transform OCL Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transform OCL Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformOCLResponse(TransformOCLResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseErrorResponse(ErrorResponse object) {
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

} //RestexampleSwitch
