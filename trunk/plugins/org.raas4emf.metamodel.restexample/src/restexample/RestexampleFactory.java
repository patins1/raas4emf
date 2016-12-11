/**
 */
package restexample;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see restexample.RestexamplePackage
 * @generated
 */
public interface RestexampleFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RestexampleFactory eINSTANCE = restexample.impl.RestexampleFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Get All Packages Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get All Packages Request</em>'.
	 * @generated
	 */
	GetAllPackagesRequest createGetAllPackagesRequest();

	/**
	 * Returns a new object of class '<em>Get All Packages Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get All Packages Response</em>'.
	 * @generated
	 */
	GetAllPackagesResponse createGetAllPackagesResponse();

	/**
	 * Returns a new object of class '<em>Get All Classes Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get All Classes Request</em>'.
	 * @generated
	 */
	GetAllClassesRequest createGetAllClassesRequest();

	/**
	 * Returns a new object of class '<em>Get All Classes Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get All Classes Response</em>'.
	 * @generated
	 */
	GetAllClassesResponse createGetAllClassesResponse();

	/**
	 * Returns a new object of class '<em>Transform OCL Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transform OCL Request</em>'.
	 * @generated
	 */
	TransformOCLRequest createTransformOCLRequest();

	/**
	 * Returns a new object of class '<em>Transform OCL Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transform OCL Response</em>'.
	 * @generated
	 */
	TransformOCLResponse createTransformOCLResponse();

	/**
	 * Returns a new object of class '<em>Error Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Response</em>'.
	 * @generated
	 */
	ErrorResponse createErrorResponse();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RestexamplePackage getRestexamplePackage();

} //RestexampleFactory
