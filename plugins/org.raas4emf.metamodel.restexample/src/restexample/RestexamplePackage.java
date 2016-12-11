/**
 */
package restexample;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see restexample.RestexampleFactory
 * @model kind="package"
 * @generated
 */
public interface RestexamplePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "restexample";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/restexample";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "restexample";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RestexamplePackage eINSTANCE = restexample.impl.RestexamplePackageImpl.init();

	/**
	 * The meta object id for the '{@link restexample.impl.GetAllPackagesRequestImpl <em>Get All Packages Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restexample.impl.GetAllPackagesRequestImpl
	 * @see restexample.impl.RestexamplePackageImpl#getGetAllPackagesRequest()
	 * @generated
	 */
	int GET_ALL_PACKAGES_REQUEST = 0;

	/**
	 * The number of structural features of the '<em>Get All Packages Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_PACKAGES_REQUEST_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Get All Packages Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_PACKAGES_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link restexample.impl.GetAllPackagesResponseImpl <em>Get All Packages Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restexample.impl.GetAllPackagesResponseImpl
	 * @see restexample.impl.RestexamplePackageImpl#getGetAllPackagesResponse()
	 * @generated
	 */
	int GET_ALL_PACKAGES_RESPONSE = 1;

	/**
	 * The feature id for the '<em><b>Package UR Is</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_PACKAGES_RESPONSE__PACKAGE_UR_IS = 0;

	/**
	 * The number of structural features of the '<em>Get All Packages Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_PACKAGES_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get All Packages Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_PACKAGES_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link restexample.impl.GetAllClassesRequestImpl <em>Get All Classes Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restexample.impl.GetAllClassesRequestImpl
	 * @see restexample.impl.RestexamplePackageImpl#getGetAllClassesRequest()
	 * @generated
	 */
	int GET_ALL_CLASSES_REQUEST = 2;

	/**
	 * The feature id for the '<em><b>Package URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CLASSES_REQUEST__PACKAGE_URI = 0;

	/**
	 * The number of structural features of the '<em>Get All Classes Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CLASSES_REQUEST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get All Classes Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CLASSES_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link restexample.impl.GetAllClassesResponseImpl <em>Get All Classes Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restexample.impl.GetAllClassesResponseImpl
	 * @see restexample.impl.RestexamplePackageImpl#getGetAllClassesResponse()
	 * @generated
	 */
	int GET_ALL_CLASSES_RESPONSE = 3;

	/**
	 * The feature id for the '<em><b>Class Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CLASSES_RESPONSE__CLASS_NAMES = 0;

	/**
	 * The number of structural features of the '<em>Get All Classes Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CLASSES_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Get All Classes Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ALL_CLASSES_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link restexample.impl.TransformOCLRequestImpl <em>Transform OCL Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restexample.impl.TransformOCLRequestImpl
	 * @see restexample.impl.RestexamplePackageImpl#getTransformOCLRequest()
	 * @generated
	 */
	int TRANSFORM_OCL_REQUEST = 4;

	/**
	 * The feature id for the '<em><b>Ocl Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_OCL_REQUEST__OCL_TEXT = 0;

	/**
	 * The feature id for the '<em><b>Package URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_OCL_REQUEST__PACKAGE_URI = 1;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_OCL_REQUEST__CLASS_NAME = 2;

	/**
	 * The number of structural features of the '<em>Transform OCL Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_OCL_REQUEST_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transform OCL Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_OCL_REQUEST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link restexample.impl.TransformOCLResponseImpl <em>Transform OCL Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restexample.impl.TransformOCLResponseImpl
	 * @see restexample.impl.RestexamplePackageImpl#getTransformOCLResponse()
	 * @generated
	 */
	int TRANSFORM_OCL_RESPONSE = 5;

	/**
	 * The feature id for the '<em><b>Java Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_OCL_RESPONSE__JAVA_TEXT = 0;

	/**
	 * The feature id for the '<em><b>Xpath Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_OCL_RESPONSE__XPATH_TEXT = 1;

	/**
	 * The feature id for the '<em><b>Csharp Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_OCL_RESPONSE__CSHARP_TEXT = 2;

	/**
	 * The number of structural features of the '<em>Transform OCL Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_OCL_RESPONSE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transform OCL Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_OCL_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link restexample.impl.ErrorResponseImpl <em>Error Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see restexample.impl.ErrorResponseImpl
	 * @see restexample.impl.RestexamplePackageImpl#getErrorResponse()
	 * @generated
	 */
	int ERROR_RESPONSE = 6;

	/**
	 * The feature id for the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_RESPONSE__ERROR_MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Error Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Error Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_RESPONSE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link restexample.GetAllPackagesRequest <em>Get All Packages Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get All Packages Request</em>'.
	 * @see restexample.GetAllPackagesRequest
	 * @generated
	 */
	EClass getGetAllPackagesRequest();

	/**
	 * Returns the meta object for class '{@link restexample.GetAllPackagesResponse <em>Get All Packages Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get All Packages Response</em>'.
	 * @see restexample.GetAllPackagesResponse
	 * @generated
	 */
	EClass getGetAllPackagesResponse();

	/**
	 * Returns the meta object for the attribute list '{@link restexample.GetAllPackagesResponse#getPackageURIs <em>Package UR Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Package UR Is</em>'.
	 * @see restexample.GetAllPackagesResponse#getPackageURIs()
	 * @see #getGetAllPackagesResponse()
	 * @generated
	 */
	EAttribute getGetAllPackagesResponse_PackageURIs();

	/**
	 * Returns the meta object for class '{@link restexample.GetAllClassesRequest <em>Get All Classes Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get All Classes Request</em>'.
	 * @see restexample.GetAllClassesRequest
	 * @generated
	 */
	EClass getGetAllClassesRequest();

	/**
	 * Returns the meta object for the attribute '{@link restexample.GetAllClassesRequest#getPackageURI <em>Package URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package URI</em>'.
	 * @see restexample.GetAllClassesRequest#getPackageURI()
	 * @see #getGetAllClassesRequest()
	 * @generated
	 */
	EAttribute getGetAllClassesRequest_PackageURI();

	/**
	 * Returns the meta object for class '{@link restexample.GetAllClassesResponse <em>Get All Classes Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get All Classes Response</em>'.
	 * @see restexample.GetAllClassesResponse
	 * @generated
	 */
	EClass getGetAllClassesResponse();

	/**
	 * Returns the meta object for the attribute list '{@link restexample.GetAllClassesResponse#getClassNames <em>Class Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Class Names</em>'.
	 * @see restexample.GetAllClassesResponse#getClassNames()
	 * @see #getGetAllClassesResponse()
	 * @generated
	 */
	EAttribute getGetAllClassesResponse_ClassNames();

	/**
	 * Returns the meta object for class '{@link restexample.TransformOCLRequest <em>Transform OCL Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transform OCL Request</em>'.
	 * @see restexample.TransformOCLRequest
	 * @generated
	 */
	EClass getTransformOCLRequest();

	/**
	 * Returns the meta object for the attribute '{@link restexample.TransformOCLRequest#getOclText <em>Ocl Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ocl Text</em>'.
	 * @see restexample.TransformOCLRequest#getOclText()
	 * @see #getTransformOCLRequest()
	 * @generated
	 */
	EAttribute getTransformOCLRequest_OclText();

	/**
	 * Returns the meta object for the attribute '{@link restexample.TransformOCLRequest#getPackageURI <em>Package URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package URI</em>'.
	 * @see restexample.TransformOCLRequest#getPackageURI()
	 * @see #getTransformOCLRequest()
	 * @generated
	 */
	EAttribute getTransformOCLRequest_PackageURI();

	/**
	 * Returns the meta object for the attribute '{@link restexample.TransformOCLRequest#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see restexample.TransformOCLRequest#getClassName()
	 * @see #getTransformOCLRequest()
	 * @generated
	 */
	EAttribute getTransformOCLRequest_ClassName();

	/**
	 * Returns the meta object for class '{@link restexample.TransformOCLResponse <em>Transform OCL Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transform OCL Response</em>'.
	 * @see restexample.TransformOCLResponse
	 * @generated
	 */
	EClass getTransformOCLResponse();

	/**
	 * Returns the meta object for the attribute '{@link restexample.TransformOCLResponse#getJavaText <em>Java Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java Text</em>'.
	 * @see restexample.TransformOCLResponse#getJavaText()
	 * @see #getTransformOCLResponse()
	 * @generated
	 */
	EAttribute getTransformOCLResponse_JavaText();

	/**
	 * Returns the meta object for the attribute '{@link restexample.TransformOCLResponse#getXpathText <em>Xpath Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xpath Text</em>'.
	 * @see restexample.TransformOCLResponse#getXpathText()
	 * @see #getTransformOCLResponse()
	 * @generated
	 */
	EAttribute getTransformOCLResponse_XpathText();

	/**
	 * Returns the meta object for the attribute '{@link restexample.TransformOCLResponse#getCsharpText <em>Csharp Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Csharp Text</em>'.
	 * @see restexample.TransformOCLResponse#getCsharpText()
	 * @see #getTransformOCLResponse()
	 * @generated
	 */
	EAttribute getTransformOCLResponse_CsharpText();

	/**
	 * Returns the meta object for class '{@link restexample.ErrorResponse <em>Error Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Response</em>'.
	 * @see restexample.ErrorResponse
	 * @generated
	 */
	EClass getErrorResponse();

	/**
	 * Returns the meta object for the attribute '{@link restexample.ErrorResponse#getErrorMessage <em>Error Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Message</em>'.
	 * @see restexample.ErrorResponse#getErrorMessage()
	 * @see #getErrorResponse()
	 * @generated
	 */
	EAttribute getErrorResponse_ErrorMessage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RestexampleFactory getRestexampleFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link restexample.impl.GetAllPackagesRequestImpl <em>Get All Packages Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restexample.impl.GetAllPackagesRequestImpl
		 * @see restexample.impl.RestexamplePackageImpl#getGetAllPackagesRequest()
		 * @generated
		 */
		EClass GET_ALL_PACKAGES_REQUEST = eINSTANCE.getGetAllPackagesRequest();

		/**
		 * The meta object literal for the '{@link restexample.impl.GetAllPackagesResponseImpl <em>Get All Packages Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restexample.impl.GetAllPackagesResponseImpl
		 * @see restexample.impl.RestexamplePackageImpl#getGetAllPackagesResponse()
		 * @generated
		 */
		EClass GET_ALL_PACKAGES_RESPONSE = eINSTANCE.getGetAllPackagesResponse();

		/**
		 * The meta object literal for the '<em><b>Package UR Is</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_ALL_PACKAGES_RESPONSE__PACKAGE_UR_IS = eINSTANCE.getGetAllPackagesResponse_PackageURIs();

		/**
		 * The meta object literal for the '{@link restexample.impl.GetAllClassesRequestImpl <em>Get All Classes Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restexample.impl.GetAllClassesRequestImpl
		 * @see restexample.impl.RestexamplePackageImpl#getGetAllClassesRequest()
		 * @generated
		 */
		EClass GET_ALL_CLASSES_REQUEST = eINSTANCE.getGetAllClassesRequest();

		/**
		 * The meta object literal for the '<em><b>Package URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_ALL_CLASSES_REQUEST__PACKAGE_URI = eINSTANCE.getGetAllClassesRequest_PackageURI();

		/**
		 * The meta object literal for the '{@link restexample.impl.GetAllClassesResponseImpl <em>Get All Classes Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restexample.impl.GetAllClassesResponseImpl
		 * @see restexample.impl.RestexamplePackageImpl#getGetAllClassesResponse()
		 * @generated
		 */
		EClass GET_ALL_CLASSES_RESPONSE = eINSTANCE.getGetAllClassesResponse();

		/**
		 * The meta object literal for the '<em><b>Class Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_ALL_CLASSES_RESPONSE__CLASS_NAMES = eINSTANCE.getGetAllClassesResponse_ClassNames();

		/**
		 * The meta object literal for the '{@link restexample.impl.TransformOCLRequestImpl <em>Transform OCL Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restexample.impl.TransformOCLRequestImpl
		 * @see restexample.impl.RestexamplePackageImpl#getTransformOCLRequest()
		 * @generated
		 */
		EClass TRANSFORM_OCL_REQUEST = eINSTANCE.getTransformOCLRequest();

		/**
		 * The meta object literal for the '<em><b>Ocl Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORM_OCL_REQUEST__OCL_TEXT = eINSTANCE.getTransformOCLRequest_OclText();

		/**
		 * The meta object literal for the '<em><b>Package URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORM_OCL_REQUEST__PACKAGE_URI = eINSTANCE.getTransformOCLRequest_PackageURI();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORM_OCL_REQUEST__CLASS_NAME = eINSTANCE.getTransformOCLRequest_ClassName();

		/**
		 * The meta object literal for the '{@link restexample.impl.TransformOCLResponseImpl <em>Transform OCL Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restexample.impl.TransformOCLResponseImpl
		 * @see restexample.impl.RestexamplePackageImpl#getTransformOCLResponse()
		 * @generated
		 */
		EClass TRANSFORM_OCL_RESPONSE = eINSTANCE.getTransformOCLResponse();

		/**
		 * The meta object literal for the '<em><b>Java Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORM_OCL_RESPONSE__JAVA_TEXT = eINSTANCE.getTransformOCLResponse_JavaText();

		/**
		 * The meta object literal for the '<em><b>Xpath Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORM_OCL_RESPONSE__XPATH_TEXT = eINSTANCE.getTransformOCLResponse_XpathText();

		/**
		 * The meta object literal for the '<em><b>Csharp Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORM_OCL_RESPONSE__CSHARP_TEXT = eINSTANCE.getTransformOCLResponse_CsharpText();

		/**
		 * The meta object literal for the '{@link restexample.impl.ErrorResponseImpl <em>Error Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see restexample.impl.ErrorResponseImpl
		 * @see restexample.impl.RestexamplePackageImpl#getErrorResponse()
		 * @generated
		 */
		EClass ERROR_RESPONSE = eINSTANCE.getErrorResponse();

		/**
		 * The meta object literal for the '<em><b>Error Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_RESPONSE__ERROR_MESSAGE = eINSTANCE.getErrorResponse_ErrorMessage();

	}

} //RestexamplePackage
