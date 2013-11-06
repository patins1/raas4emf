/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRelAssignsToControlImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Assigns To Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelAssignsToControl#getRelatingControl <em>Relating Control</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelAssignsToControl()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelAssignsToControlImplAdapter.class)
public interface IfcRelAssignsToControl extends IfcRelAssigns {
	/**
	 * Returns the value of the '<em><b>Relating Control</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcControl#getControls <em>Controls</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Control</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Control</em>' reference.
	 * @see #setRelatingControl(IfcControl)
	 * @see IFC2X3.IFC2X3Package#getIfcRelAssignsToControl_RelatingControl()
	 * @see IFC2X3.IfcControl#getControls
	 * @model opposite="Controls" required="true"
	 * @generated
	 */
	IfcControl getRelatingControl();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelAssignsToControl#getRelatingControl <em>Relating Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Control</em>' reference.
	 * @see #getRelatingControl()
	 * @generated
	 */
	void setRelatingControl(IfcControl value);

} // IfcRelAssignsToControl
