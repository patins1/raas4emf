/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcTextStyleFontModelImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Text Style Font Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcTextStyleFontModel#getFontFamily <em>Font Family</em>}</li>
 *   <li>{@link IFC2X3.IfcTextStyleFontModel#getFontStyle <em>Font Style</em>}</li>
 *   <li>{@link IFC2X3.IfcTextStyleFontModel#getFontVariant <em>Font Variant</em>}</li>
 *   <li>{@link IFC2X3.IfcTextStyleFontModel#getFontWeight <em>Font Weight</em>}</li>
 *   <li>{@link IFC2X3.IfcTextStyleFontModel#getFontSize <em>Font Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcTextStyleFontModel()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcTextStyleFontModelImplAdapter.class)
public interface IfcTextStyleFontModel extends IfcPreDefinedTextFont {
	/**
	 * Returns the value of the '<em><b>Font Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Size</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Size</em>' containment reference.
	 * @see #setFontSize(IfcSizeSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcTextStyleFontModel_FontSize()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IfcSizeSelect getFontSize();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTextStyleFontModel#getFontSize <em>Font Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Size</em>' containment reference.
	 * @see #getFontSize()
	 * @generated
	 */
	void setFontSize(IfcSizeSelect value);

	/**
	 * Returns the value of the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Weight</em>' attribute.
	 * @see #isSetFontWeight()
	 * @see #unsetFontWeight()
	 * @see #setFontWeight(String)
	 * @see IFC2X3.IFC2X3Package#getIfcTextStyleFontModel_FontWeight()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getFontWeight();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTextStyleFontModel#getFontWeight <em>Font Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Weight</em>' attribute.
	 * @see #isSetFontWeight()
	 * @see #unsetFontWeight()
	 * @see #getFontWeight()
	 * @generated
	 */
	void setFontWeight(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTextStyleFontModel#getFontWeight <em>Font Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontWeight()
	 * @see #getFontWeight()
	 * @see #setFontWeight(String)
	 * @generated
	 */
	void unsetFontWeight();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTextStyleFontModel#getFontWeight <em>Font Weight</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Font Weight</em>' attribute is set.
	 * @see #unsetFontWeight()
	 * @see #getFontWeight()
	 * @see #setFontWeight(String)
	 * @generated
	 */
	boolean isSetFontWeight();

	/**
	 * Returns the value of the '<em><b>Font Variant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Variant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Variant</em>' attribute.
	 * @see #isSetFontVariant()
	 * @see #unsetFontVariant()
	 * @see #setFontVariant(String)
	 * @see IFC2X3.IFC2X3Package#getIfcTextStyleFontModel_FontVariant()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getFontVariant();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTextStyleFontModel#getFontVariant <em>Font Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Variant</em>' attribute.
	 * @see #isSetFontVariant()
	 * @see #unsetFontVariant()
	 * @see #getFontVariant()
	 * @generated
	 */
	void setFontVariant(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTextStyleFontModel#getFontVariant <em>Font Variant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontVariant()
	 * @see #getFontVariant()
	 * @see #setFontVariant(String)
	 * @generated
	 */
	void unsetFontVariant();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTextStyleFontModel#getFontVariant <em>Font Variant</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Font Variant</em>' attribute is set.
	 * @see #unsetFontVariant()
	 * @see #getFontVariant()
	 * @see #setFontVariant(String)
	 * @generated
	 */
	boolean isSetFontVariant();

	/**
	 * Returns the value of the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Style</em>' attribute.
	 * @see #isSetFontStyle()
	 * @see #unsetFontStyle()
	 * @see #setFontStyle(String)
	 * @see IFC2X3.IFC2X3Package#getIfcTextStyleFontModel_FontStyle()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getFontStyle();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTextStyleFontModel#getFontStyle <em>Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Style</em>' attribute.
	 * @see #isSetFontStyle()
	 * @see #unsetFontStyle()
	 * @see #getFontStyle()
	 * @generated
	 */
	void setFontStyle(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTextStyleFontModel#getFontStyle <em>Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFontStyle()
	 * @see #getFontStyle()
	 * @see #setFontStyle(String)
	 * @generated
	 */
	void unsetFontStyle();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTextStyleFontModel#getFontStyle <em>Font Style</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Font Style</em>' attribute is set.
	 * @see #unsetFontStyle()
	 * @see #getFontStyle()
	 * @see #setFontStyle(String)
	 * @generated
	 */
	boolean isSetFontStyle();

	/**
	 * Returns the value of the '<em><b>Font Family</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Font Family</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Font Family</em>' attribute list.
	 * @see IFC2X3.IFC2X3Package#getIfcTextStyleFontModel_FontFamily()
	 * @model unique="false" dataType="IFC2X3.STRING"
	 * @generated
	 */
	EList<String> getFontFamily();

} // IfcTextStyleFontModel
