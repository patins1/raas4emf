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
import IFC2X3.IfcDistributionFlowElement;
import IFC2X3.IfcRelFlowControlElements;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Distribution Flow Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link IFC2X3.impl.IfcDistributionFlowElementImpl#getHasControlElements <em>Has Control Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcDistributionFlowElement")
@XmlSeeAlso({ IfcFlowControllerImpl.class, IfcFlowMovingDeviceImpl.class, IfcFlowStorageDeviceImpl.class, IfcFlowFittingImpl.class, IfcFlowSegmentImpl.class, IfcFlowTreatmentDeviceImpl.class, IfcEnergyConversionDeviceImpl.class, IfcDistributionChamberElementImpl.class,
		IfcElectricDistributionPointImpl.class, IfcFlowTerminalImpl.class })
@XmlRootElement(name = "IfcDistributionFlowElementElement")
public class IfcDistributionFlowElementImpl extends IfcDistributionElementImpl implements IfcDistributionFlowElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcDistributionFlowElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcDistributionFlowElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcRelFlowControlElements getHasControlElements() {
		return (IfcRelFlowControlElements)eGet(IFC2X3Package.eINSTANCE.getIfcDistributionFlowElement_HasControlElements(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasControlElements(IfcRelFlowControlElements newHasControlElements) {
		eSet(IFC2X3Package.eINSTANCE.getIfcDistributionFlowElement_HasControlElements(), newHasControlElements);
	}

} //IfcDistributionFlowElementImpl
