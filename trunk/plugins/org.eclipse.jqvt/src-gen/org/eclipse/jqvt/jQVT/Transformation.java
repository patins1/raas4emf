/**
 */
package org.eclipse.jqvt.jQVT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.jqvt.jQVT.Transformation#getTransformationName <em>Transformation Name</em>}</li>
 *   <li>{@link org.eclipse.jqvt.jQVT.Transformation#getDirections <em>Directions</em>}</li>
 *   <li>{@link org.eclipse.jqvt.jQVT.Transformation#getRules <em>Rules</em>}</li>
 *   <li>{@link org.eclipse.jqvt.jQVT.Transformation#getQueries <em>Queries</em>}</li>
 * </ul>
 *
 * @see org.eclipse.jqvt.jQVT.JQVTPackage#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends EObject
{
  /**
   * Returns the value of the '<em><b>Transformation Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transformation Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transformation Name</em>' attribute.
   * @see #setTransformationName(String)
   * @see org.eclipse.jqvt.jQVT.JQVTPackage#getTransformation_TransformationName()
   * @model
   * @generated
   */
  String getTransformationName();

  /**
   * Sets the value of the '{@link org.eclipse.jqvt.jQVT.Transformation#getTransformationName <em>Transformation Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transformation Name</em>' attribute.
   * @see #getTransformationName()
   * @generated
   */
  void setTransformationName(String value);

  /**
   * Returns the value of the '<em><b>Directions</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.jqvt.jQVT.Direction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Directions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Directions</em>' containment reference list.
   * @see org.eclipse.jqvt.jQVT.JQVTPackage#getTransformation_Directions()
   * @model containment="true"
   * @generated
   */
  EList<Direction> getDirections();

  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.jqvt.jQVT.Relation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference list.
   * @see org.eclipse.jqvt.jQVT.JQVTPackage#getTransformation_Rules()
   * @model containment="true"
   * @generated
   */
  EList<Relation> getRules();

  /**
   * Returns the value of the '<em><b>Queries</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.jqvt.jQVT.Query}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Queries</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Queries</em>' containment reference list.
   * @see org.eclipse.jqvt.jQVT.JQVTPackage#getTransformation_Queries()
   * @model containment="true"
   * @generated
   */
  EList<Query> getQueries();

} // Transformation
