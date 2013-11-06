/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcTextStyleTextModelImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Text Style Text Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcTextStyleTextModel#getTextIndent <em>Text Indent</em>}</li>
 *   <li>{@link IFC2X3.IfcTextStyleTextModel#getTextAlign <em>Text Align</em>}</li>
 *   <li>{@link IFC2X3.IfcTextStyleTextModel#getTextDecoration <em>Text Decoration</em>}</li>
 *   <li>{@link IFC2X3.IfcTextStyleTextModel#getLetterSpacing <em>Letter Spacing</em>}</li>
 *   <li>{@link IFC2X3.IfcTextStyleTextModel#getWordSpacing <em>Word Spacing</em>}</li>
 *   <li>{@link IFC2X3.IfcTextStyleTextModel#getTextTransform <em>Text Transform</em>}</li>
 *   <li>{@link IFC2X3.IfcTextStyleTextModel#getLineHeight <em>Line Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcTextStyleTextModel()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcTextStyleTextModelImplAdapter.class)
public interface IfcTextStyleTextModel extends IfcTextStyleSelect {
	/**
	 * Returns the value of the '<em><b>Text Indent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Indent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Indent</em>' containment reference.
	 * @see #setTextIndent(IfcSizeSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcTextStyleTextModel_TextIndent()
	 * @model containment="true"
	 * @generated
	 */
	IfcSizeSelect getTextIndent();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTextStyleTextModel#getTextIndent <em>Text Indent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Indent</em>' containment reference.
	 * @see #getTextIndent()
	 * @generated
	 */
	void setTextIndent(IfcSizeSelect value);

	/**
	 * Returns the value of the '<em><b>Letter Spacing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Letter Spacing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Letter Spacing</em>' containment reference.
	 * @see #setLetterSpacing(IfcSizeSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcTextStyleTextModel_LetterSpacing()
	 * @model containment="true"
	 * @generated
	 */
	IfcSizeSelect getLetterSpacing();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTextStyleTextModel#getLetterSpacing <em>Letter Spacing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Letter Spacing</em>' containment reference.
	 * @see #getLetterSpacing()
	 * @generated
	 */
	void setLetterSpacing(IfcSizeSelect value);

	/**
	 * Returns the value of the '<em><b>Word Spacing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Word Spacing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Word Spacing</em>' containment reference.
	 * @see #setWordSpacing(IfcSizeSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcTextStyleTextModel_WordSpacing()
	 * @model containment="true"
	 * @generated
	 */
	IfcSizeSelect getWordSpacing();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTextStyleTextModel#getWordSpacing <em>Word Spacing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Word Spacing</em>' containment reference.
	 * @see #getWordSpacing()
	 * @generated
	 */
	void setWordSpacing(IfcSizeSelect value);

	/**
	 * Returns the value of the '<em><b>Line Height</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Height</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Height</em>' containment reference.
	 * @see #setLineHeight(IfcSizeSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcTextStyleTextModel_LineHeight()
	 * @model containment="true"
	 * @generated
	 */
	IfcSizeSelect getLineHeight();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTextStyleTextModel#getLineHeight <em>Line Height</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Height</em>' containment reference.
	 * @see #getLineHeight()
	 * @generated
	 */
	void setLineHeight(IfcSizeSelect value);

	/**
	 * Returns the value of the '<em><b>Text Transform</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Transform</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Transform</em>' attribute.
	 * @see #isSetTextTransform()
	 * @see #unsetTextTransform()
	 * @see #setTextTransform(String)
	 * @see IFC2X3.IFC2X3Package#getIfcTextStyleTextModel_TextTransform()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getTextTransform();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTextStyleTextModel#getTextTransform <em>Text Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Transform</em>' attribute.
	 * @see #isSetTextTransform()
	 * @see #unsetTextTransform()
	 * @see #getTextTransform()
	 * @generated
	 */
	void setTextTransform(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTextStyleTextModel#getTextTransform <em>Text Transform</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextTransform()
	 * @see #getTextTransform()
	 * @see #setTextTransform(String)
	 * @generated
	 */
	void unsetTextTransform();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTextStyleTextModel#getTextTransform <em>Text Transform</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Transform</em>' attribute is set.
	 * @see #unsetTextTransform()
	 * @see #getTextTransform()
	 * @see #setTextTransform(String)
	 * @generated
	 */
	boolean isSetTextTransform();

	/**
	 * Returns the value of the '<em><b>Text Decoration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Decoration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Decoration</em>' attribute.
	 * @see #isSetTextDecoration()
	 * @see #unsetTextDecoration()
	 * @see #setTextDecoration(String)
	 * @see IFC2X3.IFC2X3Package#getIfcTextStyleTextModel_TextDecoration()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getTextDecoration();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTextStyleTextModel#getTextDecoration <em>Text Decoration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Decoration</em>' attribute.
	 * @see #isSetTextDecoration()
	 * @see #unsetTextDecoration()
	 * @see #getTextDecoration()
	 * @generated
	 */
	void setTextDecoration(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTextStyleTextModel#getTextDecoration <em>Text Decoration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextDecoration()
	 * @see #getTextDecoration()
	 * @see #setTextDecoration(String)
	 * @generated
	 */
	void unsetTextDecoration();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTextStyleTextModel#getTextDecoration <em>Text Decoration</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Decoration</em>' attribute is set.
	 * @see #unsetTextDecoration()
	 * @see #getTextDecoration()
	 * @see #setTextDecoration(String)
	 * @generated
	 */
	boolean isSetTextDecoration();

	/**
	 * Returns the value of the '<em><b>Text Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text Align</em>' attribute.
	 * @see #isSetTextAlign()
	 * @see #unsetTextAlign()
	 * @see #setTextAlign(String)
	 * @see IFC2X3.IFC2X3Package#getIfcTextStyleTextModel_TextAlign()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getTextAlign();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTextStyleTextModel#getTextAlign <em>Text Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Align</em>' attribute.
	 * @see #isSetTextAlign()
	 * @see #unsetTextAlign()
	 * @see #getTextAlign()
	 * @generated
	 */
	void setTextAlign(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTextStyleTextModel#getTextAlign <em>Text Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTextAlign()
	 * @see #getTextAlign()
	 * @see #setTextAlign(String)
	 * @generated
	 */
	void unsetTextAlign();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTextStyleTextModel#getTextAlign <em>Text Align</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Text Align</em>' attribute is set.
	 * @see #unsetTextAlign()
	 * @see #getTextAlign()
	 * @see #setTextAlign(String)
	 * @generated
	 */
	boolean isSetTextAlign();

} // IfcTextStyleTextModel
