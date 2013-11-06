/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package IFC2X3.impl;

import IFC2X3.IFC2X3Package;
import IFC2X3.IfcPhysicalComplexQuantity;
import IFC2X3.IfcPhysicalQuantity;

import java.util.Collection;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Physical Complex Quantity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcPhysicalComplexQuantityImpl#getHasQuantities <em>Has Quantities</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPhysicalComplexQuantityImpl#getDiscrimination <em>Discrimination</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPhysicalComplexQuantityImpl#getQuality <em>Quality</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcPhysicalComplexQuantityImpl#getUsage <em>Usage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcPhysicalComplexQuantity")
@XmlRootElement(name = "IfcPhysicalComplexQuantityElement")
public class IfcPhysicalComplexQuantityImpl extends IfcPhysicalQuantityImpl implements IfcPhysicalComplexQuantity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcPhysicalComplexQuantityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcPhysicalComplexQuantity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcPhysicalQuantity> getHasQuantities() {
		return (EList<IfcPhysicalQuantity>)eGet(IFC2X3Package.eINSTANCE.getIfcPhysicalComplexQuantity_HasQuantities(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsage() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcPhysicalComplexQuantity_Usage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(String newUsage) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPhysicalComplexQuantity_Usage(), newUsage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUsage() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcPhysicalComplexQuantity_Usage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUsage() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcPhysicalComplexQuantity_Usage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuality() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcPhysicalComplexQuantity_Quality(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuality(String newQuality) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPhysicalComplexQuantity_Quality(), newQuality);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuality() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcPhysicalComplexQuantity_Quality());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuality() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcPhysicalComplexQuantity_Quality());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiscrimination() {
		return (String)eGet(IFC2X3Package.eINSTANCE.getIfcPhysicalComplexQuantity_Discrimination(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscrimination(String newDiscrimination) {
		eSet(IFC2X3Package.eINSTANCE.getIfcPhysicalComplexQuantity_Discrimination(), newDiscrimination);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDiscrimination() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcPhysicalComplexQuantity_Discrimination());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDiscrimination() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcPhysicalComplexQuantity_Discrimination());
	}

} //IfcPhysicalComplexQuantityImpl
