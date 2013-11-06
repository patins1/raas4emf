/**
 */
package org.eclipse.jqvt.jQVT;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmOperation;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Template Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jqvt.jQVT.PropertyTemplateItem#getReferredProperty <em>Referred Property</em>}</li>
 *   <li>{@link org.eclipse.jqvt.jQVT.PropertyTemplateItem#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.jqvt.jQVT.JQVTPackage#getPropertyTemplateItem()
 * @model
 * @generated
 */
public interface PropertyTemplateItem extends EObject
{
  /**
   * Returns the value of the '<em><b>Referred Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referred Property</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Referred Property</em>' reference.
   * @see #setReferredProperty(JvmOperation)
   * @see org.eclipse.jqvt.jQVT.JQVTPackage#getPropertyTemplateItem_ReferredProperty()
   * @model
   * @generated
   */
  JvmOperation getReferredProperty();

  /**
   * Sets the value of the '{@link org.eclipse.jqvt.jQVT.PropertyTemplateItem#getReferredProperty <em>Referred Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Referred Property</em>' reference.
   * @see #getReferredProperty()
   * @generated
   */
  void setReferredProperty(JvmOperation value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(XExpression)
   * @see org.eclipse.jqvt.jQVT.JQVTPackage#getPropertyTemplateItem_Value()
   * @model containment="true"
   * @generated
   */
  XExpression getValue();

  /**
   * Sets the value of the '{@link org.eclipse.jqvt.jQVT.PropertyTemplateItem#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(XExpression value);

} // PropertyTemplateItem
