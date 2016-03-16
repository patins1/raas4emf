/**
 */
package org.eclipse.jqvt.jQVT;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XVariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.jqvt.jQVT.RelationDomain#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.jqvt.jQVT.RelationDomain#getRootTemplate <em>Root Template</em>}</li>
 * </ul>
 *
 * @see org.eclipse.jqvt.jQVT.JQVTPackage#getRelationDomain()
 * @model
 * @generated
 */
public interface RelationDomain extends EObject
{
  /**
   * Returns the value of the '<em><b>Direction</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Direction</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Direction</em>' reference.
   * @see #setDirection(Direction)
   * @see org.eclipse.jqvt.jQVT.JQVTPackage#getRelationDomain_Direction()
   * @model
   * @generated
   */
  Direction getDirection();

  /**
   * Sets the value of the '{@link org.eclipse.jqvt.jQVT.RelationDomain#getDirection <em>Direction</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Direction</em>' reference.
   * @see #getDirection()
   * @generated
   */
  void setDirection(Direction value);

  /**
   * Returns the value of the '<em><b>Root Template</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root Template</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root Template</em>' containment reference.
   * @see #setRootTemplate(XVariableDeclaration)
   * @see org.eclipse.jqvt.jQVT.JQVTPackage#getRelationDomain_RootTemplate()
   * @model containment="true"
   * @generated
   */
  XVariableDeclaration getRootTemplate();

  /**
   * Sets the value of the '{@link org.eclipse.jqvt.jQVT.RelationDomain#getRootTemplate <em>Root Template</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root Template</em>' containment reference.
   * @see #getRootTemplate()
   * @generated
   */
  void setRootTemplate(XVariableDeclaration value);

} // RelationDomain
