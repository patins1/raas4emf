/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcActorSelect;
import IFC2X3.IfcAsset;
import IFC2X3.IfcCalendarDate;
import IFC2X3.IfcCostValue;
import IFC2X3.IfcPerson;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Asset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcAssetImpl#getAssetID <em>Asset ID</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAssetImpl#getOriginalValue <em>Original Value</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAssetImpl#getCurrentValue <em>Current Value</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAssetImpl#getTotalReplacementCost <em>Total Replacement Cost</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAssetImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAssetImpl#getUser <em>User</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAssetImpl#getResponsiblePerson <em>Responsible Person</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAssetImpl#getIncorporationDate <em>Incorporation Date</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcAssetImpl#getDepreciatedValue <em>Depreciated Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcAsset")
@XmlRootElement(name = "IfcAssetElement")
public class IfcAssetImpl extends IfcGroupImpl implements IfcAsset {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcAssetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcAsset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCostValue getCurrentValue() {
		return (IfcCostValue)eGet(IFC2X3Package.eINSTANCE.getIfcAsset_CurrentValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentValue(IfcCostValue newCurrentValue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcAsset_CurrentValue(), newCurrentValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCostValue getOriginalValue() {
		return (IfcCostValue)eGet(IFC2X3Package.eINSTANCE.getIfcAsset_OriginalValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalValue(IfcCostValue newOriginalValue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcAsset_OriginalValue(), newOriginalValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCalendarDate getIncorporationDate() {
		return (IfcCalendarDate)eGet(IFC2X3Package.eINSTANCE.getIfcAsset_IncorporationDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncorporationDate(IfcCalendarDate newIncorporationDate) {
		eSet(IFC2X3Package.eINSTANCE.getIfcAsset_IncorporationDate(), newIncorporationDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCostValue getDepreciatedValue() {
		return (IfcCostValue)eGet(IFC2X3Package.eINSTANCE.getIfcAsset_DepreciatedValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDepreciatedValue(IfcCostValue newDepreciatedValue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcAsset_DepreciatedValue(), newDepreciatedValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCostValue getTotalReplacementCost() {
		return (IfcCostValue)eGet(IFC2X3Package.eINSTANCE.getIfcAsset_TotalReplacementCost(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalReplacementCost(IfcCostValue newTotalReplacementCost) {
		eSet(IFC2X3Package.eINSTANCE.getIfcAsset_TotalReplacementCost(), newTotalReplacementCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPerson getResponsiblePerson() {
		return (IfcPerson)eGet(IFC2X3Package.eINSTANCE.getIfcAsset_ResponsiblePerson(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsiblePerson(IfcPerson newResponsiblePerson) {
		eSet(IFC2X3Package.eINSTANCE.getIfcAsset_ResponsiblePerson(), newResponsiblePerson);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorSelect getUser() {
		return (IfcActorSelect)eGet(IFC2X3Package.eINSTANCE.getIfcAsset_User(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(IfcActorSelect newUser) {
		eSet(IFC2X3Package.eINSTANCE.getIfcAsset_User(), newUser);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorSelect getOwner() {
		return (IfcActorSelect)eGet(IFC2X3Package.eINSTANCE.getIfcAsset_Owner(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(IfcActorSelect newOwner) {
		eSet(IFC2X3Package.eINSTANCE.getIfcAsset_Owner(), newOwner);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssetID() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcAsset_AssetID(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssetID(String newAssetID) {
		eSet(IFC2X3Package.eINSTANCE.getIfcAsset_AssetID(), newAssetID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAssetID() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcAsset_AssetID());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAssetID() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcAsset_AssetID());
	}

} //IfcAssetImpl
