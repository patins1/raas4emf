/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcRelConnectsStructuralMemberImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Rel Connects Structural Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcRelConnectsStructuralMember#getRelatingStructuralMember <em>Relating Structural Member</em>}</li>
 *   <li>{@link IFC2X3.IfcRelConnectsStructuralMember#getRelatedStructuralConnection <em>Related Structural Connection</em>}</li>
 *   <li>{@link IFC2X3.IfcRelConnectsStructuralMember#getAppliedCondition <em>Applied Condition</em>}</li>
 *   <li>{@link IFC2X3.IfcRelConnectsStructuralMember#getAdditionalConditions <em>Additional Conditions</em>}</li>
 *   <li>{@link IFC2X3.IfcRelConnectsStructuralMember#getSupportedLength <em>Supported Length</em>}</li>
 *   <li>{@link IFC2X3.IfcRelConnectsStructuralMember#getConditionCoordinateSystem <em>Condition Coordinate System</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcRelConnectsStructuralMember()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcRelConnectsStructuralMemberImplAdapter.class)
public interface IfcRelConnectsStructuralMember extends IfcRelConnects {
	/**
	 * Returns the value of the '<em><b>Additional Conditions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Conditions</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Conditions</em>' reference.
	 * @see #setAdditionalConditions(IfcStructuralConnectionCondition)
	 * @see IFC2X3.IFC2X3Package#getIfcRelConnectsStructuralMember_AdditionalConditions()
	 * @model
	 * @generated
	 */
	IfcStructuralConnectionCondition getAdditionalConditions();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelConnectsStructuralMember#getAdditionalConditions <em>Additional Conditions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Conditions</em>' reference.
	 * @see #getAdditionalConditions()
	 * @generated
	 */
	void setAdditionalConditions(IfcStructuralConnectionCondition value);

	/**
	 * Returns the value of the '<em><b>Condition Coordinate System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Coordinate System</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Coordinate System</em>' reference.
	 * @see #setConditionCoordinateSystem(IfcAxis2Placement3D)
	 * @see IFC2X3.IFC2X3Package#getIfcRelConnectsStructuralMember_ConditionCoordinateSystem()
	 * @model
	 * @generated
	 */
	IfcAxis2Placement3D getConditionCoordinateSystem();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelConnectsStructuralMember#getConditionCoordinateSystem <em>Condition Coordinate System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Coordinate System</em>' reference.
	 * @see #getConditionCoordinateSystem()
	 * @generated
	 */
	void setConditionCoordinateSystem(IfcAxis2Placement3D value);

	/**
	 * Returns the value of the '<em><b>Related Structural Connection</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcStructuralConnection#getConnectsStructuralMembers <em>Connects Structural Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Structural Connection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Structural Connection</em>' reference.
	 * @see #setRelatedStructuralConnection(IfcStructuralConnection)
	 * @see IFC2X3.IFC2X3Package#getIfcRelConnectsStructuralMember_RelatedStructuralConnection()
	 * @see IFC2X3.IfcStructuralConnection#getConnectsStructuralMembers
	 * @model opposite="ConnectsStructuralMembers" required="true"
	 * @generated
	 */
	IfcStructuralConnection getRelatedStructuralConnection();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelConnectsStructuralMember#getRelatedStructuralConnection <em>Related Structural Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related Structural Connection</em>' reference.
	 * @see #getRelatedStructuralConnection()
	 * @generated
	 */
	void setRelatedStructuralConnection(IfcStructuralConnection value);

	/**
	 * Returns the value of the '<em><b>Applied Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied Condition</em>' reference.
	 * @see #setAppliedCondition(IfcBoundaryCondition)
	 * @see IFC2X3.IFC2X3Package#getIfcRelConnectsStructuralMember_AppliedCondition()
	 * @model
	 * @generated
	 */
	IfcBoundaryCondition getAppliedCondition();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelConnectsStructuralMember#getAppliedCondition <em>Applied Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applied Condition</em>' reference.
	 * @see #getAppliedCondition()
	 * @generated
	 */
	void setAppliedCondition(IfcBoundaryCondition value);

	/**
	 * Returns the value of the '<em><b>Relating Structural Member</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcStructuralMember#getConnectedBy <em>Connected By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Structural Member</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Structural Member</em>' reference.
	 * @see #setRelatingStructuralMember(IfcStructuralMember)
	 * @see IFC2X3.IFC2X3Package#getIfcRelConnectsStructuralMember_RelatingStructuralMember()
	 * @see IFC2X3.IfcStructuralMember#getConnectedBy
	 * @model opposite="ConnectedBy" required="true"
	 * @generated
	 */
	IfcStructuralMember getRelatingStructuralMember();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelConnectsStructuralMember#getRelatingStructuralMember <em>Relating Structural Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Structural Member</em>' reference.
	 * @see #getRelatingStructuralMember()
	 * @generated
	 */
	void setRelatingStructuralMember(IfcStructuralMember value);

	/**
	 * Returns the value of the '<em><b>Supported Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Length</em>' attribute.
	 * @see #isSetSupportedLength()
	 * @see #unsetSupportedLength()
	 * @see #setSupportedLength(Double)
	 * @see IFC2X3.IFC2X3Package#getIfcRelConnectsStructuralMember_SupportedLength()
	 * @model unsettable="true" dataType="IFC2X3.REAL"
	 * @generated
	 */
	Double getSupportedLength();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcRelConnectsStructuralMember#getSupportedLength <em>Supported Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supported Length</em>' attribute.
	 * @see #isSetSupportedLength()
	 * @see #unsetSupportedLength()
	 * @see #getSupportedLength()
	 * @generated
	 */
	void setSupportedLength(Double value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcRelConnectsStructuralMember#getSupportedLength <em>Supported Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSupportedLength()
	 * @see #getSupportedLength()
	 * @see #setSupportedLength(Double)
	 * @generated
	 */
	void unsetSupportedLength();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcRelConnectsStructuralMember#getSupportedLength <em>Supported Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Supported Length</em>' attribute is set.
	 * @see #unsetSupportedLength()
	 * @see #getSupportedLength()
	 * @see #setSupportedLength(Double)
	 * @generated
	 */
	boolean isSetSupportedLength();

} // IfcRelConnectsStructuralMember
