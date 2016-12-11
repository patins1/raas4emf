/**
 */
package restexample.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import restexample.ErrorResponse;
import restexample.GetAllClassesRequest;
import restexample.GetAllClassesResponse;
import restexample.GetAllPackagesRequest;
import restexample.GetAllPackagesResponse;
import restexample.RestexampleFactory;
import restexample.RestexamplePackage;
import restexample.TransformOCLRequest;
import restexample.TransformOCLResponse;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestexamplePackageImpl extends EPackageImpl implements RestexamplePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getAllPackagesRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getAllPackagesResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getAllClassesRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getAllClassesResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformOCLRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformOCLResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorResponseEClass = null;

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
	 * @see restexample.RestexamplePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RestexamplePackageImpl() {
		super(eNS_URI, RestexampleFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RestexamplePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RestexamplePackage init() {
		if (isInited) return (RestexamplePackage)EPackage.Registry.INSTANCE.getEPackage(RestexamplePackage.eNS_URI);

		// Obtain or create and register package
		RestexamplePackageImpl theRestexamplePackage = (RestexamplePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RestexamplePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RestexamplePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theRestexamplePackage.createPackageContents();

		// Initialize created meta-data
		theRestexamplePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRestexamplePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RestexamplePackage.eNS_URI, theRestexamplePackage);
		return theRestexamplePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetAllPackagesRequest() {
		return getAllPackagesRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetAllPackagesResponse() {
		return getAllPackagesResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetAllPackagesResponse_PackageURIs() {
		return (EAttribute)getAllPackagesResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetAllClassesRequest() {
		return getAllClassesRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetAllClassesRequest_PackageURI() {
		return (EAttribute)getAllClassesRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetAllClassesResponse() {
		return getAllClassesResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetAllClassesResponse_ClassNames() {
		return (EAttribute)getAllClassesResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformOCLRequest() {
		return transformOCLRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformOCLRequest_OclText() {
		return (EAttribute)transformOCLRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformOCLRequest_PackageURI() {
		return (EAttribute)transformOCLRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformOCLRequest_ClassName() {
		return (EAttribute)transformOCLRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformOCLResponse() {
		return transformOCLResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformOCLResponse_JavaText() {
		return (EAttribute)transformOCLResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformOCLResponse_XpathText() {
		return (EAttribute)transformOCLResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformOCLResponse_CsharpText() {
		return (EAttribute)transformOCLResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorResponse() {
		return errorResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorResponse_ErrorMessage() {
		return (EAttribute)errorResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestexampleFactory getRestexampleFactory() {
		return (RestexampleFactory)getEFactoryInstance();
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
		getAllPackagesRequestEClass = createEClass(GET_ALL_PACKAGES_REQUEST);

		getAllPackagesResponseEClass = createEClass(GET_ALL_PACKAGES_RESPONSE);
		createEAttribute(getAllPackagesResponseEClass, GET_ALL_PACKAGES_RESPONSE__PACKAGE_UR_IS);

		getAllClassesRequestEClass = createEClass(GET_ALL_CLASSES_REQUEST);
		createEAttribute(getAllClassesRequestEClass, GET_ALL_CLASSES_REQUEST__PACKAGE_URI);

		getAllClassesResponseEClass = createEClass(GET_ALL_CLASSES_RESPONSE);
		createEAttribute(getAllClassesResponseEClass, GET_ALL_CLASSES_RESPONSE__CLASS_NAMES);

		transformOCLRequestEClass = createEClass(TRANSFORM_OCL_REQUEST);
		createEAttribute(transformOCLRequestEClass, TRANSFORM_OCL_REQUEST__OCL_TEXT);
		createEAttribute(transformOCLRequestEClass, TRANSFORM_OCL_REQUEST__PACKAGE_URI);
		createEAttribute(transformOCLRequestEClass, TRANSFORM_OCL_REQUEST__CLASS_NAME);

		transformOCLResponseEClass = createEClass(TRANSFORM_OCL_RESPONSE);
		createEAttribute(transformOCLResponseEClass, TRANSFORM_OCL_RESPONSE__JAVA_TEXT);
		createEAttribute(transformOCLResponseEClass, TRANSFORM_OCL_RESPONSE__XPATH_TEXT);
		createEAttribute(transformOCLResponseEClass, TRANSFORM_OCL_RESPONSE__CSHARP_TEXT);

		errorResponseEClass = createEClass(ERROR_RESPONSE);
		createEAttribute(errorResponseEClass, ERROR_RESPONSE__ERROR_MESSAGE);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(getAllPackagesRequestEClass, GetAllPackagesRequest.class, "GetAllPackagesRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(getAllPackagesResponseEClass, GetAllPackagesResponse.class, "GetAllPackagesResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetAllPackagesResponse_PackageURIs(), ecorePackage.getEString(), "packageURIs", null, 0, -1, GetAllPackagesResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getAllClassesRequestEClass, GetAllClassesRequest.class, "GetAllClassesRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetAllClassesRequest_PackageURI(), ecorePackage.getEString(), "packageURI", null, 0, 1, GetAllClassesRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getAllClassesResponseEClass, GetAllClassesResponse.class, "GetAllClassesResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGetAllClassesResponse_ClassNames(), ecorePackage.getEString(), "classNames", null, 0, -1, GetAllClassesResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformOCLRequestEClass, TransformOCLRequest.class, "TransformOCLRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformOCLRequest_OclText(), ecorePackage.getEString(), "oclText", null, 0, 1, TransformOCLRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformOCLRequest_PackageURI(), ecorePackage.getEString(), "packageURI", null, 0, 1, TransformOCLRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformOCLRequest_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, TransformOCLRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformOCLResponseEClass, TransformOCLResponse.class, "TransformOCLResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformOCLResponse_JavaText(), ecorePackage.getEString(), "javaText", null, 0, 1, TransformOCLResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformOCLResponse_XpathText(), ecorePackage.getEString(), "xpathText", null, 0, 1, TransformOCLResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformOCLResponse_CsharpText(), ecorePackage.getEString(), "csharpText", null, 0, 1, TransformOCLResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorResponseEClass, ErrorResponse.class, "ErrorResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getErrorResponse_ErrorMessage(), ecorePackage.getEString(), "errorMessage", null, 0, 1, ErrorResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RestexamplePackageImpl
