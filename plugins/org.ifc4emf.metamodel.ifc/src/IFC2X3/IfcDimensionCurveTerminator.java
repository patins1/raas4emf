/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcDimensionCurveTerminatorImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Dimension Curve Terminator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcDimensionCurveTerminator#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcDimensionCurveTerminator()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcDimensionCurveTerminatorImplAdapter.class)
public interface IfcDimensionCurveTerminator extends IfcTerminatorSymbol {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcDimensionExtentUsage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see IFC2X3.IfcDimensionExtentUsage
	 * @see #isSetRole()
	 * @see #unsetRole()
	 * @see #setRole(IfcDimensionExtentUsage)
	 * @see IFC2X3.IFC2X3Package#getIfcDimensionCurveTerminator_Role()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcDimensionExtentUsage getRole();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcDimensionCurveTerminator#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see IFC2X3.IfcDimensionExtentUsage
	 * @see #isSetRole()
	 * @see #unsetRole()
	 * @see #getRole()
	 * @generated
	 */
	void setRole(IfcDimensionExtentUsage value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcDimensionCurveTerminator#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRole()
	 * @see #getRole()
	 * @see #setRole(IfcDimensionExtentUsage)
	 * @generated
	 */
	void unsetRole();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcDimensionCurveTerminator#getRole <em>Role</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Role</em>' attribute is set.
	 * @see #unsetRole()
	 * @see #getRole()
	 * @see #setRole(IfcDimensionExtentUsage)
	 * @generated
	 */
	boolean isSetRole();

} // IfcDimensionCurveTerminator
