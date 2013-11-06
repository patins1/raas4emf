/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package express2ecore;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.ifc4emf.metamodel.express.core.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute2 Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link express2ecore.Attribute2Feature#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link express2ecore.Attribute2Feature#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see express2ecore.Express2ecorePackage#getAttribute2Feature()
 * @model
 * @generated
 */
public interface Attribute2Feature extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see express2ecore.Express2ecorePackage#getAttribute2Feature_Attribute()
	 * @model
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link express2ecore.Attribute2Feature#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(EStructuralFeature)
	 * @see express2ecore.Express2ecorePackage#getAttribute2Feature_Feature()
	 * @model
	 * @generated
	 */
	EStructuralFeature getFeature();

	/**
	 * Sets the value of the '{@link express2ecore.Attribute2Feature#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(EStructuralFeature value);

} // Attribute2Feature
