/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcDerivedProfileDefImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Derived Profile Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcDerivedProfileDef#getParentProfile <em>Parent Profile</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedProfileDef#getOperator <em>Operator</em>}</li>
 *   <li>{@link IFC2X3.IfcDerivedProfileDef#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcDerivedProfileDef()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcDerivedProfileDefImplAdapter.class)
public interface IfcDerivedProfileDef extends IfcProfileDef {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' reference.
	 * @see #setOperator(IfcCartesianTransformationOperator2D)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedProfileDef_Operator()
	 * @model required="true"
	 * @generated
	 */
	IfcCartesianTransformationOperator2D getOperator();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedProfileDef#getOperator <em>Operator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' reference.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(IfcCartesianTransformationOperator2D value);

	/**
	 * Returns the value of the '<em><b>Parent Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Profile</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Profile</em>' reference.
	 * @see #setParentProfile(IfcProfileDef)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedProfileDef_ParentProfile()
	 * @model required="true"
	 * @generated
	 */
	IfcProfileDef getParentProfile();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedProfileDef#getParentProfile <em>Parent Profile</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Profile</em>' reference.
	 * @see #getParentProfile()
	 * @generated
	 */
	void setParentProfile(IfcProfileDef value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #isSetLabel()
	 * @see #unsetLabel()
	 * @see #setLabel(String)
	 * @see IFC2X3.IFC2X3Package#getIfcDerivedProfileDef_Label()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDerivedProfileDef#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #isSetLabel()
	 * @see #unsetLabel()
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDerivedProfileDef#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLabel()
	 * @see #getLabel()
	 * @see #setLabel(String)
	 * @generated
	 */
	void unsetLabel();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDerivedProfileDef#getLabel <em>Label</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Label</em>' attribute is set.
	 * @see #unsetLabel()
	 * @see #getLabel()
	 * @see #setLabel(String)
	 * @generated
	 */
	boolean isSetLabel();

} // IfcDerivedProfileDef
