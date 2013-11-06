/**
 */
package org.eclipse.jqvt.jQVT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XVariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jqvt.jQVT.Relation#isTopRelation <em>Top Relation</em>}</li>
 *   <li>{@link org.eclipse.jqvt.jQVT.Relation#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.jqvt.jQVT.Relation#getVars <em>Vars</em>}</li>
 *   <li>{@link org.eclipse.jqvt.jQVT.Relation#getDomains <em>Domains</em>}</li>
 *   <li>{@link org.eclipse.jqvt.jQVT.Relation#getWhen <em>When</em>}</li>
 *   <li>{@link org.eclipse.jqvt.jQVT.Relation#getWhere <em>Where</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.jqvt.jQVT.JQVTPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends EObject
{
  /**
   * Returns the value of the '<em><b>Top Relation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Top Relation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Top Relation</em>' attribute.
   * @see #setTopRelation(boolean)
   * @see org.eclipse.jqvt.jQVT.JQVTPackage#getRelation_TopRelation()
   * @model
   * @generated
   */
  boolean isTopRelation();

  /**
   * Sets the value of the '{@link org.eclipse.jqvt.jQVT.Relation#isTopRelation <em>Top Relation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Top Relation</em>' attribute.
   * @see #isTopRelation()
   * @generated
   */
  void setTopRelation(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.jqvt.jQVT.JQVTPackage#getRelation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.jqvt.jQVT.Relation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Vars</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xbase.XVariableDeclaration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vars</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' containment reference list.
   * @see org.eclipse.jqvt.jQVT.JQVTPackage#getRelation_Vars()
   * @model containment="true"
   * @generated
   */
  EList<XVariableDeclaration> getVars();

  /**
   * Returns the value of the '<em><b>Domains</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.jqvt.jQVT.RelationDomain}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Domains</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Domains</em>' containment reference list.
   * @see org.eclipse.jqvt.jQVT.JQVTPackage#getRelation_Domains()
   * @model containment="true"
   * @generated
   */
  EList<RelationDomain> getDomains();

  /**
   * Returns the value of the '<em><b>When</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xbase.XExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>When</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>When</em>' containment reference list.
   * @see org.eclipse.jqvt.jQVT.JQVTPackage#getRelation_When()
   * @model containment="true"
   * @generated
   */
  EList<XExpression> getWhen();

  /**
   * Returns the value of the '<em><b>Where</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xbase.XExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Where</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Where</em>' containment reference list.
   * @see org.eclipse.jqvt.jQVT.JQVTPackage#getRelation_Where()
   * @model containment="true"
   * @generated
   */
  EList<XExpression> getWhere();

} // Relation
