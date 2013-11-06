/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcTextLiteralWithExtentImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Text Literal With Extent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcTextLiteralWithExtent#getExtent <em>Extent</em>}</li>
 *   <li>{@link IFC2X3.IfcTextLiteralWithExtent#getBoxAlignment <em>Box Alignment</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcTextLiteralWithExtent()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcTextLiteralWithExtentImplAdapter.class)
public interface IfcTextLiteralWithExtent extends IfcTextLiteral {
	/**
	 * Returns the value of the '<em><b>Extent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extent</em>' reference.
	 * @see #setExtent(IfcPlanarExtent)
	 * @see IFC2X3.IFC2X3Package#getIfcTextLiteralWithExtent_Extent()
	 * @model required="true"
	 * @generated
	 */
	IfcPlanarExtent getExtent();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTextLiteralWithExtent#getExtent <em>Extent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent</em>' reference.
	 * @see #getExtent()
	 * @generated
	 */
	void setExtent(IfcPlanarExtent value);

	/**
	 * Returns the value of the '<em><b>Box Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Box Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Box Alignment</em>' attribute.
	 * @see #isSetBoxAlignment()
	 * @see #unsetBoxAlignment()
	 * @see #setBoxAlignment(String)
	 * @see IFC2X3.IFC2X3Package#getIfcTextLiteralWithExtent_BoxAlignment()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getBoxAlignment();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcTextLiteralWithExtent#getBoxAlignment <em>Box Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Box Alignment</em>' attribute.
	 * @see #isSetBoxAlignment()
	 * @see #unsetBoxAlignment()
	 * @see #getBoxAlignment()
	 * @generated
	 */
	void setBoxAlignment(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcTextLiteralWithExtent#getBoxAlignment <em>Box Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBoxAlignment()
	 * @see #getBoxAlignment()
	 * @see #setBoxAlignment(String)
	 * @generated
	 */
	void unsetBoxAlignment();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcTextLiteralWithExtent#getBoxAlignment <em>Box Alignment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Box Alignment</em>' attribute is set.
	 * @see #unsetBoxAlignment()
	 * @see #getBoxAlignment()
	 * @see #setBoxAlignment(String)
	 * @generated
	 */
	boolean isSetBoxAlignment();

} // IfcTextLiteralWithExtent
