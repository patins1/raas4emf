/**
 */
package restexample.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import restexample.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see restexample.RestexamplePackage
 * @generated
 */
public class RestexampleAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RestexamplePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestexampleAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RestexamplePackage.eINSTANCE;
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
	protected RestexampleSwitch<Adapter> modelSwitch =
		new RestexampleSwitch<Adapter>() {
			@Override
			public Adapter caseGetAllPackagesRequest(GetAllPackagesRequest object) {
				return createGetAllPackagesRequestAdapter();
			}
			@Override
			public Adapter caseGetAllPackagesResponse(GetAllPackagesResponse object) {
				return createGetAllPackagesResponseAdapter();
			}
			@Override
			public Adapter caseGetAllClassesRequest(GetAllClassesRequest object) {
				return createGetAllClassesRequestAdapter();
			}
			@Override
			public Adapter caseGetAllClassesResponse(GetAllClassesResponse object) {
				return createGetAllClassesResponseAdapter();
			}
			@Override
			public Adapter caseTransformOCLRequest(TransformOCLRequest object) {
				return createTransformOCLRequestAdapter();
			}
			@Override
			public Adapter caseTransformOCLResponse(TransformOCLResponse object) {
				return createTransformOCLResponseAdapter();
			}
			@Override
			public Adapter caseErrorResponse(ErrorResponse object) {
				return createErrorResponseAdapter();
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
	 * Creates a new adapter for an object of class '{@link restexample.GetAllPackagesRequest <em>Get All Packages Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see restexample.GetAllPackagesRequest
	 * @generated
	 */
	public Adapter createGetAllPackagesRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link restexample.GetAllPackagesResponse <em>Get All Packages Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see restexample.GetAllPackagesResponse
	 * @generated
	 */
	public Adapter createGetAllPackagesResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link restexample.GetAllClassesRequest <em>Get All Classes Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see restexample.GetAllClassesRequest
	 * @generated
	 */
	public Adapter createGetAllClassesRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link restexample.GetAllClassesResponse <em>Get All Classes Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see restexample.GetAllClassesResponse
	 * @generated
	 */
	public Adapter createGetAllClassesResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link restexample.TransformOCLRequest <em>Transform OCL Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see restexample.TransformOCLRequest
	 * @generated
	 */
	public Adapter createTransformOCLRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link restexample.TransformOCLResponse <em>Transform OCL Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see restexample.TransformOCLResponse
	 * @generated
	 */
	public Adapter createTransformOCLResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link restexample.ErrorResponse <em>Error Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see restexample.ErrorResponse
	 * @generated
	 */
	public Adapter createErrorResponseAdapter() {
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

} //RestexampleAdapterFactory
