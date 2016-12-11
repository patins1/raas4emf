/**
 */
package restexample.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import restexample.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestexampleFactoryImpl extends EFactoryImpl implements RestexampleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RestexampleFactory init() {
		try {
			RestexampleFactory theRestexampleFactory = (RestexampleFactory)EPackage.Registry.INSTANCE.getEFactory(RestexamplePackage.eNS_URI);
			if (theRestexampleFactory != null) {
				return theRestexampleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RestexampleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestexampleFactoryImpl() {
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
			case RestexamplePackage.GET_ALL_PACKAGES_REQUEST: return createGetAllPackagesRequest();
			case RestexamplePackage.GET_ALL_PACKAGES_RESPONSE: return createGetAllPackagesResponse();
			case RestexamplePackage.GET_ALL_CLASSES_REQUEST: return createGetAllClassesRequest();
			case RestexamplePackage.GET_ALL_CLASSES_RESPONSE: return createGetAllClassesResponse();
			case RestexamplePackage.TRANSFORM_OCL_REQUEST: return createTransformOCLRequest();
			case RestexamplePackage.TRANSFORM_OCL_RESPONSE: return createTransformOCLResponse();
			case RestexamplePackage.ERROR_RESPONSE: return createErrorResponse();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetAllPackagesRequest createGetAllPackagesRequest() {
		GetAllPackagesRequestImpl getAllPackagesRequest = new GetAllPackagesRequestImpl();
		return getAllPackagesRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetAllPackagesResponse createGetAllPackagesResponse() {
		GetAllPackagesResponseImpl getAllPackagesResponse = new GetAllPackagesResponseImpl();
		return getAllPackagesResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetAllClassesRequest createGetAllClassesRequest() {
		GetAllClassesRequestImpl getAllClassesRequest = new GetAllClassesRequestImpl();
		return getAllClassesRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetAllClassesResponse createGetAllClassesResponse() {
		GetAllClassesResponseImpl getAllClassesResponse = new GetAllClassesResponseImpl();
		return getAllClassesResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformOCLRequest createTransformOCLRequest() {
		TransformOCLRequestImpl transformOCLRequest = new TransformOCLRequestImpl();
		return transformOCLRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformOCLResponse createTransformOCLResponse() {
		TransformOCLResponseImpl transformOCLResponse = new TransformOCLResponseImpl();
		return transformOCLResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorResponse createErrorResponse() {
		ErrorResponseImpl errorResponse = new ErrorResponseImpl();
		return errorResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestexamplePackage getRestexamplePackage() {
		return (RestexamplePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RestexamplePackage getPackage() {
		return RestexamplePackage.eINSTANCE;
	}

} //RestexampleFactoryImpl
