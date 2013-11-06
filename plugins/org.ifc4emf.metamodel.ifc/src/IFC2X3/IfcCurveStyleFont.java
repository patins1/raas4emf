/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.eclipse.emf.common.util.EList;

import IFC2X3.jaxb.IfcCurveStyleFontImplAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Curve Style Font</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcCurveStyleFont#getName <em>Name</em>}</li>
 *   <li>{@link IFC2X3.IfcCurveStyleFont#getPatternList <em>Pattern List</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcCurveStyleFont()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcCurveStyleFontImplAdapter.class)
public interface IfcCurveStyleFont extends IfcCurveStyleFontSelect {
	/**
	 * Returns the value of the '<em><b>Pattern List</b></em>' reference list.
	 * The list contents are of type {@link IFC2X3.IfcCurveStyleFontPattern}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern List</em>' reference list.
	 * @see IFC2X3.IFC2X3Package#getIfcCurveStyleFont_PatternList()
	 * @model required="true"
	 * @generated
	 */
	EList<IfcCurveStyleFontPattern> getPatternList();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see IFC2X3.IFC2X3Package#getIfcCurveStyleFont_Name()
	 * @model unsettable="true" dataType="IFC2X3.STRING"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcCurveStyleFont#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcCurveStyleFont#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcCurveStyleFont#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

} // IfcCurveStyleFont
