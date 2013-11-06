/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcTextStyleForDefinedFontImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Text Style For Defined Font</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcTextStyleForDefinedFont#getColour <em>Colour</em>}</li>
 *   <li>{@link IFC2X3.IfcTextStyleForDefinedFont#getBackgroundColour <em>Background Colour</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcTextStyleForDefinedFont()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcTextStyleForDefinedFontImplAdapter.class)
public interface IfcTextStyleForDefinedFont extends IfcCharacterStyleSelect {
	/**
	 * Returns the value of the '<em><b>Colour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colour</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colour</em>' reference.
	 * @see #setColour(IfcColour)
	 * @see IFC2X3.IFC2X3Package#getIfcTextStyleForDefinedFont_Colour()
	 * @model required="true"
	 * @generated
	 */
	IfcColour getColour();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTextStyleForDefinedFont#getColour <em>Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colour</em>' reference.
	 * @see #getColour()
	 * @generated
	 */
	void setColour(IfcColour value);

	/**
	 * Returns the value of the '<em><b>Background Colour</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Colour</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Colour</em>' reference.
	 * @see #setBackgroundColour(IfcColour)
	 * @see IFC2X3.IFC2X3Package#getIfcTextStyleForDefinedFont_BackgroundColour()
	 * @model
	 * @generated
	 */
	IfcColour getBackgroundColour();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTextStyleForDefinedFont#getBackgroundColour <em>Background Colour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Colour</em>' reference.
	 * @see #getBackgroundColour()
	 * @generated
	 */
	void setBackgroundColour(IfcColour value);

} // IfcTextStyleForDefinedFont
