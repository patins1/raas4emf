/**
 */
package restexample;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.ecore.EObject;

import restexample.jaxb.ErrorResponseImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link restexample.ErrorResponse#getErrorMessage <em>Error Message</em>}</li>
 * </ul>
 *
 * @see restexample.RestexamplePackage#getErrorResponse()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(ErrorResponseImplAdapter.class)
public interface ErrorResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Error Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Message</em>' attribute.
	 * @see #setErrorMessage(String)
	 * @see restexample.RestexamplePackage#getErrorResponse_ErrorMessage()
	 * @model
	 * @generated
	 */
	String getErrorMessage();

	/**
	 * Sets the value of the '{@link restexample.ErrorResponse#getErrorMessage <em>Error Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Message</em>' attribute.
	 * @see #getErrorMessage()
	 * @generated
	 */
	void setErrorMessage(String value);

} // ErrorResponse
