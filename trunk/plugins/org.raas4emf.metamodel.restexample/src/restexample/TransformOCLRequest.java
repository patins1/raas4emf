/**
 */
package restexample;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.ecore.EObject;

import restexample.jaxb.TransformOCLRequestImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transform OCL Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link restexample.TransformOCLRequest#getOclText <em>Ocl Text</em>}</li>
 *   <li>{@link restexample.TransformOCLRequest#getPackageURI <em>Package URI</em>}</li>
 *   <li>{@link restexample.TransformOCLRequest#getClassName <em>Class Name</em>}</li>
 * </ul>
 *
 * @see restexample.RestexamplePackage#getTransformOCLRequest()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(TransformOCLRequestImplAdapter.class)
public interface TransformOCLRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Ocl Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ocl Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ocl Text</em>' attribute.
	 * @see #setOclText(String)
	 * @see restexample.RestexamplePackage#getTransformOCLRequest_OclText()
	 * @model
	 * @generated
	 */
	String getOclText();

	/**
	 * Sets the value of the '{@link restexample.TransformOCLRequest#getOclText <em>Ocl Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ocl Text</em>' attribute.
	 * @see #getOclText()
	 * @generated
	 */
	void setOclText(String value);

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
	 * @see restexample.RestexamplePackage#getTransformOCLRequest_PackageURI()
	 * @model
	 * @generated
	 */
	String getPackageURI();

	/**
	 * Sets the value of the '{@link restexample.TransformOCLRequest#getPackageURI <em>Package URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package URI</em>' attribute.
	 * @see #getPackageURI()
	 * @generated
	 */
	void setPackageURI(String value);

	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see restexample.RestexamplePackage#getTransformOCLRequest_ClassName()
	 * @model
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link restexample.TransformOCLRequest#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

} // TransformOCLRequest
