/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcConstructionResource;
import IFC2X3.IfcMeasureWithUnit;
import IFC2X3.IfcResourceConsumptionEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Construction Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcConstructionResourceImpl#getResourceIdentifier <em>Resource Identifier</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcConstructionResourceImpl#getResourceGroup <em>Resource Group</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcConstructionResourceImpl#getResourceConsumption <em>Resource Consumption</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcConstructionResourceImpl#getBaseQuantity <em>Base Quantity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcConstructionResource")
@XmlSeeAlso({ IfcSubContractResourceImpl.class, IfcConstructionEquipmentResourceImpl.class, IfcLaborResourceImpl.class, IfcCrewResourceImpl.class, IfcConstructionMaterialResourceImpl.class, IfcConstructionProductResourceImpl.class })
@XmlRootElement(name = "IfcConstructionResourceElement")
public class IfcConstructionResourceImpl extends IfcResourceImpl implements IfcConstructionResource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcConstructionResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcConstructionResource();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcMeasureWithUnit getBaseQuantity() {
		return (IfcMeasureWithUnit)eGet(IFC2X3Package.eINSTANCE.getIfcConstructionResource_BaseQuantity(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseQuantity(IfcMeasureWithUnit newBaseQuantity) {
		eSet(IFC2X3Package.eINSTANCE.getIfcConstructionResource_BaseQuantity(), newBaseQuantity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcResourceConsumptionEnum getResourceConsumption() {
		return (IfcResourceConsumptionEnum)eGet(IFC2X3Package.eINSTANCE.getIfcConstructionResource_ResourceConsumption(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceConsumption(IfcResourceConsumptionEnum newResourceConsumption) {
		eSet(IFC2X3Package.eINSTANCE.getIfcConstructionResource_ResourceConsumption(), newResourceConsumption);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResourceConsumption() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcConstructionResource_ResourceConsumption());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResourceConsumption() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcConstructionResource_ResourceConsumption());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourceGroup() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcConstructionResource_ResourceGroup(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceGroup(String newResourceGroup) {
		eSet(IFC2X3Package.eINSTANCE.getIfcConstructionResource_ResourceGroup(), newResourceGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResourceGroup() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcConstructionResource_ResourceGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResourceGroup() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcConstructionResource_ResourceGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourceIdentifier() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcConstructionResource_ResourceIdentifier(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceIdentifier(String newResourceIdentifier) {
		eSet(IFC2X3Package.eINSTANCE.getIfcConstructionResource_ResourceIdentifier(), newResourceIdentifier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetResourceIdentifier() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcConstructionResource_ResourceIdentifier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetResourceIdentifier() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcConstructionResource_ResourceIdentifier());
	}

} //IfcConstructionResourceImpl
