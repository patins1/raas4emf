/**
 */
package org.eclipse.jqvt.jQVT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.jqvt.jQVT.Direction#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.jqvt.jQVT.Direction#getImp <em>Imp</em>}</li>
 * </ul>
 *
 * @see org.eclipse.jqvt.jQVT.JQVTPackage#getDirection()
 * @model
 * @generated
 */
public interface Direction extends EObject
{
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
   * @see org.eclipse.jqvt.jQVT.JQVTPackage#getDirection_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.jqvt.jQVT.Direction#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Imp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imp</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imp</em>' attribute.
   * @see #setImp(String)
   * @see org.eclipse.jqvt.jQVT.JQVTPackage#getDirection_Imp()
   * @model
   * @generated
   */
  String getImp();

  /**
   * Sets the value of the '{@link org.eclipse.jqvt.jQVT.Direction#getImp <em>Imp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imp</em>' attribute.
   * @see #getImp()
   * @generated
   */
  void setImp(String value);

} // Direction
