/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcTextStyleImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Text Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcTextStyle#getTextCharacterAppearance <em>Text Character Appearance</em>}</li>
 *   <li>{@link IFC2X3.IfcTextStyle#getTextStyle <em>Text Style</em>}</li>
 *   <li>{@link IFC2X3.IfcTextStyle#getTextFontStyle <em>Text Font Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcTextStyle()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcTextStyleImplAdapter.class)
public interface IfcTextStyle extends IfcPresentationStyle {
	/**
	 * Returns the value of the '<em><b>Text Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Style</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Style</em>' reference.
	 * @see #setTextStyle(IfcTextStyleSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcTextStyle_TextStyle()
	 * @model
	 * @generated
	 */
	IfcTextStyleSelect getTextStyle();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTextStyle#getTextStyle <em>Text Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Style</em>' reference.
	 * @see #getTextStyle()
	 * @generated
	 */
	void setTextStyle(IfcTextStyleSelect value);

	/**
	 * Returns the value of the '<em><b>Text Font Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Font Style</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Font Style</em>' reference.
	 * @see #setTextFontStyle(IfcTextFontSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcTextStyle_TextFontStyle()
	 * @model required="true"
	 * @generated
	 */
	IfcTextFontSelect getTextFontStyle();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTextStyle#getTextFontStyle <em>Text Font Style</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Font Style</em>' reference.
	 * @see #getTextFontStyle()
	 * @generated
	 */
	void setTextFontStyle(IfcTextFontSelect value);

	/**
	 * Returns the value of the '<em><b>Text Character Appearance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Character Appearance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Character Appearance</em>' reference.
	 * @see #setTextCharacterAppearance(IfcCharacterStyleSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcTextStyle_TextCharacterAppearance()
	 * @model
	 * @generated
	 */
	IfcCharacterStyleSelect getTextCharacterAppearance();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTextStyle#getTextCharacterAppearance <em>Text Character Appearance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Character Appearance</em>' reference.
	 * @see #getTextCharacterAppearance()
	 * @generated
	 */
	void setTextCharacterAppearance(IfcCharacterStyleSelect value);

} // IfcTextStyle
