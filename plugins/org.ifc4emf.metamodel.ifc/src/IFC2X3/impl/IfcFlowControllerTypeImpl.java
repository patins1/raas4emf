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
import IFC2X3.IfcFlowControllerType;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Flow Controller Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcFlowControllerType")
@XmlSeeAlso({ IfcSwitchingDeviceTypeImpl.class, IfcElectricTimeControlTypeImpl.class, IfcDamperTypeImpl.class, IfcProtectiveDeviceTypeImpl.class, IfcFlowMeterTypeImpl.class, IfcAirTerminalBoxTypeImpl.class, IfcValveTypeImpl.class })
@XmlRootElement(name = "IfcFlowControllerTypeElement")
public class IfcFlowControllerTypeImpl extends IfcDistributionFlowElementTypeImpl implements IfcFlowControllerType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFlowControllerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcFlowControllerType();
	}

} //IfcFlowControllerTypeImpl
