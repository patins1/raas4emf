/**
 */
package org.eclipse.jqvt.jQVT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.xbase.XVariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.jqvt.jQVT.ObjectTemplate#getPart <em>Part</em>}</li>
 * </ul>
 *
 * @see org.eclipse.jqvt.jQVT.JQVTPackage#getObjectTemplate()
 * @model
 * @generated
 */
public interface ObjectTemplate extends XVariableDeclaration
{
  /**
   * Returns the value of the '<em><b>Part</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.jqvt.jQVT.PropertyTemplateItem}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Part</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Part</em>' containment reference list.
   * @see org.eclipse.jqvt.jQVT.JQVTPackage#getObjectTemplate_Part()
   * @model containment="true"
   * @generated
   */
  EList<PropertyTemplateItem> getPart();

} // ObjectTemplate
