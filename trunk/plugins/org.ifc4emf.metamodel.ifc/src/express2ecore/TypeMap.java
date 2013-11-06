/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package express2ecore;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link express2ecore.TypeMap#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link express2ecore.TypeMap#getTargetType <em>Target Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see express2ecore.Express2ecorePackage#getTypeMap()
 * @model
 * @generated
 */
public interface TypeMap extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Type</em>' reference.
	 * @see #setSourceType(EObject)
	 * @see express2ecore.Express2ecorePackage#getTypeMap_SourceType()
	 * @model
	 * @generated
	 */
	EObject getSourceType();

	/**
	 * Sets the value of the '{@link express2ecore.TypeMap#getSourceType <em>Source Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Type</em>' reference.
	 * @see #getSourceType()
	 * @generated
	 */
	void setSourceType(EObject value);

	/**
	 * Returns the value of the '<em><b>Target Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Type</em>' reference.
	 * @see #setTargetType(EClassifier)
	 * @see express2ecore.Express2ecorePackage#getTypeMap_TargetType()
	 * @model
	 * @generated
	 */
	EClassifier getTargetType();

	/**
	 * Sets the value of the '{@link express2ecore.TypeMap#getTargetType <em>Target Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Type</em>' reference.
	 * @see #getTargetType()
	 * @generated
	 */
	void setTargetType(EClassifier value);

} // TypeMap
