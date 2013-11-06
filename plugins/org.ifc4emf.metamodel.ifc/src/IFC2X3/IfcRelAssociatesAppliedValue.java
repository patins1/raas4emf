/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRelAssociatesAppliedValueImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Associates Applied Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelAssociatesAppliedValue#getRelatingAppliedValue <em>Relating Applied Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelAssociatesAppliedValue()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelAssociatesAppliedValueImplAdapter.class)
public interface IfcRelAssociatesAppliedValue extends IfcRelAssociates {
	/**
	 * Returns the value of the '<em><b>Relating Applied Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Applied Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Applied Value</em>' reference.
	 * @see #setRelatingAppliedValue(IfcAppliedValue)
	 * @see IFC2X3.IFC2X3Package#getIfcRelAssociatesAppliedValue_RelatingAppliedValue()
	 * @model required="true"
	 * @generated
	 */
	IfcAppliedValue getRelatingAppliedValue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelAssociatesAppliedValue#getRelatingAppliedValue <em>Relating Applied Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Applied Value</em>' reference.
	 * @see #getRelatingAppliedValue()
	 * @generated
	 */
	void setRelatingAppliedValue(IfcAppliedValue value);

} // IfcRelAssociatesAppliedValue
