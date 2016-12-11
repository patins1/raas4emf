/**
 */
package restexample;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import restexample.jaxb.GetAllPackagesResponseImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get All Packages Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link restexample.GetAllPackagesResponse#getPackageURIs <em>Package UR Is</em>}</li>
 * </ul>
 *
 * @see restexample.RestexamplePackage#getGetAllPackagesResponse()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(GetAllPackagesResponseImplAdapter.class)
public interface GetAllPackagesResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Package UR Is</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package UR Is</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package UR Is</em>' attribute list.
	 * @see restexample.RestexamplePackage#getGetAllPackagesResponse_PackageURIs()
	 * @model
	 * @generated
	 */
	EList<String> getPackageURIs();

} // GetAllPackagesResponse
