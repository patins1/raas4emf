/**
 */
package restexample;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.ecore.EObject;

import restexample.jaxb.GetAllClassesRequestImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get All Classes Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link restexample.GetAllClassesRequest#getPackageURI <em>Package URI</em>}</li>
 * </ul>
 *
 * @see restexample.RestexamplePackage#getGetAllClassesRequest()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(GetAllClassesRequestImplAdapter.class)
public interface GetAllClassesRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Package URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package URI</em>' attribute.
	 * @see #setPackageURI(String)
	 * @see restexample.RestexamplePackage#getGetAllClassesRequest_PackageURI()
	 * @model
	 * @generated
	 */
	String getPackageURI();

	/**
	 * Sets the value of the '{@link restexample.GetAllClassesRequest#getPackageURI <em>Package URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package URI</em>' attribute.
	 * @see #getPackageURI()
	 * @generated
	 */
	void setPackageURI(String value);

} // GetAllClassesRequest
