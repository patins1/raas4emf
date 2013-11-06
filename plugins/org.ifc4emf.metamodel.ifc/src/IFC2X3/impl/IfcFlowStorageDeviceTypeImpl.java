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
import IFC2X3.IfcFlowStorageDeviceType;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Flow Storage Device Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcFlowStorageDeviceType")
@XmlSeeAlso({ IfcTankTypeImpl.class, IfcElectricFlowStorageDeviceTypeImpl.class })
@XmlRootElement(name = "IfcFlowStorageDeviceTypeElement")
public class IfcFlowStorageDeviceTypeImpl extends IfcDistributionFlowElementTypeImpl implements IfcFlowStorageDeviceType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcFlowStorageDeviceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcFlowStorageDeviceType();
	}

} //IfcFlowStorageDeviceTypeImpl
