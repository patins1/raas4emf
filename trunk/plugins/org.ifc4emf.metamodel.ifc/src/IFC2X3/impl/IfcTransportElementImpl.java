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
import IFC2X3.IfcTransportElement;
import IFC2X3.IfcTransportElementTypeEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Transport Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcTransportElementImpl#getOperationType <em>Operation Type</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTransportElementImpl#getCapacityByWeight <em>Capacity By Weight</em>}</li>
 *   <li>{@link IFC2X3.impl.IfcTransportElementImpl#getCapacityByNumber <em>Capacity By Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcTransportElement")
@XmlRootElement(name = "IfcTransportElementElement")
public class IfcTransportElementImpl extends IfcElementImpl implements IfcTransportElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcTransportElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcTransportElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCapacityByNumber() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcTransportElement_CapacityByNumber(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacityByNumber(Double newCapacityByNumber) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTransportElement_CapacityByNumber(), newCapacityByNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCapacityByNumber() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTransportElement_CapacityByNumber());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCapacityByNumber() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTransportElement_CapacityByNumber());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getCapacityByWeight() {
		return (Double)eGet(IFC2X3Package.eINSTANCE.getIfcTransportElement_CapacityByWeight(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacityByWeight(Double newCapacityByWeight) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTransportElement_CapacityByWeight(), newCapacityByWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCapacityByWeight() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTransportElement_CapacityByWeight());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCapacityByWeight() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTransportElement_CapacityByWeight());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTransportElementTypeEnum getOperationType() {
		return (IfcTransportElementTypeEnum)eGet(IFC2X3Package.eINSTANCE.getIfcTransportElement_OperationType(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationType(IfcTransportElementTypeEnum newOperationType) {
		eSet(IFC2X3Package.eINSTANCE.getIfcTransportElement_OperationType(), newOperationType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOperationType() {
		eUnset(IFC2X3Package.eINSTANCE.getIfcTransportElement_OperationType());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOperationType() {
		return eIsSet(IFC2X3Package.eINSTANCE.getIfcTransportElement_OperationType());
	}

} //IfcTransportElementImpl
