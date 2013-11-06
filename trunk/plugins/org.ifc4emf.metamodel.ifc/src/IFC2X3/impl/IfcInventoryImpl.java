/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcActorSelect;
import IFC2X3.IfcCalendarDate;
import IFC2X3.IfcCostValue;
import IFC2X3.IfcInventory;
import IFC2X3.IfcInventoryTypeEnum;
import IFC2X3.IfcPerson;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Inventory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcInventoryImpl#getInventoryType <em>Inventory Type</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcInventoryImpl#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcInventoryImpl#getResponsiblePersons <em>Responsible Persons</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcInventoryImpl#getLastUpdateDate <em>Last Update Date</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcInventoryImpl#getCurrentValue <em>Current Value</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcInventoryImpl#getOriginalValue <em>Original Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcInventory")
@XmlRootElement(name = "IfcInventoryElement")
public class IfcInventoryImpl extends IfcGroupImpl implements IfcInventory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcInventoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcInventory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcActorSelect getJurisdiction() {
		return (IfcActorSelect)eGet(IFC2X3Package.eINSTANCE.getIfcInventory_Jurisdiction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJurisdiction(IfcActorSelect newJurisdiction) {
		eSet(IFC2X3Package.eINSTANCE.getIfcInventory_Jurisdiction(), newJurisdiction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCalendarDate getLastUpdateDate() {
		return (IfcCalendarDate)eGet(IFC2X3Package.eINSTANCE.getIfcInventory_LastUpdateDate(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastUpdateDate(IfcCalendarDate newLastUpdateDate) {
		eSet(IFC2X3Package.eINSTANCE.getIfcInventory_LastUpdateDate(), newLastUpdateDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCostValue getOriginalValue() {
		return (IfcCostValue)eGet(IFC2X3Package.eINSTANCE.getIfcInventory_OriginalValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalValue(IfcCostValue newOriginalValue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcInventory_OriginalValue(), newOriginalValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCostValue getCurrentValue() {
		return (IfcCostValue)eGet(IFC2X3Package.eINSTANCE.getIfcInventory_CurrentValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentValue(IfcCostValue newCurrentValue) {
		eSet(IFC2X3Package.eINSTANCE.getIfcInventory_CurrentValue(), newCurrentValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcPerson> getResponsiblePersons() {
		return (EList<IfcPerson>)eGet(IFC2X3Package.eINSTANCE.getIfcInventory_ResponsiblePersons(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcInventoryTypeEnum getInventoryType() {
		return (IfcInventoryTypeEnum)eGet(IFC2X3Package.eINSTANCE.getIfcInventory_InventoryType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInventoryType(IfcInventoryTypeEnum newInventoryType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcInventory_InventoryType(), newInventoryType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInventoryType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcInventory_InventoryType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInventoryType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcInventory_InventoryType());
	}

} //IfcInventoryImpl
