/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcStructuralActivityImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Structural Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcStructuralActivity#getAppliedLoad <em>Applied Load</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralActivity#getGlobalOrLocal <em>Global Or Local</em>}</li>
 *   <li>{@link IFC2X3.IfcStructuralActivity#getAssignedToStructuralItem <em>Assigned To Structural Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcStructuralActivity()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcStructuralActivityImplAdapter.class)
public interface IfcStructuralActivity extends IfcProduct {
	/**
	 * Returns the value of the '<em><b>Assigned To Structural Item</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link IFC2X3.IfcRelConnectsStructuralActivity#getRelatedStructuralActivity <em>Related Structural Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned To Structural Item</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned To Structural Item</em>' reference.
	 * @see #setAssignedToStructuralItem(IfcRelConnectsStructuralActivity)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralActivity_AssignedToStructuralItem()
	 * @see IFC2X3.IfcRelConnectsStructuralActivity#getRelatedStructuralActivity
	 * @model opposite="RelatedStructuralActivity" required="true"
	 * @generated
	 */
	IfcRelConnectsStructuralActivity getAssignedToStructuralItem();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralActivity#getAssignedToStructuralItem <em>Assigned To Structural Item</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned To Structural Item</em>' reference.
	 * @see #getAssignedToStructuralItem()
	 * @generated
	 */
	void setAssignedToStructuralItem(IfcRelConnectsStructuralActivity value);

	/**
	 * Returns the value of the '<em><b>Applied Load</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applied Load</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applied Load</em>' reference.
	 * @see #setAppliedLoad(IfcStructuralLoad)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralActivity_AppliedLoad()
	 * @model required="true"
	 * @generated
	 */
	IfcStructuralLoad getAppliedLoad();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralActivity#getAppliedLoad <em>Applied Load</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applied Load</em>' reference.
	 * @see #getAppliedLoad()
	 * @generated
	 */
	void setAppliedLoad(IfcStructuralLoad value);

	/**
	 * Returns the value of the '<em><b>Global Or Local</b></em>' attribute.
	 * The literals are from the enumeration {@link IFC2X3.IfcGlobalOrLocalEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Or Local</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Or Local</em>' attribute.
	 * @see IFC2X3.IfcGlobalOrLocalEnum
	 * @see #isSetGlobalOrLocal()
	 * @see #unsetGlobalOrLocal()
	 * @see #setGlobalOrLocal(IfcGlobalOrLocalEnum)
	 * @see IFC2X3.IFC2X3Package#getIfcStructuralActivity_GlobalOrLocal()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	IfcGlobalOrLocalEnum getGlobalOrLocal();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcStructuralActivity#getGlobalOrLocal <em>Global Or Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Or Local</em>' attribute.
	 * @see IFC2X3.IfcGlobalOrLocalEnum
	 * @see #isSetGlobalOrLocal()
	 * @see #unsetGlobalOrLocal()
	 * @see #getGlobalOrLocal()
	 * @generated
	 */
	void setGlobalOrLocal(IfcGlobalOrLocalEnum value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcStructuralActivity#getGlobalOrLocal <em>Global Or Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGlobalOrLocal()
	 * @see #getGlobalOrLocal()
	 * @see #setGlobalOrLocal(IfcGlobalOrLocalEnum)
	 * @generated
	 */
	void unsetGlobalOrLocal();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcStructuralActivity#getGlobalOrLocal <em>Global Or Local</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Global Or Local</em>' attribute is set.
	 * @see #unsetGlobalOrLocal()
	 * @see #getGlobalOrLocal()
	 * @see #setGlobalOrLocal(IfcGlobalOrLocalEnum)
	 * @generated
	 */
	boolean isSetGlobalOrLocal();

} // IfcStructuralActivity
