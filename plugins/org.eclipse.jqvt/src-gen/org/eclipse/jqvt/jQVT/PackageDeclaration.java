/**
 */
package org.eclipse.jqvt.jQVT;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xtype.XImportSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.jqvt.jQVT.PackageDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.jqvt.jQVT.PackageDeclaration#getImportSection <em>Import Section</em>}</li>
 *   <li>{@link org.eclipse.jqvt.jQVT.PackageDeclaration#getTransformation <em>Transformation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.jqvt.jQVT.JQVTPackage#getPackageDeclaration()
 * @model
 * @generated
 */
public interface PackageDeclaration extends EObject
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
   * @see org.eclipse.jqvt.jQVT.JQVTPackage#getPackageDeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.jqvt.jQVT.PackageDeclaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Import Section</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import Section</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import Section</em>' containment reference.
   * @see #setImportSection(XImportSection)
   * @see org.eclipse.jqvt.jQVT.JQVTPackage#getPackageDeclaration_ImportSection()
   * @model containment="true"
   * @generated
   */
  XImportSection getImportSection();

  /**
   * Sets the value of the '{@link org.eclipse.jqvt.jQVT.PackageDeclaration#getImportSection <em>Import Section</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import Section</em>' containment reference.
   * @see #getImportSection()
   * @generated
   */
  void setImportSection(XImportSection value);

  /**
   * Returns the value of the '<em><b>Transformation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Transformation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Transformation</em>' containment reference.
   * @see #setTransformation(Transformation)
   * @see org.eclipse.jqvt.jQVT.JQVTPackage#getPackageDeclaration_Transformation()
   * @model containment="true"
   * @generated
   */
  Transformation getTransformation();

  /**
   * Sets the value of the '{@link org.eclipse.jqvt.jQVT.PackageDeclaration#getTransformation <em>Transformation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Transformation</em>' containment reference.
   * @see #getTransformation()
   * @generated
   */
  void setTransformation(Transformation value);

} // PackageDeclaration
