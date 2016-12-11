/**
 */
package restexample;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import restexample.jaxb.GetAllClassesResponseImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get All Classes Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link restexample.GetAllClassesResponse#getClassNames <em>Class Names</em>}</li>
 * </ul>
 *
 * @see restexample.RestexamplePackage#getGetAllClassesResponse()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(GetAllClassesResponseImplAdapter.class)
public interface GetAllClassesResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Class Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Names</em>' attribute list.
	 * @see restexample.RestexamplePackage#getGetAllClassesResponse_ClassNames()
	 * @model
	 * @generated
	 */
	EList<String> getClassNames();

} // GetAllClassesResponse
