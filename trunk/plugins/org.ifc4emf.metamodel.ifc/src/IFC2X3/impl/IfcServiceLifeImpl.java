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
import IFC2X3.IfcServiceLife;
import IFC2X3.IfcServiceLifeTypeEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Service Life</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcServiceLifeImpl#getServiceLifeType <em>Service Life Type</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcServiceLifeImpl#getServiceLifeDuration <em>Service Life Duration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcServiceLife")
@XmlRootElement(name = "IfcServiceLifeElement")
public class IfcServiceLifeImpl extends IfcControlImpl implements IfcServiceLife {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcServiceLifeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcServiceLife();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getServiceLifeDuration() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcServiceLife_ServiceLifeDuration(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceLifeDuration(Double newServiceLifeDuration) {
		eSet(IFC2X3Package.eINSTANCE.getIfcServiceLife_ServiceLifeDuration(), newServiceLifeDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetServiceLifeDuration() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcServiceLife_ServiceLifeDuration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetServiceLifeDuration() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcServiceLife_ServiceLifeDuration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcServiceLifeTypeEnum getServiceLifeType() {
		return (IfcServiceLifeTypeEnum)eGet(IFC2X3Package.eINSTANCE.getIfcServiceLife_ServiceLifeType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceLifeType(IfcServiceLifeTypeEnum newServiceLifeType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcServiceLife_ServiceLifeType(), newServiceLifeType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetServiceLifeType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcServiceLife_ServiceLifeType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetServiceLifeType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcServiceLife_ServiceLifeType());
	}

} //IfcServiceLifeImpl
