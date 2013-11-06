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
import IFC2X3.IfcFlowMovingDeviceType;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Flow Moving Device Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcFlowMovingDeviceType")
@XmlSeeAlso({ IfcCompressorTypeImpl.class, IfcPumpTypeImpl.class, IfcFanTypeImpl.class })
@XmlRootElement(name = "IfcFlowMovingDeviceTypeElement")
public class IfcFlowMovingDeviceTypeImpl extends IfcDistributionFlowElementTypeImpl implements IfcFlowMovingDeviceType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFlowMovingDeviceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcFlowMovingDeviceType();
	}

} //IfcFlowMovingDeviceTypeImpl
