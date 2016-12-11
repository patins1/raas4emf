/**
 */
package restexample;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.ecore.EObject;

import restexample.jaxb.GetAllPackagesRequestImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get All Packages Request</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see restexample.RestexamplePackage#getGetAllPackagesRequest()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(GetAllPackagesRequestImplAdapter.class)
public interface GetAllPackagesRequest extends EObject {
} // GetAllPackagesRequest
