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
import IFC2X3.IfcEnergyConversionDeviceType;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Energy Conversion Device Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlType(name = "IfcEnergyConversionDeviceType")
@XmlSeeAlso({ IfcHeatExchangerTypeImpl.class, IfcElectricGeneratorTypeImpl.class, IfcBoilerTypeImpl.class, IfcEvaporatorTypeImpl.class, IfcUnitaryEquipmentTypeImpl.class, IfcCondenserTypeImpl.class, IfcTransformerTypeImpl.class, IfcSpaceHeaterTypeImpl.class,
		IfcMotorConnectionTypeImpl.class, IfcEvaporativeCoolerTypeImpl.class, IfcCoolingTowerTypeImpl.class, IfcCoilTypeImpl.class, IfcTubeBundleTypeImpl.class, IfcElectricMotorTypeImpl.class, IfcAirToAirHeatRecoveryTypeImpl.class, IfcHumidifierTypeImpl.class,
		IfcCooledBeamTypeImpl.class, IfcChillerTypeImpl.class })
@XmlRootElement(name = "IfcEnergyConversionDeviceTypeElement")
public class IfcEnergyConversionDeviceTypeImpl extends IfcDistributionFlowElementTypeImpl implements IfcEnergyConversionDeviceType {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcEnergyConversionDeviceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFC2X3Package.eINSTANCE.getIfcEnergyConversionDeviceType();
	}

} //IfcEnergyConversionDeviceTypeImpl
