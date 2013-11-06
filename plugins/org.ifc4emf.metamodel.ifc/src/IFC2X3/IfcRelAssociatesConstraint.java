/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRelAssociatesConstraintImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Associates Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelAssociatesConstraint#getIntent <em>Intent</em>}</li>
 *   <li>{@link IFC2X3.IfcRelAssociatesConstraint#getRelatingConstraint <em>Relating Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelAssociatesConstraint()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelAssociatesConstraintImplAdapter.class)
public interface IfcRelAssociatesConstraint extends IfcRelAssociates {
	/**
	 * Returns the value of the '<em><b>Relating Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Constraint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Constraint</em>' reference.
	 * @see #setRelatingConstraint(IfcConstraint)
	 * @see IFC2X3.IFC2X3Package#getIfcRelAssociatesConstraint_RelatingConstraint()
	 * @model required="true"
	 * @generated
	 */
	IfcConstraint getRelatingConstraint();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelAssociatesConstraint#getRelatingConstraint <em>Relating Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Constraint</em>' reference.
	 * @see #getRelatingConstraint()
	 * @generated
	 */
	void setRelatingConstraint(IfcConstraint value);

	/**
	 * Returns the value of the '<em><b>Intent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intent</em>' attribute.
	 * @see #isSetIntent()
	 * @see #unsetIntent()
	 * @see #setIntent(String)
	 * @see IFC2X3.IFC2X3Package#getIfcRelAssociatesConstraint_Intent()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getIntent();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelAssociatesConstraint#getIntent <em>Intent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intent</em>' attribute.
	 * @see #isSetIntent()
	 * @see #unsetIntent()
	 * @see #getIntent()
	 * @generated
	 */
	void setIntent(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRelAssociatesConstraint#getIntent <em>Intent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIntent()
	 * @see #getIntent()
	 * @see #setIntent(String)
	 * @generated
	 */
	void unsetIntent();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRelAssociatesConstraint#getIntent <em>Intent</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Intent</em>' attribute is set.
	 * @see #unsetIntent()
	 * @see #getIntent()
	 * @see #setIntent(String)
	 * @generated
	 */
	boolean isSetIntent();

} // IfcRelAssociatesConstraint
