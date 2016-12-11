/**
 */
package restexample;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.ecore.EObject;

import restexample.jaxb.TransformOCLResponseImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transform OCL Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link restexample.TransformOCLResponse#getJavaText <em>Java Text</em>}</li>
 *   <li>{@link restexample.TransformOCLResponse#getXpathText <em>Xpath Text</em>}</li>
 *   <li>{@link restexample.TransformOCLResponse#getCsharpText <em>Csharp Text</em>}</li>
 * </ul>
 *
 * @see restexample.RestexamplePackage#getTransformOCLResponse()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(TransformOCLResponseImplAdapter.class)
public interface TransformOCLResponse extends EObject {
	/**
	 * Returns the value of the '<em><b>Java Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Java Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Text</em>' attribute.
	 * @see #setJavaText(String)
	 * @see restexample.RestexamplePackage#getTransformOCLResponse_JavaText()
	 * @model
	 * @generated
	 */
	String getJavaText();

	/**
	 * Sets the value of the '{@link restexample.TransformOCLResponse#getJavaText <em>Java Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Java Text</em>' attribute.
	 * @see #getJavaText()
	 * @generated
	 */
	void setJavaText(String value);

	/**
	 * Returns the value of the '<em><b>Xpath Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xpath Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xpath Text</em>' attribute.
	 * @see #setXpathText(String)
	 * @see restexample.RestexamplePackage#getTransformOCLResponse_XpathText()
	 * @model
	 * @generated
	 */
	String getXpathText();

	/**
	 * Sets the value of the '{@link restexample.TransformOCLResponse#getXpathText <em>Xpath Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xpath Text</em>' attribute.
	 * @see #getXpathText()
	 * @generated
	 */
	void setXpathText(String value);

	/**
	 * Returns the value of the '<em><b>Csharp Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Csharp Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Csharp Text</em>' attribute.
	 * @see #setCsharpText(String)
	 * @see restexample.RestexamplePackage#getTransformOCLResponse_CsharpText()
	 * @model
	 * @generated
	 */
	String getCsharpText();

	/**
	 * Sets the value of the '{@link restexample.TransformOCLResponse#getCsharpText <em>Csharp Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Csharp Text</em>' attribute.
	 * @see #getCsharpText()
	 * @generated
	 */
	void setCsharpText(String value);

} // TransformOCLResponse
