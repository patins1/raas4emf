/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import IFC2X3.jaxb.IfcAssetImplAdapter;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link IFC2X3.IfcAsset#getAssetID <em>Asset ID</em>}</li>
 *   <li>{@link IFC2X3.IfcAsset#getOriginalValue <em>Original Value</em>}</li>
 *   <li>{@link IFC2X3.IfcAsset#getCurrentValue <em>Current Value</em>}</li>
 *   <li>{@link IFC2X3.IfcAsset#getTotalReplacementCost <em>Total Replacement Cost</em>}</li>
 *   <li>{@link IFC2X3.IfcAsset#getOwner <em>Owner</em>}</li>
 *   <li>{@link IFC2X3.IfcAsset#getUser <em>User</em>}</li>
 *   <li>{@link IFC2X3.IfcAsset#getResponsiblePerson <em>Responsible Person</em>}</li>
 *   <li>{@link IFC2X3.IfcAsset#getIncorporationDate <em>Incorporation Date</em>}</li>
 *   <li>{@link IFC2X3.IfcAsset#getDepreciatedValue <em>Depreciated Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see IFC2X3.IFC2X3Package#getIfcAsset()
 * @model
 * @generated
 */
@XmlJavaTypeAdapter(IfcAssetImplAdapter.class)
public interface IfcAsset extends IfcGroup {
	/**
	 * Returns the value of the '<em><b>Current Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Value</em>' reference.
	 * @see #setCurrentValue(IfcCostValue)
	 * @see IFC2X3.IFC2X3Package#getIfcAsset_CurrentValue()
	 * @model required="true"
	 * @generated
	 */
	IfcCostValue getCurrentValue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcAsset#getCurrentValue <em>Current Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Value</em>' reference.
	 * @see #getCurrentValue()
	 * @generated
	 */
	void setCurrentValue(IfcCostValue value);

	/**
	 * Returns the value of the '<em><b>Original Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Value</em>' reference.
	 * @see #setOriginalValue(IfcCostValue)
	 * @see IFC2X3.IFC2X3Package#getIfcAsset_OriginalValue()
	 * @model required="true"
	 * @generated
	 */
	IfcCostValue getOriginalValue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcAsset#getOriginalValue <em>Original Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Value</em>' reference.
	 * @see #getOriginalValue()
	 * @generated
	 */
	void setOriginalValue(IfcCostValue value);

	/**
	 * Returns the value of the '<em><b>Incorporation Date</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incorporation Date</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incorporation Date</em>' reference.
	 * @see #setIncorporationDate(IfcCalendarDate)
	 * @see IFC2X3.IFC2X3Package#getIfcAsset_IncorporationDate()
	 * @model required="true"
	 * @generated
	 */
	IfcCalendarDate getIncorporationDate();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcAsset#getIncorporationDate <em>Incorporation Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incorporation Date</em>' reference.
	 * @see #getIncorporationDate()
	 * @generated
	 */
	void setIncorporationDate(IfcCalendarDate value);

	/**
	 * Returns the value of the '<em><b>Depreciated Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depreciated Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depreciated Value</em>' reference.
	 * @see #setDepreciatedValue(IfcCostValue)
	 * @see IFC2X3.IFC2X3Package#getIfcAsset_DepreciatedValue()
	 * @model required="true"
	 * @generated
	 */
	IfcCostValue getDepreciatedValue();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcAsset#getDepreciatedValue <em>Depreciated Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depreciated Value</em>' reference.
	 * @see #getDepreciatedValue()
	 * @generated
	 */
	void setDepreciatedValue(IfcCostValue value);

	/**
	 * Returns the value of the '<em><b>Total Replacement Cost</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Replacement Cost</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Replacement Cost</em>' reference.
	 * @see #setTotalReplacementCost(IfcCostValue)
	 * @see IFC2X3.IFC2X3Package#getIfcAsset_TotalReplacementCost()
	 * @model required="true"
	 * @generated
	 */
	IfcCostValue getTotalReplacementCost();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcAsset#getTotalReplacementCost <em>Total Replacement Cost</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Replacement Cost</em>' reference.
	 * @see #getTotalReplacementCost()
	 * @generated
	 */
	void setTotalReplacementCost(IfcCostValue value);

	/**
	 * Returns the value of the '<em><b>Responsible Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible Person</em>' reference.
	 * @see #setResponsiblePerson(IfcPerson)
	 * @see IFC2X3.IFC2X3Package#getIfcAsset_ResponsiblePerson()
	 * @model required="true"
	 * @generated
	 */
	IfcPerson getResponsiblePerson();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcAsset#getResponsiblePerson <em>Responsible Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible Person</em>' reference.
	 * @see #getResponsiblePerson()
	 * @generated
	 */
	void setResponsiblePerson(IfcPerson value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(IfcActorSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcAsset_User()
	 * @model required="true"
	 * @generated
	 */
	IfcActorSelect getUser();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcAsset#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(IfcActorSelect value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(IfcActorSelect)
	 * @see IFC2X3.IFC2X3Package#getIfcAsset_Owner()
	 * @model required="true"
	 * @generated
	 */
	IfcActorSelect getOwner();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcAsset#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(IfcActorSelect value);

	/**
	 * Returns the value of the '<em><b>Asset ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Asset ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Asset ID</em>' attribute.
	 * @see #isSetAssetID()
	 * @see #unsetAssetID()
	 * @see #setAssetID(String)
	 * @see IFC2X3.IFC2X3Package#getIfcAsset_AssetID()
	 * @model unsettable="true" dataType="IFC2X3.STRING" required="true"
	 * @generated
	 */
	String getAssetID();

	/**
	 * Sets the value of the '{@link IFC2X3.IfcAsset#getAssetID <em>Asset ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Asset ID</em>' attribute.
	 * @see #isSetAssetID()
	 * @see #unsetAssetID()
	 * @see #getAssetID()
	 * @generated
	 */
	void setAssetID(String value);

	/**
	 * Unsets the value of the '{@link IFC2X3.IfcAsset#getAssetID <em>Asset ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAssetID()
	 * @see #getAssetID()
	 * @see #setAssetID(String)
	 * @generated
	 */
	void unsetAssetID();

	/**
	 * Returns whether the value of the '{@link IFC2X3.IfcAsset#getAssetID <em>Asset ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Asset ID</em>' attribute is set.
	 * @see #unsetAssetID()
	 * @see #getAssetID()
	 * @see #setAssetID(String)
	 * @generated
	 */
	boolean isSetAssetID();

} // IfcAsset
